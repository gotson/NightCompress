// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.foreign.*;

/**
 * {@snippet :
 * char* (*archive_read_disk_set_gname_lookup$x0)(void*,la_int64_t);
 * }
 */
public interface archive_read_disk_set_gname_lookup$x0 {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, long _x1);
    static MemorySegment allocate(archive_read_disk_set_gname_lookup$x0 fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$130.const$5, fi, constants$61.const$0, scope);
    }
    static archive_read_disk_set_gname_lookup$x0 ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment __x0, long __x1) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$131.const$0.invokeExact(symbol, __x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


