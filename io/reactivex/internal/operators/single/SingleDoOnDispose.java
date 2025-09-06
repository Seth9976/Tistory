package io.reactivex.internal.operators.single;

import gd.h;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;

public final class SingleDoOnDispose extends Single {
    public final SingleSource a;
    public final Action b;

    public SingleDoOnDispose(SingleSource singleSource0, Action action0) {
        this.a = singleSource0;
        this.b = action0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        h h0 = new h(singleObserver0, this.b);
        this.a.subscribe(h0);
    }
}

