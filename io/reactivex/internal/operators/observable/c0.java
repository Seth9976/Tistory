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
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public final class c0 extends AtomicInteger implements Observer, Disposable {
    public final Observer a;
    public final Function b;
    public final int c;
    public final AtomicThrowable d;
    public final b0 e;
    public final boolean f;
    public SimpleQueue g;
    public Disposable h;
    public volatile boolean i;
    public volatile boolean j;
    public volatile boolean k;
    public int l;

    public c0(int v, Observer observer0, Function function0, boolean z) {
        this.a = observer0;
        this.b = function0;
        this.c = v;
        this.f = z;
        this.d = new AtomicThrowable();
        this.e = new b0(observer0, this, 0);
    }

    public final void a() {
        Object object1;
        ObservableSource observableSource0;
        Object object0;
        if(this.getAndIncrement() != 0) {
            return;
        }
        Observer observer0 = this.a;
        SimpleQueue simpleQueue0 = this.g;
        AtomicThrowable atomicThrowable0 = this.d;
        while(true) {
            if(!this.i) {
                if(this.k) {
                    simpleQueue0.clear();
                    return;
                }
                if(!this.f && ((Throwable)atomicThrowable0.get()) != null) {
                    simpleQueue0.clear();
                    this.k = true;
                    observer0.onError(atomicThrowable0.terminate());
                    return;
                }
                try {
                    boolean z = this.j;
                    object0 = simpleQueue0.poll();
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    this.k = true;
                    this.h.dispose();
                    atomicThrowable0.addThrowable(throwable0);
                    observer0.onError(atomicThrowable0.terminate());
                    return;
                }
                if(z && object0 == null) {
                    this.k = true;
                    Throwable throwable1 = atomicThrowable0.terminate();
                    if(throwable1 != null) {
                        observer0.onError(throwable1);
                        return;
                    }
                    observer0.onComplete();
                    return;
                }
                if(object0 != null) {
                    try {
                        observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null ObservableSource");
                    }
                    catch(Throwable throwable2) {
                        Exceptions.throwIfFatal(throwable2);
                        this.k = true;
                        this.h.dispose();
                        simpleQueue0.clear();
                        atomicThrowable0.addThrowable(throwable2);
                        observer0.onError(atomicThrowable0.terminate());
                        return;
                    }
                    if(observableSource0 instanceof Callable) {
                        try {
                            object1 = ((Callable)observableSource0).call();
                            if(object1 == null || this.k) {
                                continue;
                            }
                        }
                        catch(Throwable throwable3) {
                            Exceptions.throwIfFatal(throwable3);
                            atomicThrowable0.addThrowable(throwable3);
                            continue;
                        }
                        observer0.onNext(object1);
                        continue;
                    }
                    else {
                        this.i = true;
                        observableSource0.subscribe(this.e);
                    }
                }
            }
            if(this.decrementAndGet() == 0) {
                break;
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.k = true;
        this.h.dispose();
        this.e.getClass();
        DisposableHelper.dispose(this.e);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.k;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.j = true;
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.d.addThrowable(throwable0)) {
            this.j = true;
            this.a();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.l == 0) {
            this.g.offer(object0);
        }
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.h, disposable0)) {
            this.h = disposable0;
            if(disposable0 instanceof QueueDisposable) {
                int v = ((QueueDisposable)disposable0).requestFusion(3);
                if(v == 1) {
                    this.l = 1;
                    this.g = (QueueDisposable)disposable0;
                    this.j = true;
                    this.a.onSubscribe(this);
                    this.a();
                    return;
                }
                if(v == 2) {
                    this.l = 2;
                    this.g = (QueueDisposable)disposable0;
                    this.a.onSubscribe(this);
                    return;
                }
            }
            this.g = new SpscLinkedArrayQueue(this.c);
            this.a.onSubscribe(this);
        }
    }
}

