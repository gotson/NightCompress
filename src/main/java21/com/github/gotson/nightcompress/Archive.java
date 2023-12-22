package com.github.gotson.nightcompress;

import com.github.gotson.nightcompress.panama.archive_h;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.MessageFormatter;

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
        return archive_h.archive_version_details().getUtf8String(0);
    }

    private static boolean isLibVersionSupported() {
        return archive_h.archive_version_number() >= 3005000;
    }


    private final Path path;

    private List<ArchiveEntry> entries;

    public Archive(Path path) {
        this.path = path;
    }

    @Override
    public void close() {
    }

    @Override
    public List<ArchiveEntry> getEntries() throws LibArchiveException {
        if (entries == null) retrieveEntries();
        return entries;
    }

    @Override
    public InputStream getInputStream(ArchiveEntry archiveEntry) throws IOException {
        if (archiveEntry.getSize() != null && archiveEntry.getSize() <= 0) {
            return new EmptyInputStream();
        }

        // Small optimization to prevent the creation of large buffers for very small files
        // Never allocate more than needed, but ensure the buffer will be at least 1-byte long
        final int bufferSize = archiveEntry.getSize() != null ?
            (int) Math.max(Math.min(archiveEntry.getSize(), BUFFER_SIZE), 1) : BUFFER_SIZE;


        final PipedInputStream in = new PipedInputStream(bufferSize);
        final PipedOutputStream out = new PipedOutputStream(in);

        Runnable r = () -> {
            try (var arena = Arena.ofConfined(); var archive = new ArchiveHandle(path)) {
                var entryPtr = arena.allocate(C_POINTER);

                while (true) {
                    var result = archive_h.archive_read_next_header(archive.handle, entryPtr);
                    if (result == archive_h.ARCHIVE_EOF()) break;
                    if (result != archive_h.ARCHIVE_OK()) {
                        var cause = archive_h.archive_error_string(archive.handle).getUtf8String(0);
                        LOGGER.error("Error getting entry: {}", cause);
                        throw new LibArchiveException(MessageFormatter.format("Error getting entry: {}", cause).getMessage());
                    }
                    var entry = entryPtr.get(C_POINTER, 0);
                    if (archive_h.archive_entry_pathname_utf8(entry).getUtf8String(0).equals(archiveEntry.getName())) break;
                }

                var buffer = arena.allocateArray(C_CHAR, BUFFER_SIZE);
                while (true) {
                    var read = archive_h.archive_read_data(archive.handle, buffer, buffer.byteSize());
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

    private void retrieveEntries() throws LibArchiveException {
        try (var arena = Arena.ofConfined(); var archive = new ArchiveHandle(path)) {
            var entryPtr = arena.allocate(C_POINTER);
            entries = new ArrayList<>();

            while (true) {
                var result = archive_h.archive_read_next_header(archive.handle, entryPtr);
                if (result == archive_h.ARCHIVE_EOF()) break;
                if (result != archive_h.ARCHIVE_OK()) {
                    var cause = archive_h.archive_error_string(archive.handle).getUtf8String(0);
                    LOGGER.error("Error getting entry: {}", cause);
                    throw new LibArchiveException(MessageFormatter.format("Error getting entry: {}", cause).getMessage());
                }
                var entry = entryPtr.get(C_POINTER, 0);
                entries.add(new ArchiveEntry(
                    archive_h.archive_entry_pathname_utf8(entry).getUtf8String(0),
                    archive_h.archive_entry_size_is_set(entry) > 0 ? archive_h.archive_entry_size(entry) : null,
                    archive_h.archive_entry_mtime_is_set(entry) > 0 ? Instant.ofEpochSecond(archive_h.archive_entry_mtime(entry)) : null
                ));
            }
        }
    }

    private static class ArchiveHandle implements Closeable {
        final MemorySegment handle;

        ArchiveHandle(Path path) throws LibArchiveException {
            handle = getArchive(path);
        }

        private MemorySegment getArchive(Path path) throws LibArchiveException {
            final MemorySegment archive;
            if (!loadLibrary()) throw new LibArchiveException("Library is not loaded");

            try (var arena = Arena.ofConfined()) {
                archive = archive_h.archive_read_new();
                archive_h.archive_read_support_compression_all(archive);
                archive_h.archive_read_support_format_all(archive);

                MemorySegment pathSegment = arena.allocateUtf8String(path.toAbsolutePath().toString());
                var result = archive_h.archive_read_open_filename(archive, pathSegment, BUFFER_SIZE);
                if (result != archive_h.ARCHIVE_OK()) {
                    close();
                    var cause = archive_h.archive_error_string(archive).getUtf8String(0);
                    LOGGER.error("Could not open archive: {}. Cause: {}", path, cause);
                    throw new LibArchiveException(MessageFormatter.format("Could not open archive: {}. Cause: {}", path, cause).getMessage());
                }
            }
            return archive;
        }

        @Override
        public void close() {
            archive_h.archive_read_free(handle);
        }
    }

}
