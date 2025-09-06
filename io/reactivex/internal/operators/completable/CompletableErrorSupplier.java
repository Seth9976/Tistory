package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

public final class CompletableErrorSupplier extends Completable {
    public final Callable a;

    public CompletableErrorSupplier(Callable callable0) {
        this.a = callable0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        try {
            throwable0 = (Throwable)ObjectHelper.requireNonNull(this.a.call(), "The error returned is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
        }
        EmptyDisposable.error(throwable0, completableObserver0);
    }
}

