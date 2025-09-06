package gd;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;

public final class c0 extends DeferredScalarSubscription implements SingleObserver {
    public Disposable a;

    @Override  // io.reactivex.internal.subscriptions.DeferredScalarSubscription
    public final void cancel() {
        super.cancel();
        this.a.dispose();
    }

    @Override  // io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        this.downstream.onError(throwable0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.a, disposable0)) {
            this.a = disposable0;
            this.downstream.onSubscribe(this);
        }
    }
}

