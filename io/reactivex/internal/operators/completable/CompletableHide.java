package io.reactivex.internal.operators.completable;

import dd.k;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;

public final class CompletableHide extends Completable {
    public final CompletableSource a;

    public CompletableHide(CompletableSource completableSource0) {
        this.a = completableSource0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        k k0 = new k(completableObserver0, 1);
        this.a.subscribe(k0);
    }
}

