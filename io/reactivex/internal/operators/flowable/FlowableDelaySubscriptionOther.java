package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableDelaySubscriptionOther extends Flowable {
    public final Publisher b;
    public final Publisher c;

    public FlowableDelaySubscriptionOther(Publisher publisher0, Publisher publisher1) {
        this.b = publisher0;
        this.c = publisher1;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        d1 d10 = new d1(this.b, subscriber0);
        subscriber0.onSubscribe(d10);
        this.c.subscribe(d10.c);
    }
}

