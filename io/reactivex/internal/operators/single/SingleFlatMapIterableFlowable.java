package io.reactivex.internal.operators.single;

import gd.p;
import io.reactivex.Flowable;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import org.reactivestreams.Subscriber;

public final class SingleFlatMapIterableFlowable extends Flowable {
    public final SingleSource b;
    public final Function c;

    public SingleFlatMapIterableFlowable(SingleSource singleSource0, Function function0) {
        this.b = singleSource0;
        this.c = function0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        p p0 = new p(subscriber0, this.c);
        this.b.subscribe(p0);
    }
}

