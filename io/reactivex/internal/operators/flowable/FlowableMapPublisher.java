package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableMapPublisher extends Flowable {
    public final Publisher b;
    public final Function c;

    public FlowableMapPublisher(Publisher publisher0, Function function0) {
        this.b = publisher0;
        this.c = function0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        j1 j10 = new j1(subscriber0, this.c, 1);
        this.b.subscribe(j10);
    }
}

