package io.reactivex.internal.operators.completable;

import dd.m;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Action;

public final class CompletableDoFinally extends Completable {
    public final CompletableSource a;
    public final Action b;

    public CompletableDoFinally(CompletableSource completableSource0, Action action0) {
        this.a = completableSource0;
        this.b = action0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        m m0 = new m(completableObserver0, this.b);
        this.a.subscribe(m0);
    }
}

