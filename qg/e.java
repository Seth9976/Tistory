package qg;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okio.Buffer;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Timeout;

public final class e implements Sink {
    public final ForwardingTimeout a;
    public boolean b;
    public final Http1ExchangeCodec c;

    public e(Http1ExchangeCodec http1ExchangeCodec0) {
        this.c = http1ExchangeCodec0;
        this.a = new ForwardingTimeout(http1ExchangeCodec0.d.timeout());
    }

    @Override  // okio.Sink
    public final void close() {
        if(this.b) {
            return;
        }
        this.b = true;
        Http1ExchangeCodec.access$detachTimeout(this.c, this.a);
        this.c.e = 3;
    }

    @Override  // okio.Sink
    public final void flush() {
        if(this.b) {
            return;
        }
        this.c.d.flush();
    }

    @Override  // okio.Sink
    public final Timeout timeout() {
        return this.a;
    }

    @Override  // okio.Sink
    public final void write(Buffer buffer0, long v) {
        Intrinsics.checkNotNullParameter(buffer0, "source");
        if(this.b) {
            throw new IllegalStateException("closed");
        }
        Util.checkOffsetAndCount(buffer0.size(), 0L, v);
        this.c.d.write(buffer0, v);
    }
}

