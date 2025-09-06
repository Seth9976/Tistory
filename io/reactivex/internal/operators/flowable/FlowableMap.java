package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import org.reactivestreams.Subscriber;

public final class FlowableMap extends a {
    public final Function b;

    public FlowableMap(Flowable flowable0, Function function0) {
        super(flowable0);
        this.b = function0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Function function0 = this.b;
        if(subscriber0 instanceof ConditionalSubscriber) {
            i1 i10 = new i1(((ConditionalSubscriber)subscriber0), function0, 2);
            this.source.subscribe(i10);
            return;
        }
        j1 j10 = new j1(subscriber0, function0, 1);
        this.source.subscribe(j10);
    }
}

