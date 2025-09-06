package io.reactivex.internal.operators.maybe;

import gd.f0;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.functions.BiPredicate;

public final class MaybeEqualSingle extends Single {
    public final MaybeSource a;
    public final MaybeSource b;
    public final BiPredicate c;

    public MaybeEqualSingle(MaybeSource maybeSource0, MaybeSource maybeSource1, BiPredicate biPredicate0) {
        this.a = maybeSource0;
        this.b = maybeSource1;
        this.c = biPredicate0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        f0 f00 = new f0(singleObserver0, this.c);
        singleObserver0.onSubscribe(f00);
        this.a.subscribe(((p)f00.c));
        this.b.subscribe(((p)f00.d));
    }
}

