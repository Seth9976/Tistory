package okhttp3.internal.http2;

import androidx.room.a;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response.Builder;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 -2\u00020\u0001:\u0001-B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u001F\u0010\u0011\u001A\u00020\u00102\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001A\u00020\u00132\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0016\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0018\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001C\u001A\u0004\u0018\u00010\u001B2\u0006\u0010\u001A\u001A\u00020\u0019H\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\u0017\u0010 \u001A\u00020\u000E2\u0006\u0010\u001F\u001A\u00020\u001EH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001A\u00020\"2\u0006\u0010\u001F\u001A\u00020\u001EH\u0016¢\u0006\u0004\b#\u0010$J\u000F\u0010&\u001A\u00020%H\u0016¢\u0006\u0004\b&\u0010\'J\u000F\u0010(\u001A\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010\u0017R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,¨\u0006."}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/connection/RealConnection;", "connection", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http2/Http2Connection;", "http2Connection", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealConnection;Lokhttp3/internal/http/RealInterceptorChain;Lokhttp3/internal/http2/Http2Connection;)V", "Lokhttp3/Request;", "request", "", "contentLength", "Lokio/Sink;", "createRequestBody", "(Lokhttp3/Request;J)Lokio/Sink;", "", "writeRequestHeaders", "(Lokhttp3/Request;)V", "flushRequest", "()V", "finishRequest", "", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lokhttp3/Response$Builder;", "Lokhttp3/Response;", "response", "reportedContentLength", "(Lokhttp3/Response;)J", "Lokio/Source;", "openResponseBodySource", "(Lokhttp3/Response;)Lokio/Source;", "Lokhttp3/Headers;", "trailers", "()Lokhttp3/Headers;", "cancel", "a", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Http2ExchangeCodec implements ExchangeCodec {
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001B\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001D\u0010\r\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\r\u0010\u000ER\u0014\u0010\u0010\u001A\u00020\u000F8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001A\u00020\u000F8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001A\u00020\u000F8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001A\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u000F0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001A\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u000F0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001A\u00020\u000F8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001A\u00020\u000F8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001A\u00020\u000F8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001A\u001A\u00020\u000F8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001A\u0010\u0011R\u0014\u0010\u001B\u001A\u00020\u000F8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001B\u0010\u0011¨\u0006\u001C"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;", "", "Lokhttp3/Request;", "request", "", "Lokhttp3/internal/http2/Header;", "http2HeadersList", "(Lokhttp3/Request;)Ljava/util/List;", "Lokhttp3/Headers;", "headerBlock", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/Response$Builder;", "readHttp2HeadersList", "(Lokhttp3/Headers;Lokhttp3/Protocol;)Lokhttp3/Response$Builder;", "", "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final List http2HeadersList(@NotNull Request request0) {
            Intrinsics.checkNotNullParameter(request0, "request");
            Headers headers0 = request0.headers();
            List list0 = new ArrayList(headers0.size() + 4);
            ((ArrayList)list0).add(new Header(Header.TARGET_METHOD, request0.method()));
            String s = RequestLine.INSTANCE.requestPath(request0.url());
            ((ArrayList)list0).add(new Header(Header.TARGET_PATH, s));
            String s1 = request0.header("Host");
            if(s1 != null) {
                ((ArrayList)list0).add(new Header(Header.TARGET_AUTHORITY, s1));
            }
            ((ArrayList)list0).add(new Header(Header.TARGET_SCHEME, request0.url().scheme()));
            int v = headers0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                String s2 = headers0.name(v1);
                String s3 = a.k(Locale.US, "US", s2, Locale.US, "this as java.lang.String).toLowerCase(locale)");
                if(!Http2ExchangeCodec.g.contains(s3) || Intrinsics.areEqual(s3, "te") && Intrinsics.areEqual(headers0.value(v1), "trailers")) {
                    ((ArrayList)list0).add(new Header(s3, headers0.value(v1)));
                }
            }
            return list0;
        }

        @NotNull
        public final Builder readHttp2HeadersList(@NotNull Headers headers0, @NotNull Protocol protocol0) {
            Intrinsics.checkNotNullParameter(headers0, "headerBlock");
            Intrinsics.checkNotNullParameter(protocol0, "protocol");
            okhttp3.Headers.Builder headers$Builder0 = new okhttp3.Headers.Builder();
            int v = headers0.size();
            StatusLine statusLine0 = null;
            for(int v1 = 0; v1 < v; ++v1) {
                String s = headers0.name(v1);
                String s1 = headers0.value(v1);
                if(Intrinsics.areEqual(s, ":status")) {
                    statusLine0 = StatusLine.Companion.parse("HTTP/1.1 " + s1);
                }
                else if(!Http2ExchangeCodec.h.contains(s)) {
                    headers$Builder0.addLenient$okhttp(s, s1);
                }
            }
            if(statusLine0 == null) {
                throw new ProtocolException("Expected \':status\' header not present");
            }
            return new Builder().protocol(protocol0).code(statusLine0.code).message(statusLine0.message).headers(headers$Builder0.build());
        }
    }

    @NotNull
    public static final Companion Companion;
    public final RealConnection a;
    public final RealInterceptorChain b;
    public final Http2Connection c;
    public volatile Http2Stream d;
    public final Protocol e;
    public volatile boolean f;
    public static final List g;
    public static final List h;

    static {
        Http2ExchangeCodec.Companion = new Companion(null);
        Http2ExchangeCodec.g = Util.immutableListOf(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
        Http2ExchangeCodec.h = Util.immutableListOf(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    }

    public Http2ExchangeCodec(@NotNull OkHttpClient okHttpClient0, @NotNull RealConnection realConnection0, @NotNull RealInterceptorChain realInterceptorChain0, @NotNull Http2Connection http2Connection0) {
        Intrinsics.checkNotNullParameter(okHttpClient0, "client");
        Intrinsics.checkNotNullParameter(realConnection0, "connection");
        Intrinsics.checkNotNullParameter(realInterceptorChain0, "chain");
        Intrinsics.checkNotNullParameter(http2Connection0, "http2Connection");
        super();
        this.a = realConnection0;
        this.b = realInterceptorChain0;
        this.c = http2Connection0;
        this.e = okHttpClient0.protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE) ? Protocol.H2_PRIOR_KNOWLEDGE : Protocol.HTTP_2;
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        this.f = true;
        Http2Stream http2Stream0 = this.d;
        if(http2Stream0 != null) {
            http2Stream0.closeLater(ErrorCode.CANCEL);
        }
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public Sink createRequestBody(@NotNull Request request0, long v) {
        Intrinsics.checkNotNullParameter(request0, "request");
        Http2Stream http2Stream0 = this.d;
        Intrinsics.checkNotNull(http2Stream0);
        return http2Stream0.getSink();
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        Http2Stream http2Stream0 = this.d;
        Intrinsics.checkNotNull(http2Stream0);
        http2Stream0.getSink().close();
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.c.flush();
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public RealConnection getConnection() {
        return this.a;
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public Source openResponseBodySource(@NotNull Response response0) {
        Intrinsics.checkNotNullParameter(response0, "response");
        Http2Stream http2Stream0 = this.d;
        Intrinsics.checkNotNull(http2Stream0);
        return http2Stream0.getSource$okhttp();
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    @Nullable
    public Builder readResponseHeaders(boolean z) {
        Http2Stream http2Stream0 = this.d;
        if(http2Stream0 == null) {
            throw new IOException("stream wasn\'t created");
        }
        Headers headers0 = http2Stream0.takeHeaders();
        Builder response$Builder0 = Http2ExchangeCodec.Companion.readHttp2HeadersList(headers0, this.e);
        return !z || response$Builder0.getCode$okhttp() != 100 ? response$Builder0 : null;
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(@NotNull Response response0) {
        Intrinsics.checkNotNullParameter(response0, "response");
        return HttpHeaders.promisesBody(response0) ? Util.headersContentLength(response0) : 0L;
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public Headers trailers() {
        Http2Stream http2Stream0 = this.d;
        Intrinsics.checkNotNull(http2Stream0);
        return http2Stream0.trailers();
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(@NotNull Request request0) {
        Intrinsics.checkNotNullParameter(request0, "request");
        if(this.d != null) {
            return;
        }
        List list0 = Http2ExchangeCodec.Companion.http2HeadersList(request0);
        this.d = this.c.newStream(list0, request0.body() != null);
        if(!this.f) {
            Http2Stream http2Stream0 = this.d;
            Intrinsics.checkNotNull(http2Stream0);
            TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
            http2Stream0.readTimeout().timeout(((long)this.b.getReadTimeoutMillis$okhttp()), timeUnit0);
            Http2Stream http2Stream1 = this.d;
            Intrinsics.checkNotNull(http2Stream1);
            http2Stream1.writeTimeout().timeout(((long)this.b.getWriteTimeoutMillis$okhttp()), timeUnit0);
            return;
        }
        Http2Stream http2Stream2 = this.d;
        Intrinsics.checkNotNull(http2Stream2);
        http2Stream2.closeLater(ErrorCode.CANCEL);
        throw new IOException("Canceled");
    }
}

