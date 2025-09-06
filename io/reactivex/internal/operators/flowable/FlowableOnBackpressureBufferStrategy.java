package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.Flowable;
import io.reactivex.functions.Action;
import org.reactivestreams.Subscriber;

public final class FlowableOnBackpressureBufferStrategy extends a {
    public final long b;
    public final Action c;
    public final BackpressureOverflowStrategy d;

    public FlowableOnBackpressureBufferStrategy(Flowable flowable0, long v, Action action0, BackpressureOverflowStrategy backpressureOverflowStrategy0) {
        super(flowable0);
        this.b = v;
        this.c = action0;
        this.d = backpressureOverflowStrategy0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        h3 h30 = new h3(subscriber0, this.c, this.d, this.b);
        this.source.subscribe(h30);
    }
}

