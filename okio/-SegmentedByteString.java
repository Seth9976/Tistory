package okio;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import okio.internal.-ByteString;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000F\u001A\'\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b\u0005\u0010\u0006\u001A\u0013\u0010\b\u001A\u00020\u0007*\u00020\u0007H\u0000\u00A2\u0006\u0004\b\b\u0010\t\u001A\u0013\u0010\b\u001A\u00020\n*\u00020\nH\u0000\u00A2\u0006\u0004\b\b\u0010\u000B\u001A\u0013\u0010\b\u001A\u00020\u0000*\u00020\u0000H\u0000\u00A2\u0006\u0004\b\b\u0010\f\u001A\u001C\u0010\u000E\u001A\u00020\n*\u00020\n2\u0006\u0010\r\u001A\u00020\nH\u0080\f\u00A2\u0006\u0004\b\u000E\u0010\u000F\u001A\u001C\u0010\u0010\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001A\u00020\nH\u0080\f\u00A2\u0006\u0004\b\u0010\u0010\u0011\u001A\u001C\u0010\u0014\u001A\u00020\n*\u00020\u00122\u0006\u0010\u0013\u001A\u00020\nH\u0080\f\u00A2\u0006\u0004\b\u0014\u0010\u0015\u001A\u001C\u0010\u0016\u001A\u00020\n*\u00020\u00122\u0006\u0010\u0013\u001A\u00020\nH\u0080\f\u00A2\u0006\u0004\b\u0016\u0010\u0015\u001A\u001C\u0010\u0017\u001A\u00020\n*\u00020\u00122\u0006\u0010\u0013\u001A\u00020\nH\u0080\f\u00A2\u0006\u0004\b\u0017\u0010\u0015\u001A\u001C\u0010\u0017\u001A\u00020\u0000*\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u0000H\u0080\f\u00A2\u0006\u0004\b\u0017\u0010\u0018\u001A\u001C\u0010\u0019\u001A\u00020\u0012*\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u0012H\u0080\f\u00A2\u0006\u0004\b\u0019\u0010\u001A\u001A\u001C\u0010\u0017\u001A\u00020\u0000*\u00020\n2\u0006\u0010\u0013\u001A\u00020\u0000H\u0080\f\u00A2\u0006\u0004\b\u0017\u0010\u001B\u001A \u0010\u001E\u001A\u00020\u00002\u0006\u0010\u001C\u001A\u00020\u00002\u0006\u0010\u001D\u001A\u00020\nH\u0080\b\u00A2\u0006\u0004\b\u001E\u0010\u0011\u001A \u0010\u001E\u001A\u00020\u00002\u0006\u0010\u001C\u001A\u00020\n2\u0006\u0010\u001D\u001A\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\u001E\u0010\u001B\u001A7\u0010#\u001A\u00020\"2\u0006\u0010\u001C\u001A\u00020\u001F2\u0006\u0010 \u001A\u00020\n2\u0006\u0010\u001D\u001A\u00020\u001F2\u0006\u0010!\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\nH\u0000\u00A2\u0006\u0004\b#\u0010$\u001A\u0013\u0010&\u001A\u00020%*\u00020\u0012H\u0000\u00A2\u0006\u0004\b&\u0010\'\u001A\u0013\u0010&\u001A\u00020%*\u00020\nH\u0000\u00A2\u0006\u0004\b&\u0010(\u001A\u0013\u0010&\u001A\u00020%*\u00020\u0000H\u0000\u00A2\u0006\u0004\b&\u0010)\u001A\u0017\u0010,\u001A\u00020*2\u0006\u0010+\u001A\u00020*H\u0000\u00A2\u0006\u0004\b,\u0010-\u001A\u001B\u0010,\u001A\u00020\n*\u00020.2\u0006\u0010/\u001A\u00020\nH\u0000\u00A2\u0006\u0004\b,\u00100\u001A\u001B\u0010,\u001A\u00020\n*\u00020\u001F2\u0006\u00101\u001A\u00020\nH\u0000\u00A2\u0006\u0004\b,\u00102\" \u00108\u001A\u00020*8\u0000X\u0081\u0004\u00A2\u0006\u0012\n\u0004\b\u001C\u00103\u0012\u0004\b6\u00107\u001A\u0004\b4\u00105\"\u001A\u0010<\u001A\u00020\n8\u0000X\u0080D\u00A2\u0006\f\n\u0004\b\u001D\u00109\u001A\u0004\b:\u0010;\u00A8\u0006="}, d2 = {"", "size", "offset", "byteCount", "", "checkOffsetAndCount", "(JJJ)V", "", "reverseBytes", "(S)S", "", "(I)I", "(J)J", "bitCount", "leftRotate", "(II)I", "rightRotate", "(JI)J", "", "other", "shr", "(BI)I", "shl", "and", "(BJ)J", "xor", "(BB)B", "(IJ)J", "a", "b", "minOf", "", "aOffset", "bOffset", "", "arrayRangeEquals", "([BI[BII)Z", "", "toHexString", "(B)Ljava/lang/String;", "(I)Ljava/lang/String;", "(J)Ljava/lang/String;", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "resolveDefaultParameter", "(Lokio/Buffer$UnsafeCursor;)Lokio/Buffer$UnsafeCursor;", "Lokio/ByteString;", "position", "(Lokio/ByteString;I)I", "sizeParam", "([BI)I", "Lokio/Buffer$UnsafeCursor;", "getDEFAULT__new_UnsafeCursor", "()Lokio/Buffer$UnsafeCursor;", "getDEFAULT__new_UnsafeCursor$annotations", "()V", "DEFAULT__new_UnsafeCursor", "I", "getDEFAULT__ByteString_size", "()I", "DEFAULT__ByteString_size", "okio"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "-SegmentedByteString")
@SourceDebugExtension({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,187:1\n68#1:188\n74#1:189\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n106#1:188\n107#1:189\n*E\n"})
public final class -SegmentedByteString {
    public static final UnsafeCursor a;
    public static final int b;

    static {
        -SegmentedByteString.a = new UnsafeCursor();
        -SegmentedByteString.b = 0xB669FD2E;
    }

    public static final int and(byte b, int v) {
        return b & v;
    }

    public static final long and(byte b, long v) {
        return ((long)b) & v;
    }

    public static final long and(int v, long v1) {
        return ((long)v) & v1;
    }

    public static final boolean arrayRangeEquals(@NotNull byte[] arr_b, int v, @NotNull byte[] arr_b1, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_b, "a");
        Intrinsics.checkNotNullParameter(arr_b1, "b");
        for(int v3 = 0; v3 < v2; ++v3) {
            if(arr_b[v3 + v] != arr_b1[v3 + v1]) {
                return false;
            }
        }
        return true;
    }

    public static final void checkOffsetAndCount(long v, long v1, long v2) {
        if((v1 | v2) < 0L || v1 > v || v - v1 < v2) {
            throw new ArrayIndexOutOfBoundsException("size=" + v + " offset=" + v1 + " byteCount=" + v2);
        }
    }

    public static final int getDEFAULT__ByteString_size() [...] // 潜在的解密器

    @NotNull
    public static final UnsafeCursor getDEFAULT__new_UnsafeCursor() {
        return -SegmentedByteString.a;
    }

    public static void getDEFAULT__new_UnsafeCursor$annotations() {
    }

    public static final int leftRotate(int v, int v1) {
        return v >>> 0x20 - v1 | v << v1;
    }

    public static final long minOf(int v, long v1) {
        return Math.min(v, v1);
    }

    public static final long minOf(long v, int v1) {
        return Math.min(v, v1);
    }

    public static final int resolveDefaultParameter(@NotNull ByteString byteString0, int v) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        return v == -SegmentedByteString.b ? byteString0.size() : v;
    }

    public static final int resolveDefaultParameter(@NotNull byte[] arr_b, int v) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return v == -SegmentedByteString.b ? arr_b.length : v;
    }

    @NotNull
    public static final UnsafeCursor resolveDefaultParameter(@NotNull UnsafeCursor buffer$UnsafeCursor0) {
        Intrinsics.checkNotNullParameter(buffer$UnsafeCursor0, "unsafeCursor");
        return buffer$UnsafeCursor0 == -SegmentedByteString.a ? new UnsafeCursor() : buffer$UnsafeCursor0;
    }

    public static final int reverseBytes(int v) [...] // Inlined contents

    public static final long reverseBytes(long v) {
        return (v & 0xFFL) << 56 | ((0xFF00000000000000L & v) >>> 56 | (0xFF000000000000L & v) >>> 40 | (0xFF0000000000L & v) >>> 24 | (0xFF00000000L & v) >>> 8 | (0xFF000000L & v) << 8 | (0xFF0000L & v) << 24 | (0xFF00L & v) << 40);
    }

    public static final short reverseBytes(short v) [...] // Inlined contents

    public static final long rightRotate(long v, int v1) {
        return v << 0x40 - v1 | v >>> v1;
    }

    public static final int shl(byte b, int v) {
        return b << v;
    }

    public static final int shr(byte b, int v) {
        return b >> v;
    }

    @NotNull
    public static final String toHexString(byte b) {
        return p.concatToString(new char[]{-ByteString.getHEX_DIGIT_CHARS()[b >> 4 & 15], -ByteString.getHEX_DIGIT_CHARS()[b & 15]});
    }

    @NotNull
    public static final String toHexString(int v) {
        int v1 = 0;
        if(v == 0) {
            return "0";
        }
        char[] arr_c = {-ByteString.getHEX_DIGIT_CHARS()[v >> 28 & 15], -ByteString.getHEX_DIGIT_CHARS()[v >> 24 & 15], -ByteString.getHEX_DIGIT_CHARS()[v >> 20 & 15], -ByteString.getHEX_DIGIT_CHARS()[v >> 16 & 15], -ByteString.getHEX_DIGIT_CHARS()[v >> 12 & 15], -ByteString.getHEX_DIGIT_CHARS()[v >> 8 & 15], -ByteString.getHEX_DIGIT_CHARS()[v >> 4 & 15], -ByteString.getHEX_DIGIT_CHARS()[v & 15]};
        while(v1 < 8 && arr_c[v1] == 0x30) {
            ++v1;
        }
        return p.concatToString(arr_c, v1, 8);
    }

    @NotNull
    public static final String toHexString(long v) {
        if(v == 0L) {
            return "0";
        }
        char[] arr_c = {-ByteString.getHEX_DIGIT_CHARS()[((int)(v >> 60 & 15L))], -ByteString.getHEX_DIGIT_CHARS()[((int)(v >> 56 & 15L))], -ByteString.getHEX_DIGIT_CHARS()[((int)(v >> 52 & 15L))], -ByteString.getHEX_DIGIT_CHARS()[((int)(v >> 0x30 & 15L))], -ByteString.getHEX_DIGIT_CHARS()[((int)(v >> 44 & 15L))], -ByteString.getHEX_DIGIT_CHARS()[((int)(v >> 40 & 15L))], -ByteString.getHEX_DIGIT_CHARS()[((int)(v >> 36 & 15L))], -ByteString.getHEX_DIGIT_CHARS()[((int)(v >> 0x20 & 15L))], -ByteString.getHEX_DIGIT_CHARS()[((int)(v >> 28 & 15L))], -ByteString.getHEX_DIGIT_CHARS()[((int)(v >> 24 & 15L))], -ByteString.getHEX_DIGIT_CHARS()[((int)(v >> 20 & 15L))], -ByteString.getHEX_DIGIT_CHARS()[((int)(v >> 16 & 15L))], -ByteString.getHEX_DIGIT_CHARS()[((int)(v >> 12 & 15L))], -ByteString.getHEX_DIGIT_CHARS()[((int)(v >> 8 & 15L))], -ByteString.getHEX_DIGIT_CHARS()[((int)(v >> 4 & 15L))], -ByteString.getHEX_DIGIT_CHARS()[((int)(v & 15L))]};
        int v1;
        for(v1 = 0; v1 < 16 && arr_c[v1] == 0x30; ++v1) {
        }
        return p.concatToString(arr_c, v1, 16);
    }

    public static final byte xor(byte b, byte b1) {
        return (byte)(b ^ b1);
    }
}

