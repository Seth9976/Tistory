package okhttp3.logging;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001KJ\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\t\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\t\u0010\nJ-\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u00072\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000BH\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u001F\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0016\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u00102\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00140\u000BH\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0017J\'\u0010\u001B\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001A\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0017\u0010\u001D\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u001D\u0010\u0006J!\u0010 \u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\b\u0010\u001F\u001A\u0004\u0018\u00010\u001EH\u0016\u00A2\u0006\u0004\b \u0010!J1\u0010$\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001A\u001A\u00020\f2\b\u0010#\u001A\u0004\u0018\u00010\"H\u0016\u00A2\u0006\u0004\b$\u0010%J9\u0010(\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001A\u001A\u00020\f2\b\u0010#\u001A\u0004\u0018\u00010\"2\u0006\u0010\'\u001A\u00020&H\u0016\u00A2\u0006\u0004\b(\u0010)J\u001F\u0010,\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010+\u001A\u00020*H\u0016\u00A2\u0006\u0004\b,\u0010-J\u001F\u0010.\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010+\u001A\u00020*H\u0016\u00A2\u0006\u0004\b.\u0010-J\u0017\u0010/\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b/\u0010\u0006J\u001F\u00102\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u00101\u001A\u000200H\u0016\u00A2\u0006\u0004\b2\u00103J\u0017\u00104\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b4\u0010\u0006J\u001F\u00107\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u00106\u001A\u000205H\u0016\u00A2\u0006\u0004\b7\u00108J\u001F\u00109\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\'\u001A\u00020&H\u0016\u00A2\u0006\u0004\b9\u0010:J\u0017\u0010;\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b;\u0010\u0006J\u001F\u0010>\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010=\u001A\u00020<H\u0016\u00A2\u0006\u0004\b>\u0010?J\u0017\u0010@\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b@\u0010\u0006J\u001F\u0010A\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u00106\u001A\u000205H\u0016\u00A2\u0006\u0004\bA\u00108J\u001F\u0010B\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\'\u001A\u00020&H\u0016\u00A2\u0006\u0004\bB\u0010:J\u0017\u0010C\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\bC\u0010\u0006J\u001F\u0010D\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\'\u001A\u00020&H\u0016\u00A2\u0006\u0004\bD\u0010:J\u0017\u0010E\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\bE\u0010\u0006J\u001F\u0010F\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010=\u001A\u00020<H\u0016\u00A2\u0006\u0004\bF\u0010?J\u001F\u0010G\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010=\u001A\u00020<H\u0016\u00A2\u0006\u0004\bG\u0010?J\u0017\u0010H\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\bH\u0010\u0006J\u001F\u0010J\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010I\u001A\u00020<H\u0016\u00A2\u0006\u0004\bJ\u0010?\u00A8\u0006L"}, d2 = {"Lokhttp3/logging/LoggingEventListener;", "Lokhttp3/EventListener;", "Lokhttp3/Call;", "call", "", "callStart", "(Lokhttp3/Call;)V", "Lokhttp3/HttpUrl;", "url", "proxySelectStart", "(Lokhttp3/Call;Lokhttp3/HttpUrl;)V", "", "Ljava/net/Proxy;", "proxies", "proxySelectEnd", "(Lokhttp3/Call;Lokhttp3/HttpUrl;Ljava/util/List;)V", "", "domainName", "dnsStart", "(Lokhttp3/Call;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "(Lokhttp3/Call;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "(Lokhttp3/Call;Lokhttp3/Handshake;)V", "Lokhttp3/Protocol;", "protocol", "connectEnd", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V", "Ljava/io/IOException;", "ioe", "connectFailed", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V", "Lokhttp3/Connection;", "connection", "connectionAcquired", "(Lokhttp3/Call;Lokhttp3/Connection;)V", "connectionReleased", "requestHeadersStart", "Lokhttp3/Request;", "request", "requestHeadersEnd", "(Lokhttp3/Call;Lokhttp3/Request;)V", "requestBodyStart", "", "byteCount", "requestBodyEnd", "(Lokhttp3/Call;J)V", "requestFailed", "(Lokhttp3/Call;Ljava/io/IOException;)V", "responseHeadersStart", "Lokhttp3/Response;", "response", "responseHeadersEnd", "(Lokhttp3/Call;Lokhttp3/Response;)V", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", "canceled", "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "Factory", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LoggingEventListener extends EventListener {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lokhttp3/logging/LoggingEventListener$Factory;", "Lokhttp3/EventListener$Factory;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "Lokhttp3/Call;", "call", "Lokhttp3/EventListener;", "create", "(Lokhttp3/Call;)Lokhttp3/EventListener;", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static class Factory implements okhttp3.EventListener.Factory {
        public final Logger a;

        @JvmOverloads
        public Factory() {
            this(null, 1, null);
        }

        @JvmOverloads
        public Factory(@NotNull Logger httpLoggingInterceptor$Logger0) {
            Intrinsics.checkNotNullParameter(httpLoggingInterceptor$Logger0, "logger");
            super();
            this.a = httpLoggingInterceptor$Logger0;
        }

        public Factory(Logger httpLoggingInterceptor$Logger0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                httpLoggingInterceptor$Logger0 = Logger.DEFAULT;
            }
            this(httpLoggingInterceptor$Logger0);
        }

        @Override  // okhttp3.EventListener$Factory
        @NotNull
        public EventListener create(@NotNull Call call0) {
            Intrinsics.checkNotNullParameter(call0, "call");
            return new LoggingEventListener(this.a, null);
        }
    }

    public final Logger a;
    public long b;

    public LoggingEventListener(Logger httpLoggingInterceptor$Logger0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = httpLoggingInterceptor$Logger0;
    }

    public final void a(String s) {
        long v = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.b);
        this.a.log("[" + v + " ms] " + s);
    }

    @Override  // okhttp3.EventListener
    public void cacheConditionalHit(@NotNull Call call0, @NotNull Response response0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(response0, "cachedResponse");
        this.a("cacheConditionalHit: " + response0);
    }

    @Override  // okhttp3.EventListener
    public void cacheHit(@NotNull Call call0, @NotNull Response response0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(response0, "response");
        this.a("cacheHit: " + response0);
    }

    @Override  // okhttp3.EventListener
    public void cacheMiss(@NotNull Call call0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        this.a("cacheMiss");
    }

    @Override  // okhttp3.EventListener
    public void callEnd(@NotNull Call call0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        this.a("callEnd");
    }

    @Override  // okhttp3.EventListener
    public void callFailed(@NotNull Call call0, @NotNull IOException iOException0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(iOException0, "ioe");
        this.a("callFailed: " + iOException0);
    }

    @Override  // okhttp3.EventListener
    public void callStart(@NotNull Call call0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        this.b = System.nanoTime();
        this.a("callStart: " + call0.request());
    }

    @Override  // okhttp3.EventListener
    public void canceled(@NotNull Call call0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        this.a("canceled");
    }

    @Override  // okhttp3.EventListener
    public void connectEnd(@NotNull Call call0, @NotNull InetSocketAddress inetSocketAddress0, @NotNull Proxy proxy0, @Nullable Protocol protocol0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress0, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy0, "proxy");
        this.a("connectEnd: " + protocol0);
    }

    @Override  // okhttp3.EventListener
    public void connectFailed(@NotNull Call call0, @NotNull InetSocketAddress inetSocketAddress0, @NotNull Proxy proxy0, @Nullable Protocol protocol0, @NotNull IOException iOException0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress0, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy0, "proxy");
        Intrinsics.checkNotNullParameter(iOException0, "ioe");
        this.a("connectFailed: " + protocol0 + ' ' + iOException0);
    }

    @Override  // okhttp3.EventListener
    public void connectStart(@NotNull Call call0, @NotNull InetSocketAddress inetSocketAddress0, @NotNull Proxy proxy0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress0, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy0, "proxy");
        this.a("connectStart: " + inetSocketAddress0 + ' ' + proxy0);
    }

    @Override  // okhttp3.EventListener
    public void connectionAcquired(@NotNull Call call0, @NotNull Connection connection0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(connection0, "connection");
        this.a("connectionAcquired: " + connection0);
    }

    @Override  // okhttp3.EventListener
    public void connectionReleased(@NotNull Call call0, @NotNull Connection connection0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(connection0, "connection");
        this.a("connectionReleased");
    }

    @Override  // okhttp3.EventListener
    public void dnsEnd(@NotNull Call call0, @NotNull String s, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(s, "domainName");
        Intrinsics.checkNotNullParameter(list0, "inetAddressList");
        this.a("dnsEnd: " + list0);
    }

    @Override  // okhttp3.EventListener
    public void dnsStart(@NotNull Call call0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(s, "domainName");
        this.a("dnsStart: " + s);
    }

    @Override  // okhttp3.EventListener
    public void proxySelectEnd(@NotNull Call call0, @NotNull HttpUrl httpUrl0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(httpUrl0, "url");
        Intrinsics.checkNotNullParameter(list0, "proxies");
        this.a("proxySelectEnd: " + list0);
    }

    @Override  // okhttp3.EventListener
    public void proxySelectStart(@NotNull Call call0, @NotNull HttpUrl httpUrl0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(httpUrl0, "url");
        this.a("proxySelectStart: " + httpUrl0);
    }

    @Override  // okhttp3.EventListener
    public void requestBodyEnd(@NotNull Call call0, long v) {
        Intrinsics.checkNotNullParameter(call0, "call");
        this.a("requestBodyEnd: byteCount=" + v);
    }

    @Override  // okhttp3.EventListener
    public void requestBodyStart(@NotNull Call call0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        this.a("requestBodyStart");
    }

    @Override  // okhttp3.EventListener
    public void requestFailed(@NotNull Call call0, @NotNull IOException iOException0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(iOException0, "ioe");
        this.a("requestFailed: " + iOException0);
    }

    @Override  // okhttp3.EventListener
    public void requestHeadersEnd(@NotNull Call call0, @NotNull Request request0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(request0, "request");
        this.a("requestHeadersEnd");
    }

    @Override  // okhttp3.EventListener
    public void requestHeadersStart(@NotNull Call call0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        this.a("requestHeadersStart");
    }

    @Override  // okhttp3.EventListener
    public void responseBodyEnd(@NotNull Call call0, long v) {
        Intrinsics.checkNotNullParameter(call0, "call");
        this.a("responseBodyEnd: byteCount=" + v);
    }

    @Override  // okhttp3.EventListener
    public void responseBodyStart(@NotNull Call call0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        this.a("responseBodyStart");
    }

    @Override  // okhttp3.EventListener
    public void responseFailed(@NotNull Call call0, @NotNull IOException iOException0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(iOException0, "ioe");
        this.a("responseFailed: " + iOException0);
    }

    @Override  // okhttp3.EventListener
    public void responseHeadersEnd(@NotNull Call call0, @NotNull Response response0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(response0, "response");
        this.a("responseHeadersEnd: " + response0);
    }

    @Override  // okhttp3.EventListener
    public void responseHeadersStart(@NotNull Call call0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        this.a("responseHeadersStart");
    }

    @Override  // okhttp3.EventListener
    public void satisfactionFailure(@NotNull Call call0, @NotNull Response response0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(response0, "response");
        this.a("satisfactionFailure: " + response0);
    }

    @Override  // okhttp3.EventListener
    public void secureConnectEnd(@NotNull Call call0, @Nullable Handshake handshake0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        this.a("secureConnectEnd: " + handshake0);
    }

    @Override  // okhttp3.EventListener
    public void secureConnectStart(@NotNull Call call0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        this.a("secureConnectStart");
    }
}

