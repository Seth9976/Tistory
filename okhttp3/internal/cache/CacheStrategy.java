package okhttp3.internal.cache;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response.Builder;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000E\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u001D\b\u0000\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy;", "", "Lokhttp3/Request;", "networkRequest", "Lokhttp3/Response;", "cacheResponse", "<init>", "(Lokhttp3/Request;Lokhttp3/Response;)V", "a", "Lokhttp3/Request;", "getNetworkRequest", "()Lokhttp3/Request;", "b", "Lokhttp3/Response;", "getCacheResponse", "()Lokhttp3/Response;", "Companion", "Factory", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CacheStrategy {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001D\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Companion;", "", "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "request", "", "isCacheable", "(Lokhttp3/Response;Lokhttp3/Request;)Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final boolean isCacheable(@NotNull Response response0, @NotNull Request request0) {
            Intrinsics.checkNotNullParameter(response0, "response");
            Intrinsics.checkNotNullParameter(request0, "request");
            switch(response0.code()) {
                case 302: 
                case 307: {
                    return Response.header$default(response0, "Expires", null, 2, null) != null || response0.cacheControl().maxAgeSeconds() != -1 || response0.cacheControl().isPublic() || response0.cacheControl().isPrivate() ? !response0.cacheControl().noStore() && !request0.cacheControl().noStore() : false;
                }
                case 200: 
                case 203: 
                case 204: 
                case 300: 
                case 301: 
                case 308: 
                case 404: 
                case 405: 
                case 410: 
                case 414: 
                case 501: {
                    return !response0.cacheControl().noStore() && !request0.cacheControl().noStore();
                }
                default: {
                    return false;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\u000B\u0010\fR\u001A\u0010\u0005\u001A\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Factory;", "", "", "nowMillis", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "cacheResponse", "<init>", "(JLokhttp3/Request;Lokhttp3/Response;)V", "Lokhttp3/internal/cache/CacheStrategy;", "compute", "()Lokhttp3/internal/cache/CacheStrategy;", "b", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Factory {
        public final long a;
        public final Request b;
        public final Response c;
        public final Date d;
        public final String e;
        public final Date f;
        public final String g;
        public final Date h;
        public final long i;
        public final long j;
        public final String k;
        public final int l;

        public Factory(long v, @NotNull Request request0, @Nullable Response response0) {
            Intrinsics.checkNotNullParameter(request0, "request");
            super();
            this.a = v;
            this.b = request0;
            this.c = response0;
            this.l = -1;
            if(response0 != null) {
                this.i = response0.sentRequestAtMillis();
                this.j = response0.receivedResponseAtMillis();
                Headers headers0 = response0.headers();
                int v1 = headers0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    String s = headers0.name(v2);
                    String s1 = headers0.value(v2);
                    if(p.equals(s, "Date", true)) {
                        this.d = DatesKt.toHttpDateOrNull(s1);
                        this.e = s1;
                    }
                    else if(p.equals(s, "Expires", true)) {
                        this.h = DatesKt.toHttpDateOrNull(s1);
                    }
                    else if(p.equals(s, "Last-Modified", true)) {
                        this.f = DatesKt.toHttpDateOrNull(s1);
                        this.g = s1;
                    }
                    else if(p.equals(s, "ETag", true)) {
                        this.k = s1;
                    }
                    else if(p.equals(s, "Age", true)) {
                        this.l = Util.toNonNegativeInt(s1, -1);
                    }
                }
            }
        }

        @NotNull
        public final CacheStrategy compute() {
            String s1;
            Date date3;
            long v5;
            CacheStrategy cacheStrategy0;
            Request request0 = this.b;
            Response response0 = this.c;
            if(response0 == null) {
                cacheStrategy0 = new CacheStrategy(request0, null);
                return cacheStrategy0.getNetworkRequest() == null || !request0.cacheControl().onlyIfCached() ? cacheStrategy0 : new CacheStrategy(null, null);
            }
            if(request0.isHttps() && response0.handshake() == null) {
                cacheStrategy0 = new CacheStrategy(request0, null);
                return cacheStrategy0.getNetworkRequest() == null || !request0.cacheControl().onlyIfCached() ? cacheStrategy0 : new CacheStrategy(null, null);
            }
            if(!CacheStrategy.Companion.isCacheable(response0, request0)) {
                cacheStrategy0 = new CacheStrategy(request0, null);
                return cacheStrategy0.getNetworkRequest() == null || !request0.cacheControl().onlyIfCached() ? cacheStrategy0 : new CacheStrategy(null, null);
            }
            CacheControl cacheControl0 = request0.cacheControl();
            if(!cacheControl0.noCache() && request0.header("If-Modified-Since") == null && request0.header("If-None-Match") == null) {
                CacheControl cacheControl1 = response0.cacheControl();
                long v = this.j;
                Date date0 = this.d;
                long v1 = date0 == null ? 0L : Math.max(0L, v - date0.getTime());
                int v2 = this.l;
                if(v2 != -1) {
                    v1 = Math.max(v1, TimeUnit.SECONDS.toMillis(((long)v2)));
                }
                long v3 = this.i;
                long v4 = v1 + (v - this.i) + (this.a - v);
                Intrinsics.checkNotNull(response0);
                CacheControl cacheControl2 = response0.cacheControl();
                Date date1 = this.f;
                Date date2 = this.h;
                if(cacheControl2.maxAgeSeconds() != -1) {
                    v5 = TimeUnit.SECONDS.toMillis(((long)cacheControl2.maxAgeSeconds()));
                }
                else if(date2 != null) {
                    if(date0 != null) {
                        v = date0.getTime();
                    }
                    long v6 = date2.getTime() - v;
                    v5 = v6 > 0L ? v6 : 0L;
                }
                else if(date1 == null || response0.request().url().query() != null) {
                    v5 = 0L;
                }
                else {
                    if(date0 != null) {
                        v3 = date0.getTime();
                    }
                    Intrinsics.checkNotNull(date1);
                    long v7 = v3 - date1.getTime();
                    v5 = v7 > 0L ? v7 / 10L : 0L;
                }
                if(cacheControl0.maxAgeSeconds() == -1) {
                    date3 = date1;
                }
                else {
                    date3 = date1;
                    v5 = Math.min(v5, TimeUnit.SECONDS.toMillis(((long)cacheControl0.maxAgeSeconds())));
                }
                long v8 = cacheControl0.minFreshSeconds() == -1 ? 0L : TimeUnit.SECONDS.toMillis(((long)cacheControl0.minFreshSeconds()));
                long v9 = cacheControl1.mustRevalidate() || cacheControl0.maxStaleSeconds() == -1 ? 0L : TimeUnit.SECONDS.toMillis(((long)cacheControl0.maxStaleSeconds()));
                if(!cacheControl1.noCache()) {
                    long v10 = v8 + v4;
                    if(v10 < v9 + v5) {
                        Builder response$Builder0 = response0.newBuilder();
                        if(Long.compare(v10, v5) >= 0) {
                            response$Builder0.addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if(v4 > 86400000L) {
                            Intrinsics.checkNotNull(response0);
                            if(response0.cacheControl().maxAgeSeconds() == -1 && date2 == null) {
                                response$Builder0.addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                            }
                        }
                        cacheStrategy0 = new CacheStrategy(null, response$Builder0.build());
                        return cacheStrategy0.getNetworkRequest() == null || !request0.cacheControl().onlyIfCached() ? cacheStrategy0 : new CacheStrategy(null, null);
                    }
                }
                String s = this.k;
                if(s != null) {
                    s1 = "If-None-Match";
                    goto label_78;
                }
                boolean z = false;
                if(date3 != null) {
                    z = true;
                    s = this.g;
                }
                else if(date0 != null) {
                    z = true;
                    s = this.e;
                }
                if(z) {
                    s1 = "If-Modified-Since";
                label_78:
                    okhttp3.Headers.Builder headers$Builder0 = request0.headers().newBuilder();
                    Intrinsics.checkNotNull(s);
                    headers$Builder0.addLenient$okhttp(s1, s);
                    cacheStrategy0 = new CacheStrategy(request0.newBuilder().headers(headers$Builder0.build()).build(), response0);
                    return cacheStrategy0.getNetworkRequest() == null || !request0.cacheControl().onlyIfCached() ? cacheStrategy0 : new CacheStrategy(null, null);
                }
                cacheStrategy0 = new CacheStrategy(request0, null);
                return cacheStrategy0.getNetworkRequest() == null || !request0.cacheControl().onlyIfCached() ? cacheStrategy0 : new CacheStrategy(null, null);
            }
            cacheStrategy0 = new CacheStrategy(request0, null);
            return cacheStrategy0.getNetworkRequest() == null || !request0.cacheControl().onlyIfCached() ? cacheStrategy0 : new CacheStrategy(null, null);
        }

        @NotNull
        public final Request getRequest$okhttp() {
            return this.b;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Request a;
    public final Response b;

    static {
        CacheStrategy.Companion = new Companion(null);
    }

    public CacheStrategy(@Nullable Request request0, @Nullable Response response0) {
        this.a = request0;
        this.b = response0;
    }

    @Nullable
    public final Response getCacheResponse() {
        return this.b;
    }

    @Nullable
    public final Request getNetworkRequest() {
        return this.a;
    }
}

