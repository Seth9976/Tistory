package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class q3 extends AtomicInteger implements Observer, Disposable {
    public final Observer a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final SpscLinkedArrayQueue e;
    public final boolean f;
    public Disposable g;
    public volatile boolean h;
    public volatile boolean i;
    public Throwable j;

    public q3(Observer observer0, long v, TimeUnit timeUnit0, Scheduler scheduler0, int v1, boolean z) {
        this.a = observer0;
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler0;
        this.e = new SpscLinkedArrayQueue(v1);
        this.f = z;
    }

    public final void a() {
        if(this.getAndIncrement() != 0) {
            return;
        }
        Observer observer0 = this.a;
        SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.e;
        boolean z = this.f;
        TimeUnit timeUnit0 = this.c;
        Scheduler scheduler0 = this.d;
        long v = this.b;
        int v1 = 1;
        while(true) {
            if(this.h) {
                this.e.clear();
                return;
            }
            boolean z1 = this.i;
            Long long0 = (Long)spscLinkedArrayQueue0.peek();
            boolean z2 = long0 == null || ((long)long0) <= scheduler0.now(timeUnit0) - v ? long0 == null : true;
            if(z1) {
                if(!z) {
                    Throwable throwable1 = this.j;
                    if(throwable1 != null) {
                        this.e.clear();
                        observer0.onError(throwable1);
                        return;
                    }
                    if(z2) {
                        observer0.onComplete();
                        return;
                    }
                }
                else if(z2) {
                    Throwable throwable0 = this.j;
                    if(throwable0 != null) {
                        observer0.onError(throwable0);
                        return;
                    }
                    observer0.onComplete();
                    return;
                }
            }
            if(z2) {
                v1 = this.addAndGet(-v1);
                if(v1 != 0) {
                    continue;
                }
                return;
            }
            spscLinkedArrayQueue0.poll();
            observer0.onNext(spscLinkedArrayQueue0.poll());
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(!this.h) {
            this.h = true;
            this.g.dispose();
            if(this.getAndIncrement() == 0) {
                this.e.clear();
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.h;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.i = true;
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.j = throwable0;
        this.i = true;
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        Long long0 = this.d.now(this.c);
        this.e.offer(long0, object0);
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.g, disposable0)) {
            this.g = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

