// Generated by jextract

package com.github.gotson.nightcompress.panama;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef la_int64_t (archive_skip_callback)(struct archive *, void *, la_int64_t)
 * }
 */
public class archive_skip_callback {

    archive_skip_callback() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        long apply(MemorySegment _x0, MemorySegment _client_data, long request);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        archive_h.C_LONG_LONG,
        archive_h.C_POINTER,
        archive_h.C_POINTER,
        archive_h.C_LONG_LONG
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = archive_h.upcallHandle(archive_skip_callback.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(archive_skip_callback.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static long invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _client_data, long request) {
        try {
            return (long) DOWN$MH.invokeExact(funcPtr, _x0, _client_data, request);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}
