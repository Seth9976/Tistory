package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Action;
import org.reactivestreams.Subscriber;

public final class FlowableOnBackpressureBuffer extends a {
    public final int b;
    public final boolean c;
    public final boolean d;
    public final Action e;

    public FlowableOnBackpressureBuffer(Flowable flowable0, int v, boolean z, boolean z1, Action action0) {
        super(flowable0);
        this.b = v;
        this.c = z;
        this.d = z1;
        this.e = action0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        f3 f30 = new f3(subscriber0, this.b, this.c, this.d, this.e);
        this.source.subscribe(f30);
    }
}

