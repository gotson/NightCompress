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

public class archive_h extends archive_h_1 {

    archive_h() {
        // Should not be called directly
    }
    private static final int _XOPEN_REALTIME_THREADS = (int)-1L;
    /**
     * {@snippet lang=c :
     * #define _XOPEN_REALTIME_THREADS -1
     * }
     */
    public static int _XOPEN_REALTIME_THREADS() {
        return _XOPEN_REALTIME_THREADS;
    }
    private static final int _XOPEN_SHM = (int)1L;
    /**
     * {@snippet lang=c :
     * #define _XOPEN_SHM 1
     * }
     */
    public static int _XOPEN_SHM() {
        return _XOPEN_SHM;
    }
    private static final int _XOPEN_STREAMS = (int)-1L;
    /**
     * {@snippet lang=c :
     * #define _XOPEN_STREAMS -1
     * }
     */
    public static int _XOPEN_STREAMS() {
        return _XOPEN_STREAMS;
    }
    private static final int _XOPEN_UNIX = (int)1L;
    /**
     * {@snippet lang=c :
     * #define _XOPEN_UNIX 1
     * }
     */
    public static int _XOPEN_UNIX() {
        return _XOPEN_UNIX;
    }
    private static final int _SC_PAGE_SIZE = (int)29L;
    /**
     * {@snippet lang=c :
     * #define _SC_PAGE_SIZE 29
     * }
     */
    public static int _SC_PAGE_SIZE() {
        return _SC_PAGE_SIZE;
    }
    private static final long __DARWIN_NFDBITS = 32L;
    /**
     * {@snippet lang=c :
     * #define __DARWIN_NFDBITS 32
     * }
     */
    public static long __DARWIN_NFDBITS() {
        return __DARWIN_NFDBITS;
    }
    private static final int FD_SETSIZE = (int)1024L;
    /**
     * {@snippet lang=c :
     * #define FD_SETSIZE 1024
     * }
     */
    public static int FD_SETSIZE() {
        return FD_SETSIZE;
    }
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_VERSION_ONLY_STRING "3.5.0"
     * }
     */
    public static MemorySegment ARCHIVE_VERSION_ONLY_STRING() {
        class Holder {
            static final MemorySegment ARCHIVE_VERSION_ONLY_STRING
                = archive_h.LIBRARY_ARENA.allocateFrom("3.5.0");
        }
        return Holder.ARCHIVE_VERSION_ONLY_STRING;
    }
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_VERSION_STRING "libarchive 3.5.0"
     * }
     */
    public static MemorySegment ARCHIVE_VERSION_STRING() {
        class Holder {
            static final MemorySegment ARCHIVE_VERSION_STRING
                = archive_h.LIBRARY_ARENA.allocateFrom("libarchive 3.5.0");
        }
        return Holder.ARCHIVE_VERSION_STRING;
    }
    private static final int ARCHIVE_RETRY = (int)-10L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_RETRY -10
     * }
     */
    public static int ARCHIVE_RETRY() {
        return ARCHIVE_RETRY;
    }
    private static final int ARCHIVE_WARN = (int)-20L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_WARN -20
     * }
     */
    public static int ARCHIVE_WARN() {
        return ARCHIVE_WARN;
    }
    private static final int ARCHIVE_FAILED = (int)-25L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_FAILED -25
     * }
     */
    public static int ARCHIVE_FAILED() {
        return ARCHIVE_FAILED;
    }
    private static final int ARCHIVE_FATAL = (int)-30L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_FATAL -30
     * }
     */
    public static int ARCHIVE_FATAL() {
        return ARCHIVE_FATAL;
    }
    private static final int ARCHIVE_COMPRESSION_NONE = (int)0L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_COMPRESSION_NONE 0
     * }
     */
    public static int ARCHIVE_COMPRESSION_NONE() {
        return ARCHIVE_COMPRESSION_NONE;
    }
    private static final int ARCHIVE_COMPRESSION_GZIP = (int)1L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_COMPRESSION_GZIP 1
     * }
     */
    public static int ARCHIVE_COMPRESSION_GZIP() {
        return ARCHIVE_COMPRESSION_GZIP;
    }
    private static final int ARCHIVE_COMPRESSION_BZIP2 = (int)2L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_COMPRESSION_BZIP2 2
     * }
     */
    public static int ARCHIVE_COMPRESSION_BZIP2() {
        return ARCHIVE_COMPRESSION_BZIP2;
    }
    private static final int ARCHIVE_COMPRESSION_COMPRESS = (int)3L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_COMPRESSION_COMPRESS 3
     * }
     */
    public static int ARCHIVE_COMPRESSION_COMPRESS() {
        return ARCHIVE_COMPRESSION_COMPRESS;
    }
    private static final int ARCHIVE_COMPRESSION_PROGRAM = (int)4L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_COMPRESSION_PROGRAM 4
     * }
     */
    public static int ARCHIVE_COMPRESSION_PROGRAM() {
        return ARCHIVE_COMPRESSION_PROGRAM;
    }
    private static final int ARCHIVE_COMPRESSION_LZMA = (int)5L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_COMPRESSION_LZMA 5
     * }
     */
    public static int ARCHIVE_COMPRESSION_LZMA() {
        return ARCHIVE_COMPRESSION_LZMA;
    }
    private static final int ARCHIVE_COMPRESSION_XZ = (int)6L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_COMPRESSION_XZ 6
     * }
     */
    public static int ARCHIVE_COMPRESSION_XZ() {
        return ARCHIVE_COMPRESSION_XZ;
    }
    private static final int ARCHIVE_COMPRESSION_UU = (int)7L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_COMPRESSION_UU 7
     * }
     */
    public static int ARCHIVE_COMPRESSION_UU() {
        return ARCHIVE_COMPRESSION_UU;
    }
    private static final int ARCHIVE_COMPRESSION_RPM = (int)8L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_COMPRESSION_RPM 8
     * }
     */
    public static int ARCHIVE_COMPRESSION_RPM() {
        return ARCHIVE_COMPRESSION_RPM;
    }
    private static final int ARCHIVE_COMPRESSION_LZIP = (int)9L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_COMPRESSION_LZIP 9
     * }
     */
    public static int ARCHIVE_COMPRESSION_LZIP() {
        return ARCHIVE_COMPRESSION_LZIP;
    }
    private static final int ARCHIVE_COMPRESSION_LRZIP = (int)10L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_COMPRESSION_LRZIP 10
     * }
     */
    public static int ARCHIVE_COMPRESSION_LRZIP() {
        return ARCHIVE_COMPRESSION_LRZIP;
    }
    private static final int ARCHIVE_FORMAT_CPIO_POSIX = (int)65537L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_FORMAT_CPIO_POSIX 65537
     * }
     */
    public static int ARCHIVE_FORMAT_CPIO_POSIX() {
        return ARCHIVE_FORMAT_CPIO_POSIX;
    }
    private static final int ARCHIVE_FORMAT_CPIO_BIN_LE = (int)65538L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_FORMAT_CPIO_BIN_LE 65538
     * }
     */
    public static int ARCHIVE_FORMAT_CPIO_BIN_LE() {
        return ARCHIVE_FORMAT_CPIO_BIN_LE;
    }
    private static final int ARCHIVE_FORMAT_CPIO_BIN_BE = (int)65539L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_FORMAT_CPIO_BIN_BE 65539
     * }
     */
    public static int ARCHIVE_FORMAT_CPIO_BIN_BE() {
        return ARCHIVE_FORMAT_CPIO_BIN_BE;
    }
    private static final int ARCHIVE_FORMAT_CPIO_SVR4_NOCRC = (int)65540L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_FORMAT_CPIO_SVR4_NOCRC 65540
     * }
     */
    public static int ARCHIVE_FORMAT_CPIO_SVR4_NOCRC() {
        return ARCHIVE_FORMAT_CPIO_SVR4_NOCRC;
    }
    private static final int ARCHIVE_FORMAT_CPIO_SVR4_CRC = (int)65541L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_FORMAT_CPIO_SVR4_CRC 65541
     * }
     */
    public static int ARCHIVE_FORMAT_CPIO_SVR4_CRC() {
        return ARCHIVE_FORMAT_CPIO_SVR4_CRC;
    }
    private static final int ARCHIVE_FORMAT_CPIO_AFIO_LARGE = (int)65542L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_FORMAT_CPIO_AFIO_LARGE 65542
     * }
     */
    public static int ARCHIVE_FORMAT_CPIO_AFIO_LARGE() {
        return ARCHIVE_FORMAT_CPIO_AFIO_LARGE;
    }
    private static final int ARCHIVE_FORMAT_SHAR_BASE = (int)131073L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_FORMAT_SHAR_BASE 131073
     * }
     */
    public static int ARCHIVE_FORMAT_SHAR_BASE() {
        return ARCHIVE_FORMAT_SHAR_BASE;
    }
    private static final int ARCHIVE_FORMAT_SHAR_DUMP = (int)131074L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_FORMAT_SHAR_DUMP 131074
     * }
     */
    public static int ARCHIVE_FORMAT_SHAR_DUMP() {
        return ARCHIVE_FORMAT_SHAR_DUMP;
    }
    private static final int ARCHIVE_FORMAT_TAR_USTAR = (int)196609L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_FORMAT_TAR_USTAR 196609
     * }
     */
    public static int ARCHIVE_FORMAT_TAR_USTAR() {
        return ARCHIVE_FORMAT_TAR_USTAR;
    }
    private static final int ARCHIVE_FORMAT_TAR_PAX_INTERCHANGE = (int)196610L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_FORMAT_TAR_PAX_INTERCHANGE 196610
     * }
     */
    public static int ARCHIVE_FORMAT_TAR_PAX_INTERCHANGE() {
        return ARCHIVE_FORMAT_TAR_PAX_INTERCHANGE;
    }
    private static final int ARCHIVE_FORMAT_TAR_PAX_RESTRICTED = (int)196611L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_FORMAT_TAR_PAX_RESTRICTED 196611
     * }
     */
    public static int ARCHIVE_FORMAT_TAR_PAX_RESTRICTED() {
        return ARCHIVE_FORMAT_TAR_PAX_RESTRICTED;
    }
    private static final int ARCHIVE_FORMAT_TAR_GNUTAR = (int)196612L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_FORMAT_TAR_GNUTAR 196612
     * }
     */
    public static int ARCHIVE_FORMAT_TAR_GNUTAR() {
        return ARCHIVE_FORMAT_TAR_GNUTAR;
    }
    private static final int ARCHIVE_FORMAT_ISO9660_ROCKRIDGE = (int)262145L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_FORMAT_ISO9660_ROCKRIDGE 262145
     * }
     */
    public static int ARCHIVE_FORMAT_ISO9660_ROCKRIDGE() {
        return ARCHIVE_FORMAT_ISO9660_ROCKRIDGE;
    }
    private static final int ARCHIVE_FORMAT_AR_GNU = (int)458753L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_FORMAT_AR_GNU 458753
     * }
     */
    public static int ARCHIVE_FORMAT_AR_GNU() {
        return ARCHIVE_FORMAT_AR_GNU;
    }
    private static final int ARCHIVE_FORMAT_AR_BSD = (int)458754L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_FORMAT_AR_BSD 458754
     * }
     */
    public static int ARCHIVE_FORMAT_AR_BSD() {
        return ARCHIVE_FORMAT_AR_BSD;
    }
    private static final int ARCHIVE_READ_FORMAT_CAPS_NONE = (int)0L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_READ_FORMAT_CAPS_NONE 0
     * }
     */
    public static int ARCHIVE_READ_FORMAT_CAPS_NONE() {
        return ARCHIVE_READ_FORMAT_CAPS_NONE;
    }
    private static final int ARCHIVE_READ_FORMAT_CAPS_ENCRYPT_DATA = (int)1L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_READ_FORMAT_CAPS_ENCRYPT_DATA 1
     * }
     */
    public static int ARCHIVE_READ_FORMAT_CAPS_ENCRYPT_DATA() {
        return ARCHIVE_READ_FORMAT_CAPS_ENCRYPT_DATA;
    }
    private static final int ARCHIVE_READ_FORMAT_CAPS_ENCRYPT_METADATA = (int)2L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_READ_FORMAT_CAPS_ENCRYPT_METADATA 2
     * }
     */
    public static int ARCHIVE_READ_FORMAT_CAPS_ENCRYPT_METADATA() {
        return ARCHIVE_READ_FORMAT_CAPS_ENCRYPT_METADATA;
    }
    private static final int ARCHIVE_READ_FORMAT_ENCRYPTION_UNSUPPORTED = (int)-2L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_READ_FORMAT_ENCRYPTION_UNSUPPORTED -2
     * }
     */
    public static int ARCHIVE_READ_FORMAT_ENCRYPTION_UNSUPPORTED() {
        return ARCHIVE_READ_FORMAT_ENCRYPTION_UNSUPPORTED;
    }
    private static final int ARCHIVE_READ_FORMAT_ENCRYPTION_DONT_KNOW = (int)-1L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_READ_FORMAT_ENCRYPTION_DONT_KNOW -1
     * }
     */
    public static int ARCHIVE_READ_FORMAT_ENCRYPTION_DONT_KNOW() {
        return ARCHIVE_READ_FORMAT_ENCRYPTION_DONT_KNOW;
    }
    private static final int ARCHIVE_EXTRACT_OWNER = (int)1L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_EXTRACT_OWNER 1
     * }
     */
    public static int ARCHIVE_EXTRACT_OWNER() {
        return ARCHIVE_EXTRACT_OWNER;
    }
    private static final int ARCHIVE_EXTRACT_PERM = (int)2L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_EXTRACT_PERM 2
     * }
     */
    public static int ARCHIVE_EXTRACT_PERM() {
        return ARCHIVE_EXTRACT_PERM;
    }
    private static final int ARCHIVE_EXTRACT_TIME = (int)4L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_EXTRACT_TIME 4
     * }
     */
    public static int ARCHIVE_EXTRACT_TIME() {
        return ARCHIVE_EXTRACT_TIME;
    }
    private static final int ARCHIVE_EXTRACT_NO_OVERWRITE = (int)8L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_EXTRACT_NO_OVERWRITE 8
     * }
     */
    public static int ARCHIVE_EXTRACT_NO_OVERWRITE() {
        return ARCHIVE_EXTRACT_NO_OVERWRITE;
    }
    private static final int ARCHIVE_EXTRACT_UNLINK = (int)16L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_EXTRACT_UNLINK 16
     * }
     */
    public static int ARCHIVE_EXTRACT_UNLINK() {
        return ARCHIVE_EXTRACT_UNLINK;
    }
    private static final int ARCHIVE_EXTRACT_ACL = (int)32L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_EXTRACT_ACL 32
     * }
     */
    public static int ARCHIVE_EXTRACT_ACL() {
        return ARCHIVE_EXTRACT_ACL;
    }
    private static final int ARCHIVE_EXTRACT_FFLAGS = (int)64L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_EXTRACT_FFLAGS 64
     * }
     */
    public static int ARCHIVE_EXTRACT_FFLAGS() {
        return ARCHIVE_EXTRACT_FFLAGS;
    }
    private static final int ARCHIVE_EXTRACT_XATTR = (int)128L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_EXTRACT_XATTR 128
     * }
     */
    public static int ARCHIVE_EXTRACT_XATTR() {
        return ARCHIVE_EXTRACT_XATTR;
    }
    private static final int ARCHIVE_EXTRACT_SECURE_SYMLINKS = (int)256L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_EXTRACT_SECURE_SYMLINKS 256
     * }
     */
    public static int ARCHIVE_EXTRACT_SECURE_SYMLINKS() {
        return ARCHIVE_EXTRACT_SECURE_SYMLINKS;
    }
    private static final int ARCHIVE_EXTRACT_SECURE_NODOTDOT = (int)512L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_EXTRACT_SECURE_NODOTDOT 512
     * }
     */
    public static int ARCHIVE_EXTRACT_SECURE_NODOTDOT() {
        return ARCHIVE_EXTRACT_SECURE_NODOTDOT;
    }
    private static final int ARCHIVE_EXTRACT_NO_AUTODIR = (int)1024L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_EXTRACT_NO_AUTODIR 1024
     * }
     */
    public static int ARCHIVE_EXTRACT_NO_AUTODIR() {
        return ARCHIVE_EXTRACT_NO_AUTODIR;
    }
    private static final int ARCHIVE_EXTRACT_NO_OVERWRITE_NEWER = (int)2048L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_EXTRACT_NO_OVERWRITE_NEWER 2048
     * }
     */
    public static int ARCHIVE_EXTRACT_NO_OVERWRITE_NEWER() {
        return ARCHIVE_EXTRACT_NO_OVERWRITE_NEWER;
    }
    private static final int ARCHIVE_EXTRACT_SPARSE = (int)4096L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_EXTRACT_SPARSE 4096
     * }
     */
    public static int ARCHIVE_EXTRACT_SPARSE() {
        return ARCHIVE_EXTRACT_SPARSE;
    }
    private static final int ARCHIVE_EXTRACT_MAC_METADATA = (int)8192L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_EXTRACT_MAC_METADATA 8192
     * }
     */
    public static int ARCHIVE_EXTRACT_MAC_METADATA() {
        return ARCHIVE_EXTRACT_MAC_METADATA;
    }
    private static final int ARCHIVE_EXTRACT_NO_HFS_COMPRESSION = (int)16384L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_EXTRACT_NO_HFS_COMPRESSION 16384
     * }
     */
    public static int ARCHIVE_EXTRACT_NO_HFS_COMPRESSION() {
        return ARCHIVE_EXTRACT_NO_HFS_COMPRESSION;
    }
    private static final int ARCHIVE_EXTRACT_HFS_COMPRESSION_FORCED = (int)32768L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_EXTRACT_HFS_COMPRESSION_FORCED 32768
     * }
     */
    public static int ARCHIVE_EXTRACT_HFS_COMPRESSION_FORCED() {
        return ARCHIVE_EXTRACT_HFS_COMPRESSION_FORCED;
    }
    private static final int ARCHIVE_EXTRACT_SECURE_NOABSOLUTEPATHS = (int)65536L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_EXTRACT_SECURE_NOABSOLUTEPATHS 65536
     * }
     */
    public static int ARCHIVE_EXTRACT_SECURE_NOABSOLUTEPATHS() {
        return ARCHIVE_EXTRACT_SECURE_NOABSOLUTEPATHS;
    }
    private static final int ARCHIVE_EXTRACT_CLEAR_NOCHANGE_FFLAGS = (int)131072L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_EXTRACT_CLEAR_NOCHANGE_FFLAGS 131072
     * }
     */
    public static int ARCHIVE_EXTRACT_CLEAR_NOCHANGE_FFLAGS() {
        return ARCHIVE_EXTRACT_CLEAR_NOCHANGE_FFLAGS;
    }
    private static final int ARCHIVE_EXTRACT_SAFE_WRITES = (int)262144L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_EXTRACT_SAFE_WRITES 262144
     * }
     */
    public static int ARCHIVE_EXTRACT_SAFE_WRITES() {
        return ARCHIVE_EXTRACT_SAFE_WRITES;
    }
    private static final int ARCHIVE_READDISK_RESTORE_ATIME = (int)1L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_READDISK_RESTORE_ATIME 1
     * }
     */
    public static int ARCHIVE_READDISK_RESTORE_ATIME() {
        return ARCHIVE_READDISK_RESTORE_ATIME;
    }
    private static final int ARCHIVE_READDISK_HONOR_NODUMP = (int)2L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_READDISK_HONOR_NODUMP 2
     * }
     */
    public static int ARCHIVE_READDISK_HONOR_NODUMP() {
        return ARCHIVE_READDISK_HONOR_NODUMP;
    }
    private static final int ARCHIVE_READDISK_MAC_COPYFILE = (int)4L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_READDISK_MAC_COPYFILE 4
     * }
     */
    public static int ARCHIVE_READDISK_MAC_COPYFILE() {
        return ARCHIVE_READDISK_MAC_COPYFILE;
    }
    private static final int ARCHIVE_READDISK_NO_TRAVERSE_MOUNTS = (int)8L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_READDISK_NO_TRAVERSE_MOUNTS 8
     * }
     */
    public static int ARCHIVE_READDISK_NO_TRAVERSE_MOUNTS() {
        return ARCHIVE_READDISK_NO_TRAVERSE_MOUNTS;
    }
    private static final int ARCHIVE_READDISK_NO_XATTR = (int)16L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_READDISK_NO_XATTR 16
     * }
     */
    public static int ARCHIVE_READDISK_NO_XATTR() {
        return ARCHIVE_READDISK_NO_XATTR;
    }
    private static final int ARCHIVE_READDISK_NO_ACL = (int)32L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_READDISK_NO_ACL 32
     * }
     */
    public static int ARCHIVE_READDISK_NO_ACL() {
        return ARCHIVE_READDISK_NO_ACL;
    }
    private static final int ARCHIVE_READDISK_NO_FFLAGS = (int)64L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_READDISK_NO_FFLAGS 64
     * }
     */
    public static int ARCHIVE_READDISK_NO_FFLAGS() {
        return ARCHIVE_READDISK_NO_FFLAGS;
    }
    private static final int ARCHIVE_MATCH_MTIME = (int)256L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_MATCH_MTIME 256
     * }
     */
    public static int ARCHIVE_MATCH_MTIME() {
        return ARCHIVE_MATCH_MTIME;
    }
    private static final int ARCHIVE_MATCH_CTIME = (int)512L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_MATCH_CTIME 512
     * }
     */
    public static int ARCHIVE_MATCH_CTIME() {
        return ARCHIVE_MATCH_CTIME;
    }
    private static final int ARCHIVE_MATCH_NEWER = (int)1L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_MATCH_NEWER 1
     * }
     */
    public static int ARCHIVE_MATCH_NEWER() {
        return ARCHIVE_MATCH_NEWER;
    }
    private static final int ARCHIVE_MATCH_OLDER = (int)2L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_MATCH_OLDER 2
     * }
     */
    public static int ARCHIVE_MATCH_OLDER() {
        return ARCHIVE_MATCH_OLDER;
    }
    private static final int ARCHIVE_MATCH_EQUAL = (int)16L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_MATCH_EQUAL 16
     * }
     */
    public static int ARCHIVE_MATCH_EQUAL() {
        return ARCHIVE_MATCH_EQUAL;
    }
    private static final int __DARWIN_BYTE_ORDER = (int)1234L;
    /**
     * {@snippet lang=c :
     * #define __DARWIN_BYTE_ORDER 1234
     * }
     */
    public static int __DARWIN_BYTE_ORDER() {
        return __DARWIN_BYTE_ORDER;
    }
    private static final int LITTLE_ENDIAN = (int)1234L;
    /**
     * {@snippet lang=c :
     * #define LITTLE_ENDIAN 1234
     * }
     */
    public static int LITTLE_ENDIAN() {
        return LITTLE_ENDIAN;
    }
    private static final int BIG_ENDIAN = (int)4321L;
    /**
     * {@snippet lang=c :
     * #define BIG_ENDIAN 4321
     * }
     */
    public static int BIG_ENDIAN() {
        return BIG_ENDIAN;
    }
    private static final int PDP_ENDIAN = (int)3412L;
    /**
     * {@snippet lang=c :
     * #define PDP_ENDIAN 3412
     * }
     */
    public static int PDP_ENDIAN() {
        return PDP_ENDIAN;
    }
    private static final int BYTE_ORDER = (int)1234L;
    /**
     * {@snippet lang=c :
     * #define BYTE_ORDER 1234
     * }
     */
    public static int BYTE_ORDER() {
        return BYTE_ORDER;
    }
    private static final int NBBY = (int)8L;
    /**
     * {@snippet lang=c :
     * #define NBBY 8
     * }
     */
    public static int NBBY() {
        return NBBY;
    }
    private static final long NFDBITS = 32L;
    /**
     * {@snippet lang=c :
     * #define NFDBITS 32
     * }
     */
    public static long NFDBITS() {
        return NFDBITS;
    }
    private static final short AE_IFMT = (short)61440L;
    /**
     * {@snippet lang=c :
     * #define AE_IFMT 61440
     * }
     */
    public static short AE_IFMT() {
        return AE_IFMT;
    }
    private static final short AE_IFREG = (short)32768L;
    /**
     * {@snippet lang=c :
     * #define AE_IFREG 32768
     * }
     */
    public static short AE_IFREG() {
        return AE_IFREG;
    }
    private static final short AE_IFLNK = (short)40960L;
    /**
     * {@snippet lang=c :
     * #define AE_IFLNK 40960
     * }
     */
    public static short AE_IFLNK() {
        return AE_IFLNK;
    }
    private static final short AE_IFSOCK = (short)49152L;
    /**
     * {@snippet lang=c :
     * #define AE_IFSOCK 49152
     * }
     */
    public static short AE_IFSOCK() {
        return AE_IFSOCK;
    }
    private static final short AE_IFCHR = (short)8192L;
    /**
     * {@snippet lang=c :
     * #define AE_IFCHR 8192
     * }
     */
    public static short AE_IFCHR() {
        return AE_IFCHR;
    }
    private static final short AE_IFBLK = (short)24576L;
    /**
     * {@snippet lang=c :
     * #define AE_IFBLK 24576
     * }
     */
    public static short AE_IFBLK() {
        return AE_IFBLK;
    }
    private static final short AE_IFDIR = (short)16384L;
    /**
     * {@snippet lang=c :
     * #define AE_IFDIR 16384
     * }
     */
    public static short AE_IFDIR() {
        return AE_IFDIR;
    }
    private static final short AE_IFIFO = (short)4096L;
    /**
     * {@snippet lang=c :
     * #define AE_IFIFO 4096
     * }
     */
    public static short AE_IFIFO() {
        return AE_IFIFO;
    }
    private static final int ARCHIVE_ENTRY_ACL_PERMS_POSIX1E = (int)7L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_ENTRY_ACL_PERMS_POSIX1E 7
     * }
     */
    public static int ARCHIVE_ENTRY_ACL_PERMS_POSIX1E() {
        return ARCHIVE_ENTRY_ACL_PERMS_POSIX1E;
    }
    private static final int ARCHIVE_ENTRY_ACL_PERMS_NFS4 = (int)65529L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_ENTRY_ACL_PERMS_NFS4 65529
     * }
     */
    public static int ARCHIVE_ENTRY_ACL_PERMS_NFS4() {
        return ARCHIVE_ENTRY_ACL_PERMS_NFS4;
    }
    private static final int ARCHIVE_ENTRY_ACL_INHERITANCE_NFS4 = (int)2130706432L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_ENTRY_ACL_INHERITANCE_NFS4 2130706432
     * }
     */
    public static int ARCHIVE_ENTRY_ACL_INHERITANCE_NFS4() {
        return ARCHIVE_ENTRY_ACL_INHERITANCE_NFS4;
    }
    private static final int ARCHIVE_ENTRY_ACL_TYPE_POSIX1E = (int)768L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_ENTRY_ACL_TYPE_POSIX1E 768
     * }
     */
    public static int ARCHIVE_ENTRY_ACL_TYPE_POSIX1E() {
        return ARCHIVE_ENTRY_ACL_TYPE_POSIX1E;
    }
    private static final int ARCHIVE_ENTRY_ACL_TYPE_NFS4 = (int)15360L;
    /**
     * {@snippet lang=c :
     * #define ARCHIVE_ENTRY_ACL_TYPE_NFS4 15360
     * }
     */
    public static int ARCHIVE_ENTRY_ACL_TYPE_NFS4() {
        return ARCHIVE_ENTRY_ACL_TYPE_NFS4;
    }
}
