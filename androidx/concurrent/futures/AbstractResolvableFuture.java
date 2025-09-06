package androidx.concurrent.futures;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;
import g.a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import w2.b;
import w2.c;
import w2.d;
import w2.e;
import w2.f;
import w2.g;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public abstract class AbstractResolvableFuture implements ListenableFuture {
    public volatile Object a;
    public volatile c b;
    public volatile g c;
    public static final boolean d;
    public static final Logger e;
    public static final a f;
    public static final Object g;

    static {
        d d0;
        AbstractResolvableFuture.d = false;
        AbstractResolvableFuture.e = Logger.getLogger("androidx.concurrent.futures.AbstractResolvableFuture");
        try {
            d0 = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "a"));
            throwable0 = null;
        }
        catch(Throwable throwable0) {
            d0 = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        AbstractResolvableFuture.f = d0;
        if(throwable0 != null) {
            AbstractResolvableFuture.e.log(Level.SEVERE, "SafeAtomicHelper is broken!", throwable0);
        }
        AbstractResolvableFuture.g = new Object();
    }

    public final void a(StringBuilder stringBuilder0) {
        try {
            Object object0 = AbstractResolvableFuture.f(this);
            stringBuilder0.append("SUCCESS, result=[");
            stringBuilder0.append((object0 == this ? "this future" : String.valueOf(object0)));
            stringBuilder0.append("]");
        }
        catch(ExecutionException executionException0) {
            stringBuilder0.append("FAILURE, cause=[");
            stringBuilder0.append(executionException0.getCause());
            stringBuilder0.append("]");
        }
        catch(CancellationException unused_ex) {
            stringBuilder0.append("CANCELLED");
        }
        catch(RuntimeException runtimeException0) {
            stringBuilder0.append("UNKNOWN, cause=[");
            stringBuilder0.append(runtimeException0.getClass());
            stringBuilder0.append(" thrown from get()]");
        }
    }

    @Override  // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable0, Executor executor0) {
        runnable0.getClass();
        executor0.getClass();
        c c0 = this.b;
        c c1 = c.d;
        if(c0 != c1) {
            c c2 = new c(runnable0, executor0);
            while(true) {
                c2.c = c0;
                if(AbstractResolvableFuture.f.f(this, c0, c2)) {
                    return;
                }
                c0 = this.b;
                if(c0 == c1) {
                    break;
                }
            }
        }
        AbstractResolvableFuture.c(runnable0, executor0);
    }

    public void afterDone() {
    }

    public static void b(AbstractResolvableFuture abstractResolvableFuture0) {
        Runnable runnable0;
        c c2;
        c c1;
        c c0 = null;
        while(true) {
            g g0 = abstractResolvableFuture0.c;
            if(!AbstractResolvableFuture.f.h(abstractResolvableFuture0, g0, g.c)) {
                continue;
            }
            while(g0 != null) {
                Thread thread0 = g0.a;
                if(thread0 != null) {
                    g0.a = null;
                    LockSupport.unpark(thread0);
                }
                g0 = g0.b;
            }
            do {
                c1 = abstractResolvableFuture0.b;
            }
            while(!AbstractResolvableFuture.f.f(abstractResolvableFuture0, c1, c.d));
            while(true) {
                c2 = c0;
                c0 = c1;
                if(c0 == null) {
                    break;
                }
                c1 = c0.c;
                c0.c = c2;
            }
        label_18:
            if(c2 != null) {
                c0 = c2.c;
                runnable0 = c2.a;
                if(runnable0 instanceof e) {
                    abstractResolvableFuture0 = ((e)runnable0).a;
                    if(abstractResolvableFuture0.a == ((e)runnable0)) {
                        Object object0 = AbstractResolvableFuture.e(((e)runnable0).b);
                        if(AbstractResolvableFuture.f.g(abstractResolvableFuture0, ((e)runnable0), object0)) {
                            continue;
                        }
                    }
                }
                else {
                    break;
                }
                c2 = c0;
                goto label_18;
            }
            return;
        }
        AbstractResolvableFuture.c(runnable0, c2.b);
        c2 = c0;
        goto label_18;
    }

    public static void c(Runnable runnable0, Executor executor0) {
        try {
            executor0.execute(runnable0);
        }
        catch(RuntimeException runtimeException0) {
            AbstractResolvableFuture.e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable0 + " with executor " + executor0, runtimeException0);
        }
    }

    @Override
    public final boolean cancel(boolean z) {
        w2.a a0;
        Object object0 = this.a;
        if((object0 == null | object0 instanceof e) != 0) {
            if(AbstractResolvableFuture.d) {
                a0 = new w2.a(z, new CancellationException("Future.cancel() was called."));
            }
            else {
                a0 = z ? w2.a.c : w2.a.d;
            }
            AbstractResolvableFuture abstractResolvableFuture0 = this;
            boolean z1 = false;
            while(true) {
                if(AbstractResolvableFuture.f.g(abstractResolvableFuture0, object0, a0)) {
                    AbstractResolvableFuture.b(abstractResolvableFuture0);
                    if(object0 instanceof e) {
                        ListenableFuture listenableFuture0 = ((e)object0).b;
                        if(!(listenableFuture0 instanceof AbstractResolvableFuture)) {
                            listenableFuture0.cancel(z);
                            return true;
                        }
                        abstractResolvableFuture0 = (AbstractResolvableFuture)listenableFuture0;
                        object0 = abstractResolvableFuture0.a;
                        if((object0 == null | object0 instanceof e) != 0) {
                            z1 = true;
                            continue;
                        }
                    }
                    return true;
                }
                object0 = abstractResolvableFuture0.a;
                if(!(object0 instanceof e)) {
                    break;
                }
            }
            return z1;
        }
        return false;
    }

    public static Object d(Object object0) {
        if(!(object0 instanceof w2.a)) {
            if(object0 instanceof b) {
                throw new ExecutionException(((b)object0).a);
            }
            return object0 == AbstractResolvableFuture.g ? null : object0;
        }
        CancellationException cancellationException0 = new CancellationException("Task was cancelled.");
        cancellationException0.initCause(((w2.a)object0).b);
        throw cancellationException0;
    }

    public static Object e(ListenableFuture listenableFuture0) {
        if(listenableFuture0 instanceof AbstractResolvableFuture) {
            w2.a a0 = ((AbstractResolvableFuture)listenableFuture0).a;
            if(a0 instanceof w2.a && a0.a) {
                return a0.b == null ? w2.a.d : new w2.a(false, a0.b);
            }
            return a0;
        }
        boolean z = listenableFuture0.isCancelled();
        if((!AbstractResolvableFuture.d & z) != 0) {
            return w2.a.d;
        }
        try {
            Object object0 = AbstractResolvableFuture.f(listenableFuture0);
            return object0 == null ? AbstractResolvableFuture.g : object0;
        }
        catch(ExecutionException executionException0) {
            return new b(executionException0.getCause());
        }
        catch(CancellationException cancellationException0) {
            return !z ? new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture0, cancellationException0)) : new w2.a(false, cancellationException0);
        }
        catch(Throwable throwable0) {
            return new b(throwable0);
        }
    }

    public static Object f(ListenableFuture listenableFuture0) {
        Object object0;
        boolean z = false;
        while(true) {
            try {
                object0 = listenableFuture0.get();
                break;
            }
            catch(InterruptedException unused_ex) {
                z = true;
            }
            catch(Throwable throwable0) {
                if(z) {
                    Thread.currentThread().interrupt();
                }
                throw throwable0;
            }
        }
        if(z) {
            Thread.currentThread().interrupt();
        }
        return object0;
    }

    public final void g(g g0) {
        g0.a = null;
    alab1:
        while(true) {
            g g1 = this.c;
            if(g1 == g.c) {
                return;
            }
            g g2 = null;
            while(true) {
                if(g1 == null) {
                    break alab1;
                }
                g g3 = g1.b;
                if(g1.a != null) {
                    g2 = g1;
                }
                else if(g2 == null) {
                    if(AbstractResolvableFuture.f.h(this, g1, g3)) {
                        g1 = g3;
                        continue;
                    }
                    break;
                }
                else {
                    g2.b = g3;
                    if(g2.a == null) {
                        break;
                    }
                }
                g1 = g3;
            }
        }
    }

    @Override
    public final Object get() throws InterruptedException, ExecutionException {
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.a;
        if(((object0 == null ? 0 : 1) & !(object0 instanceof e)) != 0) {
            return AbstractResolvableFuture.d(object0);
        }
        g g0 = this.c;
        g g1 = g.c;
        if(g0 != g1) {
            g g2 = new g();
            while(true) {
                AbstractResolvableFuture.f.R(g2, g0);
                if(AbstractResolvableFuture.f.h(this, g0, g2)) {
                    while(true) {
                        LockSupport.park(this);
                        if(Thread.interrupted()) {
                            break;
                        }
                        Object object1 = this.a;
                        if(((object1 == null ? 0 : 1) & !(object1 instanceof e)) != 0) {
                            return AbstractResolvableFuture.d(object1);
                        }
                    }
                    this.g(g2);
                    throw new InterruptedException();
                }
                g0 = this.c;
                if(g0 == g1) {
                    break;
                }
            }
        }
        return AbstractResolvableFuture.d(this.a);
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) throws InterruptedException, TimeoutException, ExecutionException {
        long v1 = timeUnit0.toNanos(v);
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.a;
        if(((object0 == null ? 0 : 1) & !(object0 instanceof e)) != 0) {
            return AbstractResolvableFuture.d(object0);
        }
        long v2 = v1 <= 0L ? 0L : System.nanoTime() + v1;
        if(v1 >= 1000L) {
            g g0 = this.c;
            g g1 = g.c;
            if(g0 != g1) {
                g g2 = new g();
                while(true) {
                    AbstractResolvableFuture.f.R(g2, g0);
                    if(AbstractResolvableFuture.f.h(this, g0, g2)) {
                        do {
                            LockSupport.parkNanos(this, v1);
                            if(Thread.interrupted()) {
                                this.g(g2);
                                throw new InterruptedException();
                            }
                            Object object1 = this.a;
                            if(((object1 == null ? 0 : 1) & !(object1 instanceof e)) != 0) {
                                return AbstractResolvableFuture.d(object1);
                            }
                            v1 = v2 - System.nanoTime();
                        }
                        while(v1 >= 1000L);
                        this.g(g2);
                        goto label_27;
                    }
                    g0 = this.c;
                    if(g0 == g1) {
                        break;
                    }
                }
            }
            return AbstractResolvableFuture.d(this.a);
        }
    label_27:
        while(v1 > 0L) {
            Object object2 = this.a;
            if(((object2 == null ? 0 : 1) & !(object2 instanceof e)) != 0) {
                return AbstractResolvableFuture.d(object2);
            }
            if(Thread.interrupted()) {
                throw new InterruptedException();
            }
            v1 = v2 - System.nanoTime();
        }
        Locale locale0 = Locale.ROOT;
        String s = timeUnit0.toString().toLowerCase(locale0);
        String s1 = "Waited " + v + " " + timeUnit0.toString().toLowerCase(locale0);
        if(v1 + 1000L < 0L) {
            String s2 = s1 + " (plus ";
            long v3 = timeUnit0.convert(-v1, TimeUnit.NANOSECONDS);
            long v4 = -v1 - timeUnit0.toNanos(v3);
            int v5 = Long.compare(v3, 0L);
            boolean z = v5 == 0 || v4 > 1000L;
            if(v5 > 0) {
                s2 = (z ? s2 + v3 + " " + s + "," : s2 + v3 + " " + s) + " ";
            }
            if(z) {
                s2 = s2 + v4 + " nanoseconds ";
            }
            s1 = s2 + "delay)";
        }
        throw this.isDone() ? new TimeoutException(s1 + " but future completed as timeout expired") : new TimeoutException(s1 + " for " + "jebdyn.dexdec.irsb.Object_a5e85e71@7fb52016[status=PENDING]");
    }

    public void interruptTask() {
    }

    @Override
    public final boolean isCancelled() {
        return this.a instanceof w2.a;
    }

    @Override
    public final boolean isDone() {
        return this.a == null ? 0 : !(this.a instanceof e) & 1;
    }

    @Nullable
    public String pendingToString() {
        Object object0 = this.a;
        if(object0 instanceof e) {
            StringBuilder stringBuilder0 = new StringBuilder("setFuture=[");
            ListenableFuture listenableFuture0 = ((e)object0).b;
            return listenableFuture0 == this ? r0.a.o(stringBuilder0, "this future", "]") : r0.a.o(stringBuilder0, String.valueOf(listenableFuture0), "]");
        }
        return this instanceof ScheduledFuture ? "remaining delay=[" + ((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS) + " ms]" : null;
    }

    public boolean set(@Nullable Object object0) {
        if(object0 == null) {
            object0 = AbstractResolvableFuture.g;
        }
        if(AbstractResolvableFuture.f.g(this, null, object0)) {
            AbstractResolvableFuture.b(this);
            return true;
        }
        return false;
    }

    public boolean setException(Throwable throwable0) {
        throwable0.getClass();
        b b0 = new b(throwable0);
        if(AbstractResolvableFuture.f.g(this, null, b0)) {
            AbstractResolvableFuture.b(this);
            return true;
        }
        return false;
    }

    public boolean setFuture(ListenableFuture listenableFuture0) {
        b b0;
        listenableFuture0.getClass();
        Object object0 = this.a;
        if(object0 == null) {
            if(listenableFuture0.isDone()) {
                Object object1 = AbstractResolvableFuture.e(listenableFuture0);
                if(AbstractResolvableFuture.f.g(this, null, object1)) {
                    AbstractResolvableFuture.b(this);
                    return true;
                }
                return false;
            }
            e e0 = new e(this, listenableFuture0);
            if(AbstractResolvableFuture.f.g(this, null, e0)) {
                try {
                    listenableFuture0.addListener(e0, DirectExecutor.INSTANCE);
                }
                catch(Throwable throwable0) {
                    try {
                        b0 = new b(throwable0);
                    }
                    catch(Throwable unused_ex) {
                        b0 = b.b;
                    }
                    AbstractResolvableFuture.f.g(this, e0, b0);
                }
                return true;
            }
            object0 = this.a;
        }
        if(object0 instanceof w2.a) {
            listenableFuture0.cancel(((w2.a)object0).a);
        }
        return false;
    }

    @Override
    public String toString() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public final boolean wasInterrupted() {
        return this.a instanceof w2.a && ((w2.a)this.a).a;
    }
}

