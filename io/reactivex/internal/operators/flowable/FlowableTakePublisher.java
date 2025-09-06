package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableTakePublisher extends Flowable {
    public final Publisher b;
    public final long c;

    public FlowableTakePublisher(Publisher publisher0, long v) {
        this.b = publisher0;
        this.c = v;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        o5 o50 = new o5(subscriber0, this.c);
        this.b.subscribe(o50);
    }
}

