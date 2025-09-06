package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class g4 extends AtomicReference implements Observer, Disposable, TimeoutSupport {
    public final Observer a;
    public final long b;
    public final TimeUnit c;
    public final Worker d;
    public final SequentialDisposable e;
    public final AtomicLong f;
    public final AtomicReference g;
    public ObservableSource h;

    public g4(Observer observer0, long v, TimeUnit timeUnit0, Worker scheduler$Worker0, ObservableSource observableSource0) {
        this.a = observer0;
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler$Worker0;
        this.h = observableSource0;
        this.e = new SequentialDisposable();
        this.f = new AtomicLong();
        this.g = new AtomicReference();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this.g);
        DisposableHelper.dispose(this);
        this.d.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.f.getAndSet(0x7FFFFFFFFFFFFFFFL) != 0x7FFFFFFFFFFFFFFFL) {
            this.e.dispose();
            this.a.onComplete();
            this.d.dispose();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.f.getAndSet(0x7FFFFFFFFFFFFFFFL) != 0x7FFFFFFFFFFFFFFFL) {
            this.e.dispose();
            this.a.onError(throwable0);
            this.d.dispose();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        long v = this.f.get();
        if(v != 0x7FFFFFFFFFFFFFFFL && this.f.compareAndSet(v, v + 1L)) {
            ((Disposable)this.e.get()).dispose();
            this.a.onNext(object0);
            i4 i40 = new i4(v + 1L, this);
            Disposable disposable0 = this.d.schedule(i40, this.b, this.c);
            this.e.replace(disposable0);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this.g, disposable0);
    }

    @Override  // io.reactivex.internal.operators.observable.ObservableTimeoutTimed$TimeoutSupport
    public final void onTimeout(long v) {
        if(this.f.compareAndSet(v, 0x7FFFFFFFFFFFFFFFL)) {
            DisposableHelper.dispose(this.g);
            ObservableSource observableSource0 = this.h;
            this.h = null;
            observableSource0.subscribe(new i2(this.a, this, 1));
            this.d.dispose();
        }
    }
}

