package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.SingleSource;
import org.reactivestreams.Subscriber;

public final class FlowableConcatWithSingle extends a {
    public final SingleSource b;

    public FlowableConcatWithSingle(Flowable flowable0, SingleSource singleSource0) {
        super(flowable0);
        this.b = singleSource0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        n0 n00 = new n0(subscriber0, this.b);
        this.source.subscribe(n00);
    }
}

