package io.reactivex.internal.operators.single;

import gd.j;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;

public final class SingleHide extends Single {
    public final SingleSource a;

    public SingleHide(SingleSource singleSource0) {
        this.a = singleSource0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        j j0 = new j(singleObserver0, 1);
        this.a.subscribe(j0);
    }
}

