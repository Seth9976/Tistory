package okhttp3.internal.http1;

import androidx.room.a;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy.Type;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response.Builder;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qg.b;
import qg.c;
import qg.d;
import qg.e;
import qg.f;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 62\u00020\u0001:\u00077896:;<B)\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u001F\u0010\u0011\u001A\u00020\u00102\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001A\u00020\u00132\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001A\u001A\u00020\u000E2\u0006\u0010\u0019\u001A\u00020\u0018H\u0016¢\u0006\u0004\b\u001A\u0010\u001BJ\u0017\u0010\u001D\u001A\u00020\u001C2\u0006\u0010\u0019\u001A\u00020\u0018H\u0016¢\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010 \u001A\u00020\u001FH\u0016¢\u0006\u0004\b \u0010!J\u000F\u0010\"\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010\u0015J\u000F\u0010#\u001A\u00020\u0013H\u0016¢\u0006\u0004\b#\u0010\u0015J\u001D\u0010\'\u001A\u00020\u00132\u0006\u0010$\u001A\u00020\u001F2\u0006\u0010&\u001A\u00020%¢\u0006\u0004\b\'\u0010(J\u0019\u0010,\u001A\u0004\u0018\u00010+2\u0006\u0010*\u001A\u00020)H\u0016¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001A\u00020\u00132\u0006\u0010\u0019\u001A\u00020\u0018¢\u0006\u0004\b.\u0010/R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R\u0011\u00104\u001A\u00020)8F¢\u0006\u0006\u001A\u0004\b4\u00105¨\u0006="}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/connection/RealConnection;", "connection", "Lokio/BufferedSource;", "source", "Lokio/BufferedSink;", "sink", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealConnection;Lokio/BufferedSource;Lokio/BufferedSink;)V", "Lokhttp3/Request;", "request", "", "contentLength", "Lokio/Sink;", "createRequestBody", "(Lokhttp3/Request;J)Lokio/Sink;", "", "cancel", "()V", "writeRequestHeaders", "(Lokhttp3/Request;)V", "Lokhttp3/Response;", "response", "reportedContentLength", "(Lokhttp3/Response;)J", "Lokio/Source;", "openResponseBodySource", "(Lokhttp3/Response;)Lokio/Source;", "Lokhttp3/Headers;", "trailers", "()Lokhttp3/Headers;", "flushRequest", "finishRequest", "headers", "", "requestLine", "writeRequest", "(Lokhttp3/Headers;Ljava/lang/String;)V", "", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lokhttp3/Response$Builder;", "skipConnectBody", "(Lokhttp3/Response;)V", "b", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "isClosed", "()Z", "Companion", "qg/a", "qg/b", "qg/c", "qg/d", "qg/e", "qg/f", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
public final class Http1ExchangeCodec implements ExchangeCodec {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001A\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001A\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001A\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000B\u001A\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000B\u0010\u0007R\u0014\u0010\f\u001A\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001A\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u000E"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$Companion;", "", "", "NO_CHUNK_YET", "J", "", "STATE_CLOSED", "I", "STATE_IDLE", "STATE_OPEN_REQUEST_BODY", "STATE_OPEN_RESPONSE_BODY", "STATE_READING_RESPONSE_BODY", "STATE_READ_RESPONSE_HEADERS", "STATE_WRITING_REQUEST_BODY", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final OkHttpClient a;
    public final RealConnection b;
    public final BufferedSource c;
    public final BufferedSink d;
    public int e;
    public final HeadersReader f;
    public Headers g;

    static {
        Http1ExchangeCodec.Companion = new Companion(null);
    }

    public Http1ExchangeCodec(@Nullable OkHttpClient okHttpClient0, @NotNull RealConnection realConnection0, @NotNull BufferedSource bufferedSource0, @NotNull BufferedSink bufferedSink0) {
        Intrinsics.checkNotNullParameter(realConnection0, "connection");
        Intrinsics.checkNotNullParameter(bufferedSource0, "source");
        Intrinsics.checkNotNullParameter(bufferedSink0, "sink");
        super();
        this.a = okHttpClient0;
        this.b = realConnection0;
        this.c = bufferedSource0;
        this.d = bufferedSink0;
        this.f = new HeadersReader(bufferedSource0);
    }

    public final d a(long v) {
        if(this.e != 4) {
            throw new IllegalStateException(("state: " + this.e).toString());
        }
        this.e = 5;
        return new d(this, v);
    }

    public static final void access$detachTimeout(Http1ExchangeCodec http1ExchangeCodec0, ForwardingTimeout forwardingTimeout0) {
        http1ExchangeCodec0.getClass();
        Timeout timeout0 = forwardingTimeout0.delegate();
        forwardingTimeout0.setDelegate(Timeout.NONE);
        timeout0.clearDeadline();
        timeout0.clearTimeout();
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        this.getConnection().cancel();
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public Sink createRequestBody(@NotNull Request request0, long v) {
        Intrinsics.checkNotNullParameter(request0, "request");
        boolean z = request0.body() == null;
        if(p.equals("chunked", request0.header("Transfer-Encoding"), true)) {
            if(this.e != 1) {
                throw new IllegalStateException(("state: " + this.e).toString());
            }
            this.e = 2;
            return new b(this);
        }
        if(v == -1L) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if(this.e != 1) {
            throw new IllegalStateException(("state: " + this.e).toString());
        }
        this.e = 2;
        return new e(this);
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.d.flush();
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.d.flush();
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public RealConnection getConnection() {
        return this.b;
    }

    public final boolean isClosed() {
        return this.e == 6;
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public Source openResponseBodySource(@NotNull Response response0) {
        Intrinsics.checkNotNullParameter(response0, "response");
        if(!HttpHeaders.promisesBody(response0)) {
            return this.a(0L);
        }
        if(p.equals("chunked", Response.header$default(response0, "Transfer-Encoding", null, 2, null), true)) {
            HttpUrl httpUrl0 = response0.request().url();
            if(this.e != 4) {
                throw new IllegalStateException(("state: " + this.e).toString());
            }
            this.e = 5;
            return new c(this, httpUrl0);
        }
        long v = Util.headersContentLength(response0);
        if(v != -1L) {
            return this.a(v);
        }
        if(this.e != 4) {
            throw new IllegalStateException(("state: " + this.e).toString());
        }
        this.e = 5;
        this.getConnection().noNewExchanges$okhttp();
        return new f(this);  // 初始化器: Lqg/a;-><init>(Lokhttp3/internal/http1/Http1ExchangeCodec;)V
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    @Nullable
    public Builder readResponseHeaders(boolean z) {
        HeadersReader headersReader0 = this.f;
        if(this.e != 1 && (this.e != 2 && this.e != 3)) {
            throw new IllegalStateException(("state: " + this.e).toString());
        }
        try {
            String s = headersReader0.readLine();
            StatusLine statusLine0 = StatusLine.Companion.parse(s);
            Builder response$Builder0 = new Builder().protocol(statusLine0.protocol).code(statusLine0.code).message(statusLine0.message).headers(headersReader0.readHeaders());
            if(z && statusLine0.code == 100) {
                return null;
            }
            int v = statusLine0.code;
            if(v == 100) {
                this.e = 3;
                return response$Builder0;
            }
            if(102 <= v && v < 200) {
                this.e = 3;
                return response$Builder0;
            }
            this.e = 4;
            return response$Builder0;
        }
        catch(EOFException eOFException0) {
        }
        throw new IOException(a.j("unexpected end of stream on ", this.getConnection().route().address().url().redact()), eOFException0);
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(@NotNull Response response0) {
        Intrinsics.checkNotNullParameter(response0, "response");
        if(!HttpHeaders.promisesBody(response0)) {
            return 0L;
        }
        return p.equals("chunked", Response.header$default(response0, "Transfer-Encoding", null, 2, null), true) ? -1L : Util.headersContentLength(response0);
    }

    public final void skipConnectBody(@NotNull Response response0) {
        Intrinsics.checkNotNullParameter(response0, "response");
        long v = Util.headersContentLength(response0);
        if(v == -1L) {
            return;
        }
        d d0 = this.a(v);
        Util.skipAll(d0, 0x7FFFFFFF, TimeUnit.MILLISECONDS);
        d0.close();
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public Headers trailers() {
        if(this.e != 6) {
            throw new IllegalStateException("too early; can\'t read the trailers yet");
        }
        return this.g == null ? Util.EMPTY_HEADERS : this.g;
    }

    public final void writeRequest(@NotNull Headers headers0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(headers0, "headers");
        Intrinsics.checkNotNullParameter(s, "requestLine");
        if(this.e != 0) {
            throw new IllegalStateException(("state: " + this.e).toString());
        }
        BufferedSink bufferedSink0 = this.d;
        bufferedSink0.writeUtf8(s).writeUtf8("\r\n");
        int v = headers0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            bufferedSink0.writeUtf8(headers0.name(v1)).writeUtf8(": ").writeUtf8(headers0.value(v1)).writeUtf8("\r\n");
        }
        bufferedSink0.writeUtf8("\r\n");
        this.e = 1;
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(@NotNull Request request0) {
        Intrinsics.checkNotNullParameter(request0, "request");
        Proxy.Type proxy$Type0 = this.getConnection().route().proxy().type();
        Intrinsics.checkNotNullExpressionValue(proxy$Type0, "connection.route().proxy.type()");
        this.writeRequest(request0.headers(), RequestLine.INSTANCE.get(request0, proxy$Type0));
    }
}

