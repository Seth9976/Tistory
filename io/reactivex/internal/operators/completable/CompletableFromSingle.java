package io.reactivex.internal.operators.completable;

import dd.p;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.SingleSource;

public final class CompletableFromSingle extends Completable {
    public final SingleSource a;

    public CompletableFromSingle(SingleSource singleSource0) {
        this.a = singleSource0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        p p0 = new p(completableObserver0);
        this.a.subscribe(p0);
    }
}

