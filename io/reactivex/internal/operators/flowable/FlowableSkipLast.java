package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Subscriber;

public final class FlowableSkipLast extends a {
    public final int b;

    public FlowableSkipLast(Flowable flowable0, int v) {
        super(flowable0);
        this.b = v;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        f5 f50 = new f5(subscriber0, this.b);
        this.source.subscribe(f50);
    }
}

