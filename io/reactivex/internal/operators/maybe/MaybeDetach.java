package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;

public final class MaybeDetach extends a {
    public MaybeDetach(MaybeSource maybeSource0) {
        super(maybeSource0);
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        n n0 = new n();
        n0.b = maybeObserver0;
        this.source.subscribe(n0);
    }
}

