package io.reactivex.subjects;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

public final class d extends AtomicReference implements Disposable {
    public final MaybeObserver a;

    public d(MaybeObserver maybeObserver0, MaybeSubject maybeSubject0) {
        this.a = maybeObserver0;
        this.lazySet(maybeSubject0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        MaybeSubject maybeSubject0 = (MaybeSubject)this.getAndSet(null);
        if(maybeSubject0 != null) {
            maybeSubject0.a(this);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() == null;
    }
}

