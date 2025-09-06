package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableWindowBoundary extends a {
    public final Publisher b;
    public final int c;

    public FlowableWindowBoundary(Flowable flowable0, Publisher publisher0, int v) {
        super(flowable0);
        this.b = publisher0;
        this.c = v;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        k6 k60 = new k6(subscriber0, this.c);
        subscriber0.onSubscribe(k60);
        k60.f.offer(k6.m);
        k60.a();
        this.b.subscribe(k60.c);
        this.source.subscribe(k60);
    }
}

