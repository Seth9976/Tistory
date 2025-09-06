package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;

public final class ObservableLastSingle extends Single {
    public final ObservableSource a;
    public final Object b;

    public ObservableLastSingle(ObservableSource observableSource0, Object object0) {
        this.a = observableSource0;
        this.b = object0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        x1 x10 = new x1(singleObserver0, this.b);
        this.a.subscribe(x10);
    }
}

