package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Predicate;

public final class ObservableTakeWhile extends a {
    public final Predicate a;

    public ObservableTakeWhile(ObservableSource observableSource0, Predicate predicate0) {
        super(observableSource0);
        this.a = predicate0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        g g0 = new g(observer0, this.a, 4);
        this.source.subscribe(g0);
    }
}

