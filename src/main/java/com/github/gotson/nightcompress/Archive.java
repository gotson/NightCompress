package com.github.gotson.nightcompress;


import java.io.InputStream;
import java.nio.file.Path;
import java.util.List;

public class Archive implements LibArchive {
    public static boolean isAvailable() {
        return false;
    }

    public Archive(Path path) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<ArchiveEntry> getEntries() {
        throw new UnsupportedOperationException();
    }

    @Override
    public InputStream getInputStream(ArchiveEntry entry) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException();
    }
}
