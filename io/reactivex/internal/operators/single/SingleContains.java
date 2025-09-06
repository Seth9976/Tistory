package io.reactivex.internal.operators.single;

import gd.c;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiPredicate;

public final class SingleContains extends Single {
    public final SingleSource a;
    public final Object b;
    public final BiPredicate c;

    public SingleContains(SingleSource singleSource0, Object object0, BiPredicate biPredicate0) {
        this.a = singleSource0;
        this.b = object0;
        this.c = biPredicate0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        c c0 = new c(0, singleObserver0, this);
        this.a.subscribe(c0);
    }
}

