package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Subscriber;

public final class FlowableLimit extends a {
    public final long b;

    public FlowableLimit(Flowable flowable0, long v) {
        super(flowable0);
        this.b = v;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        x2 x20 = new x2(subscriber0, this.b);
        this.source.subscribe(x20);
    }
}

