package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class r2 implements Callable {
    public final int a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final Object e;

    public r2(Object object0, long v, TimeUnit timeUnit0, Scheduler scheduler0, int v1) {
        this.a = v1;
        this.e = object0;
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler0;
        super();
    }

    @Override
    public final Object call() {
        return this.a != 0 ? ((Observable)this.e).replay(this.b, this.c, this.d) : ((Flowable)this.e).replay(this.b, this.c, this.d);
    }
}

