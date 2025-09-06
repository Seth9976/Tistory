package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class n implements MaybeObserver, Disposable {
    public final int a;
    public MaybeObserver b;
    public Disposable c;

    public n() {
        this.a = 0;
        super();
    }

    public n(MaybeObserver maybeObserver0, int v) {
        this.a = v;
        this.b = maybeObserver0;
        super();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        switch(this.a) {
            case 0: {
                this.b = null;
                this.c.dispose();
                this.c = DisposableHelper.DISPOSED;
                return;
            }
            case 1: {
                this.c.dispose();
                this.c = DisposableHelper.DISPOSED;
                return;
            }
            case 2: {
                this.c.dispose();
                this.c = DisposableHelper.DISPOSED;
                return;
            }
            default: {
                this.c.dispose();
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        switch(this.a) {
            case 0: {
                return this.c.isDisposed();
            }
            case 1: {
                return this.c.isDisposed();
            }
            case 2: {
                return this.c.isDisposed();
            }
            default: {
                return this.c.isDisposed();
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                this.c = DisposableHelper.DISPOSED;
                MaybeObserver maybeObserver0 = this.b;
                if(maybeObserver0 != null) {
                    this.b = null;
                    maybeObserver0.onComplete();
                }
                return;
            }
            case 1: {
                this.b.onComplete();
                return;
            }
            case 2: {
                this.c = DisposableHelper.DISPOSED;
                this.b.onComplete();
                return;
            }
            default: {
                this.b.onSuccess(Boolean.TRUE);
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                this.c = DisposableHelper.DISPOSED;
                MaybeObserver maybeObserver0 = this.b;
                if(maybeObserver0 != null) {
                    this.b = null;
                    maybeObserver0.onError(throwable0);
                }
                return;
            }
            case 1: {
                this.b.onError(throwable0);
                return;
            }
            case 2: {
                this.c = DisposableHelper.DISPOSED;
                this.b.onError(throwable0);
                return;
            }
            default: {
                this.b.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                if(DisposableHelper.validate(this.c, disposable0)) {
                    this.c = disposable0;
                    this.b.onSubscribe(this);
                }
                return;
            }
            case 1: {
                if(DisposableHelper.validate(this.c, disposable0)) {
                    this.c = disposable0;
                    this.b.onSubscribe(this);
                }
                return;
            }
            case 2: {
                if(DisposableHelper.validate(this.c, disposable0)) {
                    this.c = disposable0;
                    this.b.onSubscribe(this);
                }
                return;
            }
            default: {
                if(DisposableHelper.validate(this.c, disposable0)) {
                    this.c = disposable0;
                    this.b.onSubscribe(this);
                }
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        switch(this.a) {
            case 0: {
                this.c = DisposableHelper.DISPOSED;
                MaybeObserver maybeObserver0 = this.b;
                if(maybeObserver0 != null) {
                    this.b = null;
                    maybeObserver0.onSuccess(object0);
                }
                return;
            }
            case 1: {
                this.b.onSuccess(object0);
                return;
            }
            case 2: {
                this.c = DisposableHelper.DISPOSED;
                this.b.onComplete();
                return;
            }
            default: {
                this.b.onSuccess(Boolean.FALSE);
            }
        }
    }
}

