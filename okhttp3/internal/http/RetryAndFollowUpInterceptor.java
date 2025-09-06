package okhttp3.internal.http;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy.Type;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000B2\u00020\u0001:\u0001\u000BB\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/OkHttpClient;", "client", "<init>", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RetryAndFollowUpInterceptor implements Interceptor {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor$Companion;", "", "", "MAX_FOLLOW_UPS", "I", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final OkHttpClient a;

    static {
        RetryAndFollowUpInterceptor.Companion = new Companion(null);
    }

    public RetryAndFollowUpInterceptor(@NotNull OkHttpClient okHttpClient0) {
        Intrinsics.checkNotNullParameter(okHttpClient0, "client");
        super();
        this.a = okHttpClient0;
    }

    public final Request a(Response response0, Exchange exchange0) {
        Route route0;
        Request request0 = null;
        if(exchange0 == null) {
            route0 = null;
        }
        else {
            RealConnection realConnection0 = exchange0.getConnection$okhttp();
            route0 = realConnection0 == null ? null : realConnection0.route();
        }
        int v = response0.code();
        String s = response0.request().method();
        boolean z = false;
        OkHttpClient okHttpClient0 = this.a;
        if(v != 307 && v != 308) {
            switch(v) {
                case 401: {
                    return okHttpClient0.authenticator().authenticate(route0, response0);
                label_37:
                    if(v != 300 && v != 301 && v != 302 && v != 303) {
                        return null;
                    }
                    break;
                }
                case 407: {
                    Intrinsics.checkNotNull(route0);
                    if(route0.proxy().type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    return okHttpClient0.proxyAuthenticator().authenticate(route0, response0);
                }
                case 408: {
                    if(!okHttpClient0.retryOnConnectionFailure()) {
                        return null;
                    }
                    boolean z1 = response0.request().body() == null;
                    Response response1 = response0.priorResponse();
                    if(response1 != null && response1.code() == 408) {
                        return null;
                    }
                    return RetryAndFollowUpInterceptor.c(response0, 0) <= 0 ? response0.request() : null;
                }
                case 421: {
                    boolean z2 = response0.request().body() == null;
                    if(exchange0 != null && exchange0.isCoalescedConnection$okhttp()) {
                        exchange0.getConnection$okhttp().noCoalescedConnections$okhttp();
                        return response0.request();
                    }
                    return null;
                }
                case 503: {
                    Response response2 = response0.priorResponse();
                    if(response2 != null && response2.code() == 503) {
                        return null;
                    }
                    return RetryAndFollowUpInterceptor.c(response0, 0x7FFFFFFF) == 0 ? response0.request() : null;
                }
                default: {
                    goto label_37;
                }
            }
        }
        if(okHttpClient0.followRedirects()) {
            String s1 = Response.header$default(response0, "Location", null, 2, null);
            if(s1 != null) {
                HttpUrl httpUrl0 = response0.request().url().resolve(s1);
                if(httpUrl0 != null && (Intrinsics.areEqual(httpUrl0.scheme(), response0.request().url().scheme()) || okHttpClient0.followSslRedirects())) {
                    Builder request$Builder0 = response0.request().newBuilder();
                    if(HttpMethod.permitsRequestBody(s)) {
                        int v1 = response0.code();
                        HttpMethod httpMethod0 = HttpMethod.INSTANCE;
                        if(httpMethod0.redirectsWithBody(s) || (v1 == 307 || v1 == 308)) {
                            z = true;
                        }
                        if(!httpMethod0.redirectsToGet(s) || (v1 == 307 || v1 == 308)) {
                            if(z) {
                                request0 = response0.request().body();
                            }
                            request$Builder0.method(s, ((RequestBody)request0));
                        }
                        else {
                            request$Builder0.method("GET", null);
                        }
                        if(!z) {
                            request$Builder0.removeHeader("Transfer-Encoding");
                            request$Builder0.removeHeader("Content-Length");
                            request$Builder0.removeHeader("Content-Type");
                        }
                    }
                    if(!Util.canReuseConnectionFor(response0.request().url(), httpUrl0)) {
                        request$Builder0.removeHeader("Authorization");
                    }
                    return request$Builder0.url(httpUrl0).build();
                }
            }
        }
        return null;
    }

    public final boolean b(IOException iOException0, RealCall realCall0, Request request0, boolean z) {
        if(!this.a.retryOnConnectionFailure()) {
            return false;
        }
        if(z) {
            boolean z1 = request0.body() == null;
            if(iOException0 instanceof FileNotFoundException) {
                return false;
            }
        }
        if(!(iOException0 instanceof ProtocolException)) {
            if(iOException0 instanceof InterruptedIOException) {
                return !(iOException0 instanceof SocketTimeoutException) || z ? false : realCall0.retryAfterFailure();
            }
            return (!(iOException0 instanceof SSLHandshakeException) || !(iOException0.getCause() instanceof CertificateException)) && !(iOException0 instanceof SSLPeerUnverifiedException) ? realCall0.retryAfterFailure() : false;
        }
        return false;
    }

    public static int c(Response response0, int v) {
        String s = Response.header$default(response0, "Retry-After", null, 2, null);
        if(s == null) {
            return v;
        }
        if(new Regex("\\d+").matches(s)) {
            Integer integer0 = Integer.valueOf(s);
            Intrinsics.checkNotNullExpressionValue(integer0, "valueOf(header)");
            return integer0.intValue();
        }
        return 0x7FFFFFFF;
    }

    @Override  // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Chain interceptor$Chain0) throws IOException {
        Request request1;
        Response response1;
        Intrinsics.checkNotNullParameter(interceptor$Chain0, "chain");
        RealInterceptorChain realInterceptorChain0 = (RealInterceptorChain)interceptor$Chain0;
        Request request0 = realInterceptorChain0.getRequest$okhttp();
        RealCall realCall0 = realInterceptorChain0.getCall$okhttp();
        List list0 = CollectionsKt__CollectionsKt.emptyList();
        int v = 0;
        Response response0 = null;
    alab1:
        while(true) {
            boolean z = true;
            while(true) {
                realCall0.enterNetworkInterceptorExchange(request0, z);
                if(realCall0.isCanceled()) {
                    throw new IOException("Canceled");
                }
                try {
                    try {
                        response1 = realInterceptorChain0.proceed(request0);
                        goto label_24;
                    }
                    catch(RouteException routeException0) {
                        if(!this.b(routeException0.getLastConnectException(), realCall0, request0, false)) {
                            throw Util.withSuppressed(routeException0.getFirstConnectException(), list0);
                        }
                        list0 = CollectionsKt___CollectionsKt.plus(list0, routeException0.getFirstConnectException());
                    }
                    catch(IOException iOException0) {
                        if(!this.b(iOException0, realCall0, request0, !(iOException0 instanceof ConnectionShutdownException))) {
                            throw Util.withSuppressed(iOException0, list0);
                        }
                        list0 = CollectionsKt___CollectionsKt.plus(list0, iOException0);
                    }
                }
                catch(Throwable throwable0) {
                    break alab1;
                }
                realCall0.exitNetworkInterceptorExchange$okhttp(true);
                z = false;
                continue;
            label_24:
                if(response0 != null) {
                    try {
                        response1 = response1.newBuilder().priorResponse(response0.newBuilder().body(null).build()).build();
                    label_26:
                        response0 = response1;
                        Exchange exchange0 = realCall0.getInterceptorScopedExchange$okhttp();
                        request1 = this.a(response0, exchange0);
                        if(request1 == null) {
                            if(exchange0 != null && exchange0.isDuplex$okhttp()) {
                                realCall0.timeoutEarlyExit();
                            }
                            goto label_32;
                        }
                        goto label_34;
                    }
                    catch(Throwable throwable0) {
                        break alab1;
                    }
                }
                goto label_26;
            label_32:
                realCall0.exitNetworkInterceptorExchange$okhttp(false);
                return response0;
                try {
                label_34:
                    boolean z1 = request1.body() == null;
                    ResponseBody responseBody0 = response0.body();
                    if(responseBody0 != null) {
                        Util.closeQuietly(responseBody0);
                    }
                }
                catch(Throwable throwable0) {
                    break alab1;
                }
                ++v;
                if(v <= 20) {
                    realCall0.exitNetworkInterceptorExchange$okhttp(true);
                    request0 = request1;
                    break;
                }
                try {
                    throw new ProtocolException("Too many follow-up requests: " + v);
                }
                catch(Throwable throwable0) {
                }
                break alab1;
            }
        }
        realCall0.exitNetworkInterceptorExchange$okhttp(true);
        throw throwable0;
    }
}

