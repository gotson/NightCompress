// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$15 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$15() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_SHORT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "mkdirat",
        constants$15.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "mkfifoat",
        constants$15.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "mknodat",
        constants$14.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "futimens",
        constants$12.const$4
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "utimensat",
        constants$14.const$4
    );
}


