package com.github.gotson.nightcompress;

import com.github.gotson.nightcompress.panama.archive_h;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.MessageFormatter;

import javax.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.file.Path;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static com.github.gotson.nightcompress.PropertyUtils.getPropertyAs;
import static com.github.gotson.nightcompress.panama.archive_h.C_CHAR;
import static com.github.gotson.nightcompress.panama.archive_h.C_POINTER;

public class Archive implements LibArchive {
    private static final Logger LOGGER = LoggerFactory.getLogger(Archive.class);
    private static Boolean libLoaded = null;

    private static final int BUFFER_SIZE = getPropertyAs(
        "nightcompress.extractor.buffer-size",
        Integer::parseInt,
        32 * 1024
    );

    private static final boolean USE_EXECUTOR = getPropertyAs(
        "nightcompress.extractor.use-executor",
        Boolean::parseBoolean,
        true
    );

    public static boolean isAvailable() {
        return loadLibrary();
    }

    private static boolean loadLibrary() {
        if (libLoaded == null) {
            libLoaded = false;
            try {
                LOGGER.info("Loaded {}", getLibVersion());
                libLoaded = isLibVersionSupported();
            } catch (UnsatisfiedLinkError e) {
                LOGGER.warn("Could not load libarchive. {}", e.getMessage());
            } catch (NoClassDefFoundError | UnsupportedClassVersionError e) {
                LOGGER.warn("Missing Foreign Linker API. Try adding JVM arguments: --enable-preview");
            } catch (ExceptionInInitializerError e) {
                LOGGER.warn("Native access is disabled. Try adding JVM arguments: --enable-native-access=ALL-UNNAMED");
            } catch (Exception e) {
                LOGGER.warn("Unknown error", e);
            }
        }
        return libLoaded;
    }

    private static String getLibVersion() {
        return archive_h.archive_version_details().getString(0);
    }

    private static boolean isLibVersionSupported() {
        return archive_h.archive_version_number() >= 3005000;
    }


    private final ArchiveHandle handle;
    private ArchiveEntry currentEntry;

    public static List<ArchiveEntry> getEntries(Path path) throws LibArchiveException {
        return getEntries(path, Set.of(ReadSupportCompression.ALL), Set.of(ReadSupportFilter.ALL), Set.of(ReadSupportFormat.ALL));
    }

    public static List<ArchiveEntry> getEntries(Path path, Set<ReadSupportCompression> readSupportCompressions, Set<ReadSupportFilter> readSupportFilters,
                                                Set<ReadSupportFormat> readSupportFormats) throws LibArchiveException {
        try (var archive = new Archive(path, readSupportCompressions, readSupportFilters, readSupportFormats)) {
            ArchiveEntry entry;
            List<ArchiveEntry> entries = new ArrayList<>();
            while ((entry = archive.getNextEntry()) != null) {
                entries.add(entry);
            }
            return entries;
        }
    }

    @Nullable
    public static InputStream getInputStream(Path path, String entry) throws LibArchiveException, IOException {
        return getInputStream(path, Set.of(ReadSupportCompression.ALL), Set.of(ReadSupportFilter.ALL), Set.of(ReadSupportFormat.ALL), entry);
    }

    @Nullable
    public static InputStream getInputStream(Path path, Set<ReadSupportCompression> readSupportCompressions, Set<ReadSupportFilter> readSupportFilters,
                                             Set<ReadSupportFormat> readSupportFormats, String entry) throws LibArchiveException, IOException {
        var archive = new Archive(path, readSupportCompressions, readSupportFilters, readSupportFormats);
        ArchiveEntry e;
        while ((e = archive.getNextEntry()) != null) {
            if (e.getName().equals(entry)) return new ClosingInputStream(archive.getInputStream(), archive);
        }
        return null;
    }

    public Archive(Path path) throws LibArchiveException {
        this(path, Set.of(ReadSupportCompression.ALL), Set.of(ReadSupportFilter.ALL), Set.of(ReadSupportFormat.ALL));
    }

    public Archive(Path path, Set<ReadSupportCompression> readSupportCompressions, Set<ReadSupportFilter> readSupportFilters, Set<ReadSupportFormat> readSupportFormats)
        throws LibArchiveException {
        this.handle = new ArchiveHandle(path, readSupportCompressions, readSupportFilters, readSupportFormats);
    }

    @Override
    public void close() {
        handle.close();
    }

    @Nullable
    @Override
    public ArchiveEntry getNextEntry() throws LibArchiveException {
        try (var arena = Arena.ofConfined()) {
            var entryPtr = arena.allocate(C_POINTER);

            var result = archive_h.archive_read_next_header(handle.segment, entryPtr);
            if (result == archive_h.ARCHIVE_EOF()) {
                currentEntry = null;
                return null;
            }
            if (result != archive_h.ARCHIVE_OK()) {
                MemorySegment errorStringPtr = archive_h.archive_error_string(handle.segment);
                String cause = "unknown error cause";
                if (errorStringPtr.address() != MemorySegment.NULL.address()) {
                    cause = errorStringPtr.getString(0);
                }
                LOGGER.error("Error getting entry: {}", cause);
                throw new LibArchiveException(MessageFormatter.format("Error getting entry: {}", cause).getMessage());
            }
            var entrySegment = entryPtr.get(C_POINTER, 0);

            MemorySegment pathNameToUse;
            MemorySegment pathNameUtf8 = archive_h.archive_entry_pathname_utf8(entrySegment);
            if (pathNameUtf8.address() != MemorySegment.NULL.address()) {
                pathNameToUse = pathNameUtf8;
            } else {
                pathNameToUse = archive_h.archive_entry_pathname(entrySegment);
            }
            currentEntry = new ArchiveEntry(
                pathNameToUse.getString(0),
                archive_h.archive_entry_size_is_set(entrySegment) > 0 ? archive_h.archive_entry_size(entrySegment) : null,
                archive_h.archive_entry_mtime_is_set(entrySegment) > 0 ? Instant.ofEpochSecond(archive_h.archive_entry_mtime(entrySegment)) : null
            );
        }
        return currentEntry;
    }

    @Override
    public InputStream getInputStream() throws IOException, LibArchiveException {
        if (currentEntry == null) throw new LibArchiveException("Current entry is null");
        if (currentEntry.getSize() != null && currentEntry.getSize() <= 0) {
            return new EmptyInputStream();
        }

        // Small optimization to prevent the creation of large buffers for very small files
        // Never allocate more than needed, but ensure the buffer will be at least 1-byte long
        final int bufferSize = currentEntry.getSize() != null ?
            (int) Math.max(Math.min(currentEntry.getSize(), BUFFER_SIZE), 1) : BUFFER_SIZE;


        final PipedInputStream in = new PipedInputStream(bufferSize);
        final PipedOutputStream out = new PipedOutputStream(in);

        Runnable r = () -> {
            try (var arena = Arena.ofConfined()) {
                var buffer = arena.allocate(C_CHAR, bufferSize);
                while (true) {
                    var read = archive_h.archive_read_data(handle.segment, buffer, buffer.byteSize());
                    if (read < 0) throw new IOException("Error while extracting entry");
                    if (read == 0) break;

                    var data = new byte[(int) read];
                    buffer.asByteBuffer().get(data);
                    out.write(data);
                }
                out.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };

        if (USE_EXECUTOR) {
            ExecutorHolder.cachedExecutorService.submit(r);
        } else {
            new Thread(r).start();
        }

        return in;
    }

    private static class ArchiveHandle implements Closeable {
        final MemorySegment segment;

        ArchiveHandle(Path path, Set<ReadSupportCompression> readSupportCompressions, Set<ReadSupportFilter> readSupportFilters, Set<ReadSupportFormat> readSupportFormats)
            throws LibArchiveException {
            if (!loadLibrary()) throw new LibArchiveException("Library is not loaded");

            try (var arena = Arena.ofConfined()) {
                segment = archive_h.archive_read_new();

                for (ReadSupportCompression readSupportCompression : readSupportCompressions) {
                    switch (readSupportCompression) {
                        case ALL -> archive_h.archive_read_support_compression_all(segment);
                        case BZIP2 -> archive_h.archive_read_support_compression_bzip2(segment);
                        case COMPRESS -> archive_h.archive_read_support_compression_compress(segment);
                        case GZIP -> archive_h.archive_read_support_compression_gzip(segment);
                        case LZIP -> archive_h.archive_read_support_compression_lzip(segment);
                        case LZMA -> archive_h.archive_read_support_compression_lzma(segment);
                        case NONE -> archive_h.archive_read_support_compression_none(segment);
                        case RPM -> archive_h.archive_read_support_compression_rpm(segment);
                        case UU -> archive_h.archive_read_support_compression_uu(segment);
                        case XZ -> archive_h.archive_read_support_compression_xz(segment);
                    }
                }

                for (ReadSupportFilter readSupportFilter : readSupportFilters) {
                    switch (readSupportFilter) {
                        case ALL -> archive_h.archive_read_support_filter_all(segment);
                        case BZIP2 -> archive_h.archive_read_support_filter_bzip2(segment);
                        case COMPRESS -> archive_h.archive_read_support_filter_compress(segment);
                        case GRZIP -> archive_h.archive_read_support_filter_grzip(segment);
                        case GZIP -> archive_h.archive_read_support_filter_gzip(segment);
                        case LRZIP -> archive_h.archive_read_support_filter_lrzip(segment);
                        case LZ4 -> archive_h.archive_read_support_filter_lz4(segment);
                        case LZIP -> archive_h.archive_read_support_filter_lzip(segment);
                        case LZMA -> archive_h.archive_read_support_filter_lzma(segment);
                        case LZOP -> archive_h.archive_read_support_filter_lzop(segment);
                        case NONE -> archive_h.archive_read_support_filter_none(segment);
                        case RPM -> archive_h.archive_read_support_filter_rpm(segment);
                        case UU -> archive_h.archive_read_support_filter_uu(segment);
                        case XZ -> archive_h.archive_read_support_filter_xz(segment);
                        case ZSTD -> archive_h.archive_read_support_filter_zstd(segment);
                    }
                }

                for (ReadSupportFormat readSupportFormat : readSupportFormats) {
                    switch (readSupportFormat) {
                        case ALL -> archive_h.archive_read_support_format_all(segment);
                        case AR -> archive_h.archive_read_support_format_ar(segment);
                        case CAB -> archive_h.archive_read_support_format_cab(segment);
                        case CPIO -> archive_h.archive_read_support_format_cpio(segment);
                        case EMPTY -> archive_h.archive_read_support_format_empty(segment);
                        case GNUTAR -> archive_h.archive_read_support_format_gnutar(segment);
                        case ISO9660 -> archive_h.archive_read_support_format_iso9660(segment);
                        case LHA -> archive_h.archive_read_support_format_lha(segment);
                        case MTREE -> archive_h.archive_read_support_format_mtree(segment);
                        case RAR -> archive_h.archive_read_support_format_rar(segment);
                        case RAR5 -> archive_h.archive_read_support_format_rar5(segment);
                        case RAW -> archive_h.archive_read_support_format_raw(segment);
                        case SEVEN_ZIP -> archive_h.archive_read_support_format_7zip(segment);
                        case TAR -> archive_h.archive_read_support_format_tar(segment);
                        case WARC -> archive_h.archive_read_support_format_warc(segment);
                        case XAR -> archive_h.archive_read_support_format_xar(segment);
                        case ZIP -> archive_h.archive_read_support_format_zip(segment);
                        case ZIP_STREAMABLE -> archive_h.archive_read_support_format_zip_streamable(segment);
                        case ZIP_SEEKABLE -> archive_h.archive_read_support_format_zip_seekable(segment);
                    }
                }

                MemorySegment pathSegment = arena.allocateFrom(path.toAbsolutePath().toString());
                var result = archive_h.archive_read_open_filename(segment, pathSegment, BUFFER_SIZE);
                if (result != archive_h.ARCHIVE_OK()) {
                    close();
                    MemorySegment errorStringPtr = archive_h.archive_error_string(segment);
                    String cause = "";
                    if (errorStringPtr.address() != MemorySegment.NULL.address()) {
                        cause = errorStringPtr.getString(0);
                    }
                    LOGGER.error("Could not open archive: {}. Cause: {}", path, cause);
                    throw new LibArchiveException(MessageFormatter.format("Could not open archive: {}. Cause: {}", path, cause).getMessage());
                }
            }
        }

        @Override
        public void close() {
            archive_h.archive_read_free(segment);
        }
    }

}
