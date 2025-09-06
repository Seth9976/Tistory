package io.reactivex.internal.operators.single;

import gd.k;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;

public final class SingleDoFinally extends Single {
    public final SingleSource a;
    public final Action b;

    public SingleDoFinally(SingleSource singleSource0, Action action0) {
        this.a = singleSource0;
        this.b = action0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        k k0 = new k(singleObserver0, this.b);
        this.a.subscribe(k0);
    }
}

