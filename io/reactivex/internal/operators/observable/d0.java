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
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

public final class d0 extends AtomicInteger implements Observer, Disposable {
    public final SerializedObserver a;
    public final Function b;
    public final b0 c;
    public final int d;
    public SimpleQueue e;
    public Disposable f;
    public volatile boolean g;
    public volatile boolean h;
    public volatile boolean i;
    public int j;

    public d0(SerializedObserver serializedObserver0, Function function0, int v) {
        this.a = serializedObserver0;
        this.b = function0;
        this.d = v;
        this.c = new b0(serializedObserver0, this, 1);
    }

    public final void a() {
        ObservableSource observableSource0;
        Object object0;
        if(this.getAndIncrement() != 0) {
            return;
        }
        do {
            if(this.h) {
                this.e.clear();
                return;
            }
            if(!this.g) {
                try {
                    boolean z = this.i;
                    object0 = this.e.poll();
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    this.dispose();
                    this.e.clear();
                    this.a.onError(throwable0);
                    return;
                }
                if(z && object0 == null) {
                    this.h = true;
                    this.a.onComplete();
                    return;
                }
                if(object0 != null) {
                    try {
                        observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null ObservableSource");
                    }
                    catch(Throwable throwable1) {
                        Exceptions.throwIfFatal(throwable1);
                        this.dispose();
                        this.e.clear();
                        this.a.onError(throwable1);
                        return;
                    }
                    this.g = true;
                    observableSource0.subscribe(this.c);
                }
            }
        }
        while(this.decrementAndGet() != 0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.h = true;
        this.c.getClass();
        DisposableHelper.dispose(this.c);
        this.f.dispose();
        if(this.getAndIncrement() == 0) {
            this.e.clear();
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.h;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.i) {
            return;
        }
        this.i = true;
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.i) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.i = true;
        this.dispose();
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.i) {
            return;
        }
        if(this.j == 0) {
            this.e.offer(object0);
        }
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.f, disposable0)) {
            this.f = disposable0;
            if(disposable0 instanceof QueueDisposable) {
                int v = ((QueueDisposable)disposable0).requestFusion(3);
                if(v == 1) {
                    this.j = 1;
                    this.e = (QueueDisposable)disposable0;
                    this.i = true;
                    this.a.onSubscribe(this);
                    this.a();
                    return;
                }
                if(v == 2) {
                    this.j = 2;
                    this.e = (QueueDisposable)disposable0;
                    this.a.onSubscribe(this);
                    return;
                }
            }
            this.e = new SpscLinkedArrayQueue(this.d);
            this.a.onSubscribe(this);
        }
    }
}

