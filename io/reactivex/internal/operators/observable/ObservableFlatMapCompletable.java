package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Function;

public final class ObservableFlatMapCompletable extends a {
    public final Function a;
    public final boolean b;

    public ObservableFlatMapCompletable(ObservableSource observableSource0, Function function0, boolean z) {
        super(observableSource0);
        this.a = function0;
        this.b = z;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        e1 e10 = new e1(observer0, this.a, this.b);
        this.source.subscribe(e10);
    }
}

