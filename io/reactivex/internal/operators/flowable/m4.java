package io.reactivex.internal.operators.flowable;

import io.reactivex.Scheduler;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;

public final class m4 extends d4 {
    public final Scheduler d;
    public final long e;
    public final TimeUnit f;
    public final int g;

    public m4(int v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.d = scheduler0;
        this.g = v;
        this.e = v1;
        this.f = timeUnit0;
    }

    @Override  // io.reactivex.internal.operators.flowable.d4
    public final Object a(Object object0) {
        return new Timed(object0, this.d.now(this.f), this.f);
    }

    @Override  // io.reactivex.internal.operators.flowable.d4
    public final h4 b() {
        h4 h42;
        long v = this.d.now(this.f) - this.e;
        h4 h40 = (h4)this.get();
        for(h4 h41 = (h4)h40.get(); true; h41 = (h4)h40.get()) {
            h42 = h40;
            h40 = h41;
            if(h40 == null) {
                break;
            }
            Timed timed0 = (Timed)h40.a;
            if(NotificationLite.isComplete(timed0.value()) || NotificationLite.isError(timed0.value()) || timed0.time() > v) {
                break;
            }
        }
        return h42;
    }

    @Override  // io.reactivex.internal.operators.flowable.d4
    public final Object c(Object object0) {
        return ((Timed)object0).value();
    }

    @Override  // io.reactivex.internal.operators.flowable.d4
    public final void d() {
        h4 h42;
        long v = this.d.now(this.f) - this.e;
        h4 h40 = (h4)this.get();
        h4 h41 = (h4)h40.get();
        int v1 = 0;
        while(true) {
            h42 = h40;
            h40 = h41;
            if(h40 == null) {
                break;
            }
            int v2 = this.b;
            if(v2 > this.g && v2 > 1) {
                ++v1;
                this.b = v2 - 1;
            }
            else {
                if(((Timed)h40.a).time() > v) {
                    break;
                }
                ++v1;
                --this.b;
            }
            h41 = (h4)h40.get();
        }
        if(v1 != 0) {
            this.set(h42);
        }
    }

    @Override  // io.reactivex.internal.operators.flowable.d4
    public final void e() {
        h4 h42;
        long v = this.d.now(this.f) - this.e;
        h4 h40 = (h4)this.get();
        h4 h41 = (h4)h40.get();
        int v1 = 0;
        while(true) {
            h42 = h40;
            h40 = h41;
            if(h40 == null || this.b <= 1 || ((Timed)h40.a).time() > v) {
                break;
            }
            ++v1;
            --this.b;
            h41 = (h4)h40.get();
        }
        if(v1 != 0) {
            this.set(h42);
        }
    }
}

