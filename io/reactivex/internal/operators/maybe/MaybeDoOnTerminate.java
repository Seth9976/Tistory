package io.reactivex.internal.operators.maybe;

import gd.r;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.functions.Action;

public final class MaybeDoOnTerminate extends Maybe {
    public final MaybeSource a;
    public final Action b;

    public MaybeDoOnTerminate(MaybeSource maybeSource0, Action action0) {
        this.a = maybeSource0;
        this.b = action0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        r r0 = new r(2, maybeObserver0, this);
        this.a.subscribe(r0);
    }
}

