package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.flowable.y0;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

public final class n0 implements Observer, Disposable {
    public final SerializedObserver a;
    public final long b;
    public final TimeUnit c;
    public final Worker d;
    public Disposable e;
    public y0 f;
    public volatile long g;
    public boolean h;

    public n0(SerializedObserver serializedObserver0, long v, TimeUnit timeUnit0, Worker scheduler$Worker0) {
        this.a = serializedObserver0;
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler$Worker0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.e.dispose();
        this.d.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.h) {
            return;
        }
        this.h = true;
        y0 y00 = this.f;
        if(y00 != null) {
            DisposableHelper.dispose(y00);
        }
        if(y00 != null) {
            y00.run();
        }
        this.a.onComplete();
        this.d.dispose();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.h) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        y0 y00 = this.f;
        if(y00 != null) {
            DisposableHelper.dispose(y00);
        }
        this.h = true;
        this.a.onError(throwable0);
        this.d.dispose();
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.h) {
            return;
        }
        long v = this.g + 1L;
        this.g = v;
        y0 y00 = this.f;
        if(y00 != null) {
            DisposableHelper.dispose(y00);
        }
        y0 y01 = new y0(object0, v, this);
        this.f = y01;
        DisposableHelper.replace(y01, this.d.schedule(y01, this.b, this.c));
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.e, disposable0)) {
            this.e = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

