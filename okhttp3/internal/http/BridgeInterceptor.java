package okhttp3.internal.http;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request.Builder;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okio.GzipSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lokhttp3/internal/http/BridgeInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/CookieJar;", "cookieJar", "<init>", "(Lokhttp3/CookieJar;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBridgeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1864#2,3:118\n*S KotlinDebug\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n*L\n111#1:118,3\n*E\n"})
public final class BridgeInterceptor implements Interceptor {
    public final CookieJar a;

    public BridgeInterceptor(@NotNull CookieJar cookieJar0) {
        Intrinsics.checkNotNullParameter(cookieJar0, "cookieJar");
        super();
        this.a = cookieJar0;
    }

    @Override  // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Chain interceptor$Chain0) throws IOException {
        boolean z;
        Intrinsics.checkNotNullParameter(interceptor$Chain0, "chain");
        Request request0 = interceptor$Chain0.request();
        Builder request$Builder0 = request0.newBuilder();
        RequestBody requestBody0 = request0.body();
        if(requestBody0 != null) {
            MediaType mediaType0 = requestBody0.contentType();
            if(mediaType0 != null) {
                request$Builder0.header("Content-Type", mediaType0.toString());
            }
            long v = requestBody0.contentLength();
            if(Long.compare(v, -1L) == 0) {
                request$Builder0.header("Transfer-Encoding", "chunked");
                request$Builder0.removeHeader("Content-Length");
            }
            else {
                request$Builder0.header("Content-Length", String.valueOf(v));
                request$Builder0.removeHeader("Transfer-Encoding");
            }
        }
        int v1 = 0;
        if(request0.header("Host") == null) {
            request$Builder0.header("Host", Util.toHostHeader$default(request0.url(), false, 1, null));
        }
        if(request0.header("Connection") == null) {
            request$Builder0.header("Connection", "Keep-Alive");
        }
        if(request0.header("Accept-Encoding") != null || request0.header("Range") != null) {
            z = false;
        }
        else {
            request$Builder0.header("Accept-Encoding", "gzip");
            z = true;
        }
        CookieJar cookieJar0 = this.a;
        List list0 = cookieJar0.loadForRequest(request0.url());
        if(!list0.isEmpty()) {
            StringBuilder stringBuilder0 = new StringBuilder();
            for(Object object0: list0) {
                if(v1 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if(v1 > 0) {
                    stringBuilder0.append("; ");
                }
                stringBuilder0.append(((Cookie)object0).name());
                stringBuilder0.append('=');
                stringBuilder0.append(((Cookie)object0).value());
                ++v1;
            }
            String s = stringBuilder0.toString();
            Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
            request$Builder0.header("Cookie", s);
        }
        if(request0.header("User-Agent") == null) {
            request$Builder0.header("User-Agent", "okhttp/4.12.0");
        }
        Response response0 = interceptor$Chain0.proceed(request$Builder0.build());
        HttpHeaders.receiveHeaders(cookieJar0, request0.url(), response0.headers());
        okhttp3.Response.Builder response$Builder0 = response0.newBuilder().request(request0);
        if(z && p.equals("gzip", Response.header$default(response0, "Content-Encoding", null, 2, null), true) && HttpHeaders.promisesBody(response0)) {
            ResponseBody responseBody0 = response0.body();
            if(responseBody0 != null) {
                GzipSource gzipSource0 = new GzipSource(responseBody0.source());
                response$Builder0.headers(response0.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
                response$Builder0.body(new RealResponseBody(Response.header$default(response0, "Content-Type", null, 2, null), -1L, Okio.buffer(gzipSource0)));
            }
        }
        return response$Builder0.build();
    }
}

