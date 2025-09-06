package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class LambdaObserver extends AtomicReference implements Observer, Disposable, LambdaConsumerIntrospection {
    public final Consumer a;
    public final Consumer b;
    public final Action c;
    public final Consumer d;

    public LambdaObserver(Consumer consumer0, Consumer consumer1, Action action0, Consumer consumer2) {
        this.a = consumer0;
        this.b = consumer1;
        this.c = action0;
        this.d = consumer2;
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

    @Override  // io.reactivex.Observer
    public void onComplete() {
        if(!this.isDisposed()) {
            this.lazySet(DisposableHelper.DISPOSED);
            try {
                this.c.run();
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                RxJavaPlugins.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public void onError(Throwable throwable0) {
        if(!this.isDisposed()) {
            this.lazySet(DisposableHelper.DISPOSED);
            try {
                this.b.accept(throwable0);
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                RxJavaPlugins.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
            }
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public void onNext(Object object0) {
        if(!this.isDisposed()) {
            try {
                this.a.accept(object0);
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                ((Disposable)this.get()).dispose();
                this.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.setOnce(this, disposable0)) {
            try {
                this.d.accept(this);
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                disposable0.dispose();
                this.onError(throwable0);
            }
        }
    }
}

