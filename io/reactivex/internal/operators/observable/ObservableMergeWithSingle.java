package io.reactivex.internal.operators.observable;

import ed.f;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleSource;

public final class ObservableMergeWithSingle extends a {
    public final SingleSource a;

    public ObservableMergeWithSingle(Observable observable0, SingleSource singleSource0) {
        super(observable0);
        this.a = singleSource0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        a2 a20 = new a2(observer0, 1);
        observer0.onSubscribe(a20);
        this.source.subscribe(a20);
        this.a.subscribe(((f)a20.j));
    }
}

