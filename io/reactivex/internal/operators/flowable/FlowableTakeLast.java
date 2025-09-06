package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Subscriber;

public final class FlowableTakeLast extends a {
    public final int b;

    public FlowableTakeLast(Flowable flowable0, int v) {
        super(flowable0);
        this.b = v;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        p5 p50 = new p5(subscriber0, this.b);
        this.source.subscribe(p50);
    }
}

