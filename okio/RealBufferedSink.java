package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001A\u00020\u0006H\u0016J\b\u0010\u000E\u001A\u00020\u000FH\u0016J\b\u0010\u0010\u001A\u00020\u0001H\u0016J\b\u0010\u0011\u001A\u00020\u0001H\u0016J\b\u0010\u0012\u001A\u00020\u000FH\u0016J\b\u0010\u0013\u001A\u00020\rH\u0016J\b\u0010\u0014\u001A\u00020\u0015H\u0016J\b\u0010\u0016\u001A\u00020\u0017H\u0016J\b\u0010\u0018\u001A\u00020\u0019H\u0016J\u0010\u0010\u001A\u001A\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u001DH\u0016J\u0010\u0010\u001A\u001A\u00020\u00012\u0006\u0010\u001C\u001A\u00020\u001EH\u0016J \u0010\u001A\u001A\u00020\u00012\u0006\u0010\u001C\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020\u001B2\u0006\u0010 \u001A\u00020\u001BH\u0016J\u0018\u0010\u001A\u001A\u00020\u000F2\u0006\u0010\u001C\u001A\u00020\u00062\u0006\u0010 \u001A\u00020!H\u0016J\u0010\u0010\u001A\u001A\u00020\u00012\u0006\u0010\"\u001A\u00020#H\u0016J \u0010\u001A\u001A\u00020\u00012\u0006\u0010\"\u001A\u00020#2\u0006\u0010\u001F\u001A\u00020\u001B2\u0006\u0010 \u001A\u00020\u001BH\u0016J\u0018\u0010\u001A\u001A\u00020\u00012\u0006\u0010\u001C\u001A\u00020$2\u0006\u0010 \u001A\u00020!H\u0016J\u0010\u0010%\u001A\u00020!2\u0006\u0010\u001C\u001A\u00020$H\u0016J\u0010\u0010&\u001A\u00020\u00012\u0006\u0010\'\u001A\u00020\u001BH\u0016J\u0010\u0010(\u001A\u00020\u00012\u0006\u0010)\u001A\u00020!H\u0016J\u0010\u0010*\u001A\u00020\u00012\u0006\u0010)\u001A\u00020!H\u0016J\u0010\u0010+\u001A\u00020\u00012\u0006\u0010,\u001A\u00020\u001BH\u0016J\u0010\u0010-\u001A\u00020\u00012\u0006\u0010,\u001A\u00020\u001BH\u0016J\u0010\u0010.\u001A\u00020\u00012\u0006\u0010)\u001A\u00020!H\u0016J\u0010\u0010/\u001A\u00020\u00012\u0006\u0010)\u001A\u00020!H\u0016J\u0010\u00100\u001A\u00020\u00012\u0006\u00101\u001A\u00020\u001BH\u0016J\u0010\u00102\u001A\u00020\u00012\u0006\u00101\u001A\u00020\u001BH\u0016J\u0018\u00103\u001A\u00020\u00012\u0006\u00104\u001A\u00020\u00192\u0006\u00105\u001A\u000206H\u0016J(\u00103\u001A\u00020\u00012\u0006\u00104\u001A\u00020\u00192\u0006\u00107\u001A\u00020\u001B2\u0006\u00108\u001A\u00020\u001B2\u0006\u00105\u001A\u000206H\u0016J\u0010\u00109\u001A\u00020\u00012\u0006\u00104\u001A\u00020\u0019H\u0016J \u00109\u001A\u00020\u00012\u0006\u00104\u001A\u00020\u00192\u0006\u00107\u001A\u00020\u001B2\u0006\u00108\u001A\u00020\u001BH\u0016J\u0010\u0010:\u001A\u00020\u00012\u0006\u0010;\u001A\u00020\u001BH\u0016R\u001B\u0010\u0005\u001A\u00020\u00068\u00D6\u0002X\u0096\u0004\u00A2\u0006\f\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\nR\u0010\u0010\u000B\u001A\u00020\u00068\u0006X\u0087\u0004\u00A2\u0006\u0002\n\u0000R\u0012\u0010\f\u001A\u00020\r8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004\u00A2\u0006\u0002\n\u0000\u00A8\u0006<"}, d2 = {"Lokio/RealBufferedSink;", "Lokio/BufferedSink;", "sink", "Lokio/Sink;", "(Lokio/Sink;)V", "buffer", "Lokio/Buffer;", "getBuffer$annotations", "()V", "getBuffer", "()Lokio/Buffer;", "bufferField", "closed", "", "close", "", "emit", "emitCompleteSegments", "flush", "isOpen", "outputStream", "Ljava/io/OutputStream;", "timeout", "Lokio/Timeout;", "toString", "", "write", "", "source", "Ljava/nio/ByteBuffer;", "", "offset", "byteCount", "", "byteString", "Lokio/ByteString;", "Lokio/Source;", "writeAll", "writeByte", "b", "writeDecimalLong", "v", "writeHexadecimalUnsignedLong", "writeInt", "i", "writeIntLe", "writeLong", "writeLongLe", "writeShort", "s", "writeShortLe", "writeString", "string", "charset", "Ljava/nio/charset/Charset;", "beginIndex", "endIndex", "writeUtf8", "writeUtf8CodePoint", "codePoint", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 2 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n51#1:146\n51#1:152\n51#1:157\n51#1:162\n51#1:167\n51#1:172\n51#1:175\n51#1:176\n51#1:180\n51#1:185\n51#1:188\n51#1:192\n51#1:201\n51#1:210\n51#1:215\n51#1:220\n51#1:225\n51#1:230\n51#1:235\n51#1:240\n51#1:245\n51#1:250\n51#1:255\n51#1:261\n51#1:267\n51#1:279\n34#2:143\n35#2:145\n36#2,2:147\n40#2:149\n41#2:151\n42#2:153\n50#2:154\n51#2:156\n52#2:158\n56#2:159\n57#2:161\n58#2:163\n66#2:164\n67#2:166\n68#2:168\n72#2:169\n73#2:171\n74#2:173\n78#2:177\n79#2:179\n80#2:181\n88#2:182\n89#2:184\n90#2:186\n94#2,3:189\n97#2,5:193\n105#2,3:198\n108#2,5:202\n116#2:207\n117#2:209\n118#2:211\n122#2:212\n123#2:214\n124#2:216\n128#2:217\n129#2:219\n130#2:221\n134#2:222\n135#2:224\n136#2:226\n140#2:227\n141#2:229\n142#2:231\n146#2:232\n147#2:234\n148#2:236\n152#2:237\n153#2:239\n154#2:241\n158#2:242\n159#2:244\n160#2:246\n164#2:247\n165#2:249\n166#2:251\n170#2:252\n171#2:254\n172#2,2:256\n177#2:258\n178#2:260\n179#2,2:262\n184#2:264\n185#2:266\n186#2,4:268\n192#2,7:272\n199#2,16:280\n216#2:296\n218#2:297\n1#3:144\n1#3:150\n1#3:155\n1#3:160\n1#3:165\n1#3:170\n1#3:174\n1#3:178\n1#3:183\n1#3:187\n1#3:208\n1#3:213\n1#3:218\n1#3:223\n1#3:228\n1#3:233\n1#3:238\n1#3:243\n1#3:248\n1#3:253\n1#3:259\n1#3:265\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n55#1:146\n56#1:152\n58#1:157\n59#1:162\n61#1:167\n63#1:172\n67#1:175\n78#1:176\n82#1:180\n84#1:185\n88#1:188\n93#1:192\n94#1:201\n95#1:210\n96#1:215\n97#1:220\n98#1:225\n99#1:230\n100#1:235\n101#1:240\n102#1:245\n103#1:250\n104#1:255\n105#1:261\n134#1:267\n138#1:279\n55#1:143\n55#1:145\n55#1:147,2\n56#1:149\n56#1:151\n56#1:153\n58#1:154\n58#1:156\n58#1:158\n59#1:159\n59#1:161\n59#1:163\n61#1:164\n61#1:166\n61#1:168\n63#1:169\n63#1:171\n63#1:173\n82#1:177\n82#1:179\n82#1:181\n84#1:182\n84#1:184\n84#1:186\n93#1:189,3\n93#1:193,5\n94#1:198,3\n94#1:202,5\n95#1:207\n95#1:209\n95#1:211\n96#1:212\n96#1:214\n96#1:216\n97#1:217\n97#1:219\n97#1:221\n98#1:222\n98#1:224\n98#1:226\n99#1:227\n99#1:229\n99#1:231\n100#1:232\n100#1:234\n100#1:236\n101#1:237\n101#1:239\n101#1:241\n102#1:242\n102#1:244\n102#1:246\n103#1:247\n103#1:249\n103#1:251\n104#1:252\n104#1:254\n104#1:256,2\n105#1:258\n105#1:260\n105#1:262,2\n134#1:264\n134#1:266\n134#1:268,4\n138#1:272,7\n138#1:280,16\n139#1:296\n140#1:297\n55#1:144\n56#1:150\n58#1:155\n59#1:160\n61#1:165\n63#1:170\n82#1:178\n84#1:183\n95#1:208\n96#1:213\n97#1:218\n98#1:223\n99#1:228\n100#1:233\n101#1:238\n102#1:243\n103#1:248\n104#1:253\n105#1:259\n134#1:265\n*E\n"})
public final class RealBufferedSink implements BufferedSink {
    @JvmField
    @NotNull
    public final Buffer bufferField;
    @JvmField
    public boolean closed;
    @JvmField
    @NotNull
    public final Sink sink;

    public RealBufferedSink(@NotNull Sink sink0) {
        Intrinsics.checkNotNullParameter(sink0, "sink");
        super();
        this.sink = sink0;
        this.bufferField = new Buffer();
    }

    @Override  // okio.BufferedSink
    @NotNull
    public Buffer buffer() {
        return this.bufferField;
    }

    @Override  // okio.Sink
    public void close() {
        if(!this.closed) {
            try {
                if(this.bufferField.size() > 0L) {
                    this.sink.write(this.bufferField, this.bufferField.size());
                }
                throwable0 = null;
            }
            catch(Throwable throwable0) {
            }
            try {
                this.sink.close();
            }
            catch(Throwable throwable1) {
                if(throwable0 == null) {
                    throwable0 = throwable1;
                }
            }
            this.closed = true;
            if(throwable0 != null) {
                throw throwable0;
            }
        }
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink emit() {
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        long v = this.bufferField.size();
        if(v > 0L) {
            this.sink.write(this.bufferField, v);
        }
        return this;
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink emitCompleteSegments() {
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        long v = this.bufferField.completeSegmentByteCount();
        if(v > 0L) {
            this.sink.write(this.bufferField, v);
        }
        return this;
    }

    @Override  // okio.BufferedSink
    public void flush() {
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        if(this.bufferField.size() > 0L) {
            this.sink.write(this.bufferField, this.bufferField.size());
        }
        this.sink.flush();
    }

    @Override  // okio.BufferedSink
    @NotNull
    public Buffer getBuffer() {
        return this.bufferField;
    }

    public static void getBuffer$annotations() {
    }

    @Override
    public boolean isOpen() {
        return !this.closed;
    }

    @Override  // okio.BufferedSink
    @NotNull
    public OutputStream outputStream() {
        return new OutputStream() {
            @Override
            public void close() {
                this.a.close();
            }

            @Override
            public void flush() {
                RealBufferedSink realBufferedSink0 = this.a;
                if(!realBufferedSink0.closed) {
                    realBufferedSink0.flush();
                }
            }

            @Override
            @NotNull
            public String toString() {
                return this.a + ".outputStream()";
            }

            @Override
            public void write(int v) {
                RealBufferedSink realBufferedSink0 = this.a;
                if(realBufferedSink0.closed) {
                    throw new IOException("closed");
                }
                realBufferedSink0.bufferField.writeByte(((int)(((byte)v))));
                realBufferedSink0.emitCompleteSegments();
            }

            @Override
            public void write(@NotNull byte[] arr_b, int v, int v1) {
                Intrinsics.checkNotNullParameter(arr_b, "data");
                RealBufferedSink realBufferedSink0 = this.a;
                if(realBufferedSink0.closed) {
                    throw new IOException("closed");
                }
                realBufferedSink0.bufferField.write(arr_b, v, v1);
                realBufferedSink0.emitCompleteSegments();
            }
        };
    }

    @Override  // okio.Sink
    @NotNull
    public Timeout timeout() {
        return this.sink.timeout();
    }

    @Override
    @NotNull
    public String toString() {
        return "buffer(" + this.sink + ')';
    }

    @Override
    public int write(@NotNull ByteBuffer byteBuffer0) {
        Intrinsics.checkNotNullParameter(byteBuffer0, "source");
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        int v = this.bufferField.write(byteBuffer0);
        this.emitCompleteSegments();
        return v;
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink write(@NotNull ByteString byteString0) {
        Intrinsics.checkNotNullParameter(byteString0, "byteString");
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.write(byteString0);
        return this.emitCompleteSegments();
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink write(@NotNull ByteString byteString0, int v, int v1) {
        Intrinsics.checkNotNullParameter(byteString0, "byteString");
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.write(byteString0, v, v1);
        return this.emitCompleteSegments();
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink write(@NotNull Source source0, long v) {
        Intrinsics.checkNotNullParameter(source0, "source");
        while(v > 0L) {
            long v1 = source0.read(this.bufferField, v);
            if(v1 == -1L) {
                throw new EOFException();
            }
            v -= v1;
            this.emitCompleteSegments();
        }
        return this;
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink write(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "source");
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.write(arr_b);
        return this.emitCompleteSegments();
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink write(@NotNull byte[] arr_b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "source");
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.write(arr_b, v, v1);
        return this.emitCompleteSegments();
    }

    @Override  // okio.Sink
    public void write(@NotNull Buffer buffer0, long v) {
        Intrinsics.checkNotNullParameter(buffer0, "source");
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.write(buffer0, v);
        this.emitCompleteSegments();
    }

    @Override  // okio.BufferedSink
    public long writeAll(@NotNull Source source0) {
        Intrinsics.checkNotNullParameter(source0, "source");
        long v = 0L;
        long v1;
        while((v1 = source0.read(this.bufferField, 0x2000L)) != -1L) {
            v += v1;
            this.emitCompleteSegments();
        }
        return v;
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink writeByte(int v) {
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeByte(v);
        return this.emitCompleteSegments();
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink writeDecimalLong(long v) {
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeDecimalLong(v);
        return this.emitCompleteSegments();
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink writeHexadecimalUnsignedLong(long v) {
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeHexadecimalUnsignedLong(v);
        return this.emitCompleteSegments();
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink writeInt(int v) {
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeInt(v);
        return this.emitCompleteSegments();
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink writeIntLe(int v) {
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeIntLe(v);
        return this.emitCompleteSegments();
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink writeLong(long v) {
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeLong(v);
        return this.emitCompleteSegments();
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink writeLongLe(long v) {
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeLongLe(v);
        return this.emitCompleteSegments();
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink writeShort(int v) {
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeShort(v);
        return this.emitCompleteSegments();
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink writeShortLe(int v) {
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeShortLe(v);
        return this.emitCompleteSegments();
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink writeString(@NotNull String s, int v, int v1, @NotNull Charset charset0) {
        Intrinsics.checkNotNullParameter(s, "string");
        Intrinsics.checkNotNullParameter(charset0, "charset");
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeString(s, v, v1, charset0);
        return this.emitCompleteSegments();
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink writeString(@NotNull String s, @NotNull Charset charset0) {
        Intrinsics.checkNotNullParameter(s, "string");
        Intrinsics.checkNotNullParameter(charset0, "charset");
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeString(s, charset0);
        return this.emitCompleteSegments();
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink writeUtf8(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "string");
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeUtf8(s);
        return this.emitCompleteSegments();
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink writeUtf8(@NotNull String s, int v, int v1) {
        Intrinsics.checkNotNullParameter(s, "string");
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeUtf8(s, v, v1);
        return this.emitCompleteSegments();
    }

    @Override  // okio.BufferedSink
    @NotNull
    public BufferedSink writeUtf8CodePoint(int v) {
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeUtf8CodePoint(v);
        return this.emitCompleteSegments();
    }
}

