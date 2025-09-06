package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

public final class w3 implements Observer, Disposable {
    public final Observer a;
    public boolean b;
    public Disposable c;
    public long d;

    public w3(Observer observer0, long v) {
        this.a = observer0;
        this.d = v;
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
        if(!this.b) {
            this.b = true;
            this.c.dispose();
            this.a.onComplete();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.b) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.b = true;
        this.c.dispose();
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(!this.b) {
            long v = this.d;
            this.d = v - 1L;
            if(v > 0L) {
                this.a.onNext(object0);
                if(v - 1L == 0L) {
                    this.onComplete();
                }
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.c, disposable0)) {
            this.c = disposable0;
            Observer observer0 = this.a;
            if(Long.compare(this.d, 0L) == 0) {
                this.b = true;
                disposable0.dispose();
                EmptyDisposable.complete(observer0);
                return;
            }
            observer0.onSubscribe(this);
        }
    }
}

