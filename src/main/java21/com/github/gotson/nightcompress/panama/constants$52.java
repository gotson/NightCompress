// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$52 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$52() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "clock_gettime",
        constants$12.const$4
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "clock_gettime_nsec_np",
        constants$52.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "clock_settime",
        constants$12.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "timespec_get",
        constants$16.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "imaxabs",
        constants$50.const$4
    );
}


