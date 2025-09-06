package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;

public final class MaybeHide extends a {
    public MaybeHide(MaybeSource maybeSource0) {
        super(maybeSource0);
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        n n0 = new n(maybeObserver0, 1);
        this.source.subscribe(n0);
    }
}

