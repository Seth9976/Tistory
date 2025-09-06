package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import org.reactivestreams.Subscriber;

public final class FlowableDoAfterNext extends a {
    public final Consumer b;

    public FlowableDoAfterNext(Flowable flowable0, Consumer consumer0) {
        super(flowable0);
        this.b = consumer0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Consumer consumer0 = this.b;
        if(subscriber0 instanceof ConditionalSubscriber) {
            i1 i10 = new i1(((ConditionalSubscriber)subscriber0), consumer0, 0);
            this.source.subscribe(i10);
            return;
        }
        j1 j10 = new j1(subscriber0, consumer0, 0);
        this.source.subscribe(j10);
    }
}

