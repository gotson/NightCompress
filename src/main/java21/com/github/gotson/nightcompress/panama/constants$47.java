// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$47 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$47() {}
    static final MemorySegment const$0 = RuntimeHelper.lookupGlobalVariable("timezone", JAVA_LONG);
    static final MemorySegment const$1 = RuntimeHelper.lookupGlobalVariable("daylight", JAVA_INT);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "asctime",
        constants$30.const$3
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_LONG);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "clock",
        constants$47.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "ctime",
        constants$30.const$3
    );
}


