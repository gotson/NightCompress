package com.github.gotson.nightcompress;

import java.time.Instant;
import java.util.Objects;

public final class ArchiveEntry {
    private final String name;
    private final Long size;
    private final Instant mtime;

    public ArchiveEntry(
        String name,
        Long size,
        Instant mtime
    ) {
        this.name = name;
        this.size = size;
        this.mtime = mtime;
    }

    public String getName() {
        return name;
    }

    public Long getSize() {
        return size;
    }

    public Instant getModifiedTime() {
        return mtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArchiveEntry that = (ArchiveEntry) o;

        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(size, that.size)) return false;
        return Objects.equals(mtime, that.mtime);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (mtime != null ? mtime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Entry[" +
               "pathname=" + name + ", " +
               "size=" + size + ", " +
               "mtime=" + mtime + ']';
    }

}
