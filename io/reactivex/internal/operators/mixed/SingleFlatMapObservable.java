package io.reactivex.internal.operators.mixed;

import ed.w;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

public final class SingleFlatMapObservable extends Observable {
    public final SingleSource a;
    public final Function b;

    public SingleFlatMapObservable(SingleSource singleSource0, Function function0) {
        this.a = singleSource0;
        this.b = function0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        w w0 = new w(observer0, this.b);
        observer0.onSubscribe(w0);
        this.a.subscribe(w0);
    }
}

