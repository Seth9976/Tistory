package io.reactivex.internal.operators.observable;

import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class a1 implements Observer, Disposable {
    public final MaybeObserver a;
    public final long b;
    public Disposable c;
    public long d;
    public boolean e;

    public a1(MaybeObserver maybeObserver0, long v) {
        this.a = maybeObserver0;
        this.b = v;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.c.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(!this.e) {
            this.e = true;
            this.a.onComplete();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.e) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.e = true;
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.e) {
            return;
        }
        long v = this.d;
        if(v == this.b) {
            this.e = true;
            this.c.dispose();
            this.a.onSuccess(object0);
            return;
        }
        this.d = v + 1L;
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.c, disposable0)) {
            this.c = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

