package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0001\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u001F\u0010\u000E\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u000F\u0010\u0014\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Lokio/DeflaterSink;", "Lokio/Sink;", "Lokio/BufferedSink;", "sink", "Ljava/util/zip/Deflater;", "deflater", "<init>", "(Lokio/BufferedSink;Ljava/util/zip/Deflater;)V", "(Lokio/Sink;Ljava/util/zip/Deflater;)V", "Lokio/Buffer;", "source", "", "byteCount", "", "write", "(Lokio/Buffer;J)V", "flush", "()V", "finishDeflate$okio", "finishDeflate", "close", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDeflaterSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,163:1\n86#2:164\n*S KotlinDebug\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n*L\n58#1:164\n*E\n"})
public final class DeflaterSink implements Sink {
    public final BufferedSink a;
    public final Deflater b;
    public boolean c;

    public DeflaterSink(@NotNull BufferedSink bufferedSink0, @NotNull Deflater deflater0) {
        Intrinsics.checkNotNullParameter(bufferedSink0, "sink");
        Intrinsics.checkNotNullParameter(deflater0, "deflater");
        super();
        this.a = bufferedSink0;
        this.b = deflater0;
    }

    public DeflaterSink(@NotNull Sink sink0, @NotNull Deflater deflater0) {
        Intrinsics.checkNotNullParameter(sink0, "sink");
        Intrinsics.checkNotNullParameter(deflater0, "deflater");
        this(Okio.buffer(sink0), deflater0);
    }

    public final void a(boolean z) {
        int v;
        Segment segment0;
        BufferedSink bufferedSink0 = this.a;
        Buffer buffer0 = bufferedSink0.getBuffer();
        while(true) {
            segment0 = buffer0.writableSegment$okio(1);
            Deflater deflater0 = this.b;
            try {
                v = z ? deflater0.deflate(segment0.data, segment0.limit, 0x2000 - segment0.limit, 2) : deflater0.deflate(segment0.data, segment0.limit, 0x2000 - segment0.limit);
            }
            catch(NullPointerException nullPointerException0) {
                throw new IOException("Deflater already closed", nullPointerException0);
            }
            if(v > 0) {
                segment0.limit += v;
                buffer0.setSize$okio(buffer0.size() + ((long)v));
                bufferedSink0.emitCompleteSegments();
            }
            else if(deflater0.needsInput()) {
                break;
            }
        }
        if(segment0.pos == segment0.limit) {
            buffer0.head = segment0.pop();
            SegmentPool.recycle(segment0);
        }
    }

    @Override  // okio.Sink
    public void close() throws IOException {
        try {
            if(this.c) {
                return;
            }
            this.finishDeflate$okio();
            throwable0 = null;
        }
        catch(Throwable throwable0) {
        }
        try {
            this.b.end();
        }
        catch(Throwable throwable1) {
            if(throwable0 == null) {
                throwable0 = throwable1;
            }
        }
        try {
            this.a.close();
        }
        catch(Throwable throwable2) {
            if(throwable0 == null) {
                throwable0 = throwable2;
            }
        }
        this.c = true;
        if(throwable0 != null) {
            throw throwable0;
        }
    }

    public final void finishDeflate$okio() {
        this.b.finish();
        this.a(false);
    }

    @Override  // okio.Sink
    public void flush() throws IOException {
        this.a(true);
        this.a.flush();
    }

    @Override  // okio.Sink
    @NotNull
    public Timeout timeout() {
        return this.a.timeout();
    }

    @Override
    @NotNull
    public String toString() {
        return "DeflaterSink(" + this.a + ')';
    }

    @Override  // okio.Sink
    public void write(@NotNull Buffer buffer0, long v) throws IOException {
        Intrinsics.checkNotNullParameter(buffer0, "source");
        -SegmentedByteString.checkOffsetAndCount(buffer0.size(), 0L, v);
        while(v > 0L) {
            Segment segment0 = buffer0.head;
            Intrinsics.checkNotNull(segment0);
            int v1 = (int)Math.min(v, segment0.limit - segment0.pos);
            this.b.setInput(segment0.data, segment0.pos, v1);
            this.a(false);
            buffer0.setSize$okio(buffer0.size() - ((long)v1));
            int v2 = segment0.pos + v1;
            segment0.pos = v2;
            if(v2 == segment0.limit) {
                buffer0.head = segment0.pop();
                SegmentPool.recycle(segment0);
            }
            v -= (long)v1;
        }
    }
}

