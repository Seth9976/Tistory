package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;

public final class FlowableTimer extends Flowable {
    public final Scheduler b;
    public final long c;
    public final TimeUnit d;

    public FlowableTimer(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.c = v;
        this.d = timeUnit0;
        this.b = scheduler0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        d6 d60 = new d6(subscriber0);
        subscriber0.onSubscribe(d60);
        DisposableHelper.trySet(d60, this.b.scheduleDirect(d60, this.c, this.d));
    }
}

