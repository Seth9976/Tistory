package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;

public final class ObservableMaterialize extends a {
    public ObservableMaterialize(ObservableSource observableSource0) {
        super(observableSource0);
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        t0 t00 = new t0(observer0, 3);
        this.source.subscribe(t00);
    }
}

