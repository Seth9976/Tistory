package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

public final class z0 implements Observer, Disposable {
    public final Observer a;
    public final long b;
    public final Object c;
    public final boolean d;
    public Disposable e;
    public long f;
    public boolean g;

    public z0(Observer observer0, long v, Object object0, boolean z) {
        this.a = observer0;
        this.b = v;
        this.c = object0;
        this.d = z;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.e.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.e.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(!this.g) {
            this.g = true;
            Observer observer0 = this.a;
            Object object0 = this.c;
            if(object0 == null && this.d) {
                observer0.onError(new NoSuchElementException());
                return;
            }
            if(object0 != null) {
                observer0.onNext(object0);
            }
            observer0.onComplete();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.g) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.g = true;
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.g) {
            return;
        }
        long v = this.f;
        if(v == this.b) {
            this.g = true;
            this.e.dispose();
            this.a.onNext(object0);
            this.a.onComplete();
            return;
        }
        this.f = v + 1L;
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.e, disposable0)) {
            this.e = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

