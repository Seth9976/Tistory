package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Function;

public final class ObservableFlatMapSingle extends a {
    public final Function a;
    public final boolean b;

    public ObservableFlatMapSingle(ObservableSource observableSource0, Function function0, boolean z) {
        super(observableSource0);
        this.a = function0;
        this.b = z;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        g1 g10 = new g1(1, observer0, this.a, this.b);
        this.source.subscribe(g10);
    }
}

