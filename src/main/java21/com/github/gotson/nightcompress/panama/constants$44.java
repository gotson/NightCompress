// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$44 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$44() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "__vsprintf_chk",
        constants$44.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "__vsnprintf_chk",
        constants$44.const$2
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("tm_sec"),
        JAVA_INT.withName("tm_min"),
        JAVA_INT.withName("tm_hour"),
        JAVA_INT.withName("tm_mday"),
        JAVA_INT.withName("tm_mon"),
        JAVA_INT.withName("tm_year"),
        JAVA_INT.withName("tm_wday"),
        JAVA_INT.withName("tm_yday"),
        JAVA_INT.withName("tm_isdst"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("tm_gmtoff"),
        RuntimeHelper.POINTER.withName("tm_zone")
    ).withName("tm");
    static final VarHandle const$5 = constants$44.const$4.varHandle(MemoryLayout.PathElement.groupElement("tm_sec"));
}


