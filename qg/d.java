package qg;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import okhttp3.internal.Util;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okio.Buffer;

public final class d extends a {
    public long d;
    public final Http1ExchangeCodec e;

    public d(Http1ExchangeCodec http1ExchangeCodec0, long v) {
        this.e = http1ExchangeCodec0;
        super(http1ExchangeCodec0);
        this.d = v;
        if(v == 0L) {
            this.a();
        }
    }

    @Override  // okio.Source
    public final void close() {
        if(this.b) {
            return;
        }
        if(this.d != 0L && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.e.getConnection().noNewExchanges$okhttp();
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
        long v1 = this.d;
        if(Long.compare(v1, 0L) == 0) {
            return -1L;
        }
        long v2 = super.read(buffer0, Math.min(v1, v));
        if(v2 != -1L) {
            long v3 = this.d - v2;
            this.d = v3;
            if(v3 == 0L) {
                this.a();
            }
            return v2;
        }
        this.e.getConnection().noNewExchanges$okhttp();
        ProtocolException protocolException0 = new ProtocolException("unexpected end of stream");
        this.a();
        throw protocolException0;
    }
}

