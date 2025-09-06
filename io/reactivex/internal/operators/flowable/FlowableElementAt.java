package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Subscriber;

public final class FlowableElementAt extends a {
    public final long b;
    public final Object c;
    public final boolean d;

    public FlowableElementAt(Flowable flowable0, long v, Object object0, boolean z) {
        super(flowable0);
        this.b = v;
        this.c = object0;
        this.d = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        p1 p10 = new p1(subscriber0, this.b, this.c, this.d);
        this.source.subscribe(p10);
    }
}

