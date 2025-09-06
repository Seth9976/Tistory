package gd;

import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class j implements SingleObserver, Disposable {
    public final int a;
    public Object b;
    public Disposable c;

    public j() {
        this.a = 0;
        super();
    }

    public j(Object object0, int v) {
        this.a = v;
        this.b = object0;
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
                return;
            }
            default: {
                this.c.dispose();
                this.c = DisposableHelper.DISPOSED;
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
            default: {
                return this.c.isDisposed();
            }
        }
    }

    @Override  // io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                this.c = DisposableHelper.DISPOSED;
                SingleObserver singleObserver0 = (SingleObserver)this.b;
                if(singleObserver0 != null) {
                    this.b = null;
                    singleObserver0.onError(throwable0);
                }
                return;
            }
            case 1: {
                ((SingleObserver)this.b).onError(throwable0);
                return;
            }
            default: {
                this.c = DisposableHelper.DISPOSED;
                ((MaybeObserver)this.b).onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                if(DisposableHelper.validate(this.c, disposable0)) {
                    this.c = disposable0;
                    ((SingleObserver)this.b).onSubscribe(this);
                }
                return;
            }
            case 1: {
                if(DisposableHelper.validate(this.c, disposable0)) {
                    this.c = disposable0;
                    ((SingleObserver)this.b).onSubscribe(this);
                }
                return;
            }
            default: {
                if(DisposableHelper.validate(this.c, disposable0)) {
                    this.c = disposable0;
                    ((MaybeObserver)this.b).onSubscribe(this);
                }
            }
        }
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        switch(this.a) {
            case 0: {
                this.c = DisposableHelper.DISPOSED;
                SingleObserver singleObserver0 = (SingleObserver)this.b;
                if(singleObserver0 != null) {
                    this.b = null;
                    singleObserver0.onSuccess(object0);
                }
                return;
            }
            case 1: {
                ((SingleObserver)this.b).onSuccess(object0);
                return;
            }
            default: {
                this.c = DisposableHelper.DISPOSED;
                ((MaybeObserver)this.b).onSuccess(object0);
            }
        }
    }
}

