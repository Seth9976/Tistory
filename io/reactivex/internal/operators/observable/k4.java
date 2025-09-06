package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

public final class k4 extends AtomicBoolean implements Observer, Disposable {
    public final Observer a;
    public final Object b;
    public final Consumer c;
    public final boolean d;
    public Disposable e;

    public k4(Observer observer0, Object object0, Consumer consumer0, boolean z) {
        this.a = observer0;
        this.b = object0;
        this.c = consumer0;
        this.d = z;
    }

    public final void a() {
        if(this.compareAndSet(false, true)) {
            try {
                this.c.accept(this.b);
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                RxJavaPlugins.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.a();
        this.e.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        Observer observer0 = this.a;
        if(this.d) {
            if(this.compareAndSet(false, true)) {
                try {
                    this.c.accept(this.b);
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    observer0.onError(throwable0);
                    return;
                }
            }
            this.e.dispose();
            observer0.onComplete();
            return;
        }
        observer0.onComplete();
        this.e.dispose();
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        Observer observer0 = this.a;
        if(this.d) {
            if(this.compareAndSet(false, true)) {
                try {
                    this.c.accept(this.b);
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    throwable0 = new CompositeException(new Throwable[]{throwable0, throwable1});
                }
            }
            this.e.dispose();
            observer0.onError(throwable0);
            return;
        }
        observer0.onError(throwable0);
        this.e.dispose();
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.e, disposable0)) {
            this.e = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

