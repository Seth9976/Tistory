package com.squareup.moshi;

import okio.Buffer;
import okio.Sink;
import okio.Timeout;

public final class w implements Sink {
    public final x a;

    public w(x x0) {
        this.a = x0;
    }

    @Override  // okio.Sink
    public final void close() {
        x x0 = this.a;
        if(x0.b() != 9) {
            throw new AssertionError();
        }
        int v = x0.a;
        x0.a = v - 1;
        ++x0.d[v - 2];
    }

    @Override  // okio.Sink
    public final void flush() {
        this.a.k.flush();
    }

    @Override  // okio.Sink
    public final Timeout timeout() {
        return Timeout.NONE;
    }

    @Override  // okio.Sink
    public final void write(Buffer buffer0, long v) {
        this.a.k.write(buffer0, v);
    }
}

