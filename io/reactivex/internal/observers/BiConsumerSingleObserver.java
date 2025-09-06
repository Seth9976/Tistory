package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class BiConsumerSingleObserver extends AtomicReference implements SingleObserver, Disposable {
    public final BiConsumer a;

    public BiConsumerSingleObserver(BiConsumer biConsumer0) {
        this.a = biConsumer0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.get() == DisposableHelper.DISPOSED;
    }

    @Override  // io.reactivex.SingleObserver
    public void onError(Throwable throwable0) {
        try {
            this.lazySet(DisposableHelper.DISPOSED);
            this.a.accept(null, throwable0);
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
        try {
            this.lazySet(DisposableHelper.DISPOSED);
            this.a.accept(object0, null);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            RxJavaPlugins.onError(throwable0);
        }
    }
}

