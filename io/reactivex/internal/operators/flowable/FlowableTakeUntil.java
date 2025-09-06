package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableTakeUntil extends a {
    public final Publisher b;

    public FlowableTakeUntil(Flowable flowable0, Publisher publisher0) {
        super(flowable0);
        this.b = publisher0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        s5 s50 = new s5(subscriber0);
        subscriber0.onSubscribe(s50);
        this.b.subscribe(s50.e);
        this.source.subscribe(s50);
    }
}

