package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class m2 implements Callable {
    public final int a;
    public final int b;
    public final long c;
    public final TimeUnit d;
    public final Scheduler e;
    public final Object f;

    public m2(Object object0, int v, long v1, TimeUnit timeUnit0, Scheduler scheduler0, int v2) {
        this.a = v2;
        this.f = object0;
        this.b = v;
        this.c = v1;
        this.d = timeUnit0;
        this.e = scheduler0;
        super();
    }

    @Override
    public final Object call() {
        return this.a != 0 ? ((Observable)this.f).replay(this.b, this.c, this.d, this.e) : ((Flowable)this.f).replay(this.b, this.c, this.d, this.e);
    }
}

