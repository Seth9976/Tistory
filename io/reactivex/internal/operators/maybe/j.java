package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class j extends AtomicReference implements MaybeObserver, Disposable, Runnable {
    public final MaybeObserver a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public Object e;
    public Throwable f;

    public j(MaybeObserver maybeObserver0, long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.a = maybeObserver0;
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler0;
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
        DisposableHelper.replace(this, this.d.scheduleDirect(this, this.b, this.c));
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        this.f = throwable0;
        DisposableHelper.replace(this, this.d.scheduleDirect(this, this.b, this.c));
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.setOnce(this, disposable0)) {
            this.a.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        this.e = object0;
        DisposableHelper.replace(this, this.d.scheduleDirect(this, this.b, this.c));
    }

    @Override
    public final void run() {
        Throwable throwable0 = this.f;
        MaybeObserver maybeObserver0 = this.a;
        if(throwable0 != null) {
            maybeObserver0.onError(throwable0);
            return;
        }
        Object object0 = this.e;
        if(object0 != null) {
            maybeObserver0.onSuccess(object0);
            return;
        }
        maybeObserver0.onComplete();
    }
}

