package io.reactivex.internal.operators.maybe;

import dd.c;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;

public final class MaybeDelayWithCompletable extends Maybe {
    public final MaybeSource a;
    public final CompletableSource b;

    public MaybeDelayWithCompletable(MaybeSource maybeSource0, CompletableSource completableSource0) {
        this.a = maybeSource0;
        this.b = completableSource0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        c c0 = new c(2, maybeObserver0, this.a);
        this.b.subscribe(c0);
    }
}

