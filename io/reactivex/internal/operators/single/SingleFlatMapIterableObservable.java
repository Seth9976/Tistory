package io.reactivex.internal.operators.single;

import gd.q;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

public final class SingleFlatMapIterableObservable extends Observable {
    public final SingleSource a;
    public final Function b;

    public SingleFlatMapIterableObservable(SingleSource singleSource0, Function function0) {
        this.a = singleSource0;
        this.b = function0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        q q0 = new q(observer0, this.b);
        this.a.subscribe(q0);
    }
}

