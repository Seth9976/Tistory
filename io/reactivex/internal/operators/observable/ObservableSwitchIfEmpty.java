package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;

public final class ObservableSwitchIfEmpty extends a {
    public final ObservableSource a;

    public ObservableSwitchIfEmpty(ObservableSource observableSource0, ObservableSource observableSource1) {
        super(observableSource0);
        this.a = observableSource1;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        r0 r00 = new r0(this.a, observer0);
        observer0.onSubscribe(r00.c);
        this.source.subscribe(r00);
    }
}

