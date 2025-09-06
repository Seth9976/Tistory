package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.fuseable.ScalarCallable;

public final class MaybeJust extends Maybe implements ScalarCallable {
    public final Object a;

    public MaybeJust(Object object0) {
        this.a = object0;
    }

    @Override  // io.reactivex.internal.fuseable.ScalarCallable
    public Object call() {
        return this.a;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        maybeObserver0.onSubscribe(Disposables.disposed());
        maybeObserver0.onSuccess(this.a);
    }
}

