package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md.b;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CertificatePinner;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;
import okio.AsyncTimeout;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0002deB\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0000H\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001B\u001A\u00020\u00112\u0006\u0010\u001A\u001A\u00020\u0019H\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001D\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u001D\u0010\u0015J\u000F\u0010\u001F\u001A\u00020\u0016H\u0000\u00A2\u0006\u0004\b\u001E\u0010\u0018J\u001D\u0010!\u001A\u00020\u00112\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010 \u001A\u00020\u0006\u00A2\u0006\u0004\b!\u0010\"J\u0017\u0010(\u001A\u00020%2\u0006\u0010$\u001A\u00020#H\u0000\u00A2\u0006\u0004\b&\u0010\'J\u0015\u0010+\u001A\u00020\u00112\u0006\u0010*\u001A\u00020)\u00A2\u0006\u0004\b+\u0010,J;\u00105\u001A\u00028\u0000\"\n\b\u0000\u0010.*\u0004\u0018\u00010-2\u0006\u0010/\u001A\u00020%2\u0006\u00100\u001A\u00020\u00062\u0006\u00101\u001A\u00020\u00062\u0006\u00102\u001A\u00028\u0000H\u0000\u00A2\u0006\u0004\b3\u00104J\u001B\u00108\u001A\u0004\u0018\u00010-2\b\u00102\u001A\u0004\u0018\u00010-H\u0000\u00A2\u0006\u0004\b6\u00107J\u0011\u0010<\u001A\u0004\u0018\u000109H\u0000\u00A2\u0006\u0004\b:\u0010;J\r\u0010=\u001A\u00020\u0011\u00A2\u0006\u0004\b=\u0010\u0013J\u0017\u0010A\u001A\u00020\u00112\u0006\u0010>\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b?\u0010@J\r\u0010B\u001A\u00020\u0006\u00A2\u0006\u0004\bB\u0010\u0015J\u000F\u0010F\u001A\u00020CH\u0000\u00A2\u0006\u0004\bD\u0010ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010JR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bK\u0010L\u001A\u0004\bM\u0010\u0010R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bN\u0010O\u001A\u0004\bP\u0010\u0015R\u001A\u0010U\u001A\u00020Q8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b2\u0010R\u001A\u0004\bS\u0010TR(\u0010*\u001A\u0004\u0018\u00010)2\b\u0010V\u001A\u0004\u0018\u00010)8\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\bW\u0010X\u001A\u0004\bY\u0010ZR(\u0010_\u001A\u0004\u0018\u00010%2\b\u0010V\u001A\u0004\u0018\u00010%8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b[\u0010\\\u001A\u0004\b]\u0010^R$\u0010c\u001A\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b`\u0010X\u001A\u0004\ba\u0010Z\"\u0004\bb\u0010,\u00A8\u0006f"}, d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/Request;", "originalRequest", "", "forWebSocket", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "Lokio/AsyncTimeout;", "timeout", "()Lokio/AsyncTimeout;", "clone", "()Lokhttp3/internal/connection/RealCall;", "request", "()Lokhttp3/Request;", "", "cancel", "()V", "isCanceled", "()Z", "Lokhttp3/Response;", "execute", "()Lokhttp3/Response;", "Lokhttp3/Callback;", "responseCallback", "enqueue", "(Lokhttp3/Callback;)V", "isExecuted", "getResponseWithInterceptorChain$okhttp", "getResponseWithInterceptorChain", "newExchangeFinder", "enterNetworkInterceptorExchange", "(Lokhttp3/Request;Z)V", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/connection/Exchange;", "initExchange$okhttp", "(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/connection/Exchange;", "initExchange", "Lokhttp3/internal/connection/RealConnection;", "connection", "acquireConnectionNoEvents", "(Lokhttp3/internal/connection/RealConnection;)V", "Ljava/io/IOException;", "E", "exchange", "requestDone", "responseDone", "e", "messageDone$okhttp", "(Lokhttp3/internal/connection/Exchange;ZZLjava/io/IOException;)Ljava/io/IOException;", "messageDone", "noMoreExchanges$okhttp", "(Ljava/io/IOException;)Ljava/io/IOException;", "noMoreExchanges", "Ljava/net/Socket;", "releaseConnectionNoEvents$okhttp", "()Ljava/net/Socket;", "releaseConnectionNoEvents", "timeoutEarlyExit", "closeExchange", "exitNetworkInterceptorExchange$okhttp", "(Z)V", "exitNetworkInterceptorExchange", "retryAfterFailure", "", "redactedUrl$okhttp", "()Ljava/lang/String;", "redactedUrl", "a", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "b", "Lokhttp3/Request;", "getOriginalRequest", "c", "Z", "getForWebSocket", "Lokhttp3/EventListener;", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "eventListener", "<set-?>", "j", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "l", "Lokhttp3/internal/connection/Exchange;", "getInterceptorScopedExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "interceptorScopedExchange", "r", "getConnectionToCancel", "setConnectionToCancel", "connectionToCancel", "AsyncCall", "CallReference", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,551:1\n1#2:552\n608#3,4:553\n615#3,4:557\n615#3,4:561\n608#3,4:565\n350#4,7:569\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n*L\n269#1:553,4\n344#1:557,4\n348#1:561,4\n375#1:565,4\n378#1:569,7\n*E\n"})
public final class RealCall implements Call {
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001A\u00020\b2\n\u0010\u0007\u001A\u00060\u0000R\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R$\u0010\u0017\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00118\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001B\u001A\u00020\u00188F¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001AR\u0011\u0010\u001F\u001A\u00020\u001C8F¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001ER\u0011\u0010\"\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b \u0010!¨\u0006#"}, d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "Lokhttp3/Callback;", "responseCallback", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/Callback;)V", "Lokhttp3/internal/connection/RealCall;", "other", "", "reuseCallsPerHostFrom", "(Lokhttp3/internal/connection/RealCall$AsyncCall;)V", "Ljava/util/concurrent/ExecutorService;", "executorService", "executeOn", "(Ljava/util/concurrent/ExecutorService;)V", "run", "()V", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "getCallsPerHost", "()Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "", "getHost", "()Ljava/lang/String;", "host", "Lokhttp3/Request;", "getRequest", "()Lokhttp3/Request;", "request", "getCall", "()Lokhttp3/internal/connection/RealCall;", "call", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,551:1\n615#2,4:552\n409#2,9:556\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n*L\n494#1:552,4\n513#1:556,9\n*E\n"})
    public final class AsyncCall implements Runnable {
        public final Callback a;
        public volatile AtomicInteger b;
        public final RealCall c;

        public AsyncCall(@NotNull Callback callback0) {
            Intrinsics.checkNotNullParameter(callback0, "responseCallback");
            this.c = realCall0;
            super();
            this.a = callback0;
            this.b = new AtomicInteger(0);
        }

        public final void executeOn(@NotNull ExecutorService executorService0) {
            Intrinsics.checkNotNullParameter(executorService0, "executorService");
            RealCall realCall0 = this.c;
            Dispatcher dispatcher0 = realCall0.getClient().dispatcher();
            if(Util.assertionsEnabled && Thread.holdsLock(dispatcher0)) {
                throw new AssertionError("Thread jeb-dexdec-sb-st-2162 MUST NOT hold lock on " + dispatcher0);
            }
            try {
                executorService0.execute(this);
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                InterruptedIOException interruptedIOException0 = new InterruptedIOException("executor rejected");
                interruptedIOException0.initCause(rejectedExecutionException0);
                realCall0.noMoreExchanges$okhttp(interruptedIOException0);
                this.a.onFailure(realCall0, interruptedIOException0);
            }
            finally {
                realCall0.getClient().dispatcher().finished$okhttp(this);
            }
        }

        @NotNull
        public final RealCall getCall() {
            return this.c;
        }

        @NotNull
        public final AtomicInteger getCallsPerHost() {
            return this.b;
        }

        @NotNull
        public final String getHost() {
            return this.c.getOriginalRequest().url().host();
        }

        @NotNull
        public final Request getRequest() {
            return this.c.getOriginalRequest();
        }

        public final void reuseCallsPerHostFrom(@NotNull AsyncCall realCall$AsyncCall0) {
            Intrinsics.checkNotNullParameter(realCall$AsyncCall0, "other");
            this.b = realCall$AsyncCall0.b;
        }

        @Override
        public void run() {
            Response response0;
            Callback callback0 = this.a;
            RealCall realCall0 = this.c;
            Thread thread0 = Thread.currentThread();
            thread0.setName("OkHttp " + realCall0.redactedUrl$okhttp());
            try {
                realCall0.f.enter();
                boolean z = false;
                try {
                    response0 = realCall0.getResponseWithInterceptorChain$okhttp();
                }
                catch(IOException iOException0) {
                    try {
                        goto label_17;
                    }
                    catch(Throwable throwable1) {
                        realCall0.getClient().dispatcher().finished$okhttp(this);
                        throw throwable1;
                    }
                }
                catch(Throwable throwable0) {
                    goto label_24;
                }
                try {
                    callback0.onResponse(realCall0, response0);
                    goto label_34;
                }
                catch(IOException iOException0) {
                }
                catch(Throwable throwable0) {
                    goto label_23;
                }
                z = true;
                try {
                label_17:
                    if(z) {
                        Platform.Companion.get().log("Callback failure for " + RealCall.access$toLoggableString(realCall0), 4, iOException0);
                    }
                    else {
                        callback0.onFailure(realCall0, iOException0);
                        goto label_34;
                    label_23:
                        z = true;
                    label_24:
                        realCall0.cancel();
                        if(!z) {
                            IOException iOException1 = new IOException("canceled due to " + throwable0);
                            b.addSuppressed(iOException1, throwable0);
                            callback0.onFailure(realCall0, iOException1);
                        }
                        throw throwable0;
                    }
                }
                catch(Throwable throwable1) {
                    realCall0.getClient().dispatcher().finished$okhttp(this);
                    throw throwable1;
                }
            label_34:
                realCall0.getClient().dispatcher().finished$okhttp(this);
            }
            finally {
                thread0.setName("jeb-dexdec-sb-st-2238");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "referent", "", "callStackTrace", "<init>", "(Lokhttp3/internal/connection/RealCall;Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "getCallStackTrace", "()Ljava/lang/Object;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class CallReference extends WeakReference {
        public final Object a;

        public CallReference(@NotNull RealCall realCall0, @Nullable Object object0) {
            Intrinsics.checkNotNullParameter(realCall0, "referent");
            super(realCall0);
            this.a = object0;
        }

        @Nullable
        public final Object getCallStackTrace() {
            return this.a;
        }
    }

    public final OkHttpClient a;
    public final Request b;
    public final boolean c;
    public final RealConnectionPool d;
    public final EventListener e;
    public final okhttp3.internal.connection.RealCall.timeout.1 f;
    public final AtomicBoolean g;
    public Object h;
    public ExchangeFinder i;
    public RealConnection j;
    public boolean k;
    public Exchange l;
    public boolean m;
    public boolean n;
    public boolean o;
    public volatile boolean p;
    public volatile Exchange q;
    public volatile RealConnection r;

    public RealCall(@NotNull OkHttpClient okHttpClient0, @NotNull Request request0, boolean z) {
        Intrinsics.checkNotNullParameter(okHttpClient0, "client");
        Intrinsics.checkNotNullParameter(request0, "originalRequest");
        super();
        this.a = okHttpClient0;
        this.b = request0;
        this.c = z;
        this.d = okHttpClient0.connectionPool().getDelegate$okhttp();
        this.e = okHttpClient0.eventListenerFactory().create(this);
        okhttp3.internal.connection.RealCall.timeout.1 realCall$timeout$10 = new AsyncTimeout() {
            @Override  // okio.AsyncTimeout
            public void timedOut() {
                this.n.cancel();
            }
        };
        realCall$timeout$10.timeout(((long)okHttpClient0.callTimeoutMillis()), TimeUnit.MILLISECONDS);
        this.f = realCall$timeout$10;
        this.g = new AtomicBoolean();
        this.o = true;
    }

    public final IOException a(IOException iOException0) {
        Socket socket0;
        IOException iOException1;
        boolean z = Util.assertionsEnabled;
        if(z && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2197 MUST NOT hold lock on " + this);
        }
        RealConnection realConnection0 = this.j;
        if(realConnection0 != null) {
            if(z && Thread.holdsLock(realConnection0)) {
                throw new AssertionError("Thread jeb-dexdec-sb-st-2197 MUST NOT hold lock on " + realConnection0);
            }
            synchronized(realConnection0) {
                socket0 = this.releaseConnectionNoEvents$okhttp();
            }
            if(this.j == null) {
                if(socket0 != null) {
                    Util.closeQuietly(socket0);
                }
                this.e.connectionReleased(this, realConnection0);
            }
            else if(socket0 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if(this.k) {
            iOException1 = iOException0;
        }
        else if(this.f.exit()) {
            iOException1 = new InterruptedIOException("timeout");
            if(iOException0 != null) {
                iOException1.initCause(iOException0);
            }
        }
        else {
            iOException1 = iOException0;
        }
        if(iOException0 != null) {
            Intrinsics.checkNotNull(iOException1);
            this.e.callFailed(this, iOException1);
            return iOException1;
        }
        this.e.callEnd(this);
        return iOException1;
    }

    // 去混淆评级： 低(40)
    public static final String access$toLoggableString(RealCall realCall0) {
        return (realCall0.isCanceled() ? "canceled " : "") + (realCall0.c ? "web socket" : "call") + " to " + realCall0.redactedUrl$okhttp();
    }

    public final void acquireConnectionNoEvents(@NotNull RealConnection realConnection0) {
        Intrinsics.checkNotNullParameter(realConnection0, "connection");
        if(Util.assertionsEnabled && !Thread.holdsLock(realConnection0)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2184 MUST hold lock on " + realConnection0);
        }
        if(this.j != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.j = realConnection0;
        realConnection0.getCalls().add(new CallReference(this, this.h));
    }

    @Override  // okhttp3.Call
    public void cancel() {
        if(this.p) {
            return;
        }
        this.p = true;
        Exchange exchange0 = this.q;
        if(exchange0 != null) {
            exchange0.cancel();
        }
        RealConnection realConnection0 = this.r;
        if(realConnection0 != null) {
            realConnection0.cancel();
        }
        this.e.canceled(this);
    }

    @Override
    public Object clone() {
        return this.clone();
    }

    @Override  // okhttp3.Call
    public Call clone() {
        return this.clone();
    }

    @NotNull
    public RealCall clone() {
        return new RealCall(this.a, this.b, this.c);
    }

    @Override  // okhttp3.Call
    public void enqueue(@NotNull Callback callback0) {
        Intrinsics.checkNotNullParameter(callback0, "responseCallback");
        if(!this.g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.h = Platform.Companion.get().getStackTraceForCloseable("response.body().close()");
        this.e.callStart(this);
        AsyncCall realCall$AsyncCall0 = new AsyncCall(this, callback0);
        this.a.dispatcher().enqueue$okhttp(realCall$AsyncCall0);
    }

    public final void enterNetworkInterceptorExchange(@NotNull Request request0, boolean z) {
        CertificatePinner certificatePinner0;
        HostnameVerifier hostnameVerifier0;
        SSLSocketFactory sSLSocketFactory0;
        Intrinsics.checkNotNullParameter(request0, "request");
        if(this.l != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized(this) {
            if(!this.n) {
                if(this.m) {
                    throw new IllegalStateException("Check failed.");
                }
                if(z) {
                    RealConnectionPool realConnectionPool0 = this.d;
                    HttpUrl httpUrl0 = request0.url();
                    OkHttpClient okHttpClient0 = this.a;
                    if(httpUrl0.isHttps()) {
                        sSLSocketFactory0 = okHttpClient0.sslSocketFactory();
                        hostnameVerifier0 = okHttpClient0.hostnameVerifier();
                        certificatePinner0 = okHttpClient0.certificatePinner();
                    }
                    else {
                        sSLSocketFactory0 = null;
                        hostnameVerifier0 = null;
                        certificatePinner0 = null;
                    }
                    this.i = new ExchangeFinder(realConnectionPool0, new Address(httpUrl0.host(), httpUrl0.port(), okHttpClient0.dns(), okHttpClient0.socketFactory(), sSLSocketFactory0, hostnameVerifier0, certificatePinner0, okHttpClient0.proxyAuthenticator(), okHttpClient0.proxy(), okHttpClient0.protocols(), okHttpClient0.connectionSpecs(), okHttpClient0.proxySelector()), this, this.e);
                }
                return;
            }
        }
        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
    }

    @Override  // okhttp3.Call
    @NotNull
    public Response execute() {
        OkHttpClient okHttpClient0 = this.a;
        if(this.g.compareAndSet(false, true)) {
            this.f.enter();
            this.h = Platform.Companion.get().getStackTraceForCloseable("response.body().close()");
            this.e.callStart(this);
            try {
                okHttpClient0.dispatcher().executed$okhttp(this);
                return this.getResponseWithInterceptorChain$okhttp();
            }
            finally {
                okHttpClient0.dispatcher().finished$okhttp(this);
            }
        }
        throw new IllegalStateException("Already Executed");
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean z) {
        synchronized(this) {
            if(this.o) {
                if(z) {
                    Exchange exchange0 = this.q;
                    if(exchange0 != null) {
                        exchange0.detachWithViolence();
                    }
                }
                this.l = null;
                return;
            }
        }
        throw new IllegalStateException("released");
    }

    @NotNull
    public final OkHttpClient getClient() {
        return this.a;
    }

    @Nullable
    public final RealConnection getConnection() {
        return this.j;
    }

    @Nullable
    public final RealConnection getConnectionToCancel() {
        return this.r;
    }

    @NotNull
    public final EventListener getEventListener$okhttp() {
        return this.e;
    }

    public final boolean getForWebSocket() {
        return this.c;
    }

    @Nullable
    public final Exchange getInterceptorScopedExchange$okhttp() {
        return this.l;
    }

    @NotNull
    public final Request getOriginalRequest() {
        return this.b;
    }

    @NotNull
    public final Response getResponseWithInterceptorChain$okhttp() throws IOException {
        Response response0;
        ArrayList arrayList0 = new ArrayList();
        OkHttpClient okHttpClient0 = this.a;
        o.addAll(arrayList0, okHttpClient0.interceptors());
        arrayList0.add(new RetryAndFollowUpInterceptor(okHttpClient0));
        arrayList0.add(new BridgeInterceptor(okHttpClient0.cookieJar()));
        arrayList0.add(new CacheInterceptor(okHttpClient0.cache()));
        arrayList0.add(ConnectInterceptor.INSTANCE);
        boolean z = this.c;
        if(!z) {
            o.addAll(arrayList0, okHttpClient0.networkInterceptors());
        }
        arrayList0.add(new CallServerInterceptor(z));
        RealInterceptorChain realInterceptorChain0 = new RealInterceptorChain(this, arrayList0, 0, null, this.b, okHttpClient0.connectTimeoutMillis(), okHttpClient0.readTimeoutMillis(), okHttpClient0.writeTimeoutMillis());
        boolean z1 = false;
        try {
            response0 = realInterceptorChain0.proceed(this.b);
            if(this.isCanceled()) {
                Util.closeQuietly(response0);
                throw new IOException("Canceled");
            }
            goto label_29;
        }
        catch(IOException iOException0) {
            try {
                IOException iOException1 = this.noMoreExchanges$okhttp(iOException0);
                Intrinsics.checkNotNull(iOException1, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOException1;
            }
            catch(Throwable throwable1) {
                throwable0 = throwable1;
                z1 = true;
            }
        }
        catch(Throwable throwable0) {
        }
        if(!z1) {
            this.noMoreExchanges$okhttp(null);
        }
        throw throwable0;
    label_29:
        this.noMoreExchanges$okhttp(null);
        return response0;
    }

    @NotNull
    public final Exchange initExchange$okhttp(@NotNull RealInterceptorChain realInterceptorChain0) {
        Intrinsics.checkNotNullParameter(realInterceptorChain0, "chain");
        synchronized(this) {
            if(this.o) {
                if(this.n || this.m) {
                    throw new IllegalStateException("Check failed.");
                }
                ExchangeFinder exchangeFinder0 = this.i;
                Intrinsics.checkNotNull(exchangeFinder0);
                ExchangeCodec exchangeCodec0 = exchangeFinder0.find(this.a, realInterceptorChain0);
                Exchange exchange0 = new Exchange(this, this.e, exchangeFinder0, exchangeCodec0);
                this.l = exchange0;
                this.q = exchange0;
                synchronized(this) {
                    this.m = true;
                    this.n = true;
                }
                if(this.p) {
                    throw new IOException("Canceled");
                }
                return exchange0;
            }
        }
        throw new IllegalStateException("released");
    }

    @Override  // okhttp3.Call
    public boolean isCanceled() {
        return this.p;
    }

    @Override  // okhttp3.Call
    public boolean isExecuted() {
        return this.g.get();
    }

    public final IOException messageDone$okhttp(@NotNull Exchange exchange0, boolean z, boolean z1, IOException iOException0) {
        int v2;
        Intrinsics.checkNotNullParameter(exchange0, "exchange");
        if(!Intrinsics.areEqual(exchange0, this.q)) {
            return iOException0;
        }
        synchronized(this) {
            int v = 0;
            if((!z || !this.m) && (!z1 || !this.n)) {
                v2 = 0;
            }
            else {
                if(z) {
                    this.m = false;
                }
                if(z1) {
                    this.n = false;
                }
                int v1 = this.m || this.n ? 0 : 1;
                if(!this.m && !this.n && !this.o) {
                    v = 1;
                }
                v2 = v;
                v = v1;
            }
        }
        if(v != 0) {
            this.q = null;
            RealConnection realConnection0 = this.j;
            if(realConnection0 != null) {
                realConnection0.incrementSuccessCount$okhttp();
            }
        }
        return v2 == 0 ? iOException0 : this.a(iOException0);
    }

    @Nullable
    public final IOException noMoreExchanges$okhttp(@Nullable IOException iOException0) {
        boolean z;
        synchronized(this) {
            z = false;
            if(this.o) {
                this.o = false;
                if(!this.m && !this.n) {
                    z = true;
                }
            }
        }
        return z ? this.a(iOException0) : iOException0;
    }

    @NotNull
    public final String redactedUrl$okhttp() {
        return this.b.url().redact();
    }

    @Nullable
    public final Socket releaseConnectionNoEvents$okhttp() {
        RealConnection realConnection0 = this.j;
        Intrinsics.checkNotNull(realConnection0);
        if(Util.assertionsEnabled && !Thread.holdsLock(realConnection0)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2184 MUST hold lock on " + realConnection0);
        }
        List list0 = realConnection0.getCalls();
        int v = 0;
        Iterator iterator0 = list0.iterator();
        while(true) {
            if(!iterator0.hasNext()) {
                v = -1;
                break;
            }
            Object object0 = iterator0.next();
            if(Intrinsics.areEqual(((Reference)object0).get(), this)) {
                break;
            }
            ++v;
        }
        if(v == -1) {
            throw new IllegalStateException("Check failed.");
        }
        list0.remove(v);
        this.j = null;
        if(list0.isEmpty()) {
            realConnection0.setIdleAtNs$okhttp(System.nanoTime());
            return this.d.connectionBecameIdle(realConnection0) ? realConnection0.socket() : null;
        }
        return null;
    }

    @Override  // okhttp3.Call
    @NotNull
    public Request request() {
        return this.b;
    }

    public final boolean retryAfterFailure() {
        ExchangeFinder exchangeFinder0 = this.i;
        Intrinsics.checkNotNull(exchangeFinder0);
        return exchangeFinder0.retryAfterFailure();
    }

    public final void setConnectionToCancel(@Nullable RealConnection realConnection0) {
        this.r = realConnection0;
    }

    @NotNull
    public AsyncTimeout timeout() {
        return this.f;
    }

    @Override  // okhttp3.Call
    public Timeout timeout() {
        return this.timeout();
    }

    public final void timeoutEarlyExit() {
        if(this.k) {
            throw new IllegalStateException("Check failed.");
        }
        this.k = true;
        this.f.exit();
    }
}

