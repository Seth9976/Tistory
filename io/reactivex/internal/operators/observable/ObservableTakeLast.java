package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;

public final class ObservableTakeLast extends a {
    public final int a;

    public ObservableTakeLast(ObservableSource observableSource0, int v) {
        super(observableSource0);
        this.a = v;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        x3 x30 = new x3(observer0, this.a);
        this.source.subscribe(x30);
    }
}

