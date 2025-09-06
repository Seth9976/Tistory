package io.reactivex.internal.operators.single;

import gd.i;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;

public final class SingleDoAfterTerminate extends Single {
    public final SingleSource a;
    public final Action b;

    public SingleDoAfterTerminate(SingleSource singleSource0, Action action0) {
        this.a = singleSource0;
        this.b = action0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        i i0 = new i(2, singleObserver0, this.b);
        this.a.subscribe(i0);
    }
}

