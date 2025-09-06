package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Predicate;
import org.reactivestreams.Subscriber;

public final class FlowableTakeWhile extends a {
    public final Predicate b;

    public FlowableTakeWhile(Flowable flowable0, Predicate predicate0) {
        super(flowable0);
        this.b = predicate0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        i5 i50 = new i5(subscriber0, this.b, 2);
        this.source.subscribe(i50);
    }
}

