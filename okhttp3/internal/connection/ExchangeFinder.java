package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import jeb.synthetic.FIN;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u001D\u0010\u0011\u001A\u00020\u00102\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0014\u001A\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001A\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001AJ\u0015\u0010\u001D\u001A\u00020\u00182\u0006\u0010\u001C\u001A\u00020\u001B¢\u0006\u0004\b\u001D\u0010\u001ER\u001A\u0010\u0005\u001A\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lokhttp3/internal/connection/ExchangeFinder;", "", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/Address;", "address", "Lokhttp3/internal/connection/RealCall;", "call", "Lokhttp3/EventListener;", "eventListener", "<init>", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Address;Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;)V", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http/ExchangeCodec;", "find", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/http/ExchangeCodec;", "Ljava/io/IOException;", "e", "", "trackFailure", "(Ljava/io/IOException;)V", "", "retryAfterFailure", "()Z", "Lokhttp3/HttpUrl;", "url", "sameHostAndPort", "(Lokhttp3/HttpUrl;)Z", "b", "Lokhttp3/Address;", "getAddress$okhttp", "()Lokhttp3/Address;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ExchangeFinder {
    public final RealConnectionPool a;
    public final Address b;
    public final RealCall c;
    public final EventListener d;
    public Selection e;
    public RouteSelector f;
    public int g;
    public int h;
    public int i;
    public Route j;

    public ExchangeFinder(@NotNull RealConnectionPool realConnectionPool0, @NotNull Address address0, @NotNull RealCall realCall0, @NotNull EventListener eventListener0) {
        Intrinsics.checkNotNullParameter(realConnectionPool0, "connectionPool");
        Intrinsics.checkNotNullParameter(address0, "address");
        Intrinsics.checkNotNullParameter(realCall0, "call");
        Intrinsics.checkNotNullParameter(eventListener0, "eventListener");
        super();
        this.a = realConnectionPool0;
        this.b = address0;
        this.c = realCall0;
        this.d = eventListener0;
    }

    public final RealConnection a(int v, int v1, int v2, int v3, boolean z, boolean z1) {
        Socket socket0;
        List list0;
        while(!this.c.isCanceled()) {
            RealConnection realConnection0 = this.c.getConnection();
            boolean z2 = true;
            if(realConnection0 == null) {
            label_16:
                this.g = 0;
                this.h = 0;
                this.i = 0;
                if(this.a.callAcquirePooledConnection(this.b, this.c, null, false)) {
                    realConnection0 = this.c.getConnection();
                    Intrinsics.checkNotNull(realConnection0);
                    this.d.connectionAcquired(this.c, realConnection0);
                }
                else {
                    Route route0 = this.j;
                    if(route0 == null) {
                        Selection routeSelector$Selection0 = this.e;
                        if(routeSelector$Selection0 != null) {
                            Intrinsics.checkNotNull(routeSelector$Selection0);
                            if(routeSelector$Selection0.hasNext()) {
                                Selection routeSelector$Selection1 = this.e;
                                Intrinsics.checkNotNull(routeSelector$Selection1);
                                route0 = routeSelector$Selection1.next();
                                list0 = null;
                                goto label_53;
                            }
                        }
                        RouteSelector routeSelector0 = this.f;
                        if(routeSelector0 == null) {
                            routeSelector0 = new RouteSelector(this.b, this.c.getClient().getRouteDatabase(), this.c, this.d);
                            this.f = routeSelector0;
                        }
                        Selection routeSelector$Selection2 = routeSelector0.next();
                        this.e = routeSelector$Selection2;
                        list0 = routeSelector$Selection2.getRoutes();
                        if(this.c.isCanceled()) {
                            throw new IOException("Canceled");
                        }
                        if(this.a.callAcquirePooledConnection(this.b, this.c, list0, false)) {
                            realConnection0 = this.c.getConnection();
                            Intrinsics.checkNotNull(realConnection0);
                            this.d.connectionAcquired(this.c, realConnection0);
                            goto label_77;
                        }
                        else {
                            route0 = routeSelector$Selection2.next();
                        }
                    }
                    else {
                        Intrinsics.checkNotNull(route0);
                        this.j = null;
                        list0 = null;
                    }
                label_53:
                    realConnection0 = new RealConnection(this.a, route0);
                    this.c.setConnectionToCancel(realConnection0);
                    try {
                        realConnection0.connect(v, v1, v2, v3, z, this.c, this.d);
                    }
                    finally {
                        this.c.setConnectionToCancel(null);
                    }
                    this.c.getClient().getRouteDatabase().connected(realConnection0.route());
                    if(this.a.callAcquirePooledConnection(this.b, this.c, list0, true)) {
                        RealConnection realConnection1 = this.c.getConnection();
                        Intrinsics.checkNotNull(realConnection1);
                        this.j = route0;
                        Util.closeQuietly(realConnection0.socket());
                        this.d.connectionAcquired(this.c, realConnection1);
                        realConnection0 = realConnection1;
                    }
                    else {
                        synchronized(realConnection0) {
                            this.a.put(realConnection0);
                            this.c.acquireConnectionNoEvents(realConnection0);
                        }
                        this.d.connectionAcquired(this.c, realConnection0);
                    }
                }
            }
            else {
                synchronized(realConnection0) {
                    socket0 = realConnection0.getNoNewExchanges() || !this.sameHostAndPort(realConnection0.route().address().url()) ? this.c.releaseConnectionNoEvents$okhttp() : null;
                }
                if(this.c.getConnection() == null) {
                    if(socket0 != null) {
                        Util.closeQuietly(socket0);
                    }
                    this.d.connectionReleased(this.c, realConnection0);
                    goto label_16;
                }
                else if(socket0 != null) {
                    throw new IllegalStateException("Check failed.");
                }
            }
        label_77:
            if(realConnection0.isHealthy(z1)) {
                return realConnection0;
            }
            realConnection0.noNewExchanges$okhttp();
            if(this.j == null && !(this.e == null ? true : this.e.hasNext())) {
                RouteSelector routeSelector1 = this.f;
                if(routeSelector1 != null) {
                    z2 = routeSelector1.hasNext();
                }
                if(!z2) {
                    throw new IOException("exhausted all routes");
                }
            }
        }
        throw new IOException("Canceled");
    }

    @NotNull
    public final ExchangeCodec find(@NotNull OkHttpClient okHttpClient0, @NotNull RealInterceptorChain realInterceptorChain0) {
        Intrinsics.checkNotNullParameter(okHttpClient0, "client");
        Intrinsics.checkNotNullParameter(realInterceptorChain0, "chain");
        try {
            return this.a(realInterceptorChain0.getConnectTimeoutMillis$okhttp(), realInterceptorChain0.getReadTimeoutMillis$okhttp(), realInterceptorChain0.getWriteTimeoutMillis$okhttp(), okHttpClient0.pingIntervalMillis(), okHttpClient0.retryOnConnectionFailure(), !Intrinsics.areEqual(realInterceptorChain0.getRequest$okhttp().method(), "GET")).newCodec$okhttp(okHttpClient0, realInterceptorChain0);
        }
        catch(RouteException routeException0) {
            this.trackFailure(routeException0.getLastConnectException());
            throw routeException0;
        }
        catch(IOException iOException0) {
            this.trackFailure(iOException0);
            throw new RouteException(iOException0);
        }
    }

    @NotNull
    public final Address getAddress$okhttp() {
        return this.b;
    }

    public final boolean retryAfterFailure() {
        Route route0 = null;
        int v = this.g;
        if(v == 0 && this.h == 0 && this.i == 0) {
            return false;
        }
        if(this.j != null) {
            return true;
        }
        if(v <= 1 && this.h <= 1 && this.i <= 0) {
            RealConnection realConnection0 = this.c.getConnection();
            if(realConnection0 != null) {
                __monitor_enter(realConnection0);
                int v1 = FIN.finallyOpen$NT();
                if(realConnection0.getRouteFailureCount$okhttp() == 0) {
                    if(Util.canReuseConnectionFor(realConnection0.route().address().url(), this.b.url())) {
                        route0 = realConnection0.route();
                    }
                    FIN.finallyExec$NT(v1);
                }
                else {
                    FIN.finallyCodeBegin$NT(v1);
                    __monitor_exit(realConnection0);
                    FIN.finallyCodeEnd$NT(v1);
                }
            }
        }
        if(route0 != null) {
            this.j = route0;
            return true;
        }
        if(this.e != null && this.e.hasNext()) {
            return true;
        }
        return this.f == null ? true : this.f.hasNext();
    }

    public final boolean sameHostAndPort(@NotNull HttpUrl httpUrl0) {
        Intrinsics.checkNotNullParameter(httpUrl0, "url");
        HttpUrl httpUrl1 = this.b.url();
        return httpUrl0.port() == httpUrl1.port() && Intrinsics.areEqual(httpUrl0.host(), httpUrl1.host());
    }

    public final void trackFailure(@NotNull IOException iOException0) {
        Intrinsics.checkNotNullParameter(iOException0, "e");
        this.j = null;
        if(iOException0 instanceof StreamResetException && ((StreamResetException)iOException0).errorCode == ErrorCode.REFUSED_STREAM) {
            ++this.g;
            return;
        }
        if(iOException0 instanceof ConnectionShutdownException) {
            ++this.h;
            return;
        }
        ++this.i;
    }
}

