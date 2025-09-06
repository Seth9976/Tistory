package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposables;

public final class SingleJust extends Single {
    public final Object a;

    public SingleJust(Object object0) {
        this.a = object0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        singleObserver0.onSubscribe(Disposables.disposed());
        singleObserver0.onSuccess(this.a);
    }
}

