package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.Callable;

public final class ObservableBufferExactBoundary extends a {
    public final ObservableSource a;
    public final Callable b;

    public ObservableBufferExactBoundary(ObservableSource observableSource0, ObservableSource observableSource1, Callable callable0) {
        super(observableSource0);
        this.a = observableSource1;
        this.b = callable0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        q q0 = new q(new SerializedObserver(observer0), this.b, this.a);
        this.source.subscribe(q0);
    }
}

