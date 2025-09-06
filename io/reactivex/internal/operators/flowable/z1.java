package io.reactivex.internal.operators.flowable;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.observable.g1;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class z1 extends AtomicReference implements SingleObserver, Disposable {
    public final int a;
    public final AtomicInteger b;

    public z1(AtomicInteger atomicInteger0, int v) {
        this.a = v;
        this.b = atomicInteger0;
        super();
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
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            g1 g10 = (g1)this.b;
            CompositeDisposable compositeDisposable0 = g10.d;
            compositeDisposable0.delete(this);
            if(g10.f.addThrowable(throwable0)) {
                if(!g10.c) {
                    g10.i.dispose();
                    compositeDisposable0.dispose();
                }
                g10.e.decrementAndGet();
                if(g10.getAndIncrement() == 0) {
                    g10.a();
                    return;
                }
            }
            else {
                RxJavaPlugins.onError(throwable0);
            }
            return;
        }
        y1 y10 = (y1)this.b;
        CompositeDisposable compositeDisposable1 = y10.f;
        compositeDisposable1.delete(this);
        if(y10.h.addThrowable(throwable0)) {
            if(!y10.c) {
                y10.k.cancel();
                compositeDisposable1.dispose();
            }
            else if(y10.d != 0x7FFFFFFF) {
                y10.k.request(1L);
            }
            y10.g.decrementAndGet();
            if(y10.getAndIncrement() == 0) {
                y10.b();
            }
        }
        else {
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            DisposableHelper.setOnce(this, disposable0);
            return;
        }
        DisposableHelper.setOnce(this, disposable0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        SpscLinkedArrayQueue spscLinkedArrayQueue1;
        if(this.a != 0) {
            boolean z = false;
            g1 g10 = (g1)this.b;
            g10.d.delete(this);
            if(g10.get() == 0 && g10.compareAndSet(0, 1)) {
                g10.b.onNext(object0);
                if(g10.e.decrementAndGet() == 0) {
                    z = true;
                }
                SpscLinkedArrayQueue spscLinkedArrayQueue0 = (SpscLinkedArrayQueue)g10.h.get();
                if(z && (spscLinkedArrayQueue0 == null || spscLinkedArrayQueue0.isEmpty())) {
                    Throwable throwable0 = g10.f.terminate();
                    if(throwable0 != null) {
                        g10.b.onError(throwable0);
                        return;
                    }
                    g10.b.onComplete();
                    return;
                }
                if(g10.decrementAndGet() == 0) {
                    return;
                }
                g10.a();
                return;
            }
            while(true) {
                AtomicReference atomicReference0 = g10.h;
                spscLinkedArrayQueue1 = (SpscLinkedArrayQueue)atomicReference0.get();
                if(spscLinkedArrayQueue1 != null) {
                    break;
                }
                spscLinkedArrayQueue1 = new SpscLinkedArrayQueue(0x80);
            label_24:
                if(atomicReference0.compareAndSet(null, spscLinkedArrayQueue1)) {
                    break;
                }
                if(atomicReference0.get() != null) {
                    continue;
                }
                if(false) {
                    break;
                }
                goto label_24;
            }
            synchronized(spscLinkedArrayQueue1) {
                spscLinkedArrayQueue1.offer(object0);
            }
            g10.e.decrementAndGet();
            if(g10.getAndIncrement() == 0) {
                g10.a();
            }
            return;
        }
        boolean z1 = false;
        y1 y10 = (y1)this.b;
        y10.f.delete(this);
        if(y10.get() == 0 && y10.compareAndSet(0, 1)) {
            if(y10.g.decrementAndGet() == 0) {
                z1 = true;
            }
            if(y10.e.get() == 0L) {
                SpscLinkedArrayQueue spscLinkedArrayQueue3 = y10.c();
                synchronized(spscLinkedArrayQueue3) {
                    spscLinkedArrayQueue3.offer(object0);
                }
            }
            else {
                y10.b.onNext(object0);
                SpscLinkedArrayQueue spscLinkedArrayQueue2 = (SpscLinkedArrayQueue)y10.j.get();
                if(z1 && (spscLinkedArrayQueue2 == null || spscLinkedArrayQueue2.isEmpty())) {
                    Throwable throwable1 = y10.h.terminate();
                    if(throwable1 != null) {
                        y10.b.onError(throwable1);
                        return;
                    }
                    y10.b.onComplete();
                    return;
                }
                BackpressureHelper.produced(y10.e, 1L);
                if(y10.d != 0x7FFFFFFF) {
                    y10.k.request(1L);
                }
            }
            if(y10.decrementAndGet() == 0) {
                return;
            }
            y10.b();
            return;
        }
        SpscLinkedArrayQueue spscLinkedArrayQueue4 = y10.c();
        synchronized(spscLinkedArrayQueue4) {
            spscLinkedArrayQueue4.offer(object0);
        }
        y10.g.decrementAndGet();
        if(y10.getAndIncrement() == 0) {
            y10.b();
        }
    }
}

