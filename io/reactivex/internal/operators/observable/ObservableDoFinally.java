package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Action;

public final class ObservableDoFinally extends a {
    public final Action a;

    public ObservableDoFinally(ObservableSource observableSource0, Action action0) {
        super(observableSource0);
        this.a = action0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        x0 x00 = new x0(observer0, this.a);
        this.source.subscribe(x00);
    }
}

