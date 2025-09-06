package okio;

import java.io.IOException;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\r\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\fH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokio/CipherSink;", "Lokio/Sink;", "Lokio/BufferedSink;", "sink", "Ljavax/crypto/Cipher;", "cipher", "<init>", "(Lokio/BufferedSink;Ljavax/crypto/Cipher;)V", "Lokio/Buffer;", "source", "", "byteCount", "", "write", "(Lokio/Buffer;J)V", "flush", "()V", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "close", "b", "Ljavax/crypto/Cipher;", "getCipher", "()Ljavax/crypto/Cipher;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCipherSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,148:1\n1#2:149\n86#3:150\n*S KotlinDebug\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n*L\n47#1:150\n*E\n"})
public final class CipherSink implements Sink {
    public final BufferedSink a;
    public final Cipher b;
    public final int c;
    public boolean d;

    public CipherSink(@NotNull BufferedSink bufferedSink0, @NotNull Cipher cipher0) {
        Intrinsics.checkNotNullParameter(bufferedSink0, "sink");
        Intrinsics.checkNotNullParameter(cipher0, "cipher");
        super();
        this.a = bufferedSink0;
        this.b = cipher0;
        int v = cipher0.getBlockSize();
        this.c = v;
        if(v <= 0) {
            throw new IllegalArgumentException(("Block cipher required " + cipher0).toString());
        }
    }

    @Override  // okio.Sink
    public void close() throws IOException {
        if(this.d) {
            return;
        }
        this.d = true;
        Cipher cipher0 = this.b;
        int v = cipher0.getOutputSize(0);
        BufferedSink bufferedSink0 = this.a;
        Throwable throwable0 = null;
        if(v != 0) {
            if(v > 0x2000) {
                try {
                    byte[] arr_b = cipher0.doFinal();
                    Intrinsics.checkNotNullExpressionValue(arr_b, "doFinal(...)");
                    bufferedSink0.write(arr_b);
                }
                catch(Throwable throwable1) {
                    throwable0 = throwable1;
                }
            }
            else {
                Buffer buffer0 = bufferedSink0.getBuffer();
                Segment segment0 = buffer0.writableSegment$okio(v);
                try {
                    int v1 = cipher0.doFinal(segment0.data, segment0.limit);
                    segment0.limit += v1;
                    buffer0.setSize$okio(buffer0.size() + ((long)v1));
                }
                catch(Throwable throwable2) {
                    throwable0 = throwable2;
                }
                if(segment0.pos == segment0.limit) {
                    buffer0.head = segment0.pop();
                    SegmentPool.recycle(segment0);
                }
            }
        }
        try {
            bufferedSink0.close();
        }
        catch(Throwable throwable3) {
            if(throwable0 == null) {
                throwable0 = throwable3;
            }
        }
        if(throwable0 != null) {
            throw throwable0;
        }
    }

    @Override  // okio.Sink
    public void flush() {
        this.a.flush();
    }

    @NotNull
    public final Cipher getCipher() {
        return this.b;
    }

    @Override  // okio.Sink
    @NotNull
    public Timeout timeout() {
        return this.a.timeout();
    }

    @Override  // okio.Sink
    public void write(@NotNull Buffer buffer0, long v) throws IOException {
        Intrinsics.checkNotNullParameter(buffer0, "source");
        -SegmentedByteString.checkOffsetAndCount(buffer0.size(), 0L, v);
        if(this.d) {
            throw new IllegalStateException("closed");
        }
        while(v > 0L) {
            Segment segment0 = buffer0.head;
            Intrinsics.checkNotNull(segment0);
            int v1 = (int)Math.min(v, segment0.limit - segment0.pos);
            BufferedSink bufferedSink0 = this.a;
            Buffer buffer1 = bufferedSink0.getBuffer();
            Cipher cipher0 = this.b;
            int v2 = cipher0.getOutputSize(v1);
            while(true) {
                if(v2 > 0x2000) {
                    int v3 = this.c;
                    if(v1 <= v3) {
                        byte[] arr_b = cipher0.update(buffer0.readByteArray(v));
                        Intrinsics.checkNotNullExpressionValue(arr_b, "update(...)");
                        bufferedSink0.write(arr_b);
                        v1 = (int)v;
                        break;
                    }
                    else {
                        v1 -= v3;
                        v2 = cipher0.getOutputSize(v1);
                        continue;
                    }
                }
                Segment segment1 = buffer1.writableSegment$okio(v2);
                int v4 = this.b.update(segment0.data, segment0.pos, v1, segment1.data, segment1.limit);
                segment1.limit += v4;
                buffer1.setSize$okio(buffer1.size() + ((long)v4));
                if(segment1.pos == segment1.limit) {
                    buffer1.head = segment1.pop();
                    SegmentPool.recycle(segment1);
                }
                bufferedSink0.emitCompleteSegments();
                buffer0.setSize$okio(buffer0.size() - ((long)v1));
                int v5 = segment0.pos + v1;
                segment0.pos = v5;
                if(v5 != segment0.limit) {
                    break;
                }
                buffer0.head = segment0.pop();
                SegmentPool.recycle(segment0);
                break;
            }
            v -= (long)v1;
        }
    }
}

