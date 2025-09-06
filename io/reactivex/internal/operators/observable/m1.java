package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.observables.GroupedObservable;

public final class m1 extends GroupedObservable {
    public final n1 b;

    public m1(Object object0, n1 n10) {
        super(object0);
        this.b = n10;
    }

    @Override  // io.reactivex.Observable
    public final void subscribeActual(Observer observer0) {
        this.b.subscribe(observer0);
    }
}

