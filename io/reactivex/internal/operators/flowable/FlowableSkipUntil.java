package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableSkipUntil extends a {
    public final Publisher b;

    public FlowableSkipUntil(Flowable flowable0, Publisher publisher0) {
        super(flowable0);
        this.b = publisher0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        h5 h50 = new h5(subscriber0);
        subscriber0.onSubscribe(h50);
        this.b.subscribe(h50.d);
        this.source.subscribe(h50);
    }
}

