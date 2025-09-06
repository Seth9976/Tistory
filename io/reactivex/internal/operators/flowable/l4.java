package io.reactivex.internal.operators.flowable;

import io.reactivex.Scheduler;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class l4 implements Callable {
    public final int a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;

    public l4(int v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.a = v;
        this.b = v1;
        this.c = timeUnit0;
        this.d = scheduler0;
    }

    @Override
    public final Object call() {
        return new m4(this.a, this.b, this.c, this.d);
    }
}

