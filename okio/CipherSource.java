package okio;

import java.io.IOException;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\f\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lokio/CipherSource;", "Lokio/Source;", "Lokio/BufferedSource;", "source", "Ljavax/crypto/Cipher;", "cipher", "<init>", "(Lokio/BufferedSource;Ljavax/crypto/Cipher;)V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "", "close", "()V", "b", "Ljavax/crypto/Cipher;", "getCipher", "()Ljavax/crypto/Cipher;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCipherSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSource.kt\nokio/CipherSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
public final class CipherSource implements Source {
    public final BufferedSource a;
    public final Cipher b;
    public final int c;
    public final Buffer d;
    public boolean e;
    public boolean f;

    public CipherSource(@NotNull BufferedSource bufferedSource0, @NotNull Cipher cipher0) {
        Intrinsics.checkNotNullParameter(bufferedSource0, "source");
        Intrinsics.checkNotNullParameter(cipher0, "cipher");
        super();
        this.a = bufferedSource0;
        this.b = cipher0;
        int v = cipher0.getBlockSize();
        this.c = v;
        this.d = new Buffer();
        if(v <= 0) {
            throw new IllegalArgumentException(("Block cipher required " + cipher0).toString());
        }
    }

    @Override  // okio.Source
    public void close() throws IOException {
        this.f = true;
        this.a.close();
    }

    @NotNull
    public final Cipher getCipher() {
        return this.b;
    }

    @Override  // okio.Source
    public long read(@NotNull Buffer buffer0, long v) throws IOException {
        Buffer buffer1;
        Intrinsics.checkNotNullParameter(buffer0, "sink");
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException(q.n(v, "byteCount < 0: ").toString());
        }
        if(this.f) {
            throw new IllegalStateException("closed");
        }
        if(v1 == 0) {
            return 0L;
        }
    alab1:
        while(true) {
            buffer1 = this.d;
            if(buffer1.size() != 0L || this.e) {
                break;
            }
            BufferedSource bufferedSource0 = this.a;
            boolean z = bufferedSource0.exhausted();
            Cipher cipher0 = this.b;
            if(z) {
                this.e = true;
                int v2 = cipher0.getOutputSize(0);
                if(v2 == 0) {
                    break;
                }
                Segment segment0 = buffer1.writableSegment$okio(v2);
                int v3 = cipher0.doFinal(segment0.data, segment0.pos);
                segment0.limit += v3;
                buffer1.setSize$okio(buffer1.size() + ((long)v3));
                if(segment0.pos != segment0.limit) {
                    break;
                }
                buffer1.head = segment0.pop();
                SegmentPool.recycle(segment0);
                return buffer1.read(buffer0, v);
            }
            Segment segment1 = bufferedSource0.getBuffer().head;
            Intrinsics.checkNotNull(segment1);
            int v4 = segment1.limit - segment1.pos;
            int v5 = cipher0.getOutputSize(v4);
            while(v5 > 0x2000) {
                int v6 = this.c;
                if(v4 <= v6) {
                    this.e = true;
                    byte[] arr_b = cipher0.doFinal(bufferedSource0.readByteArray());
                    Intrinsics.checkNotNullExpressionValue(arr_b, "doFinal(...)");
                    buffer1.write(arr_b);
                    continue alab1;
                }
                v4 -= v6;
                v5 = cipher0.getOutputSize(v4);
            }
            Segment segment2 = buffer1.writableSegment$okio(v5);
            int v7 = this.b.update(segment1.data, segment1.pos, v4, segment2.data, segment2.pos);
            bufferedSource0.skip(((long)v4));
            segment2.limit += v7;
            buffer1.setSize$okio(buffer1.size() + ((long)v7));
            if(segment2.pos == segment2.limit) {
                buffer1.head = segment2.pop();
                SegmentPool.recycle(segment2);
            }
        }
        return buffer1.read(buffer0, v);
    }

    @Override  // okio.Source
    @NotNull
    public Timeout timeout() {
        return this.a.timeout();
    }
}

