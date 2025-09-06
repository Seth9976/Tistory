package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.BiFunction;
import org.reactivestreams.Subscriber;

public final class FlowableReduce extends a {
    public final BiFunction b;

    public FlowableReduce(Flowable flowable0, BiFunction biFunction0) {
        super(flowable0);
        this.b = biFunction0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        w3 w30 = new w3(subscriber0, this.b);
        this.source.subscribe(w30);
    }
}

