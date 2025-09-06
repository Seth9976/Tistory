package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.ScalarCallable;

public final class MaybeEmpty extends Maybe implements ScalarCallable {
    public static final MaybeEmpty INSTANCE;

    static {
        MaybeEmpty.INSTANCE = new MaybeEmpty();
    }

    @Override  // io.reactivex.internal.fuseable.ScalarCallable
    public Object call() {
        return null;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        EmptyDisposable.complete(maybeObserver0);
    }
}

