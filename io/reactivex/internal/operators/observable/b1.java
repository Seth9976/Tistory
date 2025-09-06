package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

public final class b1 implements Observer, Disposable {
    public final SingleObserver a;
    public final long b;
    public final Object c;
    public Disposable d;
    public long e;
    public boolean f;

    public b1(SingleObserver singleObserver0, long v, Object object0) {
        this.a = singleObserver0;
        this.b = v;
        this.c = object0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.d.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(!this.f) {
            this.f = true;
            SingleObserver singleObserver0 = this.a;
            Object object0 = this.c;
            if(object0 != null) {
                singleObserver0.onSuccess(object0);
                return;
            }
            singleObserver0.onError(new NoSuchElementException());
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.f) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.f = true;
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.f) {
            return;
        }
        long v = this.e;
        if(v == this.b) {
            this.f = true;
            this.d.dispose();
            this.a.onSuccess(object0);
            return;
        }
        this.e = v + 1L;
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.d, disposable0)) {
            this.d = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

