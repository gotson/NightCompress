// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$57 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$57() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "linkat",
        constants$20.const$2
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "readlinkat",
        constants$57.const$1
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "symlinkat",
        constants$57.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "unlinkat",
        constants$57.const$5
    );
}


