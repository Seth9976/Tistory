package okhttp3.internal;

import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers.Builder;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0016\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u0004\u001A\u001E\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004\u001A\u001E\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000E\u001A\u0018\u0010\u000F\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u0014\u001A\u0016\u0010\u0015\u001A\u00020\u00042\u0006\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u000E\u001A \u0010\u0019\u001A\u0004\u0018\u00010\u00172\u0006\u0010\u001A\u001A\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u001D2\u0006\u0010\u001E\u001A\u00020\u0004¨\u0006\u001F"}, d2 = {"addHeaderLenient", "Lokhttp3/Headers$Builder;", "builder", "line", "", "name", "value", "applyConnectionSpec", "", "connectionSpec", "Lokhttp3/ConnectionSpec;", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "isFallback", "", "cacheGet", "Lokhttp3/Response;", "cache", "Lokhttp3/Cache;", "request", "Lokhttp3/Request;", "cookieToString", "cookie", "Lokhttp3/Cookie;", "forObsoleteRfc2965", "parseCookie", "currentTimeMillis", "", "url", "Lokhttp3/HttpUrl;", "setCookie", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "Internal")
public final class Internal {
    @NotNull
    public static final Builder addHeaderLenient(@NotNull Builder headers$Builder0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(headers$Builder0, "builder");
        Intrinsics.checkNotNullParameter(s, "line");
        return headers$Builder0.addLenient$okhttp(s);
    }

    @NotNull
    public static final Builder addHeaderLenient(@NotNull Builder headers$Builder0, @NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(headers$Builder0, "builder");
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(s1, "value");
        return headers$Builder0.addLenient$okhttp(s, s1);
    }

    public static final void applyConnectionSpec(@NotNull ConnectionSpec connectionSpec0, @NotNull SSLSocket sSLSocket0, boolean z) {
        Intrinsics.checkNotNullParameter(connectionSpec0, "connectionSpec");
        Intrinsics.checkNotNullParameter(sSLSocket0, "sslSocket");
        connectionSpec0.apply$okhttp(sSLSocket0, z);
    }

    @Nullable
    public static final Response cacheGet(@NotNull Cache cache0, @NotNull Request request0) {
        Intrinsics.checkNotNullParameter(cache0, "cache");
        Intrinsics.checkNotNullParameter(request0, "request");
        return cache0.get$okhttp(request0);
    }

    @NotNull
    public static final String cookieToString(@NotNull Cookie cookie0, boolean z) {
        Intrinsics.checkNotNullParameter(cookie0, "cookie");
        return cookie0.toString$okhttp(z);
    }

    @Nullable
    public static final Cookie parseCookie(long v, @NotNull HttpUrl httpUrl0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(httpUrl0, "url");
        Intrinsics.checkNotNullParameter(s, "setCookie");
        return Cookie.Companion.parse$okhttp(v, httpUrl0, s);
    }
}

