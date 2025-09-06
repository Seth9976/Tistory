package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class m3 implements Observer, Disposable {
    public final int a;
    public final Observer b;
    public final BiFunction c;
    public Object d;
    public Disposable e;
    public boolean f;

    public m3(Observer observer0, BiFunction biFunction0) {
        this.a = 0;
        super();
        this.b = observer0;
        this.c = biFunction0;
    }

    public m3(Observer observer0, BiFunction biFunction0, Object object0) {
        this.a = 1;
        super();
        this.b = observer0;
        this.c = biFunction0;
        this.d = object0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            this.e.dispose();
            return;
        }
        this.e.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.e.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.a != 0) {
            if(!this.f) {
                this.f = true;
                this.b.onComplete();
            }
            return;
        }
        if(!this.f) {
            this.f = true;
            this.b.onComplete();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            if(this.f) {
                RxJavaPlugins.onError(throwable0);
                return;
            }
            this.f = true;
            this.b.onError(throwable0);
            return;
        }
        if(this.f) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.f = true;
        this.b.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        Object object3;
        Object object1;
        if(this.a != 0) {
            if(!this.f) {
                try {
                    object1 = ObjectHelper.requireNonNull(this.c.apply(this.d, object0), "The accumulator returned a null value");
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    this.e.dispose();
                    this.onError(throwable0);
                    return;
                }
                this.d = object1;
                this.b.onNext(object1);
                return;
            }
            return;
        }
        if(!this.f) {
            Object object2 = this.d;
            Observer observer0 = this.b;
            if(object2 == null) {
                this.d = object0;
                observer0.onNext(object0);
                return;
            }
            try {
                object3 = ObjectHelper.requireNonNull(this.c.apply(object2, object0), "The value returned by the accumulator is null");
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                this.e.dispose();
                this.onError(throwable1);
                return;
            }
            this.d = object3;
            observer0.onNext(object3);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            if(DisposableHelper.validate(this.e, disposable0)) {
                this.e = disposable0;
                this.b.onSubscribe(this);
                this.b.onNext(this.d);
            }
            return;
        }
        if(DisposableHelper.validate(this.e, disposable0)) {
            this.e = disposable0;
            this.b.onSubscribe(this);
        }
    }
}

