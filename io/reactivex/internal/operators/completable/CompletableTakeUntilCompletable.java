package io.reactivex.internal.operators.completable;

import dd.w;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;

public final class CompletableTakeUntilCompletable extends Completable {
    public final Completable a;
    public final CompletableSource b;

    public CompletableTakeUntilCompletable(Completable completable0, CompletableSource completableSource0) {
        this.a = completable0;
        this.b = completableSource0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        w w0 = new w(completableObserver0);
        completableObserver0.onSubscribe(w0);
        this.b.subscribe(w0.b);
        this.a.subscribe(w0);
    }
}

