package io.reactivex.internal.operators.observable;

import io.reactivex.Scheduler;
import java.util.concurrent.TimeUnit;

public final class y2 implements BufferSupplier {
    public final int a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;

    public y2(int v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.a = v;
        this.b = v1;
        this.c = timeUnit0;
        this.d = scheduler0;
    }

    @Override  // io.reactivex.internal.operators.observable.ObservableReplay$BufferSupplier
    public final ReplayBuffer call() {
        return new z2(this.a, this.b, this.c, this.d);
    }
}

