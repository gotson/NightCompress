// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.foreign.*;

/**
 * {@snippet :
 * int (*funopen$x0)(void*,char*,int);
 * }
 */
public interface funopen$x0 {

    int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2);
    static MemorySegment allocate(funopen$x0 fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$42.const$2, fi, constants$20.const$0, scope);
    }
    static funopen$x0 ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2) -> {
            try {
                return (int)constants$23.const$1.invokeExact(symbol, __x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


