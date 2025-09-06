package io.reactivex.internal.operators.completable;

import dd.t;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;

public final class CompletableSubscribeOn extends Completable {
    public final CompletableSource a;
    public final Scheduler b;

    public CompletableSubscribeOn(CompletableSource completableSource0, Scheduler scheduler0) {
        this.a = completableSource0;
        this.b = scheduler0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        t t0 = new t(completableObserver0, this.a);
        completableObserver0.onSubscribe(t0);
        Disposable disposable0 = this.b.scheduleDirect(t0);
        ((SequentialDisposable)t0.c).replace(disposable0);
    }
}

