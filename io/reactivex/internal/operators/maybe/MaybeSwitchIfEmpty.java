package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;

public final class MaybeSwitchIfEmpty extends a {
    public final MaybeSource a;

    public MaybeSwitchIfEmpty(MaybeSource maybeSource0, MaybeSource maybeSource1) {
        super(maybeSource0);
        this.a = maybeSource1;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        y y0 = new y(3, maybeObserver0, this.a);
        this.source.subscribe(y0);
    }
}

