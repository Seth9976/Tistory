package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableEmitter;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Cancellable;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class j0 extends AtomicReference implements ObservableEmitter, Disposable {
    public final Observer a;

    public j0(Observer observer0) {
        this.a = observer0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.ObservableEmitter, io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.Emitter
    public final void onComplete() {
        if(!this.isDisposed()) {
            try {
                this.a.onComplete();
            }
            finally {
                DisposableHelper.dispose(this);
            }
        }
    }

    @Override  // io.reactivex.Emitter
    public final void onError(Throwable throwable0) {
        if(!this.tryOnError(throwable0)) {
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // io.reactivex.Emitter
    public final void onNext(Object object0) {
        if(object0 == null) {
            this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        if(!this.isDisposed()) {
            this.a.onNext(object0);
        }
    }

    @Override  // io.reactivex.ObservableEmitter
    public final ObservableEmitter serialize() {
        return new k0(this);
    }

    @Override  // io.reactivex.ObservableEmitter
    public final void setCancellable(Cancellable cancellable0) {
        DisposableHelper.set(this, new CancellableDisposable(cancellable0));
    }

    @Override  // io.reactivex.ObservableEmitter
    public final void setDisposable(Disposable disposable0) {
        DisposableHelper.set(this, disposable0);
    }

    // 去混淆评级： 低(40)
    @Override
    public final String toString() {
        return "j0{" + super.toString() + "}";
    }

    @Override  // io.reactivex.ObservableEmitter
    public final boolean tryOnError(Throwable throwable0) {
        if(throwable0 == null) {
            throwable0 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if(!this.isDisposed()) {
            try {
                this.a.onError(throwable0);
                return true;
            }
            finally {
                DisposableHelper.dispose(this);
            }
        }
        return false;
    }
}

