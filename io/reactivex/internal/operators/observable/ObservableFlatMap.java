package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Function;

public final class ObservableFlatMap extends a {
    public final Function a;
    public final boolean b;
    public final int c;
    public final int d;

    public ObservableFlatMap(ObservableSource observableSource0, Function function0, boolean z, int v, int v1) {
        super(observableSource0);
        this.a = function0;
        this.b = z;
        this.c = v;
        this.d = v1;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        if(ObservableScalarXMap.tryScalarXMapSubscribe(this.source, observer0, this.a)) {
            return;
        }
        d1 d10 = new d1(this.c, this.d, observer0, this.a, this.b);
        this.source.subscribe(d10);
    }
}

