package io.reactivex.internal.operators.observable;

import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicReference;

public abstract class q2 extends AtomicReference implements ReplayBuffer {
    public t2 a;
    public int b;

    public q2() {
        t2 t20 = new t2(null);
        this.a = t20;
        this.set(t20);
    }

    public Object a(Object object0) {
        return object0;
    }

    public t2 b() {
        return (t2)this.get();
    }

    public Object c(Object object0) {
        return object0;
    }

    @Override  // io.reactivex.internal.operators.observable.ObservableReplay$ReplayBuffer
    public final void complete() {
        t2 t20 = new t2(this.a(NotificationLite.complete()));
        this.a.set(t20);
        this.a = t20;
        ++this.b;
        this.e();
    }

    public abstract void d();

    public void e() {
        t2 t20 = (t2)this.get();
        if(t20.a != null) {
            t2 t21 = new t2(null);
            t21.lazySet(t20.get());
            this.set(t21);
        }
    }

    @Override  // io.reactivex.internal.operators.observable.ObservableReplay$ReplayBuffer
    public final void error(Throwable throwable0) {
        t2 t20 = new t2(this.a(NotificationLite.error(throwable0)));
        this.a.set(t20);
        this.a = t20;
        ++this.b;
        this.e();
    }

    @Override  // io.reactivex.internal.operators.observable.ObservableReplay$ReplayBuffer
    public final void next(Object object0) {
        t2 t20 = new t2(this.a(object0));
        this.a.set(t20);
        this.a = t20;
        ++this.b;
        this.d();
    }

    @Override  // io.reactivex.internal.operators.observable.ObservableReplay$ReplayBuffer
    public final void replay(r2 r20) {
        if(r20.getAndIncrement() != 0) {
            return;
        }
        int v = 1;
        do {
            t2 t20 = (t2)r20.c;
            if(t20 == null) {
                t20 = this.b();
                r20.c = t20;
            }
            while(true) {
                if(r20.d) {
                    r20.c = null;
                    return;
                }
                t2 t21 = (t2)t20.get();
                if(t21 == null) {
                    break;
                }
                if(NotificationLite.accept(this.c(t21.a), r20.b)) {
                    r20.c = null;
                    return;
                }
                t20 = t21;
            }
            r20.c = t20;
            v = r20.addAndGet(-v);
        }
        while(v != 0);
    }
}

