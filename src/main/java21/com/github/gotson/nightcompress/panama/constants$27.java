// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$27 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$27() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "fgets",
        constants$27.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "fopen",
        constants$27.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandleVariadic(
        "fprintf",
        constants$13.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "fputc",
        constants$12.const$4
    );
}


