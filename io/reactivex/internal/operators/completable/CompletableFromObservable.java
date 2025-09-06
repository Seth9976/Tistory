package io.reactivex.internal.operators.completable;

import dd.n;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.ObservableSource;

public final class CompletableFromObservable extends Completable {
    public final ObservableSource a;

    public CompletableFromObservable(ObservableSource observableSource0) {
        this.a = observableSource0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        n n0 = new n(completableObserver0, 0);
        this.a.subscribe(n0);
    }
}

