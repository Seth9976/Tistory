package vg;

import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

public final class c implements Sink {
    @Override  // okio.Sink
    public final void close() {
    }

    @Override  // okio.Sink
    public final void flush() {
    }

    @Override  // okio.Sink
    public final Timeout timeout() {
        return Timeout.NONE;
    }

    @Override  // okio.Sink
    public final void write(Buffer buffer0, long v) {
        Intrinsics.checkNotNullParameter(buffer0, "source");
        buffer0.skip(v);
    }
}

