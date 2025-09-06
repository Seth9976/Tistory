package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Function;
import io.reactivex.observers.SerializedObserver;

public final class ObservableDebounce extends a {
    public final Function a;

    public ObservableDebounce(ObservableSource observableSource0, Function function0) {
        super(observableSource0);
        this.a = function0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        m0 m00 = new m0(new SerializedObserver(observer0), this.a);
        this.source.subscribe(m00);
    }
}

