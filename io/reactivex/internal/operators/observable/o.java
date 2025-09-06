package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class o extends AtomicReference implements Observer, Disposable {
    public final n a;
    public final long b;

    public o(n n0, long v) {
        this.a = n0;
        this.b = v;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() == DisposableHelper.DISPOSED;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        Object object0 = this.get();
        DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
        if(object0 != disposableHelper0) {
            this.lazySet(disposableHelper0);
            this.a.a(this, this.b);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        Object object0 = this.get();
        DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
        if(object0 != disposableHelper0) {
            this.lazySet(disposableHelper0);
            DisposableHelper.dispose(this.a.f);
            this.a.e.delete(this);
            this.a.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        Disposable disposable0 = (Disposable)this.get();
        DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
        if(disposable0 != disposableHelper0) {
            this.lazySet(disposableHelper0);
            disposable0.dispose();
            this.a.a(this, this.b);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }
}

