package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

public final class FlowableWindowBoundarySupplier extends a {
    public final Callable b;
    public final int c;

    public FlowableWindowBoundarySupplier(Flowable flowable0, Callable callable0, int v) {
        super(flowable0);
        this.b = callable0;
        this.c = v;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        o6 o60 = new o6(subscriber0, this.c, this.b);
        this.source.subscribe(o60);
    }
}

