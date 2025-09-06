package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeEmitter;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Cancellable;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class i extends AtomicReference implements MaybeEmitter, Disposable {
    public final MaybeObserver a;

    public i(MaybeObserver maybeObserver0) {
        this.a = maybeObserver0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.MaybeEmitter, io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.MaybeEmitter
    public final void onComplete() {
        Object object0 = this.get();
        DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
        if(object0 != disposableHelper0) {
            Disposable disposable0 = (Disposable)this.getAndSet(disposableHelper0);
            if(disposable0 != disposableHelper0) {
                try {
                    this.a.onComplete();
                }
                catch(Throwable throwable0) {
                    if(disposable0 != null) {
                        disposable0.dispose();
                    }
                    throw throwable0;
                }
                if(disposable0 != null) {
                    disposable0.dispose();
                }
            }
        }
    }

    @Override  // io.reactivex.MaybeEmitter
    public final void onError(Throwable throwable0) {
        if(!this.tryOnError(throwable0)) {
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // io.reactivex.MaybeEmitter
    public final void onSuccess(Object object0) {
        Object object1 = this.get();
        DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
        if(object1 != disposableHelper0) {
            Disposable disposable0 = (Disposable)this.getAndSet(disposableHelper0);
            if(disposable0 != disposableHelper0) {
                try {
                    MaybeObserver maybeObserver0 = this.a;
                    if(object0 == null) {
                        maybeObserver0.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                    }
                    else {
                        maybeObserver0.onSuccess(object0);
                        goto label_15;
                    label_12:
                        if(disposable0 == null) {
                            throw throwable0;
                        }
                        goto label_13;
                    }
                    goto label_15;
                }
                catch(Throwable throwable0) {
                    goto label_12;
                }
            label_13:
                disposable0.dispose();
                throw throwable0;
            label_15:
                if(disposable0 != null) {
                    disposable0.dispose();
                }
            }
        }
    }

    @Override  // io.reactivex.MaybeEmitter
    public final void setCancellable(Cancellable cancellable0) {
        DisposableHelper.set(this, new CancellableDisposable(cancellable0));
    }

    @Override  // io.reactivex.MaybeEmitter
    public final void setDisposable(Disposable disposable0) {
        DisposableHelper.set(this, disposable0);
    }

    // 去混淆评级： 低(40)
    @Override
    public final String toString() {
        return "i{" + super.toString() + "}";
    }

    @Override  // io.reactivex.MaybeEmitter
    public final boolean tryOnError(Throwable throwable0) {
        if(throwable0 == null) {
            throwable0 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        Object object0 = this.get();
        DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
        if(object0 != disposableHelper0) {
            Disposable disposable0 = (Disposable)this.getAndSet(disposableHelper0);
            if(disposable0 != disposableHelper0) {
                try {
                    this.a.onError(throwable0);
                }
                catch(Throwable throwable1) {
                    if(disposable0 != null) {
                        disposable0.dispose();
                    }
                    throw throwable1;
                }
                if(disposable0 != null) {
                    disposable0.dispose();
                }
                return true;
            }
        }
        return false;
    }
}

