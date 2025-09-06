package androidx.work.impl.utils.futures;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;
import g.b;
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

@RestrictTo({Scope.LIBRARY_GROUP})
public abstract class AbstractFuture implements ListenableFuture {
    public volatile Object a;
    public volatile d b;
    public volatile h c;
    public static final boolean d;
    public static final Logger e;
    public static final b f;
    public static final Object g;

    static {
        e e0;
        AbstractFuture.d = false;
        AbstractFuture.e = Logger.getLogger("androidx.work.impl.utils.futures.AbstractFuture");
        try {
            e0 = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "a"));
            throwable0 = null;
        }
        catch(Throwable throwable0) {
            e0 = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        AbstractFuture.f = e0;
        if(throwable0 != null) {
            AbstractFuture.e.log(Level.SEVERE, "SafeAtomicHelper is broken!", throwable0);
        }
        AbstractFuture.g = new Object();
    }

    public final void a(StringBuilder stringBuilder0) {
        try {
            Object object0 = AbstractFuture.f(this);
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
        d d0 = this.b;
        d d1 = d.d;
        if(d0 != d1) {
            d d2 = new d(runnable0, executor0);
            while(true) {
                d2.c = d0;
                if(AbstractFuture.f.d(this, d0, d2)) {
                    return;
                }
                d0 = this.b;
                if(d0 == d1) {
                    break;
                }
            }
        }
        AbstractFuture.c(runnable0, executor0);
    }

    public void afterDone() {
    }

    public static void b(AbstractFuture abstractFuture0) {
        Runnable runnable0;
        d d2;
        d d1;
        d d0 = null;
        while(true) {
            h h0 = abstractFuture0.c;
            if(!AbstractFuture.f.f(abstractFuture0, h0, h.c)) {
                continue;
            }
            while(h0 != null) {
                Thread thread0 = h0.a;
                if(thread0 != null) {
                    h0.a = null;
                    LockSupport.unpark(thread0);
                }
                h0 = h0.b;
            }
            do {
                d1 = abstractFuture0.b;
            }
            while(!AbstractFuture.f.d(abstractFuture0, d1, d.d));
            while(true) {
                d2 = d0;
                d0 = d1;
                if(d0 == null) {
                    break;
                }
                d1 = d0.c;
                d0.c = d2;
            }
        label_18:
            if(d2 != null) {
                d0 = d2.c;
                runnable0 = d2.a;
                if(runnable0 instanceof f) {
                    abstractFuture0 = ((f)runnable0).a;
                    if(abstractFuture0.a == ((f)runnable0)) {
                        Object object0 = AbstractFuture.e(((f)runnable0).b);
                        if(AbstractFuture.f.e(abstractFuture0, ((f)runnable0), object0)) {
                            continue;
                        }
                    }
                }
                else {
                    break;
                }
                d2 = d0;
                goto label_18;
            }
            return;
        }
        AbstractFuture.c(runnable0, d2.b);
        d2 = d0;
        goto label_18;
    }

    public static void c(Runnable runnable0, Executor executor0) {
        try {
            executor0.execute(runnable0);
        }
        catch(RuntimeException runtimeException0) {
            AbstractFuture.e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable0 + " with executor " + executor0, runtimeException0);
        }
    }

    @Override
    public final boolean cancel(boolean z) {
        a a0;
        Object object0 = this.a;
        if((object0 == null | object0 instanceof f) != 0) {
            if(AbstractFuture.d) {
                a0 = new a(z, new CancellationException("Future.cancel() was called."));
            }
            else {
                a0 = z ? a.c : a.d;
            }
            AbstractFuture abstractFuture0 = this;
            boolean z1 = false;
            while(true) {
                if(AbstractFuture.f.e(abstractFuture0, object0, a0)) {
                    AbstractFuture.b(abstractFuture0);
                    if(object0 instanceof f) {
                        ListenableFuture listenableFuture0 = ((f)object0).b;
                        if(!(listenableFuture0 instanceof AbstractFuture)) {
                            listenableFuture0.cancel(z);
                            return true;
                        }
                        abstractFuture0 = (AbstractFuture)listenableFuture0;
                        object0 = abstractFuture0.a;
                        if((object0 == null | object0 instanceof f) != 0) {
                            z1 = true;
                            continue;
                        }
                    }
                    return true;
                }
                object0 = abstractFuture0.a;
                if(!(object0 instanceof f)) {
                    break;
                }
            }
            return z1;
        }
        return false;
    }

    public static Object d(Object object0) {
        if(!(object0 instanceof a)) {
            if(object0 instanceof c) {
                throw new ExecutionException(((c)object0).a);
            }
            return object0 == AbstractFuture.g ? null : object0;
        }
        CancellationException cancellationException0 = new CancellationException("Task was cancelled.");
        cancellationException0.initCause(((a)object0).b);
        throw cancellationException0;
    }

    public static Object e(ListenableFuture listenableFuture0) {
        if(listenableFuture0 instanceof AbstractFuture) {
            a a0 = ((AbstractFuture)listenableFuture0).a;
            if(a0 instanceof a && a0.a) {
                return a0.b == null ? a.d : new a(false, a0.b);
            }
            return a0;
        }
        boolean z = listenableFuture0.isCancelled();
        if((!AbstractFuture.d & z) != 0) {
            return a.d;
        }
        try {
            Object object0 = AbstractFuture.f(listenableFuture0);
            return object0 == null ? AbstractFuture.g : object0;
        }
        catch(ExecutionException executionException0) {
            return new c(executionException0.getCause());
        }
        catch(CancellationException cancellationException0) {
            return !z ? new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture0, cancellationException0)) : new a(false, cancellationException0);
        }
        catch(Throwable throwable0) {
            return new c(throwable0);
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

    public final void g(h h0) {
        h0.a = null;
    alab1:
        while(true) {
            h h1 = this.c;
            if(h1 == h.c) {
                return;
            }
            h h2 = null;
            while(true) {
                if(h1 == null) {
                    break alab1;
                }
                h h3 = h1.b;
                if(h1.a != null) {
                    h2 = h1;
                }
                else if(h2 == null) {
                    if(AbstractFuture.f.f(this, h1, h3)) {
                        h1 = h3;
                        continue;
                    }
                    break;
                }
                else {
                    h2.b = h3;
                    if(h2.a == null) {
                        break;
                    }
                }
                h1 = h3;
            }
        }
    }

    @Override
    public final Object get() throws InterruptedException, ExecutionException {
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.a;
        if(((object0 == null ? 0 : 1) & !(object0 instanceof f)) != 0) {
            return AbstractFuture.d(object0);
        }
        h h0 = this.c;
        h h1 = h.c;
        if(h0 != h1) {
            h h2 = new h();
            while(true) {
                AbstractFuture.f.x(h2, h0);
                if(AbstractFuture.f.f(this, h0, h2)) {
                    while(true) {
                        LockSupport.park(this);
                        if(Thread.interrupted()) {
                            break;
                        }
                        Object object1 = this.a;
                        if(((object1 == null ? 0 : 1) & !(object1 instanceof f)) != 0) {
                            return AbstractFuture.d(object1);
                        }
                    }
                    this.g(h2);
                    throw new InterruptedException();
                }
                h0 = this.c;
                if(h0 == h1) {
                    break;
                }
            }
        }
        return AbstractFuture.d(this.a);
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) throws InterruptedException, TimeoutException, ExecutionException {
        long v1 = timeUnit0.toNanos(v);
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.a;
        if(((object0 == null ? 0 : 1) & !(object0 instanceof f)) != 0) {
            return AbstractFuture.d(object0);
        }
        long v2 = v1 <= 0L ? 0L : System.nanoTime() + v1;
        if(v1 >= 1000L) {
            h h0 = this.c;
            h h1 = h.c;
            if(h0 != h1) {
                h h2 = new h();
                while(true) {
                    AbstractFuture.f.x(h2, h0);
                    if(AbstractFuture.f.f(this, h0, h2)) {
                        do {
                            LockSupport.parkNanos(this, v1);
                            if(Thread.interrupted()) {
                                this.g(h2);
                                throw new InterruptedException();
                            }
                            Object object1 = this.a;
                            if(((object1 == null ? 0 : 1) & !(object1 instanceof f)) != 0) {
                                return AbstractFuture.d(object1);
                            }
                            v1 = v2 - System.nanoTime();
                        }
                        while(v1 >= 1000L);
                        this.g(h2);
                        goto label_27;
                    }
                    h0 = this.c;
                    if(h0 == h1) {
                        break;
                    }
                }
            }
            return AbstractFuture.d(this.a);
        }
    label_27:
        while(v1 > 0L) {
            Object object2 = this.a;
            if(((object2 == null ? 0 : 1) & !(object2 instanceof f)) != 0) {
                return AbstractFuture.d(object2);
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
        throw this.isDone() ? new TimeoutException(s1 + " but future completed as timeout expired") : new TimeoutException(s1 + " for " + "jebdyn.dexdec.irsb.Object_e2416401@24560149[status=PENDING]");
    }

    public void interruptTask() {
    }

    @Override
    public final boolean isCancelled() {
        return this.a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.a == null ? 0 : !(this.a instanceof f) & 1;
    }

    @Nullable
    public String pendingToString() {
        Object object0 = this.a;
        if(object0 instanceof f) {
            StringBuilder stringBuilder0 = new StringBuilder("setFuture=[");
            ListenableFuture listenableFuture0 = ((f)object0).b;
            return listenableFuture0 == this ? r0.a.o(stringBuilder0, "this future", "]") : r0.a.o(stringBuilder0, String.valueOf(listenableFuture0), "]");
        }
        return this instanceof ScheduledFuture ? "remaining delay=[" + ((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS) + " ms]" : null;
    }

    public boolean set(@Nullable Object object0) {
        if(object0 == null) {
            object0 = AbstractFuture.g;
        }
        if(AbstractFuture.f.e(this, null, object0)) {
            AbstractFuture.b(this);
            return true;
        }
        return false;
    }

    public boolean setException(Throwable throwable0) {
        throwable0.getClass();
        c c0 = new c(throwable0);
        if(AbstractFuture.f.e(this, null, c0)) {
            AbstractFuture.b(this);
            return true;
        }
        return false;
    }

    public boolean setFuture(ListenableFuture listenableFuture0) {
        c c0;
        listenableFuture0.getClass();
        Object object0 = this.a;
        if(object0 == null) {
            if(listenableFuture0.isDone()) {
                Object object1 = AbstractFuture.e(listenableFuture0);
                if(AbstractFuture.f.e(this, null, object1)) {
                    AbstractFuture.b(this);
                    return true;
                }
                return false;
            }
            f f0 = new f(this, listenableFuture0);
            if(AbstractFuture.f.e(this, null, f0)) {
                try {
                    listenableFuture0.addListener(f0, i.a);
                }
                catch(Throwable throwable0) {
                    try {
                        c0 = new c(throwable0);
                    }
                    catch(Throwable unused_ex) {
                        c0 = c.b;
                    }
                    AbstractFuture.f.e(this, f0, c0);
                }
                return true;
            }
            object0 = this.a;
        }
        if(object0 instanceof a) {
            listenableFuture0.cancel(((a)object0).a);
        }
        return false;
    }

    @Override
    public String toString() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public final boolean wasInterrupted() {
        return this.a instanceof a && ((a)this.a).a;
    }
}

