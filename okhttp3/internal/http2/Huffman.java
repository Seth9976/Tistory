package okhttp3.internal.http2;

import i6.b;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012J\u001D\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\u0002¢\u0006\u0004\b\u000B\u0010\fJ%\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/http2/Huffman;", "", "Lokio/ByteString;", "source", "Lokio/BufferedSink;", "sink", "", "encode", "(Lokio/ByteString;Lokio/BufferedSink;)V", "bytes", "", "encodedLength", "(Lokio/ByteString;)I", "Lokio/BufferedSource;", "", "byteCount", "decode", "(Lokio/BufferedSource;JLokio/BufferedSink;)V", "i6/b", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Huffman {
    @NotNull
    public static final Huffman INSTANCE;
    public static final int[] a;
    public static final byte[] b;
    public static final b c;

    static {
        b[] arr_b;
        Huffman.INSTANCE = new Huffman();  // 初始化器: Ljava/lang/Object;-><init>()V
        Huffman.a = new int[]{0x1FF8, 0x7FFFD8, 0xFFFFFE2, 0xFFFFFE3, 0xFFFFFE4, 0xFFFFFE5, 0xFFFFFE6, 0xFFFFFE7, 0xFFFFFE8, 0xFFFFEA, 0x3FFFFFFC, 0xFFFFFE9, 0xFFFFFEA, 0x3FFFFFFD, 0xFFFFFEB, 0xFFFFFEC, 0xFFFFFED, 0xFFFFFEE, 0xFFFFFEF, 0xFFFFFF0, 0xFFFFFF1, 0xFFFFFF2, 0x3FFFFFFE, 0xFFFFFF3, 0xFFFFFF4, 0xFFFFFF5, 0xFFFFFF6, 0xFFFFFF7, 0xFFFFFF8, 0xFFFFFF9, 0xFFFFFFA, 0xFFFFFFB, 20, 0x3F8, 0x3F9, 0xFFA, 0x1FF9, 21, 0xF8, 0x7FA, 0x3FA, 0x3FB, 0xF9, 0x7FB, 0xFA, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 0x1F, 92, 0xFB, 0x7FFC, 0x20, 0xFFB, 1020, 0x1FFA, 33, 93, 94, 0x5F, 0x60, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0xFC, 0x73, 0xFD, 0x1FFB, 0x7FFF0, 0x1FFC, 0x3FFC, 34, 0x7FFD, 3, 35, 4, 36, 5, 37, 38, 39, 6, 0x74, 0x75, 40, 41, 42, 7, 43, 0x76, 44, 8, 9, 45, 0x77, 120, 0x79, 0x7A, 0x7B, 0x7FFE, 0x7FC, 0x3FFD, 0x1FFD, 0xFFFFFFC, 0xFFFE6, 0x3FFFD2, 0xFFFE7, 0xFFFE8, 0x3FFFD3, 0x3FFFD4, 0x3FFFD5, 0x7FFFD9, 0x3FFFD6, 0x7FFFDA, 0x7FFFDB, 0x7FFFDC, 0x7FFFDD, 0x7FFFDE, 0xFFFFEB, 0x7FFFDF, 0xFFFFEC, 0xFFFFED, 0x3FFFD7, 0x7FFFE0, 0xFFFFEE, 0x7FFFE1, 0x7FFFE2, 0x7FFFE3, 0x7FFFE4, 0x1FFFDC, 0x3FFFD8, 0x7FFFE5, 0x3FFFD9, 0x7FFFE6, 0x7FFFE7, 0xFFFFEF, 0x3FFFDA, 0x1FFFDD, 0xFFFE9, 0x3FFFDB, 0x3FFFDC, 0x7FFFE8, 0x7FFFE9, 0x1FFFDE, 0x7FFFEA, 0x3FFFDD, 0x3FFFDE, 0xFFFFF0, 0x1FFFDF, 0x3FFFDF, 0x7FFFEB, 0x7FFFEC, 0x1FFFE0, 0x1FFFE1, 0x3FFFE0, 0x1FFFE2, 0x7FFFED, 0x3FFFE1, 0x7FFFEE, 0x7FFFEF, 0xFFFEA, 0x3FFFE2, 0x3FFFE3, 0x3FFFE4, 0x7FFFF0, 0x3FFFE5, 0x3FFFE6, 0x7FFFF1, 0x3FFFFE0, 0x3FFFFE1, 0xFFFEB, 0x7FFF1, 0x3FFFE7, 0x7FFFF2, 0x3FFFE8, 0x1FFFFEC, 0x3FFFFE2, 0x3FFFFE3, 0x3FFFFE4, 0x7FFFFDE, 0x7FFFFDF, 0x3FFFFE5, 0xFFFFF1, 0x1FFFFED, 0x7FFF2, 0x1FFFE3, 0x3FFFFE6, 0x7FFFFE0, 0x7FFFFE1, 0x3FFFFE7, 0x7FFFFE2, 0xFFFFF2, 0x1FFFE4, 0x1FFFE5, 0x3FFFFE8, 0x3FFFFE9, 0xFFFFFFD, 0x7FFFFE3, 0x7FFFFE4, 0x7FFFFE5, 0xFFFEC, 0xFFFFF3, 0xFFFED, 0x1FFFE6, 0x3FFFE9, 0x1FFFE7, 0x1FFFE8, 0x7FFFF3, 0x3FFFEA, 0x3FFFEB, 0x1FFFFEE, 0x1FFFFEF, 0xFFFFF4, 0xFFFFF5, 0x3FFFFEA, 0x7FFFF4, 0x3FFFFEB, 0x7FFFFE6, 0x3FFFFEC, 0x3FFFFED, 0x7FFFFE7, 0x7FFFFE8, 0x7FFFFE9, 0x7FFFFEA, 0x7FFFFEB, 0xFFFFFFE, 0x7FFFFEC, 0x7FFFFED, 0x7FFFFEE, 0x7FFFFEF, 0x7FFFFF0, 0x3FFFFEE};
        Huffman.b = new byte[]{13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        Huffman.c = new b();
        for(int v = 0; v < 0x100; ++v) {
            int v1 = Huffman.a[v];
            int v2 = Huffman.b[v];
            Huffman.INSTANCE.getClass();
            b b0 = new b(v, v2);
            for(b b1 = Huffman.c; true; b1 = b2) {
                arr_b = (b[])b1.c;
                if(v2 <= 8) {
                    break;
                }
                v2 -= 8;
                int v3 = v1 >>> v2 & 0xFF;
                Intrinsics.checkNotNull(arr_b);
                b b2 = arr_b[v3];
                if(b2 == null) {
                    b2 = new b();
                    arr_b[v3] = b2;
                }
            }
            int v4 = v1 << 8 - v2 & 0xFF;
            Intrinsics.checkNotNull(arr_b);
            ArraysKt___ArraysJvmKt.fill(arr_b, b0, v4, (1 << 8 - v2) + v4);
        }
    }

    public final void decode(@NotNull BufferedSource bufferedSource0, long v, @NotNull BufferedSink bufferedSink0) {
        Intrinsics.checkNotNullParameter(bufferedSource0, "source");
        Intrinsics.checkNotNullParameter(bufferedSink0, "sink");
        b b0 = Huffman.c;
        int v1 = 0;
        b b1 = b0;
        int v3 = 0;
        for(long v2 = 0L; Long.compare(v2, v) < 0; ++v2) {
            v1 = v1 << 8 | Util.and(bufferedSource0.readByte(), ((byte)0xFF));
            v3 += 8;
            while(v3 >= 8) {
                Intrinsics.checkNotNull(((b[])b1.c));
                b1 = ((b[])b1.c)[v1 >>> v3 - 8 & 0xFF];
                Intrinsics.checkNotNull(b1);
                if(((b[])b1.c) == null) {
                    bufferedSink0.writeByte(b1.a);
                    v3 -= b1.b;
                    b1 = b0;
                }
                else {
                    v3 -= 8;
                }
            }
        }
        while(v3 > 0) {
            Intrinsics.checkNotNull(((b[])b1.c));
            b b2 = ((b[])b1.c)[v1 << 8 - v3 & 0xFF];
            Intrinsics.checkNotNull(b2);
            if(((b[])b2.c) != null) {
                break;
            }
            int v4 = b2.b;
            if(v4 > v3) {
                break;
            }
            bufferedSink0.writeByte(b2.a);
            v3 -= v4;
            b1 = b0;
        }
    }

    public final void encode(@NotNull ByteString byteString0, @NotNull BufferedSink bufferedSink0) throws IOException {
        Intrinsics.checkNotNullParameter(byteString0, "source");
        Intrinsics.checkNotNullParameter(bufferedSink0, "sink");
        int v = byteString0.size();
        long v1 = 0L;
        int v3 = 0;
        for(int v2 = 0; v2 < v; ++v2) {
            int v4 = Util.and(byteString0.getByte(v2), ((byte)0xFF));
            v1 = v1 << Huffman.b[v4] | ((long)Huffman.a[v4]);
            v3 += Huffman.b[v4];
            while(v3 >= 8) {
                v3 -= 8;
                bufferedSink0.writeByte(((int)(v1 >> v3)));
            }
        }
        if(v3 > 0) {
            bufferedSink0.writeByte(((int)(v1 << 8 - v3 | 0xFFL >>> v3)));
        }
    }

    public final int encodedLength(@NotNull ByteString byteString0) {
        Intrinsics.checkNotNullParameter(byteString0, "bytes");
        int v = byteString0.size();
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 += (long)Huffman.b[Util.and(byteString0.getByte(v2), ((byte)0xFF))];
        }
        return (int)(v1 + 7L >> 3);
    }
}

