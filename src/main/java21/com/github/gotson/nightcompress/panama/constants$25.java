// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

final class constants$25 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$25() {}
    static final VarHandle const$0 = constants$21.const$1.varHandle(MemoryLayout.PathElement.groupElement("_offset"));
    static final VarHandle const$1 = RuntimeHelper.POINTER.varHandle();
    static final MemorySegment const$2 = RuntimeHelper.lookupGlobalVariable("__stdinp", RuntimeHelper.POINTER);
    static final MemorySegment const$3 = RuntimeHelper.lookupGlobalVariable("__stdoutp", RuntimeHelper.POINTER);
    static final MemorySegment const$4 = RuntimeHelper.lookupGlobalVariable("__stderrp", RuntimeHelper.POINTER);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "clearerr",
        constants$0.const$3
    );
}


