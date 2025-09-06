package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

public final class ObservableDoOnEach extends a {
    public final Consumer a;
    public final Consumer b;
    public final Action c;
    public final Action d;

    public ObservableDoOnEach(ObservableSource observableSource0, Consumer consumer0, Consumer consumer1, Action action0, Action action1) {
        super(observableSource0);
        this.a = consumer0;
        this.b = consumer1;
        this.c = action0;
        this.d = action1;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        y0 y00 = new y0(observer0, this.a, this.b, this.c, this.d);
        this.source.subscribe(y00);
    }
}

