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
 * struct stat {
 *     dev_t st_dev;
 *     mode_t st_mode;
 *     nlink_t st_nlink;
 *     __darwin_ino64_t st_ino;
 *     uid_t st_uid;
 *     gid_t st_gid;
 *     dev_t st_rdev;
 *     struct timespec st_atimespec;
 *     struct timespec st_mtimespec;
 *     struct timespec st_ctimespec;
 *     struct timespec st_birthtimespec;
 *     off_t st_size;
 *     blkcnt_t st_blocks;
 *     blksize_t st_blksize;
 *     __uint32_t st_flags;
 *     __uint32_t st_gen;
 *     __int32_t st_lspare;
 *     __int64_t st_qspare[2];
 * }
 * }
 */
public class stat {

    stat() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        archive_h.C_INT.withName("st_dev"),
        archive_h.C_SHORT.withName("st_mode"),
        archive_h.C_SHORT.withName("st_nlink"),
        archive_h.C_LONG_LONG.withName("st_ino"),
        archive_h.C_INT.withName("st_uid"),
        archive_h.C_INT.withName("st_gid"),
        archive_h.C_INT.withName("st_rdev"),
        MemoryLayout.paddingLayout(4),
        timespec.layout().withName("st_atimespec"),
        timespec.layout().withName("st_mtimespec"),
        timespec.layout().withName("st_ctimespec"),
        timespec.layout().withName("st_birthtimespec"),
        archive_h.C_LONG_LONG.withName("st_size"),
        archive_h.C_LONG_LONG.withName("st_blocks"),
        archive_h.C_INT.withName("st_blksize"),
        archive_h.C_INT.withName("st_flags"),
        archive_h.C_INT.withName("st_gen"),
        archive_h.C_INT.withName("st_lspare"),
        MemoryLayout.sequenceLayout(2, archive_h.C_LONG_LONG).withName("st_qspare")
    ).withName("stat");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt st_dev$LAYOUT = (OfInt)$LAYOUT.select(groupElement("st_dev"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * dev_t st_dev
     * }
     */
    public static final OfInt st_dev$layout() {
        return st_dev$LAYOUT;
    }

    private static final long st_dev$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * dev_t st_dev
     * }
     */
    public static final long st_dev$offset() {
        return st_dev$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * dev_t st_dev
     * }
     */
    public static int st_dev(MemorySegment struct) {
        return struct.get(st_dev$LAYOUT, st_dev$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * dev_t st_dev
     * }
     */
    public static void st_dev(MemorySegment struct, int fieldValue) {
        struct.set(st_dev$LAYOUT, st_dev$OFFSET, fieldValue);
    }

    private static final OfShort st_mode$LAYOUT = (OfShort)$LAYOUT.select(groupElement("st_mode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * mode_t st_mode
     * }
     */
    public static final OfShort st_mode$layout() {
        return st_mode$LAYOUT;
    }

    private static final long st_mode$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * mode_t st_mode
     * }
     */
    public static final long st_mode$offset() {
        return st_mode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * mode_t st_mode
     * }
     */
    public static short st_mode(MemorySegment struct) {
        return struct.get(st_mode$LAYOUT, st_mode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * mode_t st_mode
     * }
     */
    public static void st_mode(MemorySegment struct, short fieldValue) {
        struct.set(st_mode$LAYOUT, st_mode$OFFSET, fieldValue);
    }

    private static final OfShort st_nlink$LAYOUT = (OfShort)$LAYOUT.select(groupElement("st_nlink"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * nlink_t st_nlink
     * }
     */
    public static final OfShort st_nlink$layout() {
        return st_nlink$LAYOUT;
    }

    private static final long st_nlink$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * nlink_t st_nlink
     * }
     */
    public static final long st_nlink$offset() {
        return st_nlink$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * nlink_t st_nlink
     * }
     */
    public static short st_nlink(MemorySegment struct) {
        return struct.get(st_nlink$LAYOUT, st_nlink$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * nlink_t st_nlink
     * }
     */
    public static void st_nlink(MemorySegment struct, short fieldValue) {
        struct.set(st_nlink$LAYOUT, st_nlink$OFFSET, fieldValue);
    }

    private static final OfLong st_ino$LAYOUT = (OfLong)$LAYOUT.select(groupElement("st_ino"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __darwin_ino64_t st_ino
     * }
     */
    public static final OfLong st_ino$layout() {
        return st_ino$LAYOUT;
    }

    private static final long st_ino$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __darwin_ino64_t st_ino
     * }
     */
    public static final long st_ino$offset() {
        return st_ino$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __darwin_ino64_t st_ino
     * }
     */
    public static long st_ino(MemorySegment struct) {
        return struct.get(st_ino$LAYOUT, st_ino$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __darwin_ino64_t st_ino
     * }
     */
    public static void st_ino(MemorySegment struct, long fieldValue) {
        struct.set(st_ino$LAYOUT, st_ino$OFFSET, fieldValue);
    }

    private static final OfInt st_uid$LAYOUT = (OfInt)$LAYOUT.select(groupElement("st_uid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uid_t st_uid
     * }
     */
    public static final OfInt st_uid$layout() {
        return st_uid$LAYOUT;
    }

    private static final long st_uid$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uid_t st_uid
     * }
     */
    public static final long st_uid$offset() {
        return st_uid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uid_t st_uid
     * }
     */
    public static int st_uid(MemorySegment struct) {
        return struct.get(st_uid$LAYOUT, st_uid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uid_t st_uid
     * }
     */
    public static void st_uid(MemorySegment struct, int fieldValue) {
        struct.set(st_uid$LAYOUT, st_uid$OFFSET, fieldValue);
    }

    private static final OfInt st_gid$LAYOUT = (OfInt)$LAYOUT.select(groupElement("st_gid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gid_t st_gid
     * }
     */
    public static final OfInt st_gid$layout() {
        return st_gid$LAYOUT;
    }

    private static final long st_gid$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gid_t st_gid
     * }
     */
    public static final long st_gid$offset() {
        return st_gid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gid_t st_gid
     * }
     */
    public static int st_gid(MemorySegment struct) {
        return struct.get(st_gid$LAYOUT, st_gid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gid_t st_gid
     * }
     */
    public static void st_gid(MemorySegment struct, int fieldValue) {
        struct.set(st_gid$LAYOUT, st_gid$OFFSET, fieldValue);
    }

    private static final OfInt st_rdev$LAYOUT = (OfInt)$LAYOUT.select(groupElement("st_rdev"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * dev_t st_rdev
     * }
     */
    public static final OfInt st_rdev$layout() {
        return st_rdev$LAYOUT;
    }

    private static final long st_rdev$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * dev_t st_rdev
     * }
     */
    public static final long st_rdev$offset() {
        return st_rdev$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * dev_t st_rdev
     * }
     */
    public static int st_rdev(MemorySegment struct) {
        return struct.get(st_rdev$LAYOUT, st_rdev$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * dev_t st_rdev
     * }
     */
    public static void st_rdev(MemorySegment struct, int fieldValue) {
        struct.set(st_rdev$LAYOUT, st_rdev$OFFSET, fieldValue);
    }

    private static final GroupLayout st_atimespec$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("st_atimespec"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct timespec st_atimespec
     * }
     */
    public static final GroupLayout st_atimespec$layout() {
        return st_atimespec$LAYOUT;
    }

    private static final long st_atimespec$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct timespec st_atimespec
     * }
     */
    public static final long st_atimespec$offset() {
        return st_atimespec$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct timespec st_atimespec
     * }
     */
    public static MemorySegment st_atimespec(MemorySegment struct) {
        return struct.asSlice(st_atimespec$OFFSET, st_atimespec$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct timespec st_atimespec
     * }
     */
    public static void st_atimespec(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, st_atimespec$OFFSET, st_atimespec$LAYOUT.byteSize());
    }

    private static final GroupLayout st_mtimespec$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("st_mtimespec"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct timespec st_mtimespec
     * }
     */
    public static final GroupLayout st_mtimespec$layout() {
        return st_mtimespec$LAYOUT;
    }

    private static final long st_mtimespec$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct timespec st_mtimespec
     * }
     */
    public static final long st_mtimespec$offset() {
        return st_mtimespec$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct timespec st_mtimespec
     * }
     */
    public static MemorySegment st_mtimespec(MemorySegment struct) {
        return struct.asSlice(st_mtimespec$OFFSET, st_mtimespec$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct timespec st_mtimespec
     * }
     */
    public static void st_mtimespec(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, st_mtimespec$OFFSET, st_mtimespec$LAYOUT.byteSize());
    }

    private static final GroupLayout st_ctimespec$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("st_ctimespec"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct timespec st_ctimespec
     * }
     */
    public static final GroupLayout st_ctimespec$layout() {
        return st_ctimespec$LAYOUT;
    }

    private static final long st_ctimespec$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct timespec st_ctimespec
     * }
     */
    public static final long st_ctimespec$offset() {
        return st_ctimespec$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct timespec st_ctimespec
     * }
     */
    public static MemorySegment st_ctimespec(MemorySegment struct) {
        return struct.asSlice(st_ctimespec$OFFSET, st_ctimespec$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct timespec st_ctimespec
     * }
     */
    public static void st_ctimespec(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, st_ctimespec$OFFSET, st_ctimespec$LAYOUT.byteSize());
    }

    private static final GroupLayout st_birthtimespec$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("st_birthtimespec"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct timespec st_birthtimespec
     * }
     */
    public static final GroupLayout st_birthtimespec$layout() {
        return st_birthtimespec$LAYOUT;
    }

    private static final long st_birthtimespec$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct timespec st_birthtimespec
     * }
     */
    public static final long st_birthtimespec$offset() {
        return st_birthtimespec$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct timespec st_birthtimespec
     * }
     */
    public static MemorySegment st_birthtimespec(MemorySegment struct) {
        return struct.asSlice(st_birthtimespec$OFFSET, st_birthtimespec$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct timespec st_birthtimespec
     * }
     */
    public static void st_birthtimespec(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, st_birthtimespec$OFFSET, st_birthtimespec$LAYOUT.byteSize());
    }

    private static final OfLong st_size$LAYOUT = (OfLong)$LAYOUT.select(groupElement("st_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * off_t st_size
     * }
     */
    public static final OfLong st_size$layout() {
        return st_size$LAYOUT;
    }

    private static final long st_size$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * off_t st_size
     * }
     */
    public static final long st_size$offset() {
        return st_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * off_t st_size
     * }
     */
    public static long st_size(MemorySegment struct) {
        return struct.get(st_size$LAYOUT, st_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * off_t st_size
     * }
     */
    public static void st_size(MemorySegment struct, long fieldValue) {
        struct.set(st_size$LAYOUT, st_size$OFFSET, fieldValue);
    }

    private static final OfLong st_blocks$LAYOUT = (OfLong)$LAYOUT.select(groupElement("st_blocks"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * blkcnt_t st_blocks
     * }
     */
    public static final OfLong st_blocks$layout() {
        return st_blocks$LAYOUT;
    }

    private static final long st_blocks$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * blkcnt_t st_blocks
     * }
     */
    public static final long st_blocks$offset() {
        return st_blocks$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * blkcnt_t st_blocks
     * }
     */
    public static long st_blocks(MemorySegment struct) {
        return struct.get(st_blocks$LAYOUT, st_blocks$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * blkcnt_t st_blocks
     * }
     */
    public static void st_blocks(MemorySegment struct, long fieldValue) {
        struct.set(st_blocks$LAYOUT, st_blocks$OFFSET, fieldValue);
    }

    private static final OfInt st_blksize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("st_blksize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * blksize_t st_blksize
     * }
     */
    public static final OfInt st_blksize$layout() {
        return st_blksize$LAYOUT;
    }

    private static final long st_blksize$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * blksize_t st_blksize
     * }
     */
    public static final long st_blksize$offset() {
        return st_blksize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * blksize_t st_blksize
     * }
     */
    public static int st_blksize(MemorySegment struct) {
        return struct.get(st_blksize$LAYOUT, st_blksize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * blksize_t st_blksize
     * }
     */
    public static void st_blksize(MemorySegment struct, int fieldValue) {
        struct.set(st_blksize$LAYOUT, st_blksize$OFFSET, fieldValue);
    }

    private static final OfInt st_flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("st_flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __uint32_t st_flags
     * }
     */
    public static final OfInt st_flags$layout() {
        return st_flags$LAYOUT;
    }

    private static final long st_flags$OFFSET = 116;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __uint32_t st_flags
     * }
     */
    public static final long st_flags$offset() {
        return st_flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __uint32_t st_flags
     * }
     */
    public static int st_flags(MemorySegment struct) {
        return struct.get(st_flags$LAYOUT, st_flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __uint32_t st_flags
     * }
     */
    public static void st_flags(MemorySegment struct, int fieldValue) {
        struct.set(st_flags$LAYOUT, st_flags$OFFSET, fieldValue);
    }

    private static final OfInt st_gen$LAYOUT = (OfInt)$LAYOUT.select(groupElement("st_gen"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __uint32_t st_gen
     * }
     */
    public static final OfInt st_gen$layout() {
        return st_gen$LAYOUT;
    }

    private static final long st_gen$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __uint32_t st_gen
     * }
     */
    public static final long st_gen$offset() {
        return st_gen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __uint32_t st_gen
     * }
     */
    public static int st_gen(MemorySegment struct) {
        return struct.get(st_gen$LAYOUT, st_gen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __uint32_t st_gen
     * }
     */
    public static void st_gen(MemorySegment struct, int fieldValue) {
        struct.set(st_gen$LAYOUT, st_gen$OFFSET, fieldValue);
    }

    private static final OfInt st_lspare$LAYOUT = (OfInt)$LAYOUT.select(groupElement("st_lspare"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __int32_t st_lspare
     * }
     */
    public static final OfInt st_lspare$layout() {
        return st_lspare$LAYOUT;
    }

    private static final long st_lspare$OFFSET = 124;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __int32_t st_lspare
     * }
     */
    public static final long st_lspare$offset() {
        return st_lspare$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __int32_t st_lspare
     * }
     */
    public static int st_lspare(MemorySegment struct) {
        return struct.get(st_lspare$LAYOUT, st_lspare$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __int32_t st_lspare
     * }
     */
    public static void st_lspare(MemorySegment struct, int fieldValue) {
        struct.set(st_lspare$LAYOUT, st_lspare$OFFSET, fieldValue);
    }

    private static final SequenceLayout st_qspare$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("st_qspare"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __int64_t st_qspare[2]
     * }
     */
    public static final SequenceLayout st_qspare$layout() {
        return st_qspare$LAYOUT;
    }

    private static final long st_qspare$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __int64_t st_qspare[2]
     * }
     */
    public static final long st_qspare$offset() {
        return st_qspare$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __int64_t st_qspare[2]
     * }
     */
    public static MemorySegment st_qspare(MemorySegment struct) {
        return struct.asSlice(st_qspare$OFFSET, st_qspare$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __int64_t st_qspare[2]
     * }
     */
    public static void st_qspare(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, st_qspare$OFFSET, st_qspare$LAYOUT.byteSize());
    }

    private static long[] st_qspare$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * __int64_t st_qspare[2]
     * }
     */
    public static long[] st_qspare$dimensions() {
        return st_qspare$DIMS;
    }
    private static final VarHandle st_qspare$ELEM_HANDLE = st_qspare$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * __int64_t st_qspare[2]
     * }
     */
    public static long st_qspare(MemorySegment struct, long index0) {
        return (long)st_qspare$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * __int64_t st_qspare[2]
     * }
     */
    public static void st_qspare(MemorySegment struct, long index0, long fieldValue) {
        st_qspare$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

