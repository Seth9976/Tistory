package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.BiFunction;

public final class ObservableScan extends a {
    public final BiFunction a;

    public ObservableScan(ObservableSource observableSource0, BiFunction biFunction0) {
        super(observableSource0);
        this.a = biFunction0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        m3 m30 = new m3(observer0, this.a);
        this.source.subscribe(m30);
    }
}

