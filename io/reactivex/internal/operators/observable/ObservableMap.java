package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Function;

public final class ObservableMap extends a {
    public final Function a;

    public ObservableMap(ObservableSource observableSource0, Function function0) {
        super(observableSource0);
        this.a = function0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        w0 w00 = new w0(observer0, this.a, 2);
        this.source.subscribe(w00);
    }
}

