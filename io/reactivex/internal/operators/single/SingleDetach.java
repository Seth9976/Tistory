package io.reactivex.internal.operators.single;

import gd.j;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;

public final class SingleDetach extends Single {
    public final SingleSource a;

    public SingleDetach(SingleSource singleSource0) {
        this.a = singleSource0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        j j0 = new j();
        j0.b = singleObserver0;
        this.a.subscribe(j0);
    }
}

