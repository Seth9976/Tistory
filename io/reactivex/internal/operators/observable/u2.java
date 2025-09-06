package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.functions.Consumer;
import io.reactivex.observables.ConnectableObservable;

public final class u2 extends ConnectableObservable {
    public final ConnectableObservable a;
    public final Observable b;

    public u2(ConnectableObservable connectableObservable0, Observable observable0) {
        this.a = connectableObservable0;
        this.b = observable0;
    }

    @Override  // io.reactivex.observables.ConnectableObservable
    public final void connect(Consumer consumer0) {
        this.a.connect(consumer0);
    }

    @Override  // io.reactivex.Observable
    public final void subscribeActual(Observer observer0) {
        this.b.subscribe(observer0);
    }
}

