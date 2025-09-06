package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

public final class c extends AtomicReference implements Disposable {
    public final MaybeObserver a;

    public c(MaybeObserver maybeObserver0, MaybeCache maybeCache0) {
        super(maybeCache0);
        this.a = maybeObserver0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        MaybeCache maybeCache0 = (MaybeCache)this.getAndSet(null);
        if(maybeCache0 != null) {
            maybeCache0.a(this);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() == null;
    }
}

