package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Scheduler;

public final class MaybeUnsubscribeOn extends a {
    public final Scheduler a;

    public MaybeUnsubscribeOn(MaybeSource maybeSource0, Scheduler scheduler0) {
        super(maybeSource0);
        this.a = scheduler0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        j0 j00 = new j0(maybeObserver0, this.a);
        this.source.subscribe(j00);
    }
}

