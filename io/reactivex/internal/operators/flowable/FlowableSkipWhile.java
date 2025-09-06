package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Predicate;
import org.reactivestreams.Subscriber;

public final class FlowableSkipWhile extends a {
    public final Predicate b;

    public FlowableSkipWhile(Flowable flowable0, Predicate predicate0) {
        super(flowable0);
        this.b = predicate0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        i5 i50 = new i5(subscriber0, this.b, 0);
        this.source.subscribe(i50);
    }
}

