package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import org.reactivestreams.Subscriber;

public final class FlowableSubscribeOn extends a {
    public final Scheduler b;
    public final boolean c;

    public FlowableSubscribeOn(Flowable flowable0, Scheduler scheduler0, boolean z) {
        super(flowable0);
        this.b = scheduler0;
        this.c = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Worker scheduler$Worker0 = this.b.createWorker();
        k5 k50 = new k5(subscriber0, scheduler$Worker0, this.source, this.c);
        subscriber0.onSubscribe(k50);
        scheduler$Worker0.schedule(k50);
    }
}

