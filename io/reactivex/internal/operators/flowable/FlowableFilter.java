package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import org.reactivestreams.Subscriber;

public final class FlowableFilter extends a {
    public final Predicate b;

    public FlowableFilter(Flowable flowable0, Predicate predicate0) {
        super(flowable0);
        this.b = predicate0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Predicate predicate0 = this.b;
        if(subscriber0 instanceof ConditionalSubscriber) {
            i1 i10 = new i1(((ConditionalSubscriber)subscriber0), predicate0, 1);
            this.source.subscribe(i10);
            return;
        }
        s1 s10 = new s1(subscriber0, predicate0);
        this.source.subscribe(s10);
    }
}

