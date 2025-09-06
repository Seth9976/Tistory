package io.reactivex.internal.operators.completable;

import dd.v;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;

public final class CompletableResumeNext extends Completable {
    public final CompletableSource a;
    public final Function b;

    public CompletableResumeNext(CompletableSource completableSource0, Function function0) {
        this.a = completableSource0;
        this.b = function0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        v v0 = new v(completableObserver0, this.b);
        completableObserver0.onSubscribe(v0);
        this.a.subscribe(v0);
    }
}

