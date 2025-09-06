package qg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import okio.Buffer;

public final class f extends a {
    public boolean d;

    @Override  // okio.Source
    public final void close() {
        if(this.b) {
            return;
        }
        if(!this.d) {
            this.a();
        }
        this.b = true;
    }

    @Override  // qg.a
    public final long read(Buffer buffer0, long v) {
        Intrinsics.checkNotNullParameter(buffer0, "sink");
        if(v < 0L) {
            throw new IllegalArgumentException(q.n(v, "byteCount < 0: ").toString());
        }
        if(this.b) {
            throw new IllegalStateException("closed");
        }
        if(this.d) {
            return -1L;
        }
        long v1 = super.read(buffer0, v);
        if(v1 == -1L) {
            this.d = true;
            this.a();
            return -1L;
        }
        return v1;
    }
}

