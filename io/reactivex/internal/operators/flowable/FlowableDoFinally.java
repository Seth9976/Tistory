package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import org.reactivestreams.Subscriber;

public final class FlowableDoFinally extends a {
    public final Action b;

    public FlowableDoFinally(Flowable flowable0, Action action0) {
        super(flowable0);
        this.b = action0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Action action0 = this.b;
        if(subscriber0 instanceof ConditionalSubscriber) {
            k1 k10 = new k1(((ConditionalSubscriber)subscriber0), action0);
            this.source.subscribe(k10);
            return;
        }
        l1 l10 = new l1(subscriber0, action0);
        this.source.subscribe(l10);
    }
}

