package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableBufferBoundary extends a {
    public final Callable b;
    public final Publisher c;
    public final Function d;

    public FlowableBufferBoundary(Flowable flowable0, Publisher publisher0, Function function0, Callable callable0) {
        super(flowable0);
        this.c = publisher0;
        this.d = function0;
        this.b = callable0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        o o0 = new o(subscriber0, this.c, this.d, this.b);
        subscriber0.onSubscribe(o0);
        this.source.subscribe(o0);
    }
}

