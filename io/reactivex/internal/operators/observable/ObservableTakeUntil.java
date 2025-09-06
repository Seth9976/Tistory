package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;

public final class ObservableTakeUntil extends a {
    public final ObservableSource a;

    public ObservableTakeUntil(ObservableSource observableSource0, ObservableSource observableSource1) {
        super(observableSource0);
        this.a = observableSource1;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        z3 z30 = new z3(observer0);
        observer0.onSubscribe(z30);
        this.a.subscribe(z30.c);
        this.source.subscribe(z30);
    }
}

