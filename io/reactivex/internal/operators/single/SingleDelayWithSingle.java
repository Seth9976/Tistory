package io.reactivex.internal.operators.single;

import gd.h;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;

public final class SingleDelayWithSingle extends Single {
    public final SingleSource a;
    public final SingleSource b;

    public SingleDelayWithSingle(SingleSource singleSource0, SingleSource singleSource1) {
        this.a = singleSource0;
        this.b = singleSource1;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        h h0 = new h(0, singleObserver0, this.a);
        this.b.subscribe(h0);
    }
}

