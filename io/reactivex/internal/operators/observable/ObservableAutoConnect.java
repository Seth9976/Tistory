package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.functions.Consumer;
import io.reactivex.observables.ConnectableObservable;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableAutoConnect extends Observable {
    public final ConnectableObservable a;
    public final int b;
    public final Consumer c;
    public final AtomicInteger d;

    public ObservableAutoConnect(ConnectableObservable connectableObservable0, int v, Consumer consumer0) {
        this.a = connectableObservable0;
        this.b = v;
        this.c = consumer0;
        this.d = new AtomicInteger();
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        ConnectableObservable connectableObservable0 = this.a;
        connectableObservable0.subscribe(observer0);
        if(this.d.incrementAndGet() == this.b) {
            connectableObservable0.connect(this.c);
        }
    }
}

