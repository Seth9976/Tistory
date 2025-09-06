package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class e0 extends AtomicReference implements MaybeObserver, Disposable, Runnable {
    public final MaybeObserver a;
    public final Scheduler b;
    public Object c;
    public Throwable d;

    public e0(MaybeObserver maybeObserver0, Scheduler scheduler0) {
        this.a = maybeObserver0;
        this.b = scheduler0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        DisposableHelper.replace(this, this.b.scheduleDirect(this));
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        this.d = throwable0;
        DisposableHelper.replace(this, this.b.scheduleDirect(this));
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.setOnce(this, disposable0)) {
            this.a.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        this.c = object0;
        DisposableHelper.replace(this, this.b.scheduleDirect(this));
    }

    @Override
    public final void run() {
        Throwable throwable0 = this.d;
        MaybeObserver maybeObserver0 = this.a;
        if(throwable0 != null) {
            this.d = null;
            maybeObserver0.onError(throwable0);
            return;
        }
        Object object0 = this.c;
        if(object0 != null) {
            this.c = null;
            maybeObserver0.onSuccess(object0);
            return;
        }
        maybeObserver0.onComplete();
    }
}

