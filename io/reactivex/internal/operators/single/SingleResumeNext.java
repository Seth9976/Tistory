package io.reactivex.internal.operators.single;

import gd.n;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

public final class SingleResumeNext extends Single {
    public final SingleSource a;
    public final Function b;

    public SingleResumeNext(SingleSource singleSource0, Function function0) {
        this.a = singleSource0;
        this.b = function0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        n n0 = new n(1, singleObserver0, this.b);
        this.a.subscribe(n0);
    }
}

