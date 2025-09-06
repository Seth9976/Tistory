package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

public final class MaybeDefer extends Maybe {
    public final Callable a;

    public MaybeDefer(Callable callable0) {
        this.a = callable0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        MaybeSource maybeSource0;
        try {
            maybeSource0 = (MaybeSource)ObjectHelper.requireNonNull(this.a.call(), "The maybeSupplier returned a null MaybeSource");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, maybeObserver0);
            return;
        }
        maybeSource0.subscribe(maybeObserver0);
    }
}

