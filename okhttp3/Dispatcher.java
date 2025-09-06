package okhttp3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall.AsyncCall;
import okhttp3.internal.connection.RealCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001B\u0010\r\u001A\u00020\n2\n\u0010\t\u001A\u00060\u0007R\u00020\bH\u0000¢\u0006\u0004\b\u000B\u0010\fJ\r\u0010\u000E\u001A\u00020\n¢\u0006\u0004\b\u000E\u0010\u0003J\u0017\u0010\u0011\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0000¢\u0006\u0004\b\u000F\u0010\u0010J\u001B\u0010\u0013\u001A\u00020\n2\n\u0010\t\u001A\u00060\u0007R\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0013\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\u0010J\u0013\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u001A\u001A\u00020\u0019¢\u0006\u0004\b\u001A\u0010\u001BJ\r\u0010\u001C\u001A\u00020\u0019¢\u0006\u0004\b\u001C\u0010\u001BJ\u000F\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u001D\u0010\u001ER*\u0010\u001F\u001A\u00020\u00192\u0006\u0010\u001F\u001A\u00020\u00198F@FX\u0086\u000E¢\u0006\u0012\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u001B\"\u0004\b#\u0010$R*\u0010%\u001A\u00020\u00192\u0006\u0010%\u001A\u00020\u00198F@FX\u0086\u000E¢\u0006\u0012\n\u0004\b&\u0010!\u001A\u0004\b\'\u0010\u001B\"\u0004\b(\u0010$R.\u00101\u001A\u0004\u0018\u00010)2\b\u0010*\u001A\u0004\u0018\u00010)8F@FX\u0086\u000E¢\u0006\u0012\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.\"\u0004\b/\u00100R\u0011\u0010\u0005\u001A\u00020\u00048G¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u001E¨\u00062"}, d2 = {"Lokhttp3/Dispatcher;", "", "<init>", "()V", "Ljava/util/concurrent/ExecutorService;", "executorService", "(Ljava/util/concurrent/ExecutorService;)V", "Lokhttp3/internal/connection/RealCall$AsyncCall;", "Lokhttp3/internal/connection/RealCall;", "call", "", "enqueue$okhttp", "(Lokhttp3/internal/connection/RealCall$AsyncCall;)V", "enqueue", "cancelAll", "executed$okhttp", "(Lokhttp3/internal/connection/RealCall;)V", "executed", "finished$okhttp", "finished", "", "Lokhttp3/Call;", "queuedCalls", "()Ljava/util/List;", "runningCalls", "", "queuedCallsCount", "()I", "runningCallsCount", "-deprecated_executorService", "()Ljava/util/concurrent/ExecutorService;", "maxRequests", "a", "I", "getMaxRequests", "setMaxRequests", "(I)V", "maxRequestsPerHost", "b", "getMaxRequestsPerHost", "setMaxRequestsPerHost", "Ljava/lang/Runnable;", "<set-?>", "c", "Ljava/lang/Runnable;", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "idleCallback", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,241:1\n1#2:242\n615#3,4:243\n1549#4:247\n1620#4,3:248\n1549#4:251\n1620#4,3:252\n*S KotlinDebug\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n*L\n162#1:243,4\n222#1:247\n222#1:248,3\n227#1:251\n227#1:252,3\n*E\n"})
public final class Dispatcher {
    public int a;
    public int b;
    public Runnable c;
    public ExecutorService d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final ArrayDeque g;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "executorService", imports = {}))
    @JvmName(name = "-deprecated_executorService")
    @NotNull
    public final ExecutorService -deprecated_executorService() {
        return this.executorService();
    }

    public Dispatcher() {
        this.a = 0x40;
        this.b = 5;
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.g = new ArrayDeque();
    }

    public Dispatcher(@NotNull ExecutorService executorService0) {
        Intrinsics.checkNotNullParameter(executorService0, "executorService");
        this();
        this.d = executorService0;
    }

    public final void a(ArrayDeque arrayDeque0, Object object0) {
        synchronized(this) {
            if(arrayDeque0.remove(object0)) {
                Runnable runnable0 = this.c;
                if(!this.b() && runnable0 != null) {
                    runnable0.run();
                }
                return;
            }
        }
        throw new AssertionError("Call wasn\'t in-flight!");
    }

    public final boolean b() {
        boolean z;
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2158 MUST NOT hold lock on " + this);
        }
        ArrayList arrayList0 = new ArrayList();
        synchronized(this) {
            Iterator iterator0 = this.e.iterator();
            Intrinsics.checkNotNullExpressionValue(iterator0, "readyAsyncCalls.iterator()");
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                AsyncCall realCall$AsyncCall0 = (AsyncCall)object0;
                if(this.f.size() >= this.a) {
                    break;
                }
                if(realCall$AsyncCall0.getCallsPerHost().get() < this.b) {
                    iterator0.remove();
                    realCall$AsyncCall0.getCallsPerHost().incrementAndGet();
                    Intrinsics.checkNotNullExpressionValue(realCall$AsyncCall0, "asyncCall");
                    arrayList0.add(realCall$AsyncCall0);
                    this.f.add(realCall$AsyncCall0);
                }
            }
            z = this.runningCallsCount() > 0;
        }
        int v2 = arrayList0.size();
        for(int v1 = 0; v1 < v2; ++v1) {
            ((AsyncCall)arrayList0.get(v1)).executeOn(this.executorService());
        }
        return z;
    }

    public final void cancelAll() {
        synchronized(this) {
            for(Object object0: this.e) {
                ((AsyncCall)object0).getCall().cancel();
            }
            for(Object object1: this.f) {
                ((AsyncCall)object1).getCall().cancel();
            }
            for(Object object2: this.g) {
                ((RealCall)object2).cancel();
            }
        }
    }

    public final void enqueue$okhttp(@NotNull AsyncCall realCall$AsyncCall0) {
        AsyncCall realCall$AsyncCall2;
        Intrinsics.checkNotNullParameter(realCall$AsyncCall0, "call");
        synchronized(this) {
            this.e.add(realCall$AsyncCall0);
            if(!realCall$AsyncCall0.getCall().getForWebSocket()) {
                String s = realCall$AsyncCall0.getHost();
                for(Object object0: this.f) {
                    AsyncCall realCall$AsyncCall1 = (AsyncCall)object0;
                    if(!Intrinsics.areEqual(realCall$AsyncCall1.getHost(), s)) {
                        continue;
                    }
                    realCall$AsyncCall2 = realCall$AsyncCall1;
                    goto label_20;
                }
                realCall$AsyncCall2 = null;
                for(Object object1: this.e) {
                    AsyncCall realCall$AsyncCall3 = (AsyncCall)object1;
                    if(Intrinsics.areEqual(realCall$AsyncCall3.getHost(), s)) {
                        realCall$AsyncCall2 = realCall$AsyncCall3;
                        break;
                    }
                }
            label_20:
                if(realCall$AsyncCall2 != null) {
                    realCall$AsyncCall0.reuseCallsPerHostFrom(realCall$AsyncCall2);
                }
            }
        }
        this.b();
    }

    public final void executed$okhttp(@NotNull RealCall realCall0) {
        synchronized(this) {
            Intrinsics.checkNotNullParameter(realCall0, "call");
            this.g.add(realCall0);
        }
    }

    @JvmName(name = "executorService")
    @NotNull
    public final ExecutorService executorService() {
        synchronized(this) {
            if(this.d == null) {
                this.d = new ThreadPoolExecutor(0, 0x7FFFFFFF, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory((Util.okHttpName + " Dispatcher"), false));
            }
            ExecutorService executorService0 = this.d;
            Intrinsics.checkNotNull(executorService0);
            return executorService0;
        }
    }

    public final void finished$okhttp(@NotNull AsyncCall realCall$AsyncCall0) {
        Intrinsics.checkNotNullParameter(realCall$AsyncCall0, "call");
        realCall$AsyncCall0.getCallsPerHost().decrementAndGet();
        this.a(this.f, realCall$AsyncCall0);
    }

    public final void finished$okhttp(@NotNull RealCall realCall0) {
        Intrinsics.checkNotNullParameter(realCall0, "call");
        this.a(this.g, realCall0);
    }

    @Nullable
    public final Runnable getIdleCallback() {
        synchronized(this) {
        }
        return this.c;
    }

    public final int getMaxRequests() {
        synchronized(this) {
        }
        return this.a;
    }

    public final int getMaxRequestsPerHost() {
        synchronized(this) {
        }
        return this.b;
    }

    @NotNull
    public final List queuedCalls() {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(this.e, 10));
            for(Object object0: this.e) {
                arrayList0.add(((AsyncCall)object0).getCall());
            }
            List list0 = Collections.unmodifiableList(arrayList0);
            Intrinsics.checkNotNullExpressionValue(list0, "unmodifiableList(readyAsyncCalls.map { it.call })");
            return list0;
        }
    }

    public final int queuedCallsCount() {
        synchronized(this) {
        }
        return this.e.size();
    }

    @NotNull
    public final List runningCalls() {
        synchronized(this) {
            ArrayDeque arrayDeque0 = this.g;
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(this.f, 10));
            for(Object object0: this.f) {
                arrayList0.add(((AsyncCall)object0).getCall());
            }
            List list0 = Collections.unmodifiableList(CollectionsKt___CollectionsKt.plus(arrayDeque0, arrayList0));
            Intrinsics.checkNotNullExpressionValue(list0, "unmodifiableList(running…yncCalls.map { it.call })");
            return list0;
        }
    }

    public final int runningCallsCount() {
        synchronized(this) {
        }
        return this.f.size() + this.g.size();
    }

    public final void setIdleCallback(@Nullable Runnable runnable0) {
        synchronized(this) {
            this.c = runnable0;
        }
    }

    public final void setMaxRequests(int v) {
        if(v < 1) {
            throw new IllegalArgumentException(("max < 1: " + v).toString());
        }
        synchronized(this) {
            this.a = v;
        }
        this.b();
    }

    public final void setMaxRequestsPerHost(int v) {
        if(v < 1) {
            throw new IllegalArgumentException(("max < 1: " + v).toString());
        }
        synchronized(this) {
            this.b = v;
        }
        this.b();
    }
}

