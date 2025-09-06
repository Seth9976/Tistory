package okhttp3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 ?2\u00020\u0001:\u0002?@B\u0005\u00A2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0016J\u0018\u0010\t\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\bH\u0016J\u0010\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0010\u0010\f\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0018\u0010\r\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\u000FH\u0016J\u0010\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0010\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J*\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0018H\u0016J2\u0010\u0019\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u00182\u0006\u0010\u000E\u001A\u00020\u000FH\u0016J \u0010\u001A\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u0016H\u0016J\u0018\u0010\u001B\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u001C\u001A\u00020\u001DH\u0016J\u0018\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u001C\u001A\u00020\u001DH\u0016J+\u0010\u001F\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010 \u001A\u00020!2\u0011\u0010\"\u001A\r\u0012\t\u0012\u00070$\u00A2\u0006\u0002\b%0#H\u0016J\u0018\u0010&\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010 \u001A\u00020!H\u0016J+\u0010\'\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010(\u001A\u00020)2\u0011\u0010*\u001A\r\u0012\t\u0012\u00070\u0016\u00A2\u0006\u0002\b%0#H\u0016J\u0018\u0010+\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010(\u001A\u00020)H\u0016J\u0018\u0010,\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010-\u001A\u00020.H\u0016J\u0010\u0010/\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0018\u00100\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\u000FH\u0016J\u0018\u00101\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u00102\u001A\u000203H\u0016J\u0010\u00104\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0018\u00105\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010-\u001A\u00020.H\u0016J\u0010\u00106\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0018\u00107\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\u000FH\u0016J\u0018\u00108\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\bH\u0016J\u0010\u00109\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0018\u0010:\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\bH\u0016J\u001A\u0010;\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\b\u0010<\u001A\u0004\u0018\u00010=H\u0016J\u0010\u0010>\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016\u00A8\u0006A"}, d2 = {"Lokhttp3/EventListener;", "", "()V", "cacheConditionalHit", "", "call", "Lokhttp3/Call;", "cachedResponse", "Lokhttp3/Response;", "cacheHit", "response", "cacheMiss", "callEnd", "callFailed", "ioe", "Ljava/io/IOException;", "callStart", "canceled", "connectEnd", "inetSocketAddress", "Ljava/net/InetSocketAddress;", "proxy", "Ljava/net/Proxy;", "protocol", "Lokhttp3/Protocol;", "connectFailed", "connectStart", "connectionAcquired", "connection", "Lokhttp3/Connection;", "connectionReleased", "dnsEnd", "domainName", "", "inetAddressList", "", "Ljava/net/InetAddress;", "Lkotlin/jvm/JvmSuppressWildcards;", "dnsStart", "proxySelectEnd", "url", "Lokhttp3/HttpUrl;", "proxies", "proxySelectStart", "requestBodyEnd", "byteCount", "", "requestBodyStart", "requestFailed", "requestHeadersEnd", "request", "Lokhttp3/Request;", "requestHeadersStart", "responseBodyEnd", "responseBodyStart", "responseFailed", "responseHeadersEnd", "responseHeadersStart", "satisfactionFailure", "secureConnectEnd", "handshake", "Lokhttp3/Handshake;", "secureConnectStart", "Companion", "Factory", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class EventListener {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/EventListener$Companion;", "", "Lokhttp3/EventListener;", "NONE", "Lokhttp3/EventListener;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lokhttp3/EventListener$Factory;", "", "create", "Lokhttp3/EventListener;", "call", "Lokhttp3/Call;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Factory {
        @NotNull
        EventListener create(@NotNull Call arg1);
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final EventListener NONE;

    static {
        EventListener.Companion = new Companion(null);
        EventListener.NONE = new EventListener.Companion.NONE.1();  // 初始化器: Lokhttp3/EventListener;-><init>()V
    }

    public void cacheConditionalHit(@NotNull Call call0, @NotNull Response response0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(response0, "cachedResponse");
    }

    public void cacheHit(@NotNull Call call0, @NotNull Response response0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(response0, "response");
    }

    public void cacheMiss(@NotNull Call call0) {
        Intrinsics.checkNotNullParameter(call0, "call");
    }

    public void callEnd(@NotNull Call call0) {
        Intrinsics.checkNotNullParameter(call0, "call");
    }

    public void callFailed(@NotNull Call call0, @NotNull IOException iOException0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(iOException0, "ioe");
    }

    public void callStart(@NotNull Call call0) {
        Intrinsics.checkNotNullParameter(call0, "call");
    }

    public void canceled(@NotNull Call call0) {
        Intrinsics.checkNotNullParameter(call0, "call");
    }

    public void connectEnd(@NotNull Call call0, @NotNull InetSocketAddress inetSocketAddress0, @NotNull Proxy proxy0, @Nullable Protocol protocol0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress0, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy0, "proxy");
    }

    public void connectFailed(@NotNull Call call0, @NotNull InetSocketAddress inetSocketAddress0, @NotNull Proxy proxy0, @Nullable Protocol protocol0, @NotNull IOException iOException0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress0, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy0, "proxy");
        Intrinsics.checkNotNullParameter(iOException0, "ioe");
    }

    public void connectStart(@NotNull Call call0, @NotNull InetSocketAddress inetSocketAddress0, @NotNull Proxy proxy0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress0, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy0, "proxy");
    }

    public void connectionAcquired(@NotNull Call call0, @NotNull Connection connection0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(connection0, "connection");
    }

    public void connectionReleased(@NotNull Call call0, @NotNull Connection connection0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(connection0, "connection");
    }

    public void dnsEnd(@NotNull Call call0, @NotNull String s, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(s, "domainName");
        Intrinsics.checkNotNullParameter(list0, "inetAddressList");
    }

    public void dnsStart(@NotNull Call call0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(s, "domainName");
    }

    public void proxySelectEnd(@NotNull Call call0, @NotNull HttpUrl httpUrl0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(httpUrl0, "url");
        Intrinsics.checkNotNullParameter(list0, "proxies");
    }

    public void proxySelectStart(@NotNull Call call0, @NotNull HttpUrl httpUrl0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(httpUrl0, "url");
    }

    public void requestBodyEnd(@NotNull Call call0, long v) {
        Intrinsics.checkNotNullParameter(call0, "call");
    }

    public void requestBodyStart(@NotNull Call call0) {
        Intrinsics.checkNotNullParameter(call0, "call");
    }

    public void requestFailed(@NotNull Call call0, @NotNull IOException iOException0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(iOException0, "ioe");
    }

    public void requestHeadersEnd(@NotNull Call call0, @NotNull Request request0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(request0, "request");
    }

    public void requestHeadersStart(@NotNull Call call0) {
        Intrinsics.checkNotNullParameter(call0, "call");
    }

    public void responseBodyEnd(@NotNull Call call0, long v) {
        Intrinsics.checkNotNullParameter(call0, "call");
    }

    public void responseBodyStart(@NotNull Call call0) {
        Intrinsics.checkNotNullParameter(call0, "call");
    }

    public void responseFailed(@NotNull Call call0, @NotNull IOException iOException0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(iOException0, "ioe");
    }

    public void responseHeadersEnd(@NotNull Call call0, @NotNull Response response0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(response0, "response");
    }

    public void responseHeadersStart(@NotNull Call call0) {
        Intrinsics.checkNotNullParameter(call0, "call");
    }

    public void satisfactionFailure(@NotNull Call call0, @NotNull Response response0) {
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(response0, "response");
    }

    public void secureConnectEnd(@NotNull Call call0, @Nullable Handshake handshake0) {
        Intrinsics.checkNotNullParameter(call0, "call");
    }

    public void secureConnectStart(@NotNull Call call0) {
        Intrinsics.checkNotNullParameter(call0, "call");
    }
}

