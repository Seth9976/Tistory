package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers.Builder;
import okhttp3.Headers;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import okio.Okio;
import okio.Sink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000F2\u00020\u0001:\u0001\u000FB\u0011\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001C\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Cache;", "cache", "<init>", "(Lokhttp3/Cache;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "a", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CacheInterceptor implements Interceptor {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor$Companion;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 中等(80)
        public static boolean a(String s) {
            return !p.equals("Connection", s, true) && !p.equals("Keep-Alive", s, true) && !p.equals("Proxy-Authenticate", s, true) && !p.equals("Proxy-Authorization", s, true) && !p.equals("TE", s, true) && !p.equals("Trailers", s, true) && !p.equals("Transfer-Encoding", s, true) && !p.equals("Upgrade", s, true);
        }

        public static final Headers access$combine(Companion cacheInterceptor$Companion0, Headers headers0, Headers headers1) {
            cacheInterceptor$Companion0.getClass();
            Builder headers$Builder0 = new Builder();
            int v = headers0.size();
            for(int v2 = 0; v2 < v; ++v2) {
                String s = headers0.name(v2);
                String s1 = headers0.value(v2);
                if((!p.equals("Warning", s, true) || !p.startsWith$default(s1, "1", false, 2, null)) && (p.equals("Content-Length", s, true) || p.equals("Content-Encoding", s, true) || p.equals("Content-Type", s, true) || !Companion.a(s) || headers1.get(s) == null)) {
                    headers$Builder0.addLenient$okhttp(s, s1);
                }
            }
            int v3 = headers1.size();
            for(int v1 = 0; v1 < v3; ++v1) {
                String s2 = headers1.name(v1);
                if(!p.equals("Content-Length", s2, true) && !p.equals("Content-Encoding", s2, true) && !p.equals("Content-Type", s2, true) && Companion.a(s2)) {
                    headers$Builder0.addLenient$okhttp(s2, headers1.value(v1));
                }
            }
            return headers$Builder0.build();
        }

        public static final Response access$stripBody(Companion cacheInterceptor$Companion0, Response response0) {
            cacheInterceptor$Companion0.getClass();
            return (response0 == null ? null : response0.body()) == null ? response0 : response0.newBuilder().body(null).build();
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Cache a;

    static {
        CacheInterceptor.Companion = new Companion(null);
    }

    public CacheInterceptor(@Nullable Cache cache0) {
        this.a = cache0;
    }

    @Nullable
    public final Cache getCache$okhttp() {
        return this.a;
    }

    @Override  // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Chain interceptor$Chain0) throws IOException {
        Response response4;
        EventListener eventListener0;
        Intrinsics.checkNotNullParameter(interceptor$Chain0, "chain");
        Call call0 = interceptor$Chain0.call();
        Cache cache0 = this.a;
        Response response0 = cache0 == null ? null : cache0.get$okhttp(interceptor$Chain0.request());
        CacheStrategy cacheStrategy0 = new Factory(System.currentTimeMillis(), interceptor$Chain0.request(), response0).compute();
        Request request0 = cacheStrategy0.getNetworkRequest();
        Response response1 = cacheStrategy0.getCacheResponse();
        if(cache0 != null) {
            cache0.trackResponse$okhttp(cacheStrategy0);
        }
        RealCall realCall0 = call0 instanceof RealCall ? ((RealCall)call0) : null;
        if(realCall0 == null) {
            eventListener0 = EventListener.NONE;
        }
        else {
            eventListener0 = realCall0.getEventListener$okhttp();
            if(eventListener0 == null) {
                eventListener0 = EventListener.NONE;
            }
        }
        if(response0 != null && response1 == null) {
            ResponseBody responseBody0 = response0.body();
            if(responseBody0 != null) {
                Util.closeQuietly(responseBody0);
            }
        }
        if(request0 == null && response1 == null) {
            Response response2 = new okhttp3.Response.Builder().request(interceptor$Chain0.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
            eventListener0.satisfactionFailure(call0, response2);
            return response2;
        }
        if(request0 == null) {
            Intrinsics.checkNotNull(response1);
            Response response3 = response1.newBuilder().cacheResponse(Companion.access$stripBody(CacheInterceptor.Companion, response1)).build();
            eventListener0.cacheHit(call0, response3);
            return response3;
        }
        if(response1 != null) {
            eventListener0.cacheConditionalHit(call0, response1);
        }
        else if(cache0 != null) {
            eventListener0.cacheMiss(call0);
        }
        try {
            response4 = interceptor$Chain0.proceed(request0);
        }
        catch(Throwable throwable0) {
            if(response0 != null) {
                ResponseBody responseBody1 = response0.body();
                if(responseBody1 != null) {
                    Util.closeQuietly(responseBody1);
                }
            }
            throw throwable0;
        }
        if(response4 == null && response0 != null) {
            ResponseBody responseBody2 = response0.body();
            if(responseBody2 != null) {
                Util.closeQuietly(responseBody2);
            }
        }
        if(response1 != null) {
            if(response4 != null && response4.code() == 304) {
                Response response5 = response1.newBuilder().headers(Companion.access$combine(CacheInterceptor.Companion, response1.headers(), response4.headers())).sentRequestAtMillis(response4.sentRequestAtMillis()).receivedResponseAtMillis(response4.receivedResponseAtMillis()).cacheResponse(Companion.access$stripBody(CacheInterceptor.Companion, response1)).networkResponse(Companion.access$stripBody(CacheInterceptor.Companion, response4)).build();
                ResponseBody responseBody3 = response4.body();
                Intrinsics.checkNotNull(responseBody3);
                responseBody3.close();
                Intrinsics.checkNotNull(cache0);
                cache0.trackConditionalCacheHit$okhttp();
                cache0.update$okhttp(response1, response5);
                eventListener0.cacheHit(call0, response5);
                return response5;
            }
            ResponseBody responseBody4 = response1.body();
            if(responseBody4 != null) {
                Util.closeQuietly(responseBody4);
            }
        }
        Intrinsics.checkNotNull(response4);
        Response response6 = response4.newBuilder().cacheResponse(Companion.access$stripBody(CacheInterceptor.Companion, response1)).networkResponse(Companion.access$stripBody(CacheInterceptor.Companion, response4)).build();
        if(cache0 != null) {
            if(HttpHeaders.promisesBody(response6) && CacheStrategy.Companion.isCacheable(response6, request0)) {
                CacheRequest cacheRequest0 = cache0.put$okhttp(response6);
                if(cacheRequest0 != null) {
                    Sink sink0 = cacheRequest0.body();
                    ResponseBody responseBody5 = response6.body();
                    Intrinsics.checkNotNull(responseBody5);
                    CacheInterceptor.cacheWritingResponse.cacheWritingSource.1 cacheInterceptor$cacheWritingResponse$cacheWritingSource$10 = new CacheInterceptor.cacheWritingResponse.cacheWritingSource.1(responseBody5.source(), cacheRequest0, Okio.buffer(sink0));
                    String s = Response.header$default(response6, "Content-Type", null, 2, null);
                    long v = response6.body().contentLength();
                    response6 = response6.newBuilder().body(new RealResponseBody(s, v, Okio.buffer(cacheInterceptor$cacheWritingResponse$cacheWritingSource$10))).build();
                }
                if(response1 != null) {
                    eventListener0.cacheMiss(call0);
                }
                return response6;
            }
            if(HttpMethod.INSTANCE.invalidatesCache(request0.method())) {
                try {
                    cache0.remove$okhttp(request0);
                }
                catch(IOException unused_ex) {
                }
            }
        }
        return response6;
    }
}

