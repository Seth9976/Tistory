package qg;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okio.Buffer;
import okio.ForwardingTimeout;
import okio.Source;
import okio.Timeout;

public abstract class a implements Source {
    public final ForwardingTimeout a;
    public boolean b;
    public final Http1ExchangeCodec c;

    public a(Http1ExchangeCodec http1ExchangeCodec0) {
        this.c = http1ExchangeCodec0;
        this.a = new ForwardingTimeout(http1ExchangeCodec0.c.timeout());
    }

    public final void a() {
        Http1ExchangeCodec http1ExchangeCodec0 = this.c;
        if(http1ExchangeCodec0.e == 6) {
            return;
        }
        if(http1ExchangeCodec0.e != 5) {
            throw new IllegalStateException("state: " + http1ExchangeCodec0.e);
        }
        Http1ExchangeCodec.access$detachTimeout(http1ExchangeCodec0, this.a);
        http1ExchangeCodec0.e = 6;
    }

    @Override  // okio.Source
    public long read(Buffer buffer0, long v) {
        Http1ExchangeCodec http1ExchangeCodec0 = this.c;
        Intrinsics.checkNotNullParameter(buffer0, "sink");
        try {
            return http1ExchangeCodec0.c.read(buffer0, v);
        }
        catch(IOException iOException0) {
            http1ExchangeCodec0.getConnection().noNewExchanges$okhttp();
            this.a();
            throw iOException0;
        }
    }

    @Override  // okio.Source
    public final Timeout timeout() {
        return this.a;
    }
}

