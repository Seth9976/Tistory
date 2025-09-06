package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Subscriber;

public final class FlowableSingle extends a {
    public final Object b;
    public final boolean c;

    public FlowableSingle(Flowable flowable0, Object object0, boolean z) {
        super(flowable0);
        this.b = object0;
        this.c = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        d5 d50 = new d5(subscriber0, this.b, this.c);
        this.source.subscribe(d50);
    }
}

