package io.reactivex.internal.operators.completable;

import dd.g;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;

public final class CompletableConcatArray extends Completable {
    public final CompletableSource[] a;

    public CompletableConcatArray(CompletableSource[] arr_completableSource) {
        this.a = arr_completableSource;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        g g0 = new g(completableObserver0, this.a);
        completableObserver0.onSubscribe(g0.d);
        g0.a();
    }
}

