package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import org.reactivestreams.Subscriber;

public final class FlowableUnsubscribeOn extends a {
    public final Scheduler b;

    public FlowableUnsubscribeOn(Flowable flowable0, Scheduler scheduler0) {
        super(flowable0);
        this.b = scheduler0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        f6 f60 = new f6(subscriber0, this.b);
        this.source.subscribe(f60);
    }
}

