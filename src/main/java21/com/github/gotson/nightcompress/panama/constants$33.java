// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$33 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$33() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandleVariadic(
        "sprintf",
        constants$13.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandleVariadic(
        "sscanf",
        constants$13.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(RuntimeHelper.POINTER);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "tmpfile",
        constants$33.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "tmpnam",
        constants$30.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "ungetc",
        constants$12.const$4
    );
}


