// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$13 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$13() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "lstat",
        constants$13.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "mkdir",
        constants$12.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "mkfifo",
        constants$12.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "stat",
        constants$13.const$0
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_SHORT,
        JAVA_INT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "mknod",
        constants$13.const$5
    );
}


