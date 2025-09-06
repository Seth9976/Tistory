package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.observers.SerializedObserver;

public final class ObservableConcatMap extends a {
    public final Function a;
    public final int b;
    public final ErrorMode c;

    public ObservableConcatMap(ObservableSource observableSource0, Function function0, int v, ErrorMode errorMode0) {
        super(observableSource0);
        this.a = function0;
        this.c = errorMode0;
        this.b = Math.max(8, v);
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Function function0 = this.a;
        if(ObservableScalarXMap.tryScalarXMapSubscribe(this.source, observer0, function0)) {
            return;
        }
        int v = this.b;
        ErrorMode errorMode0 = this.c;
        if(errorMode0 == ErrorMode.IMMEDIATE) {
            d0 d00 = new d0(new SerializedObserver(observer0), function0, v);
            this.source.subscribe(d00);
            return;
        }
        this.source.subscribe(new c0(v, observer0, function0, errorMode0 == ErrorMode.END));
    }
}

