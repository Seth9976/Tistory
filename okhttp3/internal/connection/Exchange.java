package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response.Builder;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.ws.RealWebSocket.Streams;
import okio.Buffer;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pg.a;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001B\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002UVB\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\n\u0010\u000BJ\u0015\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\f\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u001D\u0010\u0014\u001A\u00020\u00132\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u0012\u001A\u00020\u0011\u00A2\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001C\u001A\u0004\u0018\u00010\u001B2\u0006\u0010\u001A\u001A\u00020\u0011\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0015\u0010 \u001A\u00020\u000E2\u0006\u0010\u001F\u001A\u00020\u001E\u00A2\u0006\u0004\b \u0010!J\u0015\u0010#\u001A\u00020\"2\u0006\u0010\u001F\u001A\u00020\u001E\u00A2\u0006\u0004\b#\u0010$J\r\u0010&\u001A\u00020%\u00A2\u0006\u0004\b&\u0010\'J\r\u0010)\u001A\u00020(\u00A2\u0006\u0004\b)\u0010*J\r\u0010+\u001A\u00020\u000E\u00A2\u0006\u0004\b+\u0010\u0017J\r\u0010,\u001A\u00020\u000E\u00A2\u0006\u0004\b,\u0010\u0017J\r\u0010-\u001A\u00020\u000E\u00A2\u0006\u0004\b-\u0010\u0017J\r\u0010.\u001A\u00020\u000E\u00A2\u0006\u0004\b.\u0010\u0017J9\u00106\u001A\u00028\u0000\"\n\b\u0000\u00100*\u0004\u0018\u00010/2\u0006\u00102\u001A\u0002012\u0006\u00103\u001A\u00020\u00112\u0006\u00104\u001A\u00020\u00112\u0006\u00105\u001A\u00028\u0000\u00A2\u0006\u0004\b6\u00107J\r\u00108\u001A\u00020\u000E\u00A2\u0006\u0004\b8\u0010\u0017R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b;\u0010<R\u001A\u0010\u0005\u001A\u00020\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010@R\u001A\u0010\u0007\u001A\u00020\u00068\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bA\u0010B\u001A\u0004\bC\u0010DR$\u0010I\u001A\u00020\u00112\u0006\u0010E\u001A\u00020\u00118\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b5\u0010F\u001A\u0004\bG\u0010HR$\u0010L\u001A\u00020\u00112\u0006\u0010E\u001A\u00020\u00118\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bJ\u0010F\u001A\u0004\bK\u0010HR\u001A\u0010R\u001A\u00020M8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bN\u0010O\u001A\u0004\bP\u0010QR\u0014\u0010T\u001A\u00020\u00118@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bS\u0010H\u00A8\u0006W"}, d2 = {"Lokhttp3/internal/connection/Exchange;", "", "Lokhttp3/internal/connection/RealCall;", "call", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/internal/connection/ExchangeFinder;", "finder", "Lokhttp3/internal/http/ExchangeCodec;", "codec", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;Lokhttp3/internal/connection/ExchangeFinder;Lokhttp3/internal/http/ExchangeCodec;)V", "Lokhttp3/Request;", "request", "", "writeRequestHeaders", "(Lokhttp3/Request;)V", "", "duplex", "Lokio/Sink;", "createRequestBody", "(Lokhttp3/Request;Z)Lokio/Sink;", "flushRequest", "()V", "finishRequest", "responseHeadersStart", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lokhttp3/Response$Builder;", "Lokhttp3/Response;", "response", "responseHeadersEnd", "(Lokhttp3/Response;)V", "Lokhttp3/ResponseBody;", "openResponseBody", "(Lokhttp3/Response;)Lokhttp3/ResponseBody;", "Lokhttp3/Headers;", "trailers", "()Lokhttp3/Headers;", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams", "()Lokhttp3/internal/ws/RealWebSocket$Streams;", "webSocketUpgradeFailed", "noNewExchangesOnConnection", "cancel", "detachWithViolence", "Ljava/io/IOException;", "E", "", "bytesRead", "responseDone", "requestDone", "e", "bodyComplete", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "noRequestBody", "a", "Lokhttp3/internal/connection/RealCall;", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "b", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "c", "Lokhttp3/internal/connection/ExchangeFinder;", "getFinder$okhttp", "()Lokhttp3/internal/connection/ExchangeFinder;", "<set-?>", "Z", "isDuplex$okhttp", "()Z", "isDuplex", "f", "getHasFailure$okhttp", "hasFailure", "Lokhttp3/internal/connection/RealConnection;", "g", "Lokhttp3/internal/connection/RealConnection;", "getConnection$okhttp", "()Lokhttp3/internal/connection/RealConnection;", "connection", "isCoalescedConnection$okhttp", "isCoalescedConnection", "pg/a", "ResponseBodySource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Exchange {
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\u000B\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ!\u0010\u0013\u001A\u00028\u0000\"\n\b\u0000\u0010\u0011*\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001A\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "Lokio/ForwardingSource;", "Lokio/Source;", "delegate", "", "contentLength", "<init>", "(Lokhttp3/internal/connection/Exchange;Lokio/Source;J)V", "Lokio/Buffer;", "sink", "byteCount", "read", "(Lokio/Buffer;J)J", "", "close", "()V", "Ljava/io/IOException;", "E", "e", "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$ResponseBodySource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
    public final class ResponseBodySource extends ForwardingSource {
        public final long b;
        public long c;
        public boolean d;
        public boolean e;
        public boolean f;
        public final Exchange g;

        public ResponseBodySource(@NotNull Source source0, long v) {
            Intrinsics.checkNotNullParameter(source0, "delegate");
            this.g = exchange0;
            super(source0);
            this.b = v;
            this.d = true;
            if(v == 0L) {
                this.complete(null);
            }
        }

        @Override  // okio.ForwardingSource
        public void close() throws IOException {
            if(this.f) {
                return;
            }
            try {
                this.f = true;
                super.close();
                this.complete(null);
            }
            catch(IOException iOException0) {
                throw this.complete(iOException0);
            }
        }

        public final IOException complete(IOException iOException0) {
            if(this.e) {
                return iOException0;
            }
            this.e = true;
            if(iOException0 == null && this.d) {
                this.d = false;
                this.g.getEventListener$okhttp().responseBodyStart(this.g.getCall$okhttp());
            }
            return this.g.bodyComplete(this.c, true, false, iOException0);
        }

        @Override  // okio.ForwardingSource
        public long read(@NotNull Buffer buffer0, long v) throws IOException {
            Exchange exchange0 = this.g;
            Intrinsics.checkNotNullParameter(buffer0, "sink");
            if(this.f) {
                throw new IllegalStateException("closed");
            }
            try {
                long v1 = this.delegate().read(buffer0, v);
                if(this.d) {
                    this.d = false;
                    exchange0.getEventListener$okhttp().responseBodyStart(exchange0.getCall$okhttp());
                }
                if(Long.compare(v1, -1L) == 0) {
                    this.complete(null);
                    return -1L;
                }
                long v2 = this.c + v1;
                long v3 = this.b;
                if(v3 != -1L && v2 > v3) {
                    throw new ProtocolException("expected " + v3 + " bytes but received " + v2);
                }
                this.c = v2;
                if(v2 == v3) {
                    this.complete(null);
                }
                return v1;
            }
            catch(IOException iOException0) {
            }
            throw this.complete(iOException0);
        }
    }

    public final RealCall a;
    public final EventListener b;
    public final ExchangeFinder c;
    public final ExchangeCodec d;
    public boolean e;
    public boolean f;
    public final RealConnection g;

    public Exchange(@NotNull RealCall realCall0, @NotNull EventListener eventListener0, @NotNull ExchangeFinder exchangeFinder0, @NotNull ExchangeCodec exchangeCodec0) {
        Intrinsics.checkNotNullParameter(realCall0, "call");
        Intrinsics.checkNotNullParameter(eventListener0, "eventListener");
        Intrinsics.checkNotNullParameter(exchangeFinder0, "finder");
        Intrinsics.checkNotNullParameter(exchangeCodec0, "codec");
        super();
        this.a = realCall0;
        this.b = eventListener0;
        this.c = exchangeFinder0;
        this.d = exchangeCodec0;
        this.g = exchangeCodec0.getConnection();
    }

    public final void a(IOException iOException0) {
        this.f = true;
        this.c.trackFailure(iOException0);
        this.d.getConnection().trackFailure$okhttp(this.a, iOException0);
    }

    public final IOException bodyComplete(long v, boolean z, boolean z1, IOException iOException0) {
        if(iOException0 != null) {
            this.a(iOException0);
        }
        EventListener eventListener0 = this.b;
        RealCall realCall0 = this.a;
        if(z1) {
            if(iOException0 == null) {
                eventListener0.requestBodyEnd(realCall0, v);
            }
            else {
                eventListener0.requestFailed(realCall0, iOException0);
            }
        }
        if(z) {
            if(iOException0 != null) {
                eventListener0.responseFailed(realCall0, iOException0);
                return realCall0.messageDone$okhttp(this, z1, true, iOException0);
            }
            eventListener0.responseBodyEnd(realCall0, v);
        }
        return realCall0.messageDone$okhttp(this, z1, z, iOException0);
    }

    public final void cancel() {
        this.d.cancel();
    }

    @NotNull
    public final Sink createRequestBody(@NotNull Request request0, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(request0, "request");
        this.e = z;
        RequestBody requestBody0 = request0.body();
        Intrinsics.checkNotNull(requestBody0);
        long v = requestBody0.contentLength();
        this.b.requestBodyStart(this.a);
        return new a(this, this.d.createRequestBody(request0, v), v);
    }

    public final void detachWithViolence() {
        this.d.cancel();
        this.a.messageDone$okhttp(this, true, true, null);
    }

    public final void finishRequest() throws IOException {
        try {
            this.d.finishRequest();
        }
        catch(IOException iOException0) {
            this.b.requestFailed(this.a, iOException0);
            this.a(iOException0);
            throw iOException0;
        }
    }

    public final void flushRequest() throws IOException {
        try {
            this.d.flushRequest();
        }
        catch(IOException iOException0) {
            this.b.requestFailed(this.a, iOException0);
            this.a(iOException0);
            throw iOException0;
        }
    }

    @NotNull
    public final RealCall getCall$okhttp() {
        return this.a;
    }

    @NotNull
    public final RealConnection getConnection$okhttp() {
        return this.g;
    }

    @NotNull
    public final EventListener getEventListener$okhttp() {
        return this.b;
    }

    @NotNull
    public final ExchangeFinder getFinder$okhttp() {
        return this.c;
    }

    public final boolean getHasFailure$okhttp() {
        return this.f;
    }

    public final boolean isCoalescedConnection$okhttp() {
        return !Intrinsics.areEqual(this.c.getAddress$okhttp().url().host(), this.g.route().address().url().host());
    }

    public final boolean isDuplex$okhttp() {
        return this.e;
    }

    @NotNull
    public final Streams newWebSocketStreams() throws SocketException {
        this.a.timeoutEarlyExit();
        return this.d.getConnection().newWebSocketStreams$okhttp(this);
    }

    public final void noNewExchangesOnConnection() {
        this.d.getConnection().noNewExchanges$okhttp();
    }

    public final void noRequestBody() {
        this.a.messageDone$okhttp(this, true, false, null);
    }

    @NotNull
    public final ResponseBody openResponseBody(@NotNull Response response0) throws IOException {
        Intrinsics.checkNotNullParameter(response0, "response");
        try {
            String s = Response.header$default(response0, "Content-Type", null, 2, null);
            long v = this.d.reportedContentLength(response0);
            return new RealResponseBody(s, v, Okio.buffer(new ResponseBodySource(this, this.d.openResponseBodySource(response0), v)));
        }
        catch(IOException iOException0) {
            this.b.responseFailed(this.a, iOException0);
            this.a(iOException0);
            throw iOException0;
        }
    }

    @Nullable
    public final Builder readResponseHeaders(boolean z) throws IOException {
        try {
            Builder response$Builder0 = this.d.readResponseHeaders(z);
            if(response$Builder0 != null) {
                response$Builder0.initExchange$okhttp(this);
                return response$Builder0;
            }
            return null;
        }
        catch(IOException iOException0) {
            this.b.responseFailed(this.a, iOException0);
            this.a(iOException0);
            throw iOException0;
        }
    }

    public final void responseHeadersEnd(@NotNull Response response0) {
        Intrinsics.checkNotNullParameter(response0, "response");
        this.b.responseHeadersEnd(this.a, response0);
    }

    public final void responseHeadersStart() {
        this.b.responseHeadersStart(this.a);
    }

    @NotNull
    public final Headers trailers() throws IOException {
        return this.d.trailers();
    }

    public final void webSocketUpgradeFailed() {
        this.bodyComplete(-1L, true, true, null);
    }

    public final void writeRequestHeaders(@NotNull Request request0) throws IOException {
        RealCall realCall0 = this.a;
        EventListener eventListener0 = this.b;
        Intrinsics.checkNotNullParameter(request0, "request");
        try {
            eventListener0.requestHeadersStart(realCall0);
            this.d.writeRequestHeaders(request0);
            eventListener0.requestHeadersEnd(realCall0, request0);
        }
        catch(IOException iOException0) {
            eventListener0.requestFailed(realCall0, iOException0);
            this.a(iOException0);
            throw iOException0;
        }
    }
}

