// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$49 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$49() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "strftime",
        constants$49.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "strptime",
        constants$28.const$3
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "time",
        constants$29.const$3
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid();
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "tzset",
        constants$49.const$4
    );
}


