package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class h implements Observer, Disposable {
    public final int a;
    public final SingleObserver b;
    public final Predicate c;
    public Disposable d;
    public boolean e;

    public h(SingleObserver singleObserver0, Predicate predicate0, int v) {
        this.a = v;
        this.b = singleObserver0;
        this.c = predicate0;
        super();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            this.d.dispose();
            return;
        }
        this.d.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.a != 0) {
            if(!this.e) {
                this.e = true;
                this.b.onSuccess(Boolean.FALSE);
            }
            return;
        }
        if(!this.e) {
            this.e = true;
            this.b.onSuccess(Boolean.TRUE);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            if(this.e) {
                RxJavaPlugins.onError(throwable0);
                return;
            }
            this.e = true;
            this.b.onError(throwable0);
            return;
        }
        if(this.e) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.e = true;
        this.b.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.a != 0) {
            if(!this.e) {
                try {
                    if(this.c.test(object0)) {
                        goto label_9;
                    }
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    this.d.dispose();
                    this.onError(throwable0);
                }
                return;
            label_9:
                this.e = true;
                this.d.dispose();
                this.b.onSuccess(Boolean.TRUE);
                return;
            }
            return;
        }
        if(!this.e) {
            try {
                if(!this.c.test(object0)) {
                    goto label_22;
                }
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                this.d.dispose();
                this.onError(throwable1);
            }
            return;
        label_22:
            this.e = true;
            this.d.dispose();
            this.b.onSuccess(Boolean.FALSE);
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

