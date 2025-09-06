package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class a4 extends AtomicReference implements Observer, Disposable, Runnable {
    public final SerializedObserver a;
    public final long b;
    public final TimeUnit c;
    public final Worker d;
    public Disposable e;
    public volatile boolean f;
    public boolean g;

    public a4(SerializedObserver serializedObserver0, long v, TimeUnit timeUnit0, Worker scheduler$Worker0) {
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
        if(!this.g) {
            this.g = true;
            this.a.onComplete();
            this.d.dispose();
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
        this.d.dispose();
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(!this.f && !this.g) {
            this.f = true;
            this.a.onNext(object0);
            Disposable disposable0 = (Disposable)this.get();
            if(disposable0 != null) {
                disposable0.dispose();
            }
            DisposableHelper.replace(this, this.d.schedule(this, this.b, this.c));
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.e, disposable0)) {
            this.e = disposable0;
            this.a.onSubscribe(this);
        }
    }

    @Override
    public final void run() {
        this.f = false;
    }
}

