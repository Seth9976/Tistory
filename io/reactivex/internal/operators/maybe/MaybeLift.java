package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeOperator;
import io.reactivex.MaybeSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;

public final class MaybeLift extends a {
    public final MaybeOperator a;

    public MaybeLift(MaybeSource maybeSource0, MaybeOperator maybeOperator0) {
        super(maybeSource0);
        this.a = maybeOperator0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        MaybeObserver maybeObserver1;
        try {
            maybeObserver1 = (MaybeObserver)ObjectHelper.requireNonNull(this.a.apply(maybeObserver0), "The operator returned a null MaybeObserver");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, maybeObserver0);
            return;
        }
        this.source.subscribe(maybeObserver1);
    }
}

