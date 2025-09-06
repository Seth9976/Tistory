package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class c1 extends AtomicReference implements Observer {
    public final long a;
    public final d1 b;
    public volatile boolean c;
    public volatile SimpleQueue d;
    public int e;

    public c1(d1 d10, long v) {
        this.a = v;
        this.b = d10;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.c = true;
        this.b.c();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.b.h.addThrowable(throwable0)) {
            d1 d10 = this.b;
            if(!d10.c) {
                d10.b();
            }
            this.c = true;
            this.b.c();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.e == 0) {
            d1 d10 = this.b;
            if(d10.get() == 0 && d10.compareAndSet(0, 1)) {
                d10.a.onNext(object0);
                if(d10.decrementAndGet() != 0) {
                    d10.d();
                    return;
                }
                return;
            }
            SimpleQueue simpleQueue0 = this.d;
            if(simpleQueue0 == null) {
                simpleQueue0 = new SpscLinkedArrayQueue(d10.e);
                this.d = simpleQueue0;
            }
            simpleQueue0.offer(object0);
            if(d10.getAndIncrement() == 0) {
                d10.d();
            }
        }
        else {
            this.b.c();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.setOnce(this, disposable0) && disposable0 instanceof QueueDisposable) {
            int v = ((QueueDisposable)disposable0).requestFusion(7);
            if(v == 1) {
                this.e = 1;
                this.d = (QueueDisposable)disposable0;
                this.c = true;
                this.b.c();
                return;
            }
            if(v == 2) {
                this.e = 2;
                this.d = (QueueDisposable)disposable0;
            }
        }
    }
}

