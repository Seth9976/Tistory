package io.reactivex.internal.operators.completable;

import dd.b;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Predicate;

public final class CompletableOnErrorComplete extends Completable {
    public final CompletableSource a;
    public final Predicate b;

    public CompletableOnErrorComplete(CompletableSource completableSource0, Predicate predicate0) {
        this.a = completableSource0;
        this.b = predicate0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        b b0 = new b(this, completableObserver0, 2);
        this.a.subscribe(b0);
    }
}

