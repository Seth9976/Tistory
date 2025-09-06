package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class r4 extends AtomicInteger implements Observer, Disposable, Runnable {
    public final Observer a;
    public final int b;
    public final AtomicReference c;
    public final AtomicInteger d;
    public final MpscLinkedQueue e;
    public final AtomicThrowable f;
    public final AtomicBoolean g;
    public final Callable h;
    public Disposable i;
    public volatile boolean j;
    public UnicastSubject k;
    public static final p l;
    public static final Object m;

    static {
        r4.l = new p(null, 2);
        r4.m = new Object();
    }

    public r4(Observer observer0, int v, Callable callable0) {
        this.a = observer0;
        this.b = v;
        this.c = new AtomicReference();
        this.d = new AtomicInteger(1);
        this.e = new MpscLinkedQueue();
        this.f = new AtomicThrowable();
        this.g = new AtomicBoolean();
        this.h = callable0;
    }

    public final void a() {
        Disposable disposable0 = (Disposable)this.c.getAndSet(r4.l);
        if(disposable0 != null && disposable0 != r4.l) {
            disposable0.dispose();
        }
    }

    public final void b() {
        ObservableSource observableSource0;
        if(this.getAndIncrement() != 0) {
            return;
        }
        Observer observer0 = this.a;
        MpscLinkedQueue mpscLinkedQueue0 = this.e;
        AtomicThrowable atomicThrowable0 = this.f;
        int v = 1;
        while(true) {
            if(this.d.get() == 0) {
                mpscLinkedQueue0.clear();
                this.k = null;
                return;
            }
            UnicastSubject unicastSubject0 = this.k;
            boolean z = this.j;
            if(z && atomicThrowable0.get() != null) {
                mpscLinkedQueue0.clear();
                Throwable throwable0 = atomicThrowable0.terminate();
                if(unicastSubject0 != null) {
                    this.k = null;
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
                        this.k = null;
                        unicastSubject0.onComplete();
                    }
                    observer0.onComplete();
                    return;
                }
                if(unicastSubject0 != null) {
                    this.k = null;
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
            if(object0 == r4.m) {
                if(unicastSubject0 != null) {
                    this.k = null;
                    unicastSubject0.onComplete();
                }
                if(!this.g.get()) {
                    UnicastSubject unicastSubject1 = UnicastSubject.create(this.b, this);
                    this.k = unicastSubject1;
                    this.d.getAndIncrement();
                    try {
                        observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(this.h.call(), "The other Callable returned a null ObservableSource");
                    }
                    catch(Throwable throwable2) {
                        Exceptions.throwIfFatal(throwable2);
                        atomicThrowable0.addThrowable(throwable2);
                        this.j = true;
                        continue;
                    }
                    p p0 = new p(this, 2);
                    AtomicReference atomicReference0 = this.c;
                    do {
                        if(atomicReference0.compareAndSet(null, p0)) {
                            observableSource0.subscribe(p0);
                            observer0.onNext(unicastSubject1);
                            break;
                        }
                    }
                    while(atomicReference0.get() == null);
                }
            }
            else {
                unicastSubject0.onNext(object0);
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.g.compareAndSet(false, true)) {
            this.a();
            if(this.d.decrementAndGet() == 0) {
                this.i.dispose();
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.g.get();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.a();
        this.j = true;
        this.b();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.a();
        if(this.f.addThrowable(throwable0)) {
            this.j = true;
            this.b();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        this.e.offer(object0);
        this.b();
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.i, disposable0)) {
            this.i = disposable0;
            this.a.onSubscribe(this);
            this.e.offer(r4.m);
            this.b();
        }
    }

    @Override
    public final void run() {
        if(this.d.decrementAndGet() == 0) {
            this.i.dispose();
        }
    }
}

