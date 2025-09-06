package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;

public final class ObservableTakeLastOne extends a {
    public ObservableTakeLastOne(ObservableSource observableSource0) {
        super(observableSource0);
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        w1 w10 = new w1(observer0, 1);
        this.source.subscribe(w10);
    }
}

