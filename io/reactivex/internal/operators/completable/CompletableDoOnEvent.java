package io.reactivex.internal.operators.completable;

import dd.b;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Consumer;

public final class CompletableDoOnEvent extends Completable {
    public final CompletableSource a;
    public final Consumer b;

    public CompletableDoOnEvent(CompletableSource completableSource0, Consumer consumer0) {
        this.a = completableSource0;
        this.b = consumer0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        b b0 = new b(this, completableObserver0, 1);
        this.a.subscribe(b0);
    }
}

