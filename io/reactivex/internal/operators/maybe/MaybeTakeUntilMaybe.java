package io.reactivex.internal.operators.maybe;

import ed.d;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;

public final class MaybeTakeUntilMaybe extends a {
    public final MaybeSource a;

    public MaybeTakeUntilMaybe(MaybeSource maybeSource0, MaybeSource maybeSource1) {
        super(maybeSource0);
        this.a = maybeSource1;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        y y0 = new y(maybeObserver0, 5);
        maybeObserver0.onSubscribe(y0);
        this.a.subscribe(((d)y0.b));
        this.source.subscribe(y0);
    }
}

