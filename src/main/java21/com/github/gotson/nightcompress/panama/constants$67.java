// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$67 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$67() {}
    static final MemorySegment const$0 = RuntimeHelper.lookupGlobalVariable("optarg", RuntimeHelper.POINTER);
    static final MemorySegment const$1 = RuntimeHelper.lookupGlobalVariable("optind", JAVA_INT);
    static final MemorySegment const$2 = RuntimeHelper.lookupGlobalVariable("opterr", JAVA_INT);
    static final MemorySegment const$3 = RuntimeHelper.lookupGlobalVariable("optopt", JAVA_INT);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "brk",
        constants$30.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "chroot",
        constants$18.const$3
    );
}


