package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class k implements CompletableObserver, Disposable {
    public final int a;
    public Object b;
    public Disposable c;

    public k() {
        this.a = 0;
        super();
    }

    public k(Object object0, int v) {
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
                this.c = DisposableHelper.DISPOSED;
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

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                this.c = DisposableHelper.DISPOSED;
                CompletableObserver completableObserver0 = (CompletableObserver)this.b;
                if(completableObserver0 != null) {
                    this.b = null;
                    completableObserver0.onComplete();
                }
                return;
            }
            case 1: {
                ((CompletableObserver)this.b).onComplete();
                return;
            }
            default: {
                this.c = DisposableHelper.DISPOSED;
                ((MaybeObserver)this.b).onComplete();
            }
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                this.c = DisposableHelper.DISPOSED;
                CompletableObserver completableObserver0 = (CompletableObserver)this.b;
                if(completableObserver0 != null) {
                    this.b = null;
                    completableObserver0.onError(throwable0);
                }
                return;
            }
            case 1: {
                ((CompletableObserver)this.b).onError(throwable0);
                return;
            }
            default: {
                this.c = DisposableHelper.DISPOSED;
                ((MaybeObserver)this.b).onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                if(DisposableHelper.validate(this.c, disposable0)) {
                    this.c = disposable0;
                    ((CompletableObserver)this.b).onSubscribe(this);
                }
                return;
            }
            case 1: {
                if(DisposableHelper.validate(this.c, disposable0)) {
                    this.c = disposable0;
                    ((CompletableObserver)this.b).onSubscribe(this);
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
}

