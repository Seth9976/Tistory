package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;

public final class h0 extends DeferredScalarSubscription implements MaybeObserver {
    public Disposable a;

    @Override  // io.reactivex.internal.subscriptions.DeferredScalarSubscription
    public final void cancel() {
        super.cancel();
        this.a.dispose();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        this.downstream.onComplete();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        this.downstream.onError(throwable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.a, disposable0)) {
            this.a = disposable0;
            this.downstream.onSubscribe(this);
        }
    }
}

