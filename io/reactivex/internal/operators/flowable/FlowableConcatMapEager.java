package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;
import org.reactivestreams.Subscriber;

public final class FlowableConcatMapEager extends a {
    public final Function b;
    public final int c;
    public final int d;
    public final ErrorMode e;

    public FlowableConcatMapEager(Flowable flowable0, Function function0, int v, int v1, ErrorMode errorMode0) {
        super(flowable0);
        this.b = function0;
        this.c = v;
        this.d = v1;
        this.e = errorMode0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        k0 k00 = new k0(this.c, this.d, this.b, this.e, subscriber0);
        this.source.subscribe(k00);
    }
}

