package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;

public final class ObservableWindowBoundary extends a {
    public final ObservableSource a;
    public final int b;

    public ObservableWindowBoundary(ObservableSource observableSource0, ObservableSource observableSource1, int v) {
        super(observableSource0);
        this.a = observableSource1;
        this.b = v;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        n4 n40 = new n4(observer0, this.b);
        observer0.onSubscribe(n40);
        this.a.subscribe(n40.c);
        this.source.subscribe(n40);
    }
}

