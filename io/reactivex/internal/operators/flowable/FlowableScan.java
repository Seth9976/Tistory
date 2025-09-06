package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.BiFunction;
import org.reactivestreams.Subscriber;

public final class FlowableScan extends a {
    public final BiFunction b;

    public FlowableScan(Flowable flowable0, BiFunction biFunction0) {
        super(flowable0);
        this.b = biFunction0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        y4 y40 = new y4(subscriber0, this.b);
        this.source.subscribe(y40);
    }
}

