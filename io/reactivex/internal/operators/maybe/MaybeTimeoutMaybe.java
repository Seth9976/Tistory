package io.reactivex.internal.operators.maybe;

import ed.d;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;

public final class MaybeTimeoutMaybe extends a {
    public final MaybeSource a;
    public final MaybeSource b;

    public MaybeTimeoutMaybe(MaybeSource maybeSource0, MaybeSource maybeSource1, MaybeSource maybeSource2) {
        super(maybeSource0);
        this.a = maybeSource1;
        this.b = maybeSource2;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        g0 g00 = new g0(maybeObserver0, this.b, 0);
        maybeObserver0.onSubscribe(g00);
        this.a.subscribe(((d)g00.d));
        this.source.subscribe(g00);
    }
}

