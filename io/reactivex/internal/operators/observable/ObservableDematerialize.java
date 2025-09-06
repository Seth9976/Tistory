package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Function;

public final class ObservableDematerialize extends a {
    public final Function a;

    public ObservableDematerialize(ObservableSource observableSource0, Function function0) {
        super(observableSource0);
        this.a = function0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        s0 s00 = new s0(observer0, this.a);
        this.source.subscribe(s00);
    }
}

