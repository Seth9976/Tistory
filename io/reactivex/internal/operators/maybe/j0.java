package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class j0 extends AtomicReference implements MaybeObserver, Disposable, Runnable {
    public final MaybeObserver a;
    public final Scheduler b;
    public Disposable c;

    public j0(MaybeObserver maybeObserver0, Scheduler scheduler0) {
        this.a = maybeObserver0;
        this.b = scheduler0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        Disposable disposable0 = (Disposable)this.getAndSet(DisposableHelper.DISPOSED);
        if(disposable0 != DisposableHelper.DISPOSED) {
            this.c = disposable0;
            this.b.scheduleDirect(this);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.setOnce(this, disposable0)) {
            this.a.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        this.a.onSuccess(object0);
    }

    @Override
    public final void run() {
        this.c.dispose();
    }
}

