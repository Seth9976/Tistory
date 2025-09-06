package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;

public final class i0 extends DeferredScalarDisposable implements MaybeObserver {
    public Disposable a;

    @Override  // io.reactivex.internal.observers.DeferredScalarDisposable
    public final void dispose() {
        super.dispose();
        this.a.dispose();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.a, disposable0)) {
            this.a = disposable0;
            this.downstream.onSubscribe(this);
        }
    }
}

