package com.github.gotson.nightcompress;


import javax.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;

public class Archive implements LibArchive {
    public static boolean isAvailable() {
        return false;
    }

    public static List<ArchiveEntry> getEntries(Path path) throws LibArchiveException {
        throw new UnsupportedOperationException();
    }

    public static List<ArchiveEntry> getEntries(Path path, Set<ReadSupportCompression> readSupportCompressions, Set<ReadSupportFilter> readSupportFilters,
                                                Set<ReadSupportFormat> readSupportFormats) throws LibArchiveException {
        throw new UnsupportedOperationException();
    }

    @Nullable
    public static InputStream getInputStream(Path path, String entry) throws LibArchiveException, IOException {
        throw new UnsupportedOperationException();
    }

    @Nullable
    public static InputStream getInputStream(Path path, Set<ReadSupportCompression> readSupportCompressions, Set<ReadSupportFilter> readSupportFilters,
                                             Set<ReadSupportFormat> readSupportFormats, String entry) throws LibArchiveException, IOException {
        throw new UnsupportedOperationException();
    }

    public Archive(Path path) throws LibArchiveException {
        throw new UnsupportedOperationException();
    }

    public Archive(Path path, Set<ReadSupportCompression> readSupportCompressions, Set<ReadSupportFilter> readSupportFilters, Set<ReadSupportFormat> readSupportFormats)
        throws LibArchiveException {
        throw new UnsupportedOperationException();
    }

    @Override
    public ArchiveEntry getNextEntry() throws LibArchiveException {
        throw new UnsupportedOperationException();
    }

    @Override
    public InputStream getInputStream() throws IOException, LibArchiveException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException();
    }
}
