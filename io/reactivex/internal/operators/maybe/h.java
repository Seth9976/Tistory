package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class h implements MaybeObserver, Disposable {
    public final int a;
    public final SingleObserver b;
    public Disposable c;

    public h(SingleObserver singleObserver0, int v) {
        this.a = v;
        this.b = singleObserver0;
        super();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            this.c.dispose();
            this.c = DisposableHelper.DISPOSED;
            return;
        }
        this.c.dispose();
        this.c = DisposableHelper.DISPOSED;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c.isDisposed();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        if(this.a != 0) {
            this.c = DisposableHelper.DISPOSED;
            this.b.onSuccess(Boolean.TRUE);
            return;
        }
        this.c = DisposableHelper.DISPOSED;
        this.b.onSuccess(0L);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            this.c = DisposableHelper.DISPOSED;
            this.b.onError(throwable0);
            return;
        }
        this.c = DisposableHelper.DISPOSED;
        this.b.onError(throwable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            if(DisposableHelper.validate(this.c, disposable0)) {
                this.c = disposable0;
                this.b.onSubscribe(this);
            }
            return;
        }
        if(DisposableHelper.validate(this.c, disposable0)) {
            this.c = disposable0;
            this.b.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        if(this.a != 0) {
            this.c = DisposableHelper.DISPOSED;
            this.b.onSuccess(Boolean.FALSE);
            return;
        }
        this.c = DisposableHelper.DISPOSED;
        this.b.onSuccess(1L);
    }
}

