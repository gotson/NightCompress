// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$38 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$38() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandleVariadic(
        "snprintf",
        constants$38.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "vfscanf",
        constants$17.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "vscanf",
        constants$13.const$0
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "vsnprintf",
        constants$38.const$4
    );
}


