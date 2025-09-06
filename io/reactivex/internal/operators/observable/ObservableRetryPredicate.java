package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.SequentialDisposable;

public final class ObservableRetryPredicate extends a {
    public final Predicate a;
    public final long b;

    public ObservableRetryPredicate(Observable observable0, long v, Predicate predicate0) {
        super(observable0);
        this.a = predicate0;
        this.b = v;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        SequentialDisposable sequentialDisposable0 = new SequentialDisposable();
        observer0.onSubscribe(sequentialDisposable0);
        new e3(observer0, this.b, this.a, sequentialDisposable0, this.source).a();
    }
}

