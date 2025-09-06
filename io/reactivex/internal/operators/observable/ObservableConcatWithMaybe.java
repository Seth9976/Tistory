package io.reactivex.internal.operators.observable;

import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;

public final class ObservableConcatWithMaybe extends a {
    public final MaybeSource a;

    public ObservableConcatWithMaybe(Observable observable0, MaybeSource maybeSource0) {
        super(observable0);
        this.a = maybeSource0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        g0 g00 = new g0(observer0, this.a);
        this.source.subscribe(g00);
    }
}

