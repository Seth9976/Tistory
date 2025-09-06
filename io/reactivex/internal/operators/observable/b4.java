package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class b4 extends AtomicInteger implements Observer, Disposable, Runnable {
    public final Observer a;
    public final long b;
    public final TimeUnit c;
    public final Worker d;
    public final boolean e;
    public final AtomicReference f;
    public Disposable g;
    public volatile boolean h;
    public Throwable i;
    public volatile boolean j;
    public volatile boolean k;
    public boolean l;

    public b4(Observer observer0, long v, TimeUnit timeUnit0, Worker scheduler$Worker0, boolean z) {
        this.a = observer0;
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler$Worker0;
        this.e = z;
        this.f = new AtomicReference();
    }

    public final void a() {
        if(this.getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference0 = this.f;
        Observer observer0 = this.a;
        int v = 1;
        while(true) {
            if(this.j) {
                atomicReference0.lazySet(null);
                return;
            }
            boolean z = this.h;
            if(z && this.i != null) {
                atomicReference0.lazySet(null);
                observer0.onError(this.i);
                this.d.dispose();
                return;
            }
            boolean z1 = atomicReference0.get() == null;
            if(z) {
                Object object0 = atomicReference0.getAndSet(null);
                if(!z1 && this.e) {
                    observer0.onNext(object0);
                }
                observer0.onComplete();
                this.d.dispose();
                return;
            }
            if(!z1) {
                if(this.l && !this.k) {
                    goto label_28;
                }
            }
            else if(this.k) {
                this.l = false;
                this.k = false;
                goto label_28;
            }
            else {
            label_28:
                v = this.addAndGet(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            observer0.onNext(atomicReference0.getAndSet(null));
            this.k = false;
            this.l = true;
            this.d.schedule(this, this.b, this.c);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.j = true;
        this.g.dispose();
        this.d.dispose();
        if(this.getAndIncrement() == 0) {
            this.f.lazySet(null);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.j;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.h = true;
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.i = throwable0;
        this.h = true;
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        this.f.set(object0);
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.g, disposable0)) {
            this.g = disposable0;
            this.a.onSubscribe(this);
        }
    }

    @Override
    public final void run() {
        this.k = true;
        this.a();
    }
}

