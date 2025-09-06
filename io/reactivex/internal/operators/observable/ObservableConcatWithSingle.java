package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleSource;

public final class ObservableConcatWithSingle extends a {
    public final SingleSource a;

    public ObservableConcatWithSingle(Observable observable0, SingleSource singleSource0) {
        super(observable0);
        this.a = singleSource0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        h0 h00 = new h0(observer0, this.a);
        this.source.subscribe(h00);
    }
}

