package io.reactivex.internal.operators.maybe;

import gd.i;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleSource;
import io.reactivex.functions.Predicate;

public final class MaybeFilterSingle extends Maybe {
    public final SingleSource a;
    public final Predicate b;

    public MaybeFilterSingle(SingleSource singleSource0, Predicate predicate0) {
        this.a = singleSource0;
        this.b = predicate0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        i i0 = new i(3, maybeObserver0, this.b);
        this.a.subscribe(i0);
    }
}

