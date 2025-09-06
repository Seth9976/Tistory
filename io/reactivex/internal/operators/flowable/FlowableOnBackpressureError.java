package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Subscriber;

public final class FlowableOnBackpressureError extends a {
    public FlowableOnBackpressureError(Flowable flowable0) {
        super(flowable0);
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        j3 j30 = new j3(subscriber0);
        this.source.subscribe(j30);
    }
}

