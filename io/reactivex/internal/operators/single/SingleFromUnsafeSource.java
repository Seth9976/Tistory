package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;

public final class SingleFromUnsafeSource extends Single {
    public final SingleSource a;

    public SingleFromUnsafeSource(SingleSource singleSource0) {
        this.a = singleSource0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        this.a.subscribe(singleObserver0);
    }
}

