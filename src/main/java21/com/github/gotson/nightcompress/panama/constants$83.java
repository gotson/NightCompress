// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$83 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$83() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "rcmd",
        constants$83.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "rcmd_af",
        constants$83.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "rresvport",
        constants$18.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "rresvport_af",
        constants$16.const$0
    );
}


