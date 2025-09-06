package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import org.reactivestreams.Subscriber;

public final class FlowableDistinctUntilChanged extends a {
    public final Function b;
    public final BiPredicate c;

    public FlowableDistinctUntilChanged(Flowable flowable0, Function function0, BiPredicate biPredicate0) {
        super(flowable0);
        this.b = function0;
        this.c = biPredicate0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        BiPredicate biPredicate0 = this.c;
        Function function0 = this.b;
        if(subscriber0 instanceof ConditionalSubscriber) {
            g1 g10 = new g1(((ConditionalSubscriber)subscriber0), function0, biPredicate0);
            this.source.subscribe(g10);
            return;
        }
        h1 h10 = new h1(subscriber0, function0, biPredicate0);
        this.source.subscribe(h10);
    }
}

