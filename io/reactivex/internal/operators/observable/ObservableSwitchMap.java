package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Function;

public final class ObservableSwitchMap extends a {
    public final Function a;
    public final int b;
    public final boolean c;

    public ObservableSwitchMap(ObservableSource observableSource0, Function function0, int v, boolean z) {
        super(observableSource0);
        this.a = function0;
        this.b = v;
        this.c = z;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Function function0 = this.a;
        if(ObservableScalarXMap.tryScalarXMapSubscribe(this.source, observer0, function0)) {
            return;
        }
        v3 v30 = new v3(this.b, observer0, function0, this.c);
        this.source.subscribe(v30);
    }
}

