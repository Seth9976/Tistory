package io.reactivex.subjects;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

public final class m extends AtomicReference implements Disposable {
    public final SingleObserver a;

    public m(SingleObserver singleObserver0, SingleSubject singleSubject0) {
        this.a = singleObserver0;
        this.lazySet(singleSubject0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        SingleSubject singleSubject0 = (SingleSubject)this.getAndSet(null);
        if(singleSubject0 != null) {
            singleSubject0.c(this);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() == null;
    }
}

