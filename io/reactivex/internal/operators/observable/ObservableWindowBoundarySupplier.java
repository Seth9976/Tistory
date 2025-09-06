package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import java.util.concurrent.Callable;

public final class ObservableWindowBoundarySupplier extends a {
    public final Callable a;
    public final int b;

    public ObservableWindowBoundarySupplier(ObservableSource observableSource0, Callable callable0, int v) {
        super(observableSource0);
        this.a = callable0;
        this.b = v;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        r4 r40 = new r4(observer0, this.b, this.a);
        this.source.subscribe(r40);
    }
}

