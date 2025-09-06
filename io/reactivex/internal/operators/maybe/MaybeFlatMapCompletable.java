package io.reactivex.internal.operators.maybe;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;

public final class MaybeFlatMapCompletable extends Completable {
    public final MaybeSource a;
    public final Function b;

    public MaybeFlatMapCompletable(MaybeSource maybeSource0, Function function0) {
        this.a = maybeSource0;
        this.b = function0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        t t0 = new t(completableObserver0, this.b);
        completableObserver0.onSubscribe(t0);
        this.a.subscribe(t0);
    }
}

