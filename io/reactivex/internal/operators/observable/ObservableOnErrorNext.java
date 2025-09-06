package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Function;

public final class ObservableOnErrorNext extends a {
    public final Function a;
    public final boolean b;

    public ObservableOnErrorNext(ObservableSource observableSource0, Function function0, boolean z) {
        super(observableSource0);
        this.a = function0;
        this.b = z;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        c2 c20 = new c2(observer0, this.a, this.b);
        observer0.onSubscribe(c20.d);
        this.source.subscribe(c20);
    }
}

