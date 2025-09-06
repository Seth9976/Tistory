package vg;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import okio.-SegmentedByteString;
import okio.Buffer;
import okio.Segment;
import okio.SegmentPool;
import okio.Sink;
import okio.Timeout;

public final class h implements Sink {
    public final OutputStream a;
    public final Timeout b;

    public h(OutputStream outputStream0, Timeout timeout0) {
        Intrinsics.checkNotNullParameter(outputStream0, "out");
        Intrinsics.checkNotNullParameter(timeout0, "timeout");
        super();
        this.a = outputStream0;
        this.b = timeout0;
    }

    @Override  // okio.Sink
    public final void close() {
        this.a.close();
    }

    @Override  // okio.Sink
    public final void flush() {
        this.a.flush();
    }

    @Override  // okio.Sink
    public final Timeout timeout() {
        return this.b;
    }

    @Override
    public final String toString() {
        return "sink(" + this.a + ')';
    }

    @Override  // okio.Sink
    public final void write(Buffer buffer0, long v) {
        Intrinsics.checkNotNullParameter(buffer0, "source");
        -SegmentedByteString.checkOffsetAndCount(buffer0.size(), 0L, v);
        while(v > 0L) {
            this.b.throwIfReached();
            Segment segment0 = buffer0.head;
            Intrinsics.checkNotNull(segment0);
            int v1 = (int)Math.min(v, segment0.limit - segment0.pos);
            this.a.write(segment0.data, segment0.pos, v1);
            segment0.pos += v1;
            v -= (long)v1;
            buffer0.setSize$okio(buffer0.size() - ((long)v1));
            if(segment0.pos == segment0.limit) {
                buffer0.head = segment0.pop();
                SegmentPool.recycle(segment0);
            }
        }
    }
}

