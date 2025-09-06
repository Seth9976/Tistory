package io.reactivex.internal.operators.mixed;

import ed.e;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;
import org.reactivestreams.Subscriber;

public final class FlowableConcatMapSingle extends Flowable {
    public final Flowable b;
    public final Function c;
    public final ErrorMode d;
    public final int e;

    public FlowableConcatMapSingle(Flowable flowable0, Function function0, ErrorMode errorMode0, int v) {
        this.b = flowable0;
        this.c = function0;
        this.d = errorMode0;
        this.e = v;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        e e0 = new e(this.e, 1, this.c, this.d, subscriber0);
        this.b.subscribe(e0);
    }
}

