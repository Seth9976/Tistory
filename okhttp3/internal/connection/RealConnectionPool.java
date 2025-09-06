package okhttp3.internal.connection;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import okhttp3.Address;
import okhttp3.ConnectionPool;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000B\u0018\u0000 &2\u00020\u0001:\u0001&B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\r\u0010\f\u001A\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000E\u001A\u00020\u0004¢\u0006\u0004\b\u000E\u0010\rJ5\u0010\u0018\u001A\u00020\u00162\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u00112\u000E\u0010\u0015\u001A\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u0017\u001A\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001D\u001A\u00020\u001C2\u0006\u0010\u001B\u001A\u00020\u001A¢\u0006\u0004\b\u001D\u0010\u001EJ\u0015\u0010\u001F\u001A\u00020\u00162\u0006\u0010\u001B\u001A\u00020\u001A¢\u0006\u0004\b\u001F\u0010 J\r\u0010!\u001A\u00020\u001C¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001A\u00020\u00062\u0006\u0010#\u001A\u00020\u0006¢\u0006\u0004\b$\u0010%¨\u0006\'"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool;", "", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;IJLjava/util/concurrent/TimeUnit;)V", "idleConnectionCount", "()I", "connectionCount", "Lokhttp3/Address;", "address", "Lokhttp3/internal/connection/RealCall;", "call", "", "Lokhttp3/Route;", "routes", "", "requireMultiplexed", "callAcquirePooledConnection", "(Lokhttp3/Address;Lokhttp3/internal/connection/RealCall;Ljava/util/List;Z)Z", "Lokhttp3/internal/connection/RealConnection;", "connection", "", "put", "(Lokhttp3/internal/connection/RealConnection;)V", "connectionBecameIdle", "(Lokhttp3/internal/connection/RealConnection;)Z", "evictAll", "()V", "now", "cleanup", "(J)J", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRealConnectionPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnectionPool.kt\nokhttp3/internal/connection/RealConnectionPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,250:1\n1#2:251\n1774#3,4:252\n608#4,4:256\n608#4,4:260\n608#4,4:264\n*S KotlinDebug\n*F\n+ 1 RealConnectionPool.kt\nokhttp3/internal/connection/RealConnectionPool\n*L\n60#1:252,4\n95#1:256,4\n106#1:260,4\n215#1:264,4\n*E\n"})
public final class RealConnectionPool {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool$Companion;", "", "Lokhttp3/ConnectionPool;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "get", "(Lokhttp3/ConnectionPool;)Lokhttp3/internal/connection/RealConnectionPool;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final RealConnectionPool get(@NotNull ConnectionPool connectionPool0) {
            Intrinsics.checkNotNullParameter(connectionPool0, "connectionPool");
            return connectionPool0.getDelegate$okhttp();
        }
    }

    @NotNull
    public static final Companion Companion;
    public final int a;
    public final long b;
    public final TaskQueue c;
    public final okhttp3.internal.connection.RealConnectionPool.cleanupTask.1 d;
    public final ConcurrentLinkedQueue e;

    static {
        RealConnectionPool.Companion = new Companion(null);
    }

    public RealConnectionPool(@NotNull TaskRunner taskRunner0, int v, long v1, @NotNull TimeUnit timeUnit0) {
        Intrinsics.checkNotNullParameter(taskRunner0, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit0, "timeUnit");
        super();
        this.a = v;
        this.b = timeUnit0.toNanos(v1);
        this.c = taskRunner0.newQueue();
        this.d = new Task("null ConnectionPool") {
            public final RealConnectionPool e;

            {
                this.e = realConnectionPool0;
                super(s, false, 2, null);
            }

            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                return this.e.cleanup(System.nanoTime());
            }
        };
        this.e = new ConcurrentLinkedQueue();
        if(v1 <= 0L) {
            throw new IllegalArgumentException(q.n(v1, "keepAliveDuration <= 0: ").toString());
        }
    }

    public final int a(RealConnection realConnection0, long v) {
        if(Util.assertionsEnabled && !Thread.holdsLock(realConnection0)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2270 MUST hold lock on " + realConnection0);
        }
        List list0 = realConnection0.getCalls();
        int v1 = 0;
        while(v1 < list0.size()) {
            Reference reference0 = (Reference)list0.get(v1);
            if(reference0.get() == null) {
                Intrinsics.checkNotNull(reference0, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                Platform.Companion.get().logCloseableLeak("A connection to " + realConnection0.route().address().url() + " was leaked. Did you forget to close a response body?", ((CallReference)reference0).getCallStackTrace());
                list0.remove(v1);
                realConnection0.setNoNewExchanges(true);
                if(list0.isEmpty()) {
                    realConnection0.setIdleAtNs$okhttp(v - this.b);
                    return 0;
                }
                if(false) {
                    break;
                }
            }
            else {
                ++v1;
            }
        }
        return list0.size();
    }

    public final boolean callAcquirePooledConnection(@NotNull Address address0, @NotNull RealCall realCall0, @Nullable List list0, boolean z) {
        Intrinsics.checkNotNullParameter(address0, "address");
        Intrinsics.checkNotNullParameter(realCall0, "call");
        for(Object object0: this.e) {
            RealConnection realConnection0 = (RealConnection)object0;
            Intrinsics.checkNotNullExpressionValue(realConnection0, "connection");
            __monitor_enter(realConnection0);
            try {
                if((!z || realConnection0.isMultiplexed$okhttp()) && realConnection0.isEligible$okhttp(address0, list0)) {
                    realCall0.acquireConnectionNoEvents(realConnection0);
                    goto label_14;
                }
                goto label_16;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(realConnection0);
            throw throwable0;
        label_14:
            __monitor_exit(realConnection0);
            return true;
        label_16:
            __monitor_exit(realConnection0);
        }
        return false;
    }

    public final long cleanup(long v) {
        int v1 = 0;
        long v2 = 0x8000000000000000L;
        RealConnection realConnection0 = null;
        int v3 = 0;
        for(Object object0: this.e) {
            RealConnection realConnection1 = (RealConnection)object0;
            Intrinsics.checkNotNullExpressionValue(realConnection1, "connection");
            synchronized(realConnection1) {
                if(this.a(realConnection1, v) > 0) {
                    ++v3;
                }
                else {
                    ++v1;
                    long v5 = v - realConnection1.getIdleAtNs$okhttp();
                    if(v5 > v2) {
                        realConnection0 = realConnection1;
                        v2 = v5;
                    }
                }
            }
        }
        long v6 = this.b;
        if(v2 < v6 && v1 <= this.a) {
            if(v1 > 0) {
                return v6 - v2;
            }
            return v3 <= 0 ? -1L : v6;
        }
        Intrinsics.checkNotNull(realConnection0);
        synchronized(realConnection0) {
            if(!realConnection0.getCalls().isEmpty()) {
                return 0L;
            }
            if(realConnection0.getIdleAtNs$okhttp() + v2 != v) {
                return 0L;
            }
            realConnection0.setNoNewExchanges(true);
            this.e.remove(realConnection0);
        }
        Util.closeQuietly(realConnection0.socket());
        if(this.e.isEmpty()) {
            this.c.cancelAll();
        }
        return 0L;
    }

    public final boolean connectionBecameIdle(@NotNull RealConnection realConnection0) {
        Intrinsics.checkNotNullParameter(realConnection0, "connection");
        if(Util.assertionsEnabled && !Thread.holdsLock(realConnection0)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2214 MUST hold lock on " + realConnection0);
        }
        if(!realConnection0.getNoNewExchanges() && this.a != 0) {
            TaskQueue.schedule$default(this.c, this.d, 0L, 2, null);
            return false;
        }
        realConnection0.setNoNewExchanges(true);
        this.e.remove(realConnection0);
        if(this.e.isEmpty()) {
            this.c.cancelAll();
        }
        return true;
    }

    public final int connectionCount() {
        return this.e.size();
    }

    public final void evictAll() {
        Socket socket0;
        Iterator iterator0 = this.e.iterator();
        Intrinsics.checkNotNullExpressionValue(iterator0, "connections.iterator()");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            RealConnection realConnection0 = (RealConnection)object0;
            Intrinsics.checkNotNullExpressionValue(realConnection0, "connection");
            synchronized(realConnection0) {
                if(realConnection0.getCalls().isEmpty()) {
                    iterator0.remove();
                    realConnection0.setNoNewExchanges(true);
                    socket0 = realConnection0.socket();
                }
                else {
                    socket0 = null;
                }
            }
            if(socket0 != null) {
                Util.closeQuietly(socket0);
            }
        }
        if(this.e.isEmpty()) {
            this.c.cancelAll();
        }
    }

    public final int idleConnectionCount() {
        ConcurrentLinkedQueue concurrentLinkedQueue0 = this.e;
        int v = 0;
        if(concurrentLinkedQueue0 == null || !concurrentLinkedQueue0.isEmpty()) {
            for(Object object0: concurrentLinkedQueue0) {
                Intrinsics.checkNotNullExpressionValue(((RealConnection)object0), "it");
                synchronized(((RealConnection)object0)) {
                }
                if(((RealConnection)object0).getCalls().isEmpty()) {
                    ++v;
                    if(v < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
        }
        return v;
    }

    public final void put(@NotNull RealConnection realConnection0) {
        Intrinsics.checkNotNullParameter(realConnection0, "connection");
        if(Util.assertionsEnabled && !Thread.holdsLock(realConnection0)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2224 MUST hold lock on " + realConnection0);
        }
        this.e.add(realConnection0);
        TaskQueue.schedule$default(this.c, this.d, 0L, 2, null);
    }
}

