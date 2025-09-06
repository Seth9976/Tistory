package io.reactivex.internal.operators.single;

import gd.e;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;

public final class SingleDelay extends Single {
    public final SingleSource a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final boolean e;

    public SingleDelay(SingleSource singleSource0, long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        this.a = singleSource0;
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler0;
        this.e = z;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        SequentialDisposable sequentialDisposable0 = new SequentialDisposable();
        singleObserver0.onSubscribe(sequentialDisposable0);
        e e0 = new e(this, sequentialDisposable0, singleObserver0);
        this.a.subscribe(e0);
    }
}

