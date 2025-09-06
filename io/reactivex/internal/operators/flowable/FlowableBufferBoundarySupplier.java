package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

public final class FlowableBufferBoundarySupplier extends a {
    public final Callable b;
    public final Callable c;

    public FlowableBufferBoundarySupplier(Flowable flowable0, Callable callable0, Callable callable1) {
        super(flowable0);
        this.b = callable0;
        this.c = callable1;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        r r0 = new r(new SerializedSubscriber(subscriber0), this.c, this.b);
        this.source.subscribe(r0);
    }
}

