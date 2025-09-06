package qg;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import kotlin.text.q;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okio.Buffer;

public final class c extends a {
    public final HttpUrl d;
    public long e;
    public boolean f;
    public final Http1ExchangeCodec g;

    public c(Http1ExchangeCodec http1ExchangeCodec0, HttpUrl httpUrl0) {
        Intrinsics.checkNotNullParameter(httpUrl0, "url");
        this.g = http1ExchangeCodec0;
        super(http1ExchangeCodec0);
        this.d = httpUrl0;
        this.e = -1L;
        this.f = true;
    }

    @Override  // okio.Source
    public final void close() {
        if(this.b) {
            return;
        }
        if(this.f && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.g.getConnection().noNewExchanges$okhttp();
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
        if(!this.f) {
            return -1L;
        }
        long v1 = this.e;
        Http1ExchangeCodec http1ExchangeCodec0 = this.g;
        if(Long.compare(v1, 0L) == 0 || v1 == -1L) {
            if(v1 != -1L) {
                http1ExchangeCodec0.c.readUtf8LineStrict();
            }
            try {
                this.e = http1ExchangeCodec0.c.readHexadecimalUnsignedLong();
                String s = StringsKt__StringsKt.trim(http1ExchangeCodec0.c.readUtf8LineStrict()).toString();
                if(this.e < 0L || s.length() > 0 && !p.startsWith$default(s, ";", false, 2, null)) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.e + s + '\"');
                }
            }
            catch(NumberFormatException numberFormatException0) {
                throw new ProtocolException(numberFormatException0.getMessage());
            }
            if(this.e == 0L) {
                this.f = false;
                http1ExchangeCodec0.g = http1ExchangeCodec0.f.readHeaders();
                OkHttpClient okHttpClient0 = http1ExchangeCodec0.a;
                Intrinsics.checkNotNull(okHttpClient0);
                Headers headers0 = http1ExchangeCodec0.g;
                Intrinsics.checkNotNull(headers0);
                HttpHeaders.receiveHeaders(okHttpClient0.cookieJar(), this.d, headers0);
                this.a();
            }
            if(!this.f) {
                return -1L;
            }
        }
        long v2 = super.read(buffer0, Math.min(v, this.e));
        if(v2 != -1L) {
            this.e -= v2;
            return v2;
        }
        http1ExchangeCodec0.getConnection().noNewExchanges$okhttp();
        ProtocolException protocolException0 = new ProtocolException("unexpected end of stream");
        this.a();
        throw protocolException0;
    }
}

