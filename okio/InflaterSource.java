package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0001\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u001F\u0010\r\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u001D\u0010\u000F\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\u000F\u0010\u000EJ\r\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokio/InflaterSource;", "Lokio/Source;", "Lokio/BufferedSource;", "source", "Ljava/util/zip/Inflater;", "inflater", "<init>", "(Lokio/BufferedSource;Ljava/util/zip/Inflater;)V", "(Lokio/Source;Ljava/util/zip/Inflater;)V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "readOrInflate", "", "refill", "()Z", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "", "close", "()V", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nInflaterSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,147:1\n1#2:148\n86#3:149\n*S KotlinDebug\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n*L\n73#1:149\n*E\n"})
public final class InflaterSource implements Source {
    public final BufferedSource a;
    public final Inflater b;
    public int c;
    public boolean d;

    public InflaterSource(@NotNull BufferedSource bufferedSource0, @NotNull Inflater inflater0) {
        Intrinsics.checkNotNullParameter(bufferedSource0, "source");
        Intrinsics.checkNotNullParameter(inflater0, "inflater");
        super();
        this.a = bufferedSource0;
        this.b = inflater0;
    }

    public InflaterSource(@NotNull Source source0, @NotNull Inflater inflater0) {
        Intrinsics.checkNotNullParameter(source0, "source");
        Intrinsics.checkNotNullParameter(inflater0, "inflater");
        this(Okio.buffer(source0), inflater0);
    }

    @Override  // okio.Source
    public void close() throws IOException {
        if(this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    @Override  // okio.Source
    public long read(@NotNull Buffer buffer0, long v) throws IOException {
        Intrinsics.checkNotNullParameter(buffer0, "sink");
        while(true) {
            long v1 = this.readOrInflate(buffer0, v);
            if(v1 > 0L) {
                return v1;
            }
            if(this.b.finished() || this.b.needsDictionary()) {
                break;
            }
            if(this.a.exhausted()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        return -1L;
    }

    public final long readOrInflate(@NotNull Buffer buffer0, long v) throws IOException {
        Inflater inflater0 = this.b;
        Intrinsics.checkNotNullParameter(buffer0, "sink");
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException(q.n(v, "byteCount < 0: ").toString());
        }
        if(this.d) {
            throw new IllegalStateException("closed");
        }
        if(v1 == 0) {
            return 0L;
        }
        try {
            Segment segment0 = buffer0.writableSegment$okio(1);
            int v2 = (int)Math.min(v, 0x2000 - segment0.limit);
            this.refill();
            int v3 = inflater0.inflate(segment0.data, segment0.limit, v2);
            int v4 = this.c;
            if(v4 != 0) {
                int v5 = v4 - inflater0.getRemaining();
                this.c -= v5;
                this.a.skip(((long)v5));
            }
            if(v3 > 0) {
                segment0.limit += v3;
                buffer0.setSize$okio(buffer0.size() + ((long)v3));
                return (long)v3;
            }
            if(segment0.pos == segment0.limit) {
                buffer0.head = segment0.pop();
                SegmentPool.recycle(segment0);
            }
            return 0L;
        }
        catch(DataFormatException dataFormatException0) {
        }
        throw new IOException(dataFormatException0);
    }

    public final boolean refill() throws IOException {
        Inflater inflater0 = this.b;
        if(!inflater0.needsInput()) {
            return false;
        }
        BufferedSource bufferedSource0 = this.a;
        if(bufferedSource0.exhausted()) {
            return true;
        }
        Segment segment0 = bufferedSource0.getBuffer().head;
        Intrinsics.checkNotNull(segment0);
        int v = segment0.limit - segment0.pos;
        this.c = v;
        inflater0.setInput(segment0.data, segment0.pos, v);
        return false;
    }

    @Override  // okio.Source
    @NotNull
    public Timeout timeout() {
        return this.a.timeout();
    }
}

