package vg;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import okio.Buffer;
import okio.Okio;
import okio.Segment;
import okio.SegmentPool;
import okio.Source;
import okio.Timeout;

public final class f implements Source {
    public final InputStream a;
    public final Timeout b;

    public f(InputStream inputStream0, Timeout timeout0) {
        Intrinsics.checkNotNullParameter(inputStream0, "input");
        Intrinsics.checkNotNullParameter(timeout0, "timeout");
        super();
        this.a = inputStream0;
        this.b = timeout0;
    }

    @Override  // okio.Source
    public final void close() {
        this.a.close();
    }

    @Override  // okio.Source
    public final long read(Buffer buffer0, long v) {
        Intrinsics.checkNotNullParameter(buffer0, "sink");
        int v1 = Long.compare(v, 0L);
        if(v1 == 0) {
            return 0L;
        }
        if(v1 < 0) {
            throw new IllegalArgumentException(q.n(v, "byteCount < 0: ").toString());
        }
        try {
            this.b.throwIfReached();
            Segment segment0 = buffer0.writableSegment$okio(1);
            int v2 = this.a.read(segment0.data, segment0.limit, ((int)Math.min(v, 0x2000 - segment0.limit)));
            if(v2 == -1) {
                if(segment0.pos == segment0.limit) {
                    buffer0.head = segment0.pop();
                    SegmentPool.recycle(segment0);
                    return -1L;
                }
                return -1L;
            }
            segment0.limit += v2;
            buffer0.setSize$okio(buffer0.size() + ((long)v2));
            return (long)v2;
        }
        catch(AssertionError assertionError0) {
        }
        if(!Okio.isAndroidGetsocknameError(assertionError0)) {
            throw assertionError0;
        }
        throw new IOException(assertionError0);
    }

    @Override  // okio.Source
    public final Timeout timeout() {
        return this.b;
    }

    @Override
    public final String toString() {
        return "source(" + this.a + ')';
    }
}

