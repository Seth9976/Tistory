package okio;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001F\u0010\n\u001A\u00020\t2\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\f\u001A\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000F\u0010\u0015\u001A\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001A\u00020\u00128G¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0015\u0010\u0014¨\u0006\u0018"}, d2 = {"Lokio/GzipSink;", "Lokio/Sink;", "sink", "<init>", "(Lokio/Sink;)V", "Lokio/Buffer;", "source", "", "byteCount", "", "write", "(Lokio/Buffer;J)V", "flush", "()V", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "close", "Ljava/util/zip/Deflater;", "-deprecated_deflater", "()Ljava/util/zip/Deflater;", "deflater", "b", "Ljava/util/zip/Deflater;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nGzipSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,153:1\n51#2:154\n1#3:155\n86#4:156\n*S KotlinDebug\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n*L\n63#1:154\n131#1:156\n*E\n"})
public final class GzipSink implements Sink {
    public final RealBufferedSink a;
    public final Deflater b;
    public final DeflaterSink c;
    public boolean d;
    public final CRC32 e;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "deflater", imports = {}))
    @JvmName(name = "-deprecated_deflater")
    @NotNull
    public final Deflater -deprecated_deflater() {
        return this.b;
    }

    public GzipSink(@NotNull Sink sink0) {
        Intrinsics.checkNotNullParameter(sink0, "sink");
        super();
        RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
        this.a = realBufferedSink0;
        Deflater deflater0 = new Deflater(-1, true);
        this.b = deflater0;
        this.c = new DeflaterSink(realBufferedSink0, deflater0);
        this.e = new CRC32();
        realBufferedSink0.bufferField.writeShort(8075);
        realBufferedSink0.bufferField.writeByte(8);
        realBufferedSink0.bufferField.writeByte(0);
        realBufferedSink0.bufferField.writeInt(0);
        realBufferedSink0.bufferField.writeByte(0);
        realBufferedSink0.bufferField.writeByte(0);
    }

    @Override  // okio.Sink
    public void close() throws IOException {
        RealBufferedSink realBufferedSink0;
        Deflater deflater0;
        try {
            deflater0 = this.b;
            realBufferedSink0 = this.a;
            if(this.d) {
                return;
            }
            this.c.finishDeflate$okio();
            realBufferedSink0.writeIntLe(((int)this.e.getValue()));
            realBufferedSink0.writeIntLe(((int)deflater0.getBytesRead()));
            throwable0 = null;
        }
        catch(Throwable throwable0) {
        }
        try {
            deflater0.end();
        }
        catch(Throwable throwable1) {
            if(throwable0 == null) {
                throwable0 = throwable1;
            }
        }
        try {
            realBufferedSink0.close();
        }
        catch(Throwable throwable2) {
            if(throwable0 == null) {
                throwable0 = throwable2;
            }
        }
        this.d = true;
        if(throwable0 != null) {
            throw throwable0;
        }
    }

    @JvmName(name = "deflater")
    @NotNull
    public final Deflater deflater() {
        return this.b;
    }

    @Override  // okio.Sink
    public void flush() throws IOException {
        this.c.flush();
    }

    @Override  // okio.Sink
    @NotNull
    public Timeout timeout() {
        return this.a.timeout();
    }

    @Override  // okio.Sink
    public void write(@NotNull Buffer buffer0, long v) throws IOException {
        Intrinsics.checkNotNullParameter(buffer0, "source");
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException(q.n(v, "byteCount < 0: ").toString());
        }
        if(v1 == 0) {
            return;
        }
        Segment segment0 = buffer0.head;
        Intrinsics.checkNotNull(segment0);
        long v2 = v;
        while(v2 > 0L) {
            int v3 = (int)Math.min(v2, segment0.limit - segment0.pos);
            this.e.update(segment0.data, segment0.pos, v3);
            v2 -= (long)v3;
            segment0 = segment0.next;
            Intrinsics.checkNotNull(segment0);
        }
        this.c.write(buffer0, v);
    }
}

