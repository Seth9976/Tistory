package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.plugins.RxJavaPlugins;

public final class b2 extends BasicIntQueueDisposable implements Observer, Runnable {
    public final Observer a;
    public final Worker b;
    public final boolean c;
    public final int d;
    public SimpleQueue e;
    public Disposable f;
    public Throwable g;
    public volatile boolean h;
    public volatile boolean i;
    public int j;
    public boolean k;

    public b2(Observer observer0, Worker scheduler$Worker0, boolean z, int v) {
        this.a = observer0;
        this.b = scheduler$Worker0;
        this.c = z;
        this.d = v;
    }

    public final boolean a(boolean z, boolean z1, Observer observer0) {
        if(this.i) {
            this.e.clear();
            return true;
        }
        if(z) {
            Throwable throwable0 = this.g;
            if(!this.c) {
                if(throwable0 != null) {
                    this.i = true;
                    this.e.clear();
                    observer0.onError(throwable0);
                    this.b.dispose();
                    return true;
                }
                if(z1) {
                    this.i = true;
                    observer0.onComplete();
                    this.b.dispose();
                    return true;
                }
            }
            else if(z1) {
                this.i = true;
                if(throwable0 == null) {
                    observer0.onComplete();
                }
                else {
                    observer0.onError(throwable0);
                }
                this.b.dispose();
                return true;
            }
        }
        return false;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.e.clear();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(!this.i) {
            this.i = true;
            this.f.dispose();
            this.b.dispose();
            if(!this.k && this.getAndIncrement() == 0) {
                this.e.clear();
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.i;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.h) {
            return;
        }
        this.h = true;
        if(this.getAndIncrement() == 0) {
            this.b.schedule(this);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.h) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.g = throwable0;
        this.h = true;
        if(this.getAndIncrement() == 0) {
            this.b.schedule(this);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.h) {
            return;
        }
        if(this.j != 2) {
            this.e.offer(object0);
        }
        if(this.getAndIncrement() == 0) {
            this.b.schedule(this);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.f, disposable0)) {
            this.f = disposable0;
            if(disposable0 instanceof QueueDisposable) {
                int v = ((QueueDisposable)disposable0).requestFusion(7);
                if(v == 1) {
                    this.j = 1;
                    this.e = (QueueDisposable)disposable0;
                    this.h = true;
                    this.a.onSubscribe(this);
                    if(this.getAndIncrement() == 0) {
                        this.b.schedule(this);
                    }
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

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        return this.e.poll();
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int v) {
        if((v & 2) != 0) {
            this.k = true;
            return 2;
        }
        return 0;
    }

    @Override
    public final void run() {
        Object object0;
        if(this.k) {
            int v = 1;
            while(!this.i) {
                boolean z = this.h;
                if(!this.c && z && this.g != null) {
                    this.i = true;
                    this.a.onError(this.g);
                    this.b.dispose();
                    return;
                }
                this.a.onNext(null);
                if(z) {
                    this.i = true;
                    Throwable throwable0 = this.g;
                    if(throwable0 == null) {
                        this.a.onComplete();
                    }
                    else {
                        this.a.onError(throwable0);
                    }
                    this.b.dispose();
                    return;
                }
                v = this.addAndGet(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
        }
        else {
            SimpleQueue simpleQueue0 = this.e;
            Observer observer0 = this.a;
            int v1 = 1;
        label_25:
            while(!this.a(this.h, simpleQueue0.isEmpty(), observer0)) {
                while(true) {
                    try {
                    label_26:
                        boolean z1 = this.h;
                        object0 = simpleQueue0.poll();
                    }
                    catch(Throwable throwable1) {
                        Exceptions.throwIfFatal(throwable1);
                        this.i = true;
                        this.f.dispose();
                        simpleQueue0.clear();
                        observer0.onError(throwable1);
                        this.b.dispose();
                        return;
                    }
                    if(this.a(z1, object0 == null, observer0)) {
                        break label_25;
                    }
                    if(object0 != null) {
                        observer0.onNext(object0);
                        goto label_26;
                    }
                    v1 = this.addAndGet(-v1);
                    if(v1 == 0) {
                        return;
                    }
                    if(false) {
                        break label_25;
                    }
                    continue label_25;
                }
            }
        }
    }
}

