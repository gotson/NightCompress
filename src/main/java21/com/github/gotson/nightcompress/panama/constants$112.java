// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$112 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$112() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "archive_read_add_passphrase",
        constants$13.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "archive_read_set_passphrase_callback",
        constants$17.const$4
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "archive_read_extract",
        constants$20.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "archive_read_extract2",
        constants$17.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(archive_read_extract_set_progress_callback$_progress_func.class, "apply", constants$0.const$3);
    static final FunctionDescriptor const$5 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "archive_read_extract_set_progress_callback",
        constants$112.const$5
    );
}


