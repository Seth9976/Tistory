package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class EmptyCompletableObserver extends AtomicReference implements CompletableObserver, Disposable, LambdaConsumerIntrospection {
    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        return false;
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.get() == DisposableHelper.DISPOSED;
    }

    @Override  // io.reactivex.CompletableObserver
    public void onComplete() {
        this.lazySet(DisposableHelper.DISPOSED);
    }

    @Override  // io.reactivex.CompletableObserver
    public void onError(Throwable throwable0) {
        this.lazySet(DisposableHelper.DISPOSED);
        RxJavaPlugins.onError(new OnErrorNotImplementedException(throwable0));
    }

    @Override  // io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }
}

