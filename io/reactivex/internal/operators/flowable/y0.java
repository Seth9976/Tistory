package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.observable.n0;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class y0 extends AtomicReference implements Disposable, Runnable {
    public final int a;
    public final Object b;
    public final long c;
    public final AtomicBoolean d;
    public final Object e;

    public y0(Object object0, long v, z0 z00) {
        this.a = 0;
        super();
        this.d = new AtomicBoolean();
        this.b = object0;
        this.c = v;
        this.e = z00;
    }

    public y0(Object object0, long v, n0 n00) {
        this.a = 1;
        super();
        this.d = new AtomicBoolean();
        this.b = object0;
        this.c = v;
        this.e = n00;
    }

    public void a() {
        if(this.d.compareAndSet(false, true)) {
            z0 z00 = (z0)this.e;
            Object object0 = this.b;
            if(this.c == z00.g) {
                if(z00.get() != 0L) {
                    z00.a.onNext(object0);
                    BackpressureHelper.produced(z00, 1L);
                    DisposableHelper.dispose(this);
                    return;
                }
                z00.cancel();
                MissingBackpressureException missingBackpressureException0 = new MissingBackpressureException("Could not deliver value due to lack of requests");
                z00.a.onError(missingBackpressureException0);
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            DisposableHelper.dispose(this);
            return;
        }
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() == DisposableHelper.DISPOSED;
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            if(this.d.compareAndSet(false, true)) {
                n0 n00 = (n0)this.e;
                Object object0 = this.b;
                if(this.c == n00.g) {
                    n00.a.onNext(object0);
                    DisposableHelper.dispose(this);
                }
            }
            return;
        }
        this.a();
    }
}

