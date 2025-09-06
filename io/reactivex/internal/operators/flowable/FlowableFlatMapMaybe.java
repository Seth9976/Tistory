package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import org.reactivestreams.Subscriber;

public final class FlowableFlatMapMaybe extends a {
    public final Function b;
    public final boolean c;
    public final int d;

    public FlowableFlatMapMaybe(Flowable flowable0, Function function0, boolean z, int v) {
        super(flowable0);
        this.b = function0;
        this.c = z;
        this.d = v;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        y1 y10 = new y1(subscriber0, this.b, this.c, this.d, 0);
        this.source.subscribe(y10);
    }
}

