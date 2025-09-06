package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class ConsumerSingleObserver extends AtomicReference implements SingleObserver, Disposable, LambdaConsumerIntrospection {
    public final Consumer a;
    public final Consumer b;

    public ConsumerSingleObserver(Consumer consumer0, Consumer consumer1) {
        this.a = consumer0;
        this.b = consumer1;
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        return this.b != Functions.ON_ERROR_MISSING;
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.get() == DisposableHelper.DISPOSED;
    }

    @Override  // io.reactivex.SingleObserver
    public void onError(Throwable throwable0) {
        this.lazySet(DisposableHelper.DISPOSED);
        try {
            this.b.accept(throwable0);
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            RxJavaPlugins.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
        }
    }

    @Override  // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }

    @Override  // io.reactivex.SingleObserver
    public void onSuccess(Object object0) {
        this.lazySet(DisposableHelper.DISPOSED);
        try {
            this.a.accept(object0);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            RxJavaPlugins.onError(throwable0);
        }
    }
}

