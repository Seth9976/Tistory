package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import org.reactivestreams.Subscriber;

public final class FlowableFlatMapCompletable extends a {
    public final Function b;
    public final int c;
    public final boolean d;

    public FlowableFlatMapCompletable(Flowable flowable0, Function function0, boolean z, int v) {
        super(flowable0);
        this.b = function0;
        this.d = z;
        this.c = v;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        v1 v10 = new v1(this.c, this.b, subscriber0, this.d);
        this.source.subscribe(v10);
    }
}

