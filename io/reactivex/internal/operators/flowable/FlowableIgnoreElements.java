package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Subscriber;

public final class FlowableIgnoreElements extends a {
    public FlowableIgnoreElements(Flowable flowable0) {
        super(flowable0);
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        k2 k20 = new k2(subscriber0);
        this.source.subscribe(k20);
    }
}

