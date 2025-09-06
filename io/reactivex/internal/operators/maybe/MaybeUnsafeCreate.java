package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;

public final class MaybeUnsafeCreate extends a {
    public MaybeUnsafeCreate(MaybeSource maybeSource0) {
        super(maybeSource0);
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        this.source.subscribe(maybeObserver0);
    }
}

