package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class CallbackCompletableObserver extends AtomicReference implements CompletableObserver, Disposable, Consumer, LambdaConsumerIntrospection {
    public final Consumer a;
    public final Action b;

    public CallbackCompletableObserver(Action action0) {
        this.a = this;
        this.b = action0;
    }

    public CallbackCompletableObserver(Consumer consumer0, Action action0) {
        this.a = consumer0;
        this.b = action0;
    }

    @Override  // io.reactivex.functions.Consumer
    public void accept(Object object0) throws Exception {
        this.accept(((Throwable)object0));
    }

    public void accept(Throwable throwable0) {
        RxJavaPlugins.onError(new OnErrorNotImplementedException(throwable0));
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        return this.a != this;
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.get() == DisposableHelper.DISPOSED;
    }

    @Override  // io.reactivex.CompletableObserver
    public void onComplete() {
        try {
            this.b.run();
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            RxJavaPlugins.onError(throwable0);
        }
        this.lazySet(DisposableHelper.DISPOSED);
    }

    @Override  // io.reactivex.CompletableObserver
    public void onError(Throwable throwable0) {
        try {
            this.a.accept(throwable0);
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            RxJavaPlugins.onError(throwable1);
        }
        this.lazySet(DisposableHelper.DISPOSED);
    }

    @Override  // io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }
}

