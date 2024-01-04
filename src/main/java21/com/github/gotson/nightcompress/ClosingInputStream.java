package com.github.gotson.nightcompress;

import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

final class ClosingInputStream extends FilterInputStream {
    private final Closeable closeable;

    public ClosingInputStream(InputStream in, Closeable closeable) {
        super(in);
        this.closeable = closeable;
    }

    @Override
    public void close() throws IOException {
        super.close();
        closeable.close();
    }
}
