// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$85 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$85() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "setgroups",
        constants$12.const$4
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.ofVoid(
        JAVA_LONG
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "sethostid",
        constants$85.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "sethostname",
        constants$16.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "setkey",
        constants$0.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "setlogin",
        constants$18.const$3
    );
}


