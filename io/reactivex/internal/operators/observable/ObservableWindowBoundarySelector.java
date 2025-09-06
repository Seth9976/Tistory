package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Function;
import io.reactivex.observers.SerializedObserver;

public final class ObservableWindowBoundarySelector extends a {
    public final ObservableSource a;
    public final Function b;
    public final int c;

    public ObservableWindowBoundarySelector(ObservableSource observableSource0, ObservableSource observableSource1, Function function0, int v) {
        super(observableSource0);
        this.a = observableSource1;
        this.b = function0;
        this.c = v;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        p4 p40 = new p4(new SerializedObserver(observer0), this.a, this.b, this.c);
        this.source.subscribe(p40);
    }
}

