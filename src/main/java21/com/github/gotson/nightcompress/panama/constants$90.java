// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$90 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$90() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "searchfs",
        constants$90.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "fsctl",
        constants$76.const$3
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "ffsctl",
        constants$90.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "fsync_volume_np",
        constants$16.const$3
    );
}


