// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$18 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$18() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "mkdirx_np",
        constants$13.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "mkfifox_np",
        constants$13.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "statx_np",
        constants$17.const$4
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "umaskx_np",
        constants$18.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "fstatx64_np",
        constants$17.const$0
    );
}


