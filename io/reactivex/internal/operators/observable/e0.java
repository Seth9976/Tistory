package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.InnerQueuedObserver;
import io.reactivex.internal.observers.InnerQueuedObserverSupport;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

public final class e0 extends AtomicInteger implements Observer, Disposable, InnerQueuedObserverSupport {
    public final Observer a;
    public final Function b;
    public final int c;
    public final int d;
    public final ErrorMode e;
    public final AtomicThrowable f;
    public final ArrayDeque g;
    public SimpleQueue h;
    public Disposable i;
    public volatile boolean j;
    public int k;
    public volatile boolean l;
    public InnerQueuedObserver m;
    public int n;

    public e0(int v, int v1, Observer observer0, Function function0, ErrorMode errorMode0) {
        this.a = observer0;
        this.b = function0;
        this.c = v;
        this.d = v1;
        this.e = errorMode0;
        this.f = new AtomicThrowable();
        this.g = new ArrayDeque();
    }

    public final void a() {
        InnerQueuedObserver innerQueuedObserver0 = this.m;
        if(innerQueuedObserver0 != null) {
            innerQueuedObserver0.dispose();
        }
        InnerQueuedObserver innerQueuedObserver1;
        while((innerQueuedObserver1 = (InnerQueuedObserver)this.g.poll()) != null) {
            innerQueuedObserver1.dispose();
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.l) {
            return;
        }
        this.l = true;
        this.i.dispose();
        if(this.getAndIncrement() == 0) {
            while(true) {
                this.h.clear();
                this.a();
                if(this.decrementAndGet() == 0) {
                    break;
                }
            }
        }
    }

    @Override  // io.reactivex.internal.observers.InnerQueuedObserverSupport
    public final void drain() {
        Object object1;
        ObservableSource observableSource0;
        if(this.getAndIncrement() != 0) {
            return;
        }
        SimpleQueue simpleQueue0 = this.h;
        ArrayDeque arrayDeque0 = this.g;
        Observer observer0 = this.a;
        ErrorMode errorMode0 = this.e;
        int v = 1;
    alab1:
        while(true) {
            int v1;
            for(v1 = this.n; v1 != this.c; ++v1) {
                if(this.l) {
                    simpleQueue0.clear();
                    this.a();
                    return;
                }
                if(errorMode0 == ErrorMode.IMMEDIATE && ((Throwable)this.f.get()) != null) {
                    simpleQueue0.clear();
                    this.a();
                    observer0.onError(this.f.terminate());
                    return;
                }
                try {
                    Object object0 = simpleQueue0.poll();
                    if(object0 == null) {
                        break;
                    }
                    observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null ObservableSource");
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    this.i.dispose();
                    simpleQueue0.clear();
                    this.a();
                    this.f.addThrowable(throwable0);
                    observer0.onError(this.f.terminate());
                    return;
                }
                InnerQueuedObserver innerQueuedObserver0 = new InnerQueuedObserver(this, this.d);
                arrayDeque0.offer(innerQueuedObserver0);
                observableSource0.subscribe(innerQueuedObserver0);
            }
            this.n = v1;
            if(this.l) {
                simpleQueue0.clear();
                this.a();
                return;
            }
            if(errorMode0 == ErrorMode.IMMEDIATE && ((Throwable)this.f.get()) != null) {
                simpleQueue0.clear();
                this.a();
                observer0.onError(this.f.terminate());
                return;
            }
            InnerQueuedObserver innerQueuedObserver1 = this.m;
            if(innerQueuedObserver1 == null) {
                if(errorMode0 == ErrorMode.BOUNDARY && ((Throwable)this.f.get()) != null) {
                    simpleQueue0.clear();
                    this.a();
                    observer0.onError(this.f.terminate());
                    return;
                }
                boolean z = this.j;
                InnerQueuedObserver innerQueuedObserver2 = (InnerQueuedObserver)arrayDeque0.poll();
                if(z && innerQueuedObserver2 == null) {
                    if(((Throwable)this.f.get()) != null) {
                        simpleQueue0.clear();
                        this.a();
                        observer0.onError(this.f.terminate());
                        return;
                    }
                    observer0.onComplete();
                    return;
                }
                if(innerQueuedObserver2 != null) {
                    this.m = innerQueuedObserver2;
                }
                innerQueuedObserver1 = innerQueuedObserver2;
            }
            if(innerQueuedObserver1 != null) {
                SimpleQueue simpleQueue1 = innerQueuedObserver1.queue();
                while(true) {
                    if(this.l) {
                        simpleQueue0.clear();
                        this.a();
                        return;
                    }
                    boolean z1 = innerQueuedObserver1.isDone();
                    if(errorMode0 == ErrorMode.IMMEDIATE && ((Throwable)this.f.get()) != null) {
                        simpleQueue0.clear();
                        this.a();
                        observer0.onError(this.f.terminate());
                        return;
                    }
                    try {
                        object1 = simpleQueue1.poll();
                    }
                    catch(Throwable throwable1) {
                        Exceptions.throwIfFatal(throwable1);
                        this.f.addThrowable(throwable1);
                        this.m = null;
                        --this.n;
                        continue alab1;
                    }
                    if(z1 && object1 == null) {
                        this.m = null;
                        --this.n;
                        continue alab1;
                    }
                    if(object1 == null) {
                        break;
                    }
                    observer0.onNext(object1);
                }
            }
            v = this.addAndGet(-v);
            if(v == 0) {
                break;
            }
        }
    }

    @Override  // io.reactivex.internal.observers.InnerQueuedObserverSupport
    public final void innerComplete(InnerQueuedObserver innerQueuedObserver0) {
        innerQueuedObserver0.setDone();
        this.drain();
    }

    @Override  // io.reactivex.internal.observers.InnerQueuedObserverSupport
    public final void innerError(InnerQueuedObserver innerQueuedObserver0, Throwable throwable0) {
        if(this.f.addThrowable(throwable0)) {
            if(this.e == ErrorMode.IMMEDIATE) {
                this.i.dispose();
            }
            innerQueuedObserver0.setDone();
            this.drain();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.internal.observers.InnerQueuedObserverSupport
    public final void innerNext(InnerQueuedObserver innerQueuedObserver0, Object object0) {
        innerQueuedObserver0.queue().offer(object0);
        this.drain();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.l;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.j = true;
        this.drain();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.f.addThrowable(throwable0)) {
            this.j = true;
            this.drain();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.k == 0) {
            this.h.offer(object0);
        }
        this.drain();
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.i, disposable0)) {
            this.i = disposable0;
            if(disposable0 instanceof QueueDisposable) {
                int v = ((QueueDisposable)disposable0).requestFusion(3);
                if(v == 1) {
                    this.k = 1;
                    this.h = (QueueDisposable)disposable0;
                    this.j = true;
                    this.a.onSubscribe(this);
                    this.drain();
                    return;
                }
                if(v == 2) {
                    this.k = 2;
                    this.h = (QueueDisposable)disposable0;
                    this.a.onSubscribe(this);
                    return;
                }
            }
            this.h = new SpscLinkedArrayQueue(this.d);
            this.a.onSubscribe(this);
        }
    }
}

