package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class y3 extends AtomicBoolean implements Observer, Disposable {
    public final Observer a;
    public final long b;
    public final long c;
    public final TimeUnit d;
    public final Scheduler e;
    public final SpscLinkedArrayQueue f;
    public final boolean g;
    public Disposable h;
    public volatile boolean i;
    public Throwable j;

    public y3(Observer observer0, long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0, int v2, boolean z) {
        this.a = observer0;
        this.b = v;
        this.c = v1;
        this.d = timeUnit0;
        this.e = scheduler0;
        this.f = new SpscLinkedArrayQueue(v2);
        this.g = z;
    }

    public final void a() {
        if(!this.compareAndSet(false, true)) {
            return;
        }
        Observer observer0 = this.a;
        SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.f;
        boolean z = this.g;
        long v = this.e.now(this.d) - this.c;
        while(true) {
            if(this.i) {
                spscLinkedArrayQueue0.clear();
                return;
            }
            if(!z) {
                Throwable throwable0 = this.j;
                if(throwable0 != null) {
                    spscLinkedArrayQueue0.clear();
                    observer0.onError(throwable0);
                    return;
                }
            }
            Object object0 = spscLinkedArrayQueue0.poll();
            if(object0 == null) {
                Throwable throwable1 = this.j;
                if(throwable1 != null) {
                    observer0.onError(throwable1);
                    return;
                }
                observer0.onComplete();
                return;
            }
            Object object1 = spscLinkedArrayQueue0.poll();
            if(((long)(((Long)object0))) >= v) {
                observer0.onNext(object1);
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(!this.i) {
            this.i = true;
            this.h.dispose();
            if(this.compareAndSet(false, true)) {
                this.f.clear();
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.i;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.j = throwable0;
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        long v = this.e.now(this.d);
        long v1 = this.b;
        boolean z = Long.compare(v1, 0x7FFFFFFFFFFFFFFFL) == 0;
        SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.f;
        spscLinkedArrayQueue0.offer(v, object0);
        while(!spscLinkedArrayQueue0.isEmpty() && (((long)(((Long)spscLinkedArrayQueue0.peek()))) <= v - this.c || !z && ((long)(spscLinkedArrayQueue0.size() >> 1)) > v1)) {
            spscLinkedArrayQueue0.poll();
            spscLinkedArrayQueue0.poll();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.h, disposable0)) {
            this.h = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

