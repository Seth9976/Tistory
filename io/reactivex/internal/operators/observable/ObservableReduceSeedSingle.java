package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.functions.BiFunction;

public final class ObservableReduceSeedSingle extends Single {
    public final ObservableSource a;
    public final Object b;
    public final BiFunction c;

    public ObservableReduceSeedSingle(ObservableSource observableSource0, Object object0, BiFunction biFunction0) {
        this.a = observableSource0;
        this.b = object0;
        this.c = biFunction0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        x1 x10 = new x1(singleObserver0, this.c, this.b);
        this.a.subscribe(x10);
    }
}

