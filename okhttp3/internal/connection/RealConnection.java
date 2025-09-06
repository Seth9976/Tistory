package okhttp3.internal.connection;

import androidx.compose.material3.td;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy.Type;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.k;
import kotlin.text.p;
import o0.e;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.CipherSuite;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request.Builder;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection.Listener;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket.Streams;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00C8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000B\u0018\u0000 {2\u00020\u00012\u00020\u0002:\u0001{B\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\f\u001A\u00020\tH\u0000\u00A2\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\u000E\u001A\u00020\tH\u0000\u00A2\u0006\u0004\b\r\u0010\u000BJ\u000F\u0010\u0010\u001A\u00020\tH\u0000\u00A2\u0006\u0004\b\u000F\u0010\u000BJE\u0010\u001C\u001A\u00020\t2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u00112\u0006\u0010\u0015\u001A\u00020\u00112\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001B\u001A\u00020\u001A\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\'\u0010$\u001A\u00020\u00162\u0006\u0010\u001F\u001A\u00020\u001E2\u000E\u0010!\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010 H\u0000\u00A2\u0006\u0004\b\"\u0010#J\u001F\u0010,\u001A\u00020)2\u0006\u0010&\u001A\u00020%2\u0006\u0010(\u001A\u00020\'H\u0000\u00A2\u0006\u0004\b*\u0010+J\u0017\u00102\u001A\u00020/2\u0006\u0010.\u001A\u00020-H\u0000\u00A2\u0006\u0004\b0\u00101J\u000F\u0010\u0006\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b\u0006\u00103J\r\u00104\u001A\u00020\t\u00A2\u0006\u0004\b4\u0010\u000BJ\u000F\u00106\u001A\u000205H\u0016\u00A2\u0006\u0004\b6\u00107J\u0015\u00109\u001A\u00020\u00162\u0006\u00108\u001A\u00020\u0016\u00A2\u0006\u0004\b9\u0010:J\u0017\u0010=\u001A\u00020\t2\u0006\u0010<\u001A\u00020;H\u0016\u00A2\u0006\u0004\b=\u0010>J\u001F\u0010C\u001A\u00020\t2\u0006\u0010@\u001A\u00020?2\u0006\u0010B\u001A\u00020AH\u0016\u00A2\u0006\u0004\bC\u0010DJ\u0011\u0010F\u001A\u0004\u0018\u00010EH\u0016\u00A2\u0006\u0004\bF\u0010GJ\'\u0010M\u001A\u00020\t2\u0006\u0010&\u001A\u00020%2\u0006\u0010H\u001A\u00020\u00052\u0006\u0010J\u001A\u00020IH\u0000\u00A2\u0006\u0004\bK\u0010LJ!\u0010R\u001A\u00020\t2\u0006\u0010\u0019\u001A\u00020N2\b\u0010O\u001A\u0004\u0018\u00010IH\u0000\u00A2\u0006\u0004\bP\u0010QJ\u000F\u0010T\u001A\u00020SH\u0016\u00A2\u0006\u0004\bT\u0010UJ\u000F\u0010W\u001A\u00020VH\u0016\u00A2\u0006\u0004\bW\u0010XR\u0017\u0010\u0004\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\bY\u0010Z\u001A\u0004\b[\u0010\\R\"\u0010\f\u001A\u00020\u00168\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b]\u0010^\u001A\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010i\u001A\u00020\u00118\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bc\u0010d\u001A\u0004\be\u0010f\"\u0004\bg\u0010hR#\u0010p\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0k0j8\u0006\u00A2\u0006\f\n\u0004\bl\u0010m\u001A\u0004\bn\u0010oR\"\u0010x\u001A\u00020q8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\br\u0010s\u001A\u0004\bt\u0010u\"\u0004\bv\u0010wR\u0014\u0010z\u001A\u00020\u00168@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\by\u0010`\u00A8\u0006|"}, d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/Route;", "route", "<init>", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;)V", "", "noNewExchanges$okhttp", "()V", "noNewExchanges", "noCoalescedConnections$okhttp", "noCoalescedConnections", "incrementSuccessCount$okhttp", "incrementSuccessCount", "", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "", "connectionRetryEnabled", "Lokhttp3/Call;", "call", "Lokhttp3/EventListener;", "eventListener", "connect", "(IIIIZLokhttp3/Call;Lokhttp3/EventListener;)V", "Lokhttp3/Address;", "address", "", "routes", "isEligible$okhttp", "(Lokhttp3/Address;Ljava/util/List;)Z", "isEligible", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http/ExchangeCodec;", "newCodec$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/http/ExchangeCodec;", "newCodec", "Lokhttp3/internal/connection/Exchange;", "exchange", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams$okhttp", "(Lokhttp3/internal/connection/Exchange;)Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams", "()Lokhttp3/Route;", "cancel", "Ljava/net/Socket;", "socket", "()Ljava/net/Socket;", "doExtensiveChecks", "isHealthy", "(Z)Z", "Lokhttp3/internal/http2/Http2Stream;", "stream", "onStream", "(Lokhttp3/internal/http2/Http2Stream;)V", "Lokhttp3/internal/http2/Http2Connection;", "connection", "Lokhttp3/internal/http2/Settings;", "settings", "onSettings", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Settings;)V", "Lokhttp3/Handshake;", "handshake", "()Lokhttp3/Handshake;", "failedRoute", "Ljava/io/IOException;", "failure", "connectFailed$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/Route;Ljava/io/IOException;)V", "connectFailed", "Lokhttp3/internal/connection/RealCall;", "e", "trackFailure$okhttp", "(Lokhttp3/internal/connection/RealCall;Ljava/io/IOException;)V", "trackFailure", "Lokhttp3/Protocol;", "protocol", "()Lokhttp3/Protocol;", "", "toString", "()Ljava/lang/String;", "a", "Lokhttp3/internal/connection/RealConnectionPool;", "getConnectionPool", "()Lokhttp3/internal/connection/RealConnectionPool;", "j", "Z", "getNoNewExchanges", "()Z", "setNoNewExchanges", "(Z)V", "l", "I", "getRouteFailureCount$okhttp", "()I", "setRouteFailureCount$okhttp", "(I)V", "routeFailureCount", "", "Ljava/lang/ref/Reference;", "p", "Ljava/util/List;", "getCalls", "()Ljava/util/List;", "calls", "", "q", "J", "getIdleAtNs$okhttp", "()J", "setIdleAtNs$okhttp", "(J)V", "idleAtNs", "isMultiplexed$okhttp", "isMultiplexed", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRealConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n1#2:766\n608#3,4:767\n608#3,4:774\n615#3,4:778\n1747#4,3:771\n*S KotlinDebug\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n*L\n529#1:767,4\n582#1:774,4\n648#1:778,4\n574#1:771,3\n*E\n"})
public final class RealConnection extends Listener implements Connection {
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J-\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fR\u0014\u0010\r\u001A\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000ER\u0014\u0010\u0010\u001A\u00020\u000F8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001A\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", "", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/Route;", "route", "Ljava/net/Socket;", "socket", "", "idleAtNs", "Lokhttp3/internal/connection/RealConnection;", "newTestConnection", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;Ljava/net/Socket;J)Lokhttp3/internal/connection/RealConnection;", "IDLE_CONNECTION_HEALTHY_NS", "J", "", "MAX_TUNNEL_ATTEMPTS", "I", "", "NPE_THROW_WITH_NULL", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final RealConnection newTestConnection(@NotNull RealConnectionPool realConnectionPool0, @NotNull Route route0, @NotNull Socket socket0, long v) {
            Intrinsics.checkNotNullParameter(realConnectionPool0, "connectionPool");
            Intrinsics.checkNotNullParameter(route0, "route");
            Intrinsics.checkNotNullParameter(socket0, "socket");
            RealConnection realConnection0 = new RealConnection(realConnectionPool0, route0);
            realConnection0.d = socket0;
            realConnection0.setIdleAtNs$okhttp(v);
            return realConnection0;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Proxy.Type.values().length];
            try {
                arr_v[Proxy.Type.DIRECT.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Proxy.Type.HTTP.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    public final RealConnectionPool a;
    public final Route b;
    public Socket c;
    public Socket d;
    public Handshake e;
    public Protocol f;
    public Http2Connection g;
    public BufferedSource h;
    public BufferedSink i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    static {
        RealConnection.Companion = new Companion(null);
    }

    public RealConnection(@NotNull RealConnectionPool realConnectionPool0, @NotNull Route route0) {
        Intrinsics.checkNotNullParameter(realConnectionPool0, "connectionPool");
        Intrinsics.checkNotNullParameter(route0, "route");
        super();
        this.a = realConnectionPool0;
        this.b = route0;
        this.o = 1;
        this.p = new ArrayList();
        this.q = 0x7FFFFFFFFFFFFFFFL;
    }

    public final void a(int v, int v1, Call call0, EventListener eventListener0) {
        Socket socket0;
        Route route0 = this.b;
        Proxy proxy0 = route0.proxy();
        Address address0 = route0.address();
        Proxy.Type proxy$Type0 = proxy0.type();
        int v2 = proxy$Type0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[proxy$Type0.ordinal()];
        if(v2 == 1 || v2 == 2) {
            socket0 = address0.socketFactory().createSocket();
            Intrinsics.checkNotNull(socket0);
        }
        else {
            socket0 = new Socket(proxy0);
        }
        this.c = socket0;
        eventListener0.connectStart(call0, route0.socketAddress(), proxy0);
        socket0.setSoTimeout(v1);
        try {
            Platform.Companion.get().connectSocket(socket0, route0.socketAddress(), v);
        }
        catch(ConnectException connectException0) {
            ConnectException connectException1 = new ConnectException("Failed to connect to " + route0.socketAddress());
            connectException1.initCause(connectException0);
            throw connectException1;
        }
        try {
            this.h = Okio.buffer(Okio.source(socket0));
            this.i = Okio.buffer(Okio.sink(socket0));
        }
        catch(NullPointerException nullPointerException0) {
            if(Intrinsics.areEqual(nullPointerException0.getMessage(), "throw with null exception")) {
                throw new IOException(nullPointerException0);
            }
        }
    }

    public static final Handshake access$getHandshake$p(RealConnection realConnection0) {
        return realConnection0.e;
    }

    public final void b(int v, int v1, int v2, Call call0, EventListener eventListener0) {
        Request request2;
        Builder request$Builder0 = new Builder();
        Route route0 = this.b;
        Request request0 = request$Builder0.url(route0.address().url()).method("CONNECT", null).header("Host", Util.toHostHeader(route0.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", "okhttp/4.12.0").build();
        Request request1 = route0.address().proxyAuthenticator().authenticate(route0, new okhttp3.Response.Builder().request(request0).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        if(request1 != null) {
            request0 = request1;
        }
        HttpUrl httpUrl0 = request0.url();
        int v3 = 0;
        while(v3 < 21) {
            this.a(v, v1, call0, eventListener0);
            String s = "CONNECT " + Util.toHostHeader(httpUrl0, true) + " HTTP/1.1";
        alab1:
            while(true) {
                BufferedSource bufferedSource0 = this.h;
                Intrinsics.checkNotNull(bufferedSource0);
                BufferedSink bufferedSink0 = this.i;
                Intrinsics.checkNotNull(bufferedSink0);
                Http1ExchangeCodec http1ExchangeCodec0 = new Http1ExchangeCodec(null, this, bufferedSource0, bufferedSink0);
                Timeout timeout0 = bufferedSource0.timeout();
                TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
                timeout0.timeout(((long)v1), timeUnit0);
                bufferedSink0.timeout().timeout(((long)v2), timeUnit0);
                http1ExchangeCodec0.writeRequest(request0.headers(), s);
                http1ExchangeCodec0.finishRequest();
                okhttp3.Response.Builder response$Builder0 = http1ExchangeCodec0.readResponseHeaders(false);
                Intrinsics.checkNotNull(response$Builder0);
                Response response0 = response$Builder0.request(request0).build();
                http1ExchangeCodec0.skipConnectBody(response0);
                switch(response0.code()) {
                    case 200: {
                        if(!bufferedSource0.getBuffer().exhausted() || !bufferedSink0.getBuffer().exhausted()) {
                            throw new IOException("TLS tunnel buffered too many bytes!");
                        }
                        request0 = null;
                        goto label_38;
                    }
                    case 407: {
                        request2 = route0.address().proxyAuthenticator().authenticate(route0, response0);
                        if(request2 == null) {
                            throw new IOException("Failed to authenticate with proxy");
                        }
                        if(!p.equals("close", Response.header$default(response0, "Connection", null, 2, null), true)) {
                            break;
                        }
                        break alab1;
                    }
                    default: {
                        throw new IOException("Unexpected response code for CONNECT: " + response0.code());
                    }
                }
                request0 = request2;
            }
            request0 = request2;
        label_38:
            if(request0 == null) {
                break;
            }
            Socket socket0 = this.c;
            if(socket0 != null) {
                Util.closeQuietly(socket0);
            }
            this.c = null;
            this.i = null;
            this.h = null;
            eventListener0.connectEnd(call0, route0.socketAddress(), route0.proxy(), null);
            ++v3;
        }
    }

    public final void c(ConnectionSpecSelector connectionSpecSelector0, int v, Call call0, EventListener eventListener0) {
        SSLSocket sSLSocket1;
        Route route0 = this.b;
        if(route0.address().sslSocketFactory() == null) {
            Protocol protocol0 = Protocol.H2_PRIOR_KNOWLEDGE;
            if(route0.address().protocols().contains(protocol0)) {
                this.d = this.c;
                this.f = protocol0;
                this.d(v);
                return;
            }
            this.d = this.c;
            this.f = Protocol.HTTP_1_1;
            return;
        }
        eventListener0.secureConnectStart(call0);
        Address address0 = route0.address();
        SSLSocketFactory sSLSocketFactory0 = address0.sslSocketFactory();
        SSLSocket sSLSocket0 = null;
        try {
            Intrinsics.checkNotNull(sSLSocketFactory0);
            Socket socket0 = sSLSocketFactory0.createSocket(this.c, address0.url().host(), address0.url().port(), true);
            Intrinsics.checkNotNull(socket0, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket1 = (SSLSocket)socket0;
        }
        catch(Throwable throwable0) {
            goto label_51;
        }
        try {
            ConnectionSpec connectionSpec0 = connectionSpecSelector0.configureSecureSocket(sSLSocket1);
            if(connectionSpec0.supportsTlsExtensions()) {
                Platform.Companion.get().configureTlsExtensions(sSLSocket1, address0.url().host(), address0.protocols());
            }
            sSLSocket1.startHandshake();
            SSLSession sSLSession0 = sSLSocket1.getSession();
            Intrinsics.checkNotNullExpressionValue(sSLSession0, "sslSocketSession");
            Handshake handshake0 = Handshake.Companion.get(sSLSession0);
            HostnameVerifier hostnameVerifier0 = address0.hostnameVerifier();
            Intrinsics.checkNotNull(hostnameVerifier0);
            if(!hostnameVerifier0.verify(address0.url().host(), sSLSession0)) {
                List list0 = handshake0.peerCertificates();
                if(list0.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + address0.url().host() + " not verified (no certificates)");
                }
                Object object0 = list0.get(0);
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                throw new SSLPeerUnverifiedException(k.trimMargin$default(("\n              |Hostname " + address0.url().host() + " not verified:\n              |    certificate: " + CertificatePinner.Companion.pin(((X509Certificate)object0)) + "\n              |    DN: " + ((X509Certificate)object0).getSubjectDN().getName() + "\n              |    subjectAltNames: " + OkHostnameVerifier.INSTANCE.allSubjectAltNames(((X509Certificate)object0)) + "\n              "), null, 1, null));
            }
            CertificatePinner certificatePinner0 = address0.certificatePinner();
            Intrinsics.checkNotNull(certificatePinner0);
            this.e = new Handshake(handshake0.tlsVersion(), handshake0.cipherSuite(), handshake0.localCertificates(), new td(certificatePinner0, handshake0, 14, address0));
            certificatePinner0.check$okhttp(address0.url().host(), new e(this, 11));
            if(connectionSpec0.supportsTlsExtensions()) {
                sSLSocket0 = Platform.Companion.get().getSelectedProtocol(sSLSocket1);
            }
            this.d = sSLSocket1;
            this.h = Okio.buffer(Okio.source(sSLSocket1));
            this.i = Okio.buffer(Okio.sink(sSLSocket1));
            this.f = sSLSocket0 == null ? Protocol.HTTP_1_1 : Protocol.Companion.get(((String)sSLSocket0));
            goto label_56;
        }
        catch(Throwable throwable0) {
            sSLSocket0 = sSLSocket1;
        }
    label_51:
        if(sSLSocket0 != null) {
            Platform.Companion.get().afterHandshake(sSLSocket0);
        }
        if(sSLSocket0 != null) {
            Util.closeQuietly(sSLSocket0);
        }
        throw throwable0;
    label_56:
        Platform.Companion.get().afterHandshake(sSLSocket1);
        eventListener0.secureConnectEnd(call0, this.e);
        if(this.f == Protocol.HTTP_2) {
            this.d(v);
        }
    }

    public final void cancel() {
        Socket socket0 = this.c;
        if(socket0 != null) {
            Util.closeQuietly(socket0);
        }
    }

    public final void connect(int v, int v1, int v2, int v3, boolean z, @NotNull Call call0, @NotNull EventListener eventListener0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(eventListener0, "eventListener");
        if(this.f != null) {
            throw new IllegalStateException("already connected");
        }
        Route route0 = this.b;
        List list0 = route0.address().connectionSpecs();
        ConnectionSpecSelector connectionSpecSelector0 = new ConnectionSpecSelector(list0);
        if(route0.address().sslSocketFactory() == null) {
            if(!list0.contains(ConnectionSpec.CLEARTEXT)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String s = route0.address().url().host();
            if(!Platform.Companion.get().isCleartextTrafficPermitted(s)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication to " + s + " not permitted by network security policy"));
            }
        }
        else if(route0.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException0 = null;
        while(true) {
            try {
                if(route0.requiresTunnel()) {
                    this.b(v, v1, v2, call0, eventListener0);
                    if(this.c != null) {
                        this.c(connectionSpecSelector0, v3, call0, eventListener0);
                        eventListener0.connectEnd(call0, route0.socketAddress(), route0.proxy(), this.f);
                        break;
                    }
                    break;
                }
                else {
                    this.a(v, v1, call0, eventListener0);
                }
                this.c(connectionSpecSelector0, v3, call0, eventListener0);
                eventListener0.connectEnd(call0, route0.socketAddress(), route0.proxy(), this.f);
                break;
            }
            catch(IOException iOException0) {
                Socket socket0 = this.d;
                if(socket0 != null) {
                    Util.closeQuietly(socket0);
                }
                Socket socket1 = this.c;
                if(socket1 != null) {
                    Util.closeQuietly(socket1);
                }
                this.d = null;
                this.c = null;
                this.h = null;
                this.i = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.o = 1;
                eventListener0.connectFailed(call0, route0.socketAddress(), route0.proxy(), null, iOException0);
                if(routeException0 == null) {
                    routeException0 = new RouteException(iOException0);
                }
                else {
                    routeException0.addConnectException(iOException0);
                }
                if(!z || !connectionSpecSelector0.connectionFailed(iOException0)) {
                    throw routeException0;
                }
            }
        }
        if(route0.requiresTunnel() && this.c == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.q = System.nanoTime();
    }

    public final void connectFailed$okhttp(@NotNull OkHttpClient okHttpClient0, @NotNull Route route0, @NotNull IOException iOException0) {
        Intrinsics.checkNotNullParameter(okHttpClient0, "client");
        Intrinsics.checkNotNullParameter(route0, "failedRoute");
        Intrinsics.checkNotNullParameter(iOException0, "failure");
        if(route0.proxy().type() != Proxy.Type.DIRECT) {
            Address address0 = route0.address();
            address0.proxySelector().connectFailed(address0.url().uri(), route0.proxy().address(), iOException0);
        }
        okHttpClient0.getRouteDatabase().failed(route0);
    }

    public final void d(int v) {
        Socket socket0 = this.d;
        Intrinsics.checkNotNull(socket0);
        BufferedSource bufferedSource0 = this.h;
        Intrinsics.checkNotNull(bufferedSource0);
        BufferedSink bufferedSink0 = this.i;
        Intrinsics.checkNotNull(bufferedSink0);
        socket0.setSoTimeout(0);
        Http2Connection http2Connection0 = new okhttp3.internal.http2.Http2Connection.Builder(true, TaskRunner.INSTANCE).socket(socket0, this.b.address().url().host(), bufferedSource0, bufferedSink0).listener(this).pingIntervalMillis(v).build();
        this.g = http2Connection0;
        this.o = Http2Connection.Companion.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(http2Connection0, false, null, 3, null);
    }

    @NotNull
    public final List getCalls() {
        return this.p;
    }

    @NotNull
    public final RealConnectionPool getConnectionPool() {
        return this.a;
    }

    public final long getIdleAtNs$okhttp() {
        return this.q;
    }

    public final boolean getNoNewExchanges() {
        return this.j;
    }

    public final int getRouteFailureCount$okhttp() {
        return this.l;
    }

    @Override  // okhttp3.Connection
    @Nullable
    public Handshake handshake() {
        return this.e;
    }

    public final void incrementSuccessCount$okhttp() {
        synchronized(this) {
            ++this.m;
        }
    }

    public final boolean isEligible$okhttp(@NotNull Address address0, @Nullable List list0) {
        Intrinsics.checkNotNullParameter(address0, "address");
        if(Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2310 MUST hold lock on " + this);
        }
        if(this.p.size() < this.o && !this.j) {
            Route route0 = this.b;
            if(!route0.address().equalsNonHost$okhttp(address0)) {
                return false;
            }
            if(Intrinsics.areEqual(address0.url().host(), this.route().address().url().host())) {
                return true;
            }
            if(this.g == null) {
                return false;
            }
            if(list0 != null && (!(list0 instanceof Collection) || !list0.isEmpty())) {
                for(Object object0: list0) {
                    Proxy.Type proxy$Type0 = ((Route)object0).proxy().type();
                    Proxy.Type proxy$Type1 = Proxy.Type.DIRECT;
                    if(proxy$Type0 == proxy$Type1 && route0.proxy().type() == proxy$Type1 && Intrinsics.areEqual(route0.socketAddress(), ((Route)object0).socketAddress())) {
                        OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
                        if(address0.hostnameVerifier() != okHostnameVerifier0) {
                            return false;
                        }
                        HttpUrl httpUrl0 = address0.url();
                        if(Util.assertionsEnabled && !Thread.holdsLock(this)) {
                            throw new AssertionError("Thread jeb-dexdec-sb-st-2310 MUST hold lock on " + this);
                        }
                        HttpUrl httpUrl1 = route0.address().url();
                        if(httpUrl0.port() != httpUrl1.port()) {
                            break;
                        }
                        if(!Intrinsics.areEqual(httpUrl0.host(), httpUrl1.host())) {
                            if(this.k) {
                                break;
                            }
                            Handshake handshake0 = this.e;
                            if(handshake0 == null) {
                                break;
                            }
                            Intrinsics.checkNotNull(handshake0);
                            List list1 = handshake0.peerCertificates();
                            if(list1.isEmpty()) {
                                break;
                            }
                            Object object1 = list1.get(0);
                            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                            if(okHostnameVerifier0.verify(httpUrl0.host(), ((X509Certificate)object1))) {
                                goto label_36;
                            }
                            break;
                        }
                        try {
                        label_36:
                            CertificatePinner certificatePinner0 = address0.certificatePinner();
                            Intrinsics.checkNotNull(certificatePinner0);
                            Handshake handshake1 = this.handshake();
                            Intrinsics.checkNotNull(handshake1);
                            certificatePinner0.check(address0.url().host(), handshake1.peerCertificates());
                            return true;
                        label_42:
                            if(false) {
                                break;
                            }
                            continue;
                        }
                        catch(SSLPeerUnverifiedException unused_ex) {
                            break;
                        }
                    }
                    goto label_42;
                }
            }
        }
        return false;
    }

    public final boolean isHealthy(boolean z) {
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2357 MUST NOT hold lock on " + this);
        }
        long v = System.nanoTime();
        Socket socket0 = this.c;
        Intrinsics.checkNotNull(socket0);
        Socket socket1 = this.d;
        Intrinsics.checkNotNull(socket1);
        BufferedSource bufferedSource0 = this.h;
        Intrinsics.checkNotNull(bufferedSource0);
        if(!socket0.isClosed() && !socket1.isClosed() && !socket1.isInputShutdown() && !socket1.isOutputShutdown()) {
            Http2Connection http2Connection0 = this.g;
            if(http2Connection0 != null) {
                return http2Connection0.isHealthy(v);
            }
            return v - this.q < 10000000000L || !z ? true : Util.isHealthy(socket1, bufferedSource0);
        }
        return false;
    }

    public final boolean isMultiplexed$okhttp() {
        return this.g != null;
    }

    @NotNull
    public final ExchangeCodec newCodec$okhttp(@NotNull OkHttpClient okHttpClient0, @NotNull RealInterceptorChain realInterceptorChain0) throws SocketException {
        Intrinsics.checkNotNullParameter(okHttpClient0, "client");
        Intrinsics.checkNotNullParameter(realInterceptorChain0, "chain");
        Socket socket0 = this.d;
        Intrinsics.checkNotNull(socket0);
        BufferedSource bufferedSource0 = this.h;
        Intrinsics.checkNotNull(bufferedSource0);
        BufferedSink bufferedSink0 = this.i;
        Intrinsics.checkNotNull(bufferedSink0);
        Http2Connection http2Connection0 = this.g;
        if(http2Connection0 != null) {
            return new Http2ExchangeCodec(okHttpClient0, this, realInterceptorChain0, http2Connection0);
        }
        socket0.setSoTimeout(realInterceptorChain0.readTimeoutMillis());
        Timeout timeout0 = bufferedSource0.timeout();
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        timeout0.timeout(((long)realInterceptorChain0.getReadTimeoutMillis$okhttp()), timeUnit0);
        bufferedSink0.timeout().timeout(((long)realInterceptorChain0.getWriteTimeoutMillis$okhttp()), timeUnit0);
        return new Http1ExchangeCodec(okHttpClient0, this, bufferedSource0, bufferedSink0);
    }

    @NotNull
    public final Streams newWebSocketStreams$okhttp(@NotNull Exchange exchange0) throws SocketException {
        Intrinsics.checkNotNullParameter(exchange0, "exchange");
        Socket socket0 = this.d;
        Intrinsics.checkNotNull(socket0);
        BufferedSource bufferedSource0 = this.h;
        Intrinsics.checkNotNull(bufferedSource0);
        BufferedSink bufferedSink0 = this.i;
        Intrinsics.checkNotNull(bufferedSink0);
        socket0.setSoTimeout(0);
        this.noNewExchanges$okhttp();
        return new Streams(bufferedSink0, exchange0) {
            public final Exchange d;

            {
                this.d = exchange0;
                super(true, bufferedSource0, bufferedSink0);
            }

            @Override
            public void close() {
                this.d.bodyComplete(-1L, true, true, null);
            }
        };
    }

    public final void noCoalescedConnections$okhttp() {
        synchronized(this) {
            this.k = true;
        }
    }

    public final void noNewExchanges$okhttp() {
        synchronized(this) {
            this.j = true;
        }
    }

    @Override  // okhttp3.internal.http2.Http2Connection$Listener
    public void onSettings(@NotNull Http2Connection http2Connection0, @NotNull Settings settings0) {
        synchronized(this) {
            Intrinsics.checkNotNullParameter(http2Connection0, "connection");
            Intrinsics.checkNotNullParameter(settings0, "settings");
            this.o = settings0.getMaxConcurrentStreams();
        }
    }

    @Override  // okhttp3.internal.http2.Http2Connection$Listener
    public void onStream(@NotNull Http2Stream http2Stream0) throws IOException {
        Intrinsics.checkNotNullParameter(http2Stream0, "stream");
        http2Stream0.close(ErrorCode.REFUSED_STREAM, null);
    }

    @Override  // okhttp3.Connection
    @NotNull
    public Protocol protocol() {
        Protocol protocol0 = this.f;
        Intrinsics.checkNotNull(protocol0);
        return protocol0;
    }

    @Override  // okhttp3.Connection
    @NotNull
    public Route route() {
        return this.b;
    }

    public final void setIdleAtNs$okhttp(long v) {
        this.q = v;
    }

    public final void setNoNewExchanges(boolean z) {
        this.j = z;
    }

    public final void setRouteFailureCount$okhttp(int v) {
        this.l = v;
    }

    @Override  // okhttp3.Connection
    @NotNull
    public Socket socket() {
        Socket socket0 = this.d;
        Intrinsics.checkNotNull(socket0);
        return socket0;
    }

    @Override
    @NotNull
    public String toString() {
        CipherSuite cipherSuite0;
        StringBuilder stringBuilder0 = new StringBuilder("Connection{");
        stringBuilder0.append(this.b.address().url().host());
        stringBuilder0.append(':');
        stringBuilder0.append(this.b.address().url().port());
        stringBuilder0.append(", proxy=");
        stringBuilder0.append(this.b.proxy());
        stringBuilder0.append(" hostAddress=");
        stringBuilder0.append(this.b.socketAddress());
        stringBuilder0.append(" cipherSuite=");
        Handshake handshake0 = this.e;
        if(handshake0 == null) {
            cipherSuite0 = "none";
        }
        else {
            cipherSuite0 = handshake0.cipherSuite();
            if(cipherSuite0 == null) {
                cipherSuite0 = "none";
            }
        }
        stringBuilder0.append(cipherSuite0);
        stringBuilder0.append(" protocol=");
        stringBuilder0.append(this.f);
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }

    public final void trackFailure$okhttp(@NotNull RealCall realCall0, @Nullable IOException iOException0) {
        synchronized(this) {
            Intrinsics.checkNotNullParameter(realCall0, "call");
            if(!(iOException0 instanceof StreamResetException)) {
                if(!this.isMultiplexed$okhttp() || iOException0 instanceof ConnectionShutdownException) {
                    this.j = true;
                    if(this.m == 0) {
                        if(iOException0 != null) {
                            this.connectFailed$okhttp(realCall0.getClient(), this.b, iOException0);
                        }
                        ++this.l;
                    }
                }
            }
            else if(((StreamResetException)iOException0).errorCode == ErrorCode.REFUSED_STREAM) {
                int v1 = this.n + 1;
                this.n = v1;
                if(v1 > 1) {
                    this.j = true;
                    ++this.l;
                }
            }
            else if(((StreamResetException)iOException0).errorCode != ErrorCode.CANCEL || !realCall0.isCanceled()) {
                this.j = true;
                ++this.l;
            }
        }
    }
}

