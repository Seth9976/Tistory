package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableSwitchIfEmpty extends a {
    public final Publisher b;

    public FlowableSwitchIfEmpty(Flowable flowable0, Publisher publisher0) {
        super(flowable0);
        this.b = publisher0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        l5 l50 = new l5(this.b, subscriber0);
        subscriber0.onSubscribe(l50.c);
        this.source.subscribe(l50);
    }
}

