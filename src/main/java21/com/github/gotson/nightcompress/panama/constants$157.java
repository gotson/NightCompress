// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$157 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$157() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "archive_entry_set_link",
        constants$32.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "archive_entry_set_link_utf8",
        constants$32.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "archive_entry_copy_link",
        constants$32.const$3
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "archive_entry_copy_link_w",
        constants$32.const$3
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "archive_entry_update_link_utf8",
        constants$13.const$0
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_SHORT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "archive_entry_set_mode",
        constants$157.const$5
    );
}


