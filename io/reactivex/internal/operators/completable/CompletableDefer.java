package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

public final class CompletableDefer extends Completable {
    public final Callable a;

    public CompletableDefer(Callable callable0) {
        this.a = callable0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        CompletableSource completableSource0;
        try {
            completableSource0 = (CompletableSource)ObjectHelper.requireNonNull(this.a.call(), "The completableSupplier returned a null CompletableSource");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, completableObserver0);
            return;
        }
        completableSource0.subscribe(completableObserver0);
    }
}

