package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class d4 extends AtomicReference implements Observer, Disposable {
    public final Object a;
    public final long b;

    public d4(long v, TimeoutSelectorSupport observableTimeout$TimeoutSelectorSupport0) {
        this.b = v;
        this.a = observableTimeout$TimeoutSelectorSupport0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        Object object0 = this.get();
        DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
        if(object0 != disposableHelper0) {
            this.lazySet(disposableHelper0);
            ((TimeoutSupport)this.a).onTimeout(this.b);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        Object object0 = this.get();
        DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
        if(object0 != disposableHelper0) {
            this.lazySet(disposableHelper0);
            ((TimeoutSelectorSupport)this.a).onTimeoutError(this.b, throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        Disposable disposable0 = (Disposable)this.get();
        DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
        if(disposable0 != disposableHelper0) {
            disposable0.dispose();
            this.lazySet(disposableHelper0);
            ((TimeoutSupport)this.a).onTimeout(this.b);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }
}

