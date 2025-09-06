package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;

public final class h1 implements Observer, Disposable {
    public final int a;
    public final Observer b;
    public final Function c;
    public Disposable d;

    public h1(Observer observer0, Function function0, int v) {
        this.a = v;
        this.b = observer0;
        this.c = function0;
        super();
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
        return this.d.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.a != 0) {
            this.b.onComplete();
            return;
        }
        DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
        if(this.d != disposableHelper0) {
            this.d = disposableHelper0;
            this.b.onComplete();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        Object object0;
        Observer observer0;
        if(this.a != 0) {
            try {
                observer0 = this.b;
                object0 = this.c.apply(throwable0);
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                observer0.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
                return;
            }
            if(object0 == null) {
                NullPointerException nullPointerException0 = new NullPointerException("The supplied value is null");
                nullPointerException0.initCause(throwable0);
                observer0.onError(nullPointerException0);
                return;
            }
            observer0.onNext(object0);
            observer0.onComplete();
            return;
        }
        DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
        if(this.d == disposableHelper0) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.d = disposableHelper0;
        this.b.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        Object object2;
        Iterator iterator0;
        if(this.a != 0) {
            this.b.onNext(object0);
            return;
        }
        if(this.d != DisposableHelper.DISPOSED) {
            try {
                iterator0 = ((Iterable)this.c.apply(object0)).iterator();
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                this.d.dispose();
                this.onError(throwable0);
                return;
            }
            while(true) {
                try {
                    if(!iterator0.hasNext()) {
                        break;
                    }
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    this.d.dispose();
                    this.onError(throwable1);
                    return;
                }
                try {
                    Object object1 = iterator0.next();
                    object2 = ObjectHelper.requireNonNull(object1, "The iterator returned a null value");
                }
                catch(Throwable throwable2) {
                    Exceptions.throwIfFatal(throwable2);
                    this.d.dispose();
                    this.onError(throwable2);
                    return;
                }
                this.b.onNext(object2);
            }
        }
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

