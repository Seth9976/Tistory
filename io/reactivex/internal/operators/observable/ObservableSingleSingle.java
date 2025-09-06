package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;

public final class ObservableSingleSingle extends Single {
    public final ObservableSource a;
    public final Object b;

    public ObservableSingleSingle(ObservableSource observableSource0, Object object0) {
        this.a = observableSource0;
        this.b = object0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        y y0 = new y(singleObserver0, this.b);
        this.a.subscribe(y0);
    }
}

