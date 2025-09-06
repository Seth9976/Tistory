package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

public final class MaybeErrorCallable extends Maybe {
    public final Callable a;

    public MaybeErrorCallable(Callable callable0) {
        this.a = callable0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        maybeObserver0.onSubscribe(Disposables.disposed());
        try {
            throwable0 = (Throwable)ObjectHelper.requireNonNull(this.a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
        }
        maybeObserver0.onError(throwable0);
    }
}

