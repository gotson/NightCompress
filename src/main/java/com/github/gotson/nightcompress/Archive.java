package com.github.gotson.nightcompress;


import javax.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.List;

public class Archive implements LibArchive {
    public static boolean isAvailable() {
        return false;
    }

    public static List<ArchiveEntry> getEntries(Path path) throws LibArchiveException {
        throw new UnsupportedOperationException();
    }

    @Nullable
    public static InputStream getInputStream(Path path, String entry) throws LibArchiveException, IOException {
        throw new UnsupportedOperationException();
    }

    public Archive(Path path) throws LibArchiveException {
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
