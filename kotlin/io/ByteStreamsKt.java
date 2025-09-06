package kotlin.io;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.collections.ByteIterator;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\u001A\u0014\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001A#\u0010\n\u001A\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\u000B\u001A\u001D\u0010\u000E\u001A\u00020\r*\u00020\u00042\b\b\u0002\u0010\f\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\u000E\u0010\u000F\u001A\u0013\u0010\u000E\u001A\u00020\r*\u00020\u0004H\u0007¢\u0006\u0004\b\u000E\u0010\u0010¨\u0006\u0011"}, d2 = {"Ljava/io/BufferedInputStream;", "Lkotlin/collections/ByteIterator;", "iterator", "(Ljava/io/BufferedInputStream;)Lkotlin/collections/ByteIterator;", "Ljava/io/InputStream;", "Ljava/io/OutputStream;", "out", "", "bufferSize", "", "copyTo", "(Ljava/io/InputStream;Ljava/io/OutputStream;I)J", "estimatedSize", "", "readBytes", "(Ljava/io/InputStream;I)[B", "(Ljava/io/InputStream;)[B", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "ByteStreamsKt")
public final class ByteStreamsKt {
    public static final long copyTo(@NotNull InputStream inputStream0, @NotNull OutputStream outputStream0, int v) {
        Intrinsics.checkNotNullParameter(inputStream0, "<this>");
        Intrinsics.checkNotNullParameter(outputStream0, "out");
        byte[] arr_b = new byte[v];
        int v1 = inputStream0.read(arr_b);
        long v2 = 0L;
        while(v1 >= 0) {
            outputStream0.write(arr_b, 0, v1);
            v2 += (long)v1;
            v1 = inputStream0.read(arr_b);
        }
        return v2;
    }

    public static long copyTo$default(InputStream inputStream0, OutputStream outputStream0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0x2000;
        }
        return ByteStreamsKt.copyTo(inputStream0, outputStream0, v);
    }

    @NotNull
    public static final ByteIterator iterator(@NotNull BufferedInputStream bufferedInputStream0) {
        Intrinsics.checkNotNullParameter(bufferedInputStream0, "<this>");
        return new ByteIterator() {
            public int a;
            public boolean b;
            public boolean c;

            {
                BufferedInputStream bufferedInputStream0 = bufferedInputStream0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = -1;
            }

            public final void a() {
                if(!this.b && !this.c) {
                    int v = bufferedInputStream0.read();
                    this.a = v;
                    boolean z = true;
                    this.b = true;
                    if(v != -1) {
                        z = false;
                    }
                    this.c = z;
                }
            }

            public final boolean getFinished() {
                return this.c;
            }

            public final int getNextByte() {
                return this.a;
            }

            public final boolean getNextPrepared() {
                return this.b;
            }

            @Override
            public boolean hasNext() {
                this.a();
                return !this.c;
            }

            @Override  // kotlin.collections.ByteIterator
            public byte nextByte() {
                this.a();
                if(this.c) {
                    throw new NoSuchElementException("Input stream is over.");
                }
                this.b = false;
                return (byte)this.a;
            }

            public final void setFinished(boolean z) {
                this.c = z;
            }

            public final void setNextByte(int v) {
                this.a = v;
            }

            public final void setNextPrepared(boolean z) {
                this.b = z;
            }
        };
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final byte[] readBytes(@NotNull InputStream inputStream0) {
        Intrinsics.checkNotNullParameter(inputStream0, "<this>");
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(Math.max(0x2000, inputStream0.available()));
        ByteStreamsKt.copyTo$default(inputStream0, byteArrayOutputStream0, 0, 2, null);
        byte[] arr_b = byteArrayOutputStream0.toByteArray();
        Intrinsics.checkNotNullExpressionValue(arr_b, "toByteArray(...)");
        return arr_b;
    }

    @Deprecated(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @ReplaceWith(expression = "readBytes()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", warningSince = "1.3")
    @NotNull
    public static final byte[] readBytes(@NotNull InputStream inputStream0, int v) {
        Intrinsics.checkNotNullParameter(inputStream0, "<this>");
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(Math.max(v, inputStream0.available()));
        ByteStreamsKt.copyTo$default(inputStream0, byteArrayOutputStream0, 0, 2, null);
        byte[] arr_b = byteArrayOutputStream0.toByteArray();
        Intrinsics.checkNotNullExpressionValue(arr_b, "toByteArray(...)");
        return arr_b;
    }

    public static byte[] readBytes$default(InputStream inputStream0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0x2000;
        }
        return ByteStreamsKt.readBytes(inputStream0, v);
    }
}

