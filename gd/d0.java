package gd;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;

public final class d0 extends DeferredScalarDisposable implements SingleObserver {
    public Disposable a;

    @Override  // io.reactivex.internal.observers.DeferredScalarDisposable
    public final void dispose() {
        super.dispose();
        this.a.dispose();
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.a, disposable0)) {
            this.a = disposable0;
            this.downstream.onSubscribe(this);
        }
    }
}

