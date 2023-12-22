package com.github.gotson.nightcompress;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public interface LibArchive extends Closeable {
    List<ArchiveEntry> getEntries() throws LibArchiveException;

    InputStream getInputStream(ArchiveEntry entry) throws IOException, LibArchiveException;
}
