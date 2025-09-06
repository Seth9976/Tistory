package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;

public final class ObservableCount extends a {
    public ObservableCount(ObservableSource observableSource0) {
        super(observableSource0);
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        i0 i00 = new i0(observer0, 0);
        this.source.subscribe(i00);
    }
}

