package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Scheduler;

public final class MaybeObserveOn extends a {
    public final Scheduler a;

    public MaybeObserveOn(MaybeSource maybeSource0, Scheduler scheduler0) {
        super(maybeSource0);
        this.a = scheduler0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        e0 e00 = new e0(maybeObserver0, this.a);
        this.source.subscribe(e00);
    }
}

