package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Predicate;

public final class ObservableFilter extends a {
    public final Predicate a;

    public ObservableFilter(ObservableSource observableSource0, Predicate predicate0) {
        super(observableSource0);
        this.a = predicate0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        w0 w00 = new w0(observer0, this.a, 1);
        this.source.subscribe(w00);
    }
}

