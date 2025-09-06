package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;

public final class ObservableDistinctUntilChanged extends a {
    public final Function a;
    public final BiPredicate b;

    public ObservableDistinctUntilChanged(ObservableSource observableSource0, Function function0, BiPredicate biPredicate0) {
        super(observableSource0);
        this.a = function0;
        this.b = biPredicate0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        v0 v00 = new v0(observer0, this.a, this.b);
        this.source.subscribe(v00);
    }
}

