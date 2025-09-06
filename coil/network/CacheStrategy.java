package coil.network;

import coil.util.-Utils;
import coil.util.Time;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import okhttp3.CacheControl;
import okhttp3.Headers.Builder;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u000E2\u00020\u0001:\u0002\u000E\u000FR\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001A\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f¨\u0006\u0010"}, d2 = {"Lcoil/network/CacheStrategy;", "", "Lokhttp3/Request;", "a", "Lokhttp3/Request;", "getNetworkRequest", "()Lokhttp3/Request;", "networkRequest", "Lcoil/network/CacheResponse;", "b", "Lcoil/network/CacheResponse;", "getCacheResponse", "()Lcoil/network/CacheResponse;", "cacheResponse", "Companion", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CacheStrategy {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001D\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\t¢\u0006\u0004\b\u0007\u0010\nJ\u001D\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000B¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lcoil/network/CacheStrategy$Companion;", "", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "response", "", "isCacheable", "(Lokhttp3/Request;Lokhttp3/Response;)Z", "Lcoil/network/CacheResponse;", "(Lokhttp3/Request;Lcoil/network/CacheResponse;)Z", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", "combineHeaders", "(Lokhttp3/Headers;Lokhttp3/Headers;)Lokhttp3/Headers;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 中等(80)
        public static boolean a(String s) {
            return !p.equals("Connection", s, true) && !p.equals("Keep-Alive", s, true) && !p.equals("Proxy-Authenticate", s, true) && !p.equals("Proxy-Authorization", s, true) && !p.equals("TE", s, true) && !p.equals("Trailers", s, true) && !p.equals("Transfer-Encoding", s, true) && !p.equals("Upgrade", s, true);
        }

        @NotNull
        public final Headers combineHeaders(@NotNull Headers headers0, @NotNull Headers headers1) {
            Builder headers$Builder0 = new Builder();
            int v = headers0.size();
            for(int v2 = 0; v2 < v; ++v2) {
                String s = headers0.name(v2);
                String s1 = headers0.value(v2);
                if((!p.equals("Warning", s, true) || !p.startsWith$default(s1, "1", false, 2, null)) && (p.equals("Content-Length", s, true) || p.equals("Content-Encoding", s, true) || p.equals("Content-Type", s, true) || !Companion.a(s) || headers1.get(s) == null)) {
                    headers$Builder0.addUnsafeNonAscii(s, s1);
                }
            }
            int v3 = headers1.size();
            for(int v1 = 0; v1 < v3; ++v1) {
                String s2 = headers1.name(v1);
                if(!p.equals("Content-Length", s2, true) && !p.equals("Content-Encoding", s2, true) && !p.equals("Content-Type", s2, true) && Companion.a(s2)) {
                    headers$Builder0.addUnsafeNonAscii(s2, headers1.value(v1));
                }
            }
            return headers$Builder0.build();
        }

        // 去混淆评级： 低(30)
        public final boolean isCacheable(@NotNull Request request0, @NotNull CacheResponse cacheResponse0) {
            return !request0.cacheControl().noStore() && !cacheResponse0.getCacheControl().noStore() && !Intrinsics.areEqual(cacheResponse0.getResponseHeaders().get("Vary"), "*");
        }

        // 去混淆评级： 低(30)
        public final boolean isCacheable(@NotNull Request request0, @NotNull Response response0) {
            return !request0.cacheControl().noStore() && !response0.cacheControl().noStore() && !Intrinsics.areEqual(response0.headers().get("Vary"), "*");
        }
    }

    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001A\u00020\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lcoil/network/CacheStrategy$Factory;", "", "Lokhttp3/Request;", "request", "Lcoil/network/CacheResponse;", "cacheResponse", "<init>", "(Lokhttp3/Request;Lcoil/network/CacheResponse;)V", "Lcoil/network/CacheStrategy;", "compute", "()Lcoil/network/CacheStrategy;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Factory {
        public final Request a;
        public final CacheResponse b;
        public final Date c;
        public final String d;
        public final Date e;
        public final String f;
        public final Date g;
        public final long h;
        public final long i;
        public final String j;
        public final int k;

        public Factory(@NotNull Request request0, @Nullable CacheResponse cacheResponse0) {
            this.a = request0;
            this.b = cacheResponse0;
            this.k = -1;
            if(cacheResponse0 != null) {
                this.h = cacheResponse0.getSentRequestAtMillis();
                this.i = cacheResponse0.getReceivedResponseAtMillis();
                Headers headers0 = cacheResponse0.getResponseHeaders();
                int v = headers0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    String s = headers0.name(v1);
                    if(p.equals(s, "Date", true)) {
                        this.c = headers0.getDate("Date");
                        this.d = headers0.value(v1);
                    }
                    else if(p.equals(s, "Expires", true)) {
                        this.g = headers0.getDate("Expires");
                    }
                    else if(p.equals(s, "Last-Modified", true)) {
                        this.e = headers0.getDate("Last-Modified");
                        this.f = headers0.value(v1);
                    }
                    else if(p.equals(s, "ETag", true)) {
                        this.j = headers0.value(v1);
                    }
                    else if(p.equals(s, "Age", true)) {
                        this.k = -Utils.toNonNegativeInt(headers0.value(v1), -1);
                    }
                }
            }
        }

        @NotNull
        public final CacheStrategy compute() {
            long v10;
            Date date3;
            long v6;
            Request request0 = this.a;
            CacheResponse cacheResponse0 = this.b;
            if(cacheResponse0 == null) {
                return new CacheStrategy(request0, null, null);
            }
            if(request0.isHttps() && !cacheResponse0.isTls()) {
                return new CacheStrategy(request0, null, null);
            }
            CacheControl cacheControl0 = cacheResponse0.getCacheControl();
            if(!CacheStrategy.Companion.isCacheable(request0, cacheResponse0)) {
                return new CacheStrategy(request0, null, null);
            }
            CacheControl cacheControl1 = request0.cacheControl();
            if(!cacheControl1.noCache() && request0.header("If-Modified-Since") == null && request0.header("If-None-Match") == null) {
                long v = this.i;
                Date date0 = this.c;
                long v1 = date0 == null ? 0L : Math.max(0L, v - date0.getTime());
                int v2 = this.k;
                if(v2 != -1) {
                    v1 = Math.max(v1, TimeUnit.SECONDS.toMillis(((long)v2)));
                }
                long v3 = Time.INSTANCE.currentMillis();
                long v4 = v1 + (v - this.h) + (v3 - v);
                Intrinsics.checkNotNull(cacheResponse0);
                CacheControl cacheControl2 = cacheResponse0.getCacheControl();
                long v5 = this.h;
                Date date1 = this.e;
                if(cacheControl2.maxAgeSeconds() == -1) {
                    Date date2 = this.g;
                    if(date2 != null) {
                        if(date0 != null) {
                            v = date0.getTime();
                        }
                        long v7 = date2.getTime() - v;
                        v6 = v7 > 0L ? v7 : 0L;
                    }
                    else if(date1 == null || request0.url().query() != null) {
                        v6 = 0L;
                    }
                    else {
                        if(date0 != null) {
                            v5 = date0.getTime();
                        }
                        Intrinsics.checkNotNull(date1);
                        long v8 = v5 - date1.getTime();
                        v6 = v8 > 0L ? v8 / 10L : 0L;
                    }
                }
                else {
                    v6 = TimeUnit.SECONDS.toMillis(((long)cacheControl2.maxAgeSeconds()));
                }
                if(cacheControl1.maxAgeSeconds() != -1) {
                    v6 = Math.min(v6, TimeUnit.SECONDS.toMillis(((long)cacheControl1.maxAgeSeconds())));
                }
                long v9 = cacheControl1.minFreshSeconds() == -1 ? 0L : TimeUnit.SECONDS.toMillis(((long)cacheControl1.minFreshSeconds()));
                if(cacheControl0.mustRevalidate() || cacheControl1.maxStaleSeconds() == -1) {
                    date3 = date0;
                    v10 = 0L;
                }
                else {
                    date3 = date0;
                    v10 = TimeUnit.SECONDS.toMillis(((long)cacheControl1.maxStaleSeconds()));
                }
                if(!cacheControl0.noCache() && v4 + v9 < v6 + v10) {
                    return new CacheStrategy(null, cacheResponse0, null);
                }
                String s = this.j;
                if(s != null) {
                    Intrinsics.checkNotNull(s);
                    return new CacheStrategy(request0.newBuilder().addHeader("If-None-Match", s).build(), cacheResponse0, null);
                }
                if(date1 != null) {
                    Intrinsics.checkNotNull(this.f);
                    return new CacheStrategy(request0.newBuilder().addHeader("If-Modified-Since", this.f).build(), cacheResponse0, null);
                }
                if(date3 != null) {
                    Intrinsics.checkNotNull(this.d);
                    return new CacheStrategy(request0.newBuilder().addHeader("If-Modified-Since", this.d).build(), cacheResponse0, null);
                }
                return new CacheStrategy(request0, null, null);
            }
            return new CacheStrategy(request0, null, null);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Request a;
    public final CacheResponse b;

    static {
        CacheStrategy.Companion = new Companion(null);
    }

    public CacheStrategy(Request request0, CacheResponse cacheResponse0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = request0;
        this.b = cacheResponse0;
    }

    @Nullable
    public final CacheResponse getCacheResponse() {
        return this.b;
    }

    @Nullable
    public final Request getNetworkRequest() {
        return this.a;
    }
}

