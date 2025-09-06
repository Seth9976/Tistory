package io.reactivex.internal.operators.observable;

import ed.d;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;

public final class ObservableMergeWithMaybe extends a {
    public final MaybeSource a;

    public ObservableMergeWithMaybe(Observable observable0, MaybeSource maybeSource0) {
        super(observable0);
        this.a = maybeSource0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        a2 a20 = new a2(observer0, 0);
        observer0.onSubscribe(a20);
        this.source.subscribe(a20);
        this.a.subscribe(((d)a20.j));
    }
}

