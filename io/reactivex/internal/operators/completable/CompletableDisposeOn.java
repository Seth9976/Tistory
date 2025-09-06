package io.reactivex.internal.operators.completable;

import dd.l;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;

public final class CompletableDisposeOn extends Completable {
    public final CompletableSource a;
    public final Scheduler b;

    public CompletableDisposeOn(CompletableSource completableSource0, Scheduler scheduler0) {
        this.a = completableSource0;
        this.b = scheduler0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        l l0 = new l(completableObserver0, this.b);
        this.a.subscribe(l0);
    }
}

