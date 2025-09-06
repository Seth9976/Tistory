package io.reactivex.internal.operators.flowable;

import fd.l;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import org.reactivestreams.Subscriber;

public final class FlowableDematerialize extends a {
    public final Function b;

    public FlowableDematerialize(Flowable flowable0, Function function0) {
        super(flowable0);
        this.b = function0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        l l0 = new l(subscriber0, this.b, 1);
        this.source.subscribe(l0);
    }
}

