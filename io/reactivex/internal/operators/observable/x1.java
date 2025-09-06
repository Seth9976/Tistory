package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

public final class x1 implements Observer, Disposable {
    public final int a;
    public final SingleObserver b;
    public Object c;
    public Disposable d;
    public Object e;

    public x1(SingleObserver singleObserver0, BiFunction biFunction0, Object object0) {
        this.a = 1;
        super();
        this.b = singleObserver0;
        this.c = object0;
        this.e = biFunction0;
    }

    public x1(SingleObserver singleObserver0, Object object0) {
        this.a = 0;
        super();
        this.b = singleObserver0;
        this.c = object0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            this.d.dispose();
            return;
        }
        this.d.dispose();
        this.d = DisposableHelper.DISPOSED;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.a == 0 ? this.d == DisposableHelper.DISPOSED : this.d.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.a != 0) {
            Object object0 = this.c;
            if(object0 != null) {
                this.c = null;
                this.b.onSuccess(object0);
            }
            return;
        }
        this.d = DisposableHelper.DISPOSED;
        Object object1 = this.e;
        SingleObserver singleObserver0 = this.b;
        if(object1 != null) {
            this.e = null;
            singleObserver0.onSuccess(object1);
            return;
        }
        Object object2 = this.c;
        if(object2 != null) {
            singleObserver0.onSuccess(object2);
            return;
        }
        singleObserver0.onError(new NoSuchElementException());
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            if(this.c != null) {
                this.c = null;
                this.b.onError(throwable0);
                return;
            }
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.d = DisposableHelper.DISPOSED;
        this.e = null;
        this.b.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.a != 0) {
            Object object1 = this.c;
            if(object1 != null) {
                try {
                    this.c = ObjectHelper.requireNonNull(((BiFunction)this.e).apply(object1, object0), "The reducer returned a null value");
                    return;
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    this.d.dispose();
                    this.onError(throwable0);
                }
            }
            return;
        }
        this.e = object0;
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            if(DisposableHelper.validate(this.d, disposable0)) {
                this.d = disposable0;
                this.b.onSubscribe(this);
            }
            return;
        }
        if(DisposableHelper.validate(this.d, disposable0)) {
            this.d = disposable0;
            this.b.onSubscribe(this);
        }
    }
}

