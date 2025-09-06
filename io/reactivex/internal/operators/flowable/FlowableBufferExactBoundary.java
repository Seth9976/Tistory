package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableBufferExactBoundary extends a {
    public final Publisher b;
    public final Callable c;

    public FlowableBufferExactBoundary(Flowable flowable0, Publisher publisher0, Callable callable0) {
        super(flowable0);
        this.b = publisher0;
        this.c = callable0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        r r0 = new r(new SerializedSubscriber(subscriber0), this.c, this.b);
        this.source.subscribe(r0);
    }
}

