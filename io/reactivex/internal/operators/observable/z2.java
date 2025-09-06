package io.reactivex.internal.operators.observable;

import io.reactivex.Scheduler;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;

public final class z2 extends q2 {
    public final Scheduler c;
    public final long d;
    public final TimeUnit e;
    public final int f;

    public z2(int v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.c = scheduler0;
        this.f = v;
        this.d = v1;
        this.e = timeUnit0;
    }

    @Override  // io.reactivex.internal.operators.observable.q2
    public final Object a(Object object0) {
        return new Timed(object0, this.c.now(this.e), this.e);
    }

    @Override  // io.reactivex.internal.operators.observable.q2
    public final t2 b() {
        t2 t22;
        long v = this.c.now(this.e) - this.d;
        t2 t20 = (t2)this.get();
        for(t2 t21 = (t2)t20.get(); true; t21 = (t2)t20.get()) {
            t22 = t20;
            t20 = t21;
            if(t20 == null) {
                break;
            }
            Timed timed0 = (Timed)t20.a;
            if(NotificationLite.isComplete(timed0.value()) || NotificationLite.isError(timed0.value()) || timed0.time() > v) {
                break;
            }
        }
        return t22;
    }

    @Override  // io.reactivex.internal.operators.observable.q2
    public final Object c(Object object0) {
        return ((Timed)object0).value();
    }

    @Override  // io.reactivex.internal.operators.observable.q2
    public final void d() {
        t2 t22;
        long v = this.c.now(this.e) - this.d;
        t2 t20 = (t2)this.get();
        t2 t21 = (t2)t20.get();
        int v1 = 0;
        while(true) {
            t22 = t20;
            t20 = t21;
            if(t20 == null) {
                break;
            }
            int v2 = this.b;
            if(v2 > this.f && v2 > 1) {
                ++v1;
                this.b = v2 - 1;
            }
            else {
                if(((Timed)t20.a).time() > v) {
                    break;
                }
                ++v1;
                --this.b;
            }
            t21 = (t2)t20.get();
        }
        if(v1 != 0) {
            this.set(t22);
        }
    }

    @Override  // io.reactivex.internal.operators.observable.q2
    public final void e() {
        t2 t22;
        long v = this.c.now(this.e) - this.d;
        t2 t20 = (t2)this.get();
        t2 t21 = (t2)t20.get();
        int v1 = 0;
        while(true) {
            t22 = t20;
            t20 = t21;
            if(t20 == null || this.b <= 1 || ((Timed)t20.a).time() > v) {
                break;
            }
            ++v1;
            --this.b;
            t21 = (t2)t20.get();
        }
        if(v1 != 0) {
            this.set(t22);
        }
    }
}

