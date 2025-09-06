package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;

public final class ObservableSkip extends a {
    public final long a;

    public ObservableSkip(ObservableSource observableSource0, long v) {
        super(observableSource0);
        this.a = v;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        i0 i00 = new i0(observer0, this.a);
        this.source.subscribe(i00);
    }
}

