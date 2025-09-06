package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;

public final class c4 implements Observer, Disposable {
    public final Observer a;
    public final TimeUnit b;
    public final Scheduler c;
    public long d;
    public Disposable e;

    public c4(Observer observer0, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.a = observer0;
        this.c = scheduler0;
        this.b = timeUnit0;
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
        this.a.onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        long v = this.c.now(this.b);
        long v1 = this.d;
        this.d = v;
        Timed timed0 = new Timed(object0, v - v1, this.b);
        this.a.onNext(timed0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.e, disposable0)) {
            this.e = disposable0;
            this.d = this.c.now(this.b);
            this.a.onSubscribe(this);
        }
    }
}

