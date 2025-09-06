package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;

public final class ObservableBufferBoundary extends a {
    public final Callable a;
    public final ObservableSource b;
    public final Function c;

    public ObservableBufferBoundary(ObservableSource observableSource0, ObservableSource observableSource1, Function function0, Callable callable0) {
        super(observableSource0);
        this.b = observableSource1;
        this.c = function0;
        this.a = callable0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        n n0 = new n(observer0, this.b, this.c, this.a);
        observer0.onSubscribe(n0);
        this.source.subscribe(n0);
    }
}

