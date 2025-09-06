package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Function;

public final class ObservableOnErrorReturn extends a {
    public final Function a;

    public ObservableOnErrorReturn(ObservableSource observableSource0, Function function0) {
        super(observableSource0);
        this.a = function0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        h1 h10 = new h1(observer0, this.a, 1);
        this.source.subscribe(h10);
    }
}

