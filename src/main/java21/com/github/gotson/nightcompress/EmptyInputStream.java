package com.github.gotson.nightcompress;

import java.io.IOException;
import java.io.InputStream;

public final class EmptyInputStream extends InputStream {
    @Override
    public int available() throws IOException {
        return 0;
    }

    @Override
    public int read() throws IOException {
        return -1;
    }
}
