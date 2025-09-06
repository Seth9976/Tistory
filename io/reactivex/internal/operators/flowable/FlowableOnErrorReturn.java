package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import org.reactivestreams.Subscriber;

public final class FlowableOnErrorReturn extends a {
    public final Function b;

    public FlowableOnErrorReturn(Flowable flowable0, Function function0) {
        super(flowable0);
        this.b = function0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        l3 l30 = new l3(subscriber0, this.b);
        this.source.subscribe(l30);
    }
}

