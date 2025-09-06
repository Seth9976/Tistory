package io.reactivex.internal.operators.observable;

import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Observer;

public final class ObservableConcatWithCompletable extends a {
    public final CompletableSource a;

    public ObservableConcatWithCompletable(Observable observable0, CompletableSource completableSource0) {
        super(observable0);
        this.a = completableSource0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        f0 f00 = new f0(observer0, this.a);
        this.source.subscribe(f00);
    }
}

