package io.reactivex.internal.operators.single;

import gd.f;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;

public final class SingleDelayWithObservable extends Single {
    public final SingleSource a;
    public final ObservableSource b;

    public SingleDelayWithObservable(SingleSource singleSource0, ObservableSource observableSource0) {
        this.a = singleSource0;
        this.b = observableSource0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        f f0 = new f(singleObserver0, this.a);
        this.b.subscribe(f0);
    }
}

