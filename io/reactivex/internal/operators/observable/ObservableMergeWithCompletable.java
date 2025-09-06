package io.reactivex.internal.operators.observable;

import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Observer;

public final class ObservableMergeWithCompletable extends a {
    public final CompletableSource a;

    public ObservableMergeWithCompletable(Observable observable0, CompletableSource completableSource0) {
        super(observable0);
        this.a = completableSource0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        z1 z10 = new z1(observer0);
        observer0.onSubscribe(z10);
        this.source.subscribe(z10);
        this.a.subscribe(z10.c);
    }
}

