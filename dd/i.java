package dd;

import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Cancellable;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class i extends AtomicReference implements CompletableEmitter, Disposable {
    public final CompletableObserver a;

    public i(CompletableObserver completableObserver0) {
        this.a = completableObserver0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.CompletableEmitter, io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.CompletableEmitter
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

    @Override  // io.reactivex.CompletableEmitter
    public final void onError(Throwable throwable0) {
        if(!this.tryOnError(throwable0)) {
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // io.reactivex.CompletableEmitter
    public final void setCancellable(Cancellable cancellable0) {
        DisposableHelper.set(this, new CancellableDisposable(cancellable0));
    }

    @Override  // io.reactivex.CompletableEmitter
    public final void setDisposable(Disposable disposable0) {
        DisposableHelper.set(this, disposable0);
    }

    // 去混淆评级： 低(40)
    @Override
    public final String toString() {
        return "i{" + super.toString() + "}";
    }

    @Override  // io.reactivex.CompletableEmitter
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

