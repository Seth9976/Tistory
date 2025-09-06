package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class CompletableError extends Completable {
    public final Throwable a;

    public CompletableError(Throwable throwable0) {
        this.a = throwable0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        EmptyDisposable.error(this.a, completableObserver0);
    }
}

