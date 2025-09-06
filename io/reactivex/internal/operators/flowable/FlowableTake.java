package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Subscriber;

public final class FlowableTake extends a {
    public final long b;

    public FlowableTake(Flowable flowable0, long v) {
        super(flowable0);
        this.b = v;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        o5 o50 = new o5(subscriber0, this.b);
        this.source.subscribe(o50);
    }
}

