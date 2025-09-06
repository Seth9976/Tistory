package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Subscriber;

public final class FlowableOnBackpressureLatest extends a {
    public FlowableOnBackpressureLatest(Flowable flowable0) {
        super(flowable0);
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        a3 a30 = new a3(subscriber0, 1);
        this.source.subscribe(a30);
    }
}

