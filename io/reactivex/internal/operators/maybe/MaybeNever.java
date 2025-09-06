package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class MaybeNever extends Maybe {
    public static final MaybeNever INSTANCE;

    static {
        MaybeNever.INSTANCE = new MaybeNever();
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        maybeObserver0.onSubscribe(EmptyDisposable.NEVER);
    }
}

