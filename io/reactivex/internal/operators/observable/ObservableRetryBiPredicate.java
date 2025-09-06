package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.disposables.SequentialDisposable;

public final class ObservableRetryBiPredicate extends a {
    public final BiPredicate a;

    public ObservableRetryBiPredicate(Observable observable0, BiPredicate biPredicate0) {
        super(observable0);
        this.a = biPredicate0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        SequentialDisposable sequentialDisposable0 = new SequentialDisposable();
        observer0.onSubscribe(sequentialDisposable0);
        new d3(observer0, this.a, sequentialDisposable0, this.source).a();
    }
}

