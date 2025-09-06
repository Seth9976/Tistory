package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.functions.Predicate;

public final class MaybeFilter extends a {
    public final Predicate a;

    public MaybeFilter(MaybeSource maybeSource0, Predicate predicate0) {
        super(maybeSource0);
        this.a = predicate0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        q q0 = new q(maybeObserver0, this.a, 0);
        this.source.subscribe(q0);
    }
}

