package com.github.gotson.nightcompress;

import javax.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

interface LibArchive extends Closeable {
    @Nullable
    ArchiveEntry getNextEntry() throws LibArchiveException;

    InputStream getInputStream() throws IOException, LibArchiveException;
}
