package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.functions.Action;

public final class MaybeDoFinally extends a {
    public final Action a;

    public MaybeDoFinally(MaybeSource maybeSource0, Action action0) {
        super(maybeSource0);
        this.a = action0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        o o0 = new o(maybeObserver0, this.a);
        this.source.subscribe(o0);
    }
}

