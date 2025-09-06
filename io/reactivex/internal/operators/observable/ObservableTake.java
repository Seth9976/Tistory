package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;

public final class ObservableTake extends a {
    public final long a;

    public ObservableTake(ObservableSource observableSource0, long v) {
        super(observableSource0);
        this.a = v;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        w3 w30 = new w3(observer0, this.a);
        this.source.subscribe(w30);
    }
}

