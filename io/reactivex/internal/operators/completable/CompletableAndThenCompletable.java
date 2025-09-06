package io.reactivex.internal.operators.completable;

import dd.c;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;

public final class CompletableAndThenCompletable extends Completable {
    public final CompletableSource a;
    public final CompletableSource b;

    public CompletableAndThenCompletable(CompletableSource completableSource0, CompletableSource completableSource1) {
        this.a = completableSource0;
        this.b = completableSource1;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        c c0 = new c(0, completableObserver0, this.b);
        this.a.subscribe(c0);
    }
}

