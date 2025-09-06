package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class n1 extends AtomicInteger implements ObservableSource, Disposable {
    public final Object a;
    public final SpscLinkedArrayQueue b;
    public final GroupByObserver c;
    public final boolean d;
    public volatile boolean e;
    public Throwable f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public final AtomicReference i;

    public n1(int v, GroupByObserver observableGroupBy$GroupByObserver0, Object object0, boolean z) {
        this.g = new AtomicBoolean();
        this.h = new AtomicBoolean();
        this.i = new AtomicReference();
        this.b = new SpscLinkedArrayQueue(v);
        this.c = observableGroupBy$GroupByObserver0;
        this.a = object0;
        this.d = z;
    }

    public final void a() {
        if(this.getAndIncrement() != 0) {
            return;
        }
        SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.b;
        boolean z = this.d;
        Observer observer0 = (Observer)this.i.get();
        int v = 1;
        while(true) {
            if(observer0 != null) {
                while(true) {
                    boolean z1 = this.e;
                    Object object0 = spscLinkedArrayQueue0.poll();
                    boolean z2 = object0 == null;
                    boolean z3 = this.g.get();
                    SpscLinkedArrayQueue spscLinkedArrayQueue1 = this.b;
                    AtomicReference atomicReference0 = this.i;
                    if(z3) {
                        spscLinkedArrayQueue1.clear();
                        this.c.cancel(this.a);
                        atomicReference0.lazySet(null);
                        return;
                    }
                    if(z1) {
                        if(!z) {
                            Throwable throwable1 = this.f;
                            if(throwable1 != null) {
                                spscLinkedArrayQueue1.clear();
                                atomicReference0.lazySet(null);
                                observer0.onError(throwable1);
                                return;
                            }
                            if(z2) {
                                atomicReference0.lazySet(null);
                                observer0.onComplete();
                                return;
                            }
                        }
                        else if(z2) {
                            Throwable throwable0 = this.f;
                            atomicReference0.lazySet(null);
                            if(throwable0 != null) {
                                observer0.onError(throwable0);
                                return;
                            }
                            observer0.onComplete();
                            return;
                        }
                    }
                    if(z2) {
                        break;
                    }
                    observer0.onNext(object0);
                }
            }
            v = this.addAndGet(-v);
            if(v == 0) {
                return;
            }
            if(observer0 == null) {
                observer0 = (Observer)this.i.get();
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.g.compareAndSet(false, true) && this.getAndIncrement() == 0) {
            this.i.lazySet(null);
            this.c.cancel(this.a);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.g.get();
    }

    @Override  // io.reactivex.ObservableSource
    public final void subscribe(Observer observer0) {
        if(this.h.compareAndSet(false, true)) {
            observer0.onSubscribe(this);
            AtomicReference atomicReference0 = this.i;
            atomicReference0.lazySet(observer0);
            if(this.g.get()) {
                atomicReference0.lazySet(null);
                return;
            }
            this.a();
            return;
        }
        EmptyDisposable.error(new IllegalStateException("Only one Observer allowed!"), observer0);
    }
}

