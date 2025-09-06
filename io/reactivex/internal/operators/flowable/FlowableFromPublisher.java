package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableFromPublisher extends Flowable {
    public final Publisher b;

    public FlowableFromPublisher(Publisher publisher0) {
        this.b = publisher0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        this.b.subscribe(subscriber0);
    }
}

