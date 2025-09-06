package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.Callable;

public final class ObservableBufferBoundarySupplier extends a {
    public final Callable a;
    public final Callable b;

    public ObservableBufferBoundarySupplier(ObservableSource observableSource0, Callable callable0, Callable callable1) {
        super(observableSource0);
        this.a = callable0;
        this.b = callable1;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        q q0 = new q(new SerializedObserver(observer0), this.b, this.a);
        this.source.subscribe(q0);
    }
}

