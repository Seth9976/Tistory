package okhttp3.internal.http;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\r\u001A\u00020\u0007\u0012\u0006\u0010\u000E\u001A\u00020\u0007\u0012\u0006\u0010\u000F\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\b\u001A\u00020\u00072\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u00072\b\b\u0002\u0010\u000E\u001A\u00020\u00072\b\b\u0002\u0010\u000F\u001A\u00020\u0007H\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0016\u001A\u0004\u0018\u00010\u0015H\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\r\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\r\u0010\u0018J\u001F\u0010\u001C\u001A\u00020\u00012\u0006\u0010\u0019\u001A\u00020\u00072\u0006\u0010\u001B\u001A\u00020\u001AH\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u000E\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\u000E\u0010\u0018J\u001F\u0010\u001E\u001A\u00020\u00012\u0006\u0010\u0019\u001A\u00020\u00072\u0006\u0010\u001B\u001A\u00020\u001AH\u0016\u00A2\u0006\u0004\b\u001E\u0010\u001DJ\u000F\u0010\u000F\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\u000F\u0010\u0018J\u001F\u0010\u001F\u001A\u00020\u00012\u0006\u0010\u0019\u001A\u00020\u00072\u0006\u0010\u001B\u001A\u00020\u001AH\u0016\u00A2\u0006\u0004\b\u001F\u0010\u001DJ\u000F\u0010\u0003\u001A\u00020 H\u0016\u00A2\u0006\u0004\b\u0003\u0010!J\u000F\u0010\f\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\f\u0010\"J\u0017\u0010$\u001A\u00020#2\u0006\u0010\f\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b$\u0010%R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)R\u001C\u0010\n\u001A\u0004\u0018\u00010\t8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-R\u001A\u0010\f\u001A\u00020\u000B8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u0010\"R\u001A\u0010\r\u001A\u00020\u00078\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b1\u00102\u001A\u0004\b3\u0010\u0018R\u001A\u0010\u000E\u001A\u00020\u00078\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b4\u00102\u001A\u0004\b5\u0010\u0018R\u001A\u0010\u000F\u001A\u00020\u00078\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b6\u00102\u001A\u0004\b7\u0010\u0018\u00A8\u00068"}, d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", "Lokhttp3/internal/connection/RealCall;", "call", "", "Lokhttp3/Interceptor;", "interceptors", "", "index", "Lokhttp3/internal/connection/Exchange;", "exchange", "Lokhttp3/Request;", "request", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "<init>", "(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;III)V", "copy$okhttp", "(ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;III)Lokhttp3/internal/http/RealInterceptorChain;", "copy", "Lokhttp3/Connection;", "connection", "()Lokhttp3/Connection;", "()I", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "withConnectTimeout", "(ILjava/util/concurrent/TimeUnit;)Lokhttp3/Interceptor$Chain;", "withReadTimeout", "withWriteTimeout", "Lokhttp3/Call;", "()Lokhttp3/Call;", "()Lokhttp3/Request;", "Lokhttp3/Response;", "proceed", "(Lokhttp3/Request;)Lokhttp3/Response;", "a", "Lokhttp3/internal/connection/RealCall;", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "d", "Lokhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "e", "Lokhttp3/Request;", "getRequest$okhttp", "f", "I", "getConnectTimeoutMillis$okhttp", "g", "getReadTimeoutMillis$okhttp", "h", "getWriteTimeoutMillis$okhttp", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRealInterceptorChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealInterceptorChain.kt\nokhttp3/internal/http/RealInterceptorChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
public final class RealInterceptorChain implements Chain {
    public final RealCall a;
    public final List b;
    public final int c;
    public final Exchange d;
    public final Request e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public RealInterceptorChain(@NotNull RealCall realCall0, @NotNull List list0, int v, @Nullable Exchange exchange0, @NotNull Request request0, int v1, int v2, int v3) {
        Intrinsics.checkNotNullParameter(realCall0, "call");
        Intrinsics.checkNotNullParameter(list0, "interceptors");
        Intrinsics.checkNotNullParameter(request0, "request");
        super();
        this.a = realCall0;
        this.b = list0;
        this.c = v;
        this.d = exchange0;
        this.e = request0;
        this.f = v1;
        this.g = v2;
        this.h = v3;
    }

    @Override  // okhttp3.Interceptor$Chain
    @NotNull
    public Call call() {
        return this.a;
    }

    @Override  // okhttp3.Interceptor$Chain
    public int connectTimeoutMillis() {
        return this.f;
    }

    @Override  // okhttp3.Interceptor$Chain
    @Nullable
    public Connection connection() {
        Exchange exchange0 = this.d;
        return exchange0 != null ? exchange0.getConnection$okhttp() : null;
    }

    @NotNull
    public final RealInterceptorChain copy$okhttp(int v, @Nullable Exchange exchange0, @NotNull Request request0, int v1, int v2, int v3) {
        Intrinsics.checkNotNullParameter(request0, "request");
        return new RealInterceptorChain(this.a, this.b, v, exchange0, request0, v1, v2, v3);
    }

    public static RealInterceptorChain copy$okhttp$default(RealInterceptorChain realInterceptorChain0, int v, Exchange exchange0, Request request0, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = realInterceptorChain0.c;
        }
        if((v4 & 2) != 0) {
            exchange0 = realInterceptorChain0.d;
        }
        if((v4 & 4) != 0) {
            request0 = realInterceptorChain0.e;
        }
        if((v4 & 8) != 0) {
            v1 = realInterceptorChain0.f;
        }
        if((v4 & 16) != 0) {
            v2 = realInterceptorChain0.g;
        }
        if((v4 & 0x20) != 0) {
            v3 = realInterceptorChain0.h;
        }
        return realInterceptorChain0.copy$okhttp(v, exchange0, request0, v1, v2, v3);
    }

    @NotNull
    public final RealCall getCall$okhttp() {
        return this.a;
    }

    public final int getConnectTimeoutMillis$okhttp() {
        return this.f;
    }

    @Nullable
    public final Exchange getExchange$okhttp() {
        return this.d;
    }

    public final int getReadTimeoutMillis$okhttp() {
        return this.g;
    }

    @NotNull
    public final Request getRequest$okhttp() {
        return this.e;
    }

    public final int getWriteTimeoutMillis$okhttp() {
        return this.h;
    }

    @Override  // okhttp3.Interceptor$Chain
    @NotNull
    public Response proceed(@NotNull Request request0) throws IOException {
        Intrinsics.checkNotNullParameter(request0, "request");
        List list0 = this.b;
        int v = this.c;
        if(v >= list0.size()) {
            throw new IllegalStateException("Check failed.");
        }
        ++this.i;
        Exchange exchange0 = this.d;
        if(exchange0 != null) {
            if(!exchange0.getFinder$okhttp().sameHostAndPort(request0.url())) {
                throw new IllegalStateException(("network interceptor " + list0.get(v - 1) + " must retain the same host and port").toString());
            }
            if(this.i != 1) {
                throw new IllegalStateException(("network interceptor " + list0.get(v - 1) + " must call proceed() exactly once").toString());
            }
        }
        RealInterceptorChain realInterceptorChain0 = RealInterceptorChain.copy$okhttp$default(this, v + 1, null, request0, 0, 0, 0, 58, null);
        Interceptor interceptor0 = (Interceptor)list0.get(v);
        Response response0 = interceptor0.intercept(realInterceptorChain0);
        if(response0 == null) {
            throw new NullPointerException("interceptor " + interceptor0 + " returned null");
        }
        if(exchange0 != null && v + 1 < list0.size() && realInterceptorChain0.i != 1) {
            throw new IllegalStateException(("network interceptor " + interceptor0 + " must call proceed() exactly once").toString());
        }
        if(response0.body() == null) {
            throw new IllegalStateException(("interceptor " + interceptor0 + " returned a response with no body").toString());
        }
        return response0;
    }

    @Override  // okhttp3.Interceptor$Chain
    public int readTimeoutMillis() {
        return this.g;
    }

    @Override  // okhttp3.Interceptor$Chain
    @NotNull
    public Request request() {
        return this.e;
    }

    @Override  // okhttp3.Interceptor$Chain
    @NotNull
    public Chain withConnectTimeout(int v, @NotNull TimeUnit timeUnit0) {
        Intrinsics.checkNotNullParameter(timeUnit0, "unit");
        if(this.d != null) {
            throw new IllegalStateException("Timeouts can\'t be adjusted in a network interceptor");
        }
        return RealInterceptorChain.copy$okhttp$default(this, 0, null, null, Util.checkDuration("connectTimeout", ((long)v), timeUnit0), 0, 0, 55, null);
    }

    @Override  // okhttp3.Interceptor$Chain
    @NotNull
    public Chain withReadTimeout(int v, @NotNull TimeUnit timeUnit0) {
        Intrinsics.checkNotNullParameter(timeUnit0, "unit");
        if(this.d != null) {
            throw new IllegalStateException("Timeouts can\'t be adjusted in a network interceptor");
        }
        return RealInterceptorChain.copy$okhttp$default(this, 0, null, null, 0, Util.checkDuration("readTimeout", ((long)v), timeUnit0), 0, 0x2F, null);
    }

    @Override  // okhttp3.Interceptor$Chain
    @NotNull
    public Chain withWriteTimeout(int v, @NotNull TimeUnit timeUnit0) {
        Intrinsics.checkNotNullParameter(timeUnit0, "unit");
        if(this.d != null) {
            throw new IllegalStateException("Timeouts can\'t be adjusted in a network interceptor");
        }
        return RealInterceptorChain.copy$okhttp$default(this, 0, null, null, 0, 0, Util.checkDuration("writeTimeout", ((long)v), timeUnit0), 0x1F, null);
    }

    @Override  // okhttp3.Interceptor$Chain
    public int writeTimeoutMillis() {
        return this.h;
    }
}

