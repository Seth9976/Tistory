package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class n4 extends AtomicInteger implements Observer, Disposable, Runnable {
    public final Observer a;
    public final int b;
    public final p c;
    public final AtomicReference d;
    public final AtomicInteger e;
    public final MpscLinkedQueue f;
    public final AtomicThrowable g;
    public final AtomicBoolean h;
    public volatile boolean i;
    public UnicastSubject j;
    public static final Object k;

    static {
        n4.k = new Object();
    }

    public n4(Observer observer0, int v) {
        this.a = observer0;
        this.b = v;
        this.c = new p(this, 1);
        this.d = new AtomicReference();
        this.e = new AtomicInteger(1);
        this.f = new MpscLinkedQueue();
        this.g = new AtomicThrowable();
        this.h = new AtomicBoolean();
    }

    public final void a() {
        if(this.getAndIncrement() != 0) {
            return;
        }
        Observer observer0 = this.a;
        MpscLinkedQueue mpscLinkedQueue0 = this.f;
        AtomicThrowable atomicThrowable0 = this.g;
        int v = 1;
        while(true) {
            if(this.e.get() == 0) {
                mpscLinkedQueue0.clear();
                this.j = null;
                return;
            }
            UnicastSubject unicastSubject0 = this.j;
            boolean z = this.i;
            if(z && atomicThrowable0.get() != null) {
                mpscLinkedQueue0.clear();
                Throwable throwable0 = atomicThrowable0.terminate();
                if(unicastSubject0 != null) {
                    this.j = null;
                    unicastSubject0.onError(throwable0);
                }
                observer0.onError(throwable0);
                return;
            }
            Object object0 = mpscLinkedQueue0.poll();
            if(z && object0 == null) {
                Throwable throwable1 = atomicThrowable0.terminate();
                if(throwable1 == null) {
                    if(unicastSubject0 != null) {
                        this.j = null;
                        unicastSubject0.onComplete();
                    }
                    observer0.onComplete();
                    return;
                }
                if(unicastSubject0 != null) {
                    this.j = null;
                    unicastSubject0.onError(throwable1);
                }
                observer0.onError(throwable1);
                return;
            }
            if(object0 == null) {
                v = this.addAndGet(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            if(object0 == n4.k) {
                if(unicastSubject0 != null) {
                    this.j = null;
                    unicastSubject0.onComplete();
                }
                if(!this.h.get()) {
                    UnicastSubject unicastSubject1 = UnicastSubject.create(this.b, this);
                    this.j = unicastSubject1;
                    this.e.getAndIncrement();
                    observer0.onNext(unicastSubject1);
                }
            }
            else {
                unicastSubject0.onNext(object0);
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.h.compareAndSet(false, true)) {
            this.c.dispose();
            if(this.e.decrementAndGet() == 0) {
                DisposableHelper.dispose(this.d);
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.h.get();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.c.dispose();
        this.i = true;
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.c.dispose();
        if(this.g.addThrowable(throwable0)) {
            this.i = true;
            this.a();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        this.f.offer(object0);
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.setOnce(this.d, disposable0)) {
            this.f.offer(n4.k);
            this.a();
        }
    }

    @Override
    public final void run() {
        if(this.e.decrementAndGet() == 0) {
            DisposableHelper.dispose(this.d);
        }
    }
}

