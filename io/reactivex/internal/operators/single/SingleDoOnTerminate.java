package io.reactivex.internal.operators.single;

import gd.c;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;

public final class SingleDoOnTerminate extends Single {
    public final SingleSource a;
    public final Action b;

    public SingleDoOnTerminate(SingleSource singleSource0, Action action0) {
        this.a = singleSource0;
        this.b = action0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        c c0 = new c(4, singleObserver0, this);
        this.a.subscribe(c0);
    }
}

