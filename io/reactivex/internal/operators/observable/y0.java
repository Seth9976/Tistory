package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class y0 implements Observer, Disposable {
    public final Observer a;
    public final Consumer b;
    public final Consumer c;
    public final Action d;
    public final Action e;
    public Disposable f;
    public boolean g;

    public y0(Observer observer0, Consumer consumer0, Consumer consumer1, Action action0, Action action1) {
        this.a = observer0;
        this.b = consumer0;
        this.c = consumer1;
        this.d = action0;
        this.e = action1;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.f.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.g) {
            return;
        }
        try {
            this.d.run();
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.onError(throwable0);
            return;
        }
        this.g = true;
        this.a.onComplete();
        try {
            this.e.run();
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            RxJavaPlugins.onError(throwable1);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.g) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        try {
            this.g = true;
            this.c.accept(throwable0);
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            throwable0 = new CompositeException(new Throwable[]{throwable0, throwable1});
        }
        this.a.onError(throwable0);
        try {
            this.e.run();
        }
        catch(Throwable throwable2) {
            Exceptions.throwIfFatal(throwable2);
            RxJavaPlugins.onError(throwable2);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.g) {
            return;
        }
        try {
            this.b.accept(object0);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.f.dispose();
            this.onError(throwable0);
            return;
        }
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.f, disposable0)) {
            this.f = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

