package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;

public final class ObservableConcatMapEager extends a {
    public final Function a;
    public final ErrorMode b;
    public final int c;
    public final int d;

    public ObservableConcatMapEager(ObservableSource observableSource0, Function function0, ErrorMode errorMode0, int v, int v1) {
        super(observableSource0);
        this.a = function0;
        this.b = errorMode0;
        this.c = v;
        this.d = v1;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        e0 e00 = new e0(this.c, this.d, observer0, this.a, this.b);
        this.source.subscribe(e00);
    }
}

