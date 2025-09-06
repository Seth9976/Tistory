package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;

public final class CompletableFromUnsafeSource extends Completable {
    public final CompletableSource a;

    public CompletableFromUnsafeSource(CompletableSource completableSource0) {
        this.a = completableSource0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        this.a.subscribe(completableObserver0);
    }
}

