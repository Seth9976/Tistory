package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Subscriber;

public final class FlowableSkip extends a {
    public final long b;

    public FlowableSkip(Flowable flowable0, long v) {
        super(flowable0);
        this.b = v;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        e5 e50 = new e5(subscriber0, this.b);
        this.source.subscribe(e50);
    }
}

