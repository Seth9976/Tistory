package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;

public final class ObservableSkipLast extends a {
    public final int a;

    public ObservableSkipLast(ObservableSource observableSource0, int v) {
        super(observableSource0);
        this.a = v;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        p3 p30 = new p3(observer0, this.a);
        this.source.subscribe(p30);
    }
}

