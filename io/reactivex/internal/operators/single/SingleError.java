package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

public final class SingleError extends Single {
    public final Callable a;

    public SingleError(Callable callable0) {
        this.a = callable0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        try {
            throwable0 = (Throwable)ObjectHelper.requireNonNull(this.a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
        }
        EmptyDisposable.error(throwable0, singleObserver0);
    }
}

