package io.reactivex.internal.operators.single;

import gd.s;
import io.reactivex.Flowable;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import org.reactivestreams.Subscriber;

public final class SingleFlatMapPublisher extends Flowable {
    public final SingleSource b;
    public final Function c;

    public SingleFlatMapPublisher(SingleSource singleSource0, Function function0) {
        this.b = singleSource0;
        this.c = function0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        s s0 = new s(subscriber0, this.c);
        this.b.subscribe(s0);
    }
}

