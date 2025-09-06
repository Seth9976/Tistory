package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposables;

public final class MaybeError extends Maybe {
    public final Throwable a;

    public MaybeError(Throwable throwable0) {
        this.a = throwable0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        maybeObserver0.onSubscribe(Disposables.disposed());
        maybeObserver0.onError(this.a);
    }
}

