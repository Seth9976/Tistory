package io.reactivex.internal.operators.observable;

import dd.n;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.BiFunction;
import io.reactivex.observers.SerializedObserver;

public final class ObservableWithLatestFrom extends a {
    public final BiFunction a;
    public final ObservableSource b;

    public ObservableWithLatestFrom(ObservableSource observableSource0, BiFunction biFunction0, ObservableSource observableSource1) {
        super(observableSource0);
        this.a = biFunction0;
        this.b = observableSource1;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        SerializedObserver serializedObserver0 = new SerializedObserver(observer0);
        x4 x40 = new x4(serializedObserver0, this.a);
        serializedObserver0.onSubscribe(x40);
        n n0 = new n(x40, 3);
        this.b.subscribe(n0);
        this.source.subscribe(x40);
    }
}

