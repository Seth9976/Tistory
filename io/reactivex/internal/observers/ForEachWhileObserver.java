package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class ForEachWhileObserver extends AtomicReference implements Observer, Disposable {
    public final Predicate a;
    public final Consumer b;
    public final Action c;
    public boolean d;

    public ForEachWhileObserver(Predicate predicate0, Consumer consumer0, Action action0) {
        this.a = predicate0;
        this.b = consumer0;
        this.c = action0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.Observer
    public void onComplete() {
        if(this.d) {
            return;
        }
        try {
            this.d = true;
            this.c.run();
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // io.reactivex.Observer
    public void onError(Throwable throwable0) {
        if(this.d) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        try {
            this.d = true;
            this.b.accept(throwable0);
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            RxJavaPlugins.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
        }
    }

    @Override  // io.reactivex.Observer
    public void onNext(Object object0) {
        if(this.d) {
            return;
        }
        try {
            if(!this.a.test(object0)) {
                goto label_9;
            }
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.dispose();
            this.onError(throwable0);
        }
        return;
    label_9:
        this.dispose();
        this.onComplete();
    }

    @Override  // io.reactivex.Observer
    public void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }
}

