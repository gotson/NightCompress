// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.foreign.*;

/**
 * {@snippet :
 * la_int64_t (*archive_write_disk_set_user_lookup$x0)(void*,char*,la_int64_t);
 * }
 */
public interface archive_write_disk_set_user_lookup$x0 {

    long apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, long _x2);
    static MemorySegment allocate(archive_write_disk_set_user_lookup$x0 fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$128.const$3, fi, constants$74.const$1, scope);
    }
    static archive_write_disk_set_user_lookup$x0 ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, long __x2) -> {
            try {
                return (long)constants$93.const$1.invokeExact(symbol, __x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


