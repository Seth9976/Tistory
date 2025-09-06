package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableEmitter;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Cancellable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

public final class v0 extends AtomicInteger implements FlowableEmitter {
    public final r0 a;
    public final AtomicThrowable b;
    public final SpscLinkedArrayQueue c;
    public volatile boolean d;

    public v0(r0 r00) {
        this.a = r00;
        this.b = new AtomicThrowable();
        this.c = new SpscLinkedArrayQueue(16);
    }

    public final void a() {
        r0 r00 = this.a;
        SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.c;
        AtomicThrowable atomicThrowable0 = this.b;
        int v = 1;
        while(true) {
            if(r00.b.isDisposed()) {
                spscLinkedArrayQueue0.clear();
                return;
            }
            if(atomicThrowable0.get() != null) {
                spscLinkedArrayQueue0.clear();
                r00.onError(atomicThrowable0.terminate());
                return;
            }
            boolean z = this.d;
            Object object0 = spscLinkedArrayQueue0.poll();
            if(z && object0 == null) {
                r00.onComplete();
                return;
            }
            if(object0 == null) {
                v = this.addAndGet(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            r00.onNext(object0);
        }
    }

    @Override  // io.reactivex.FlowableEmitter
    public final boolean isCancelled() {
        return this.a.b.isDisposed();
    }

    @Override  // io.reactivex.Emitter
    public final void onComplete() {
        if(!this.a.b.isDisposed() && !this.d) {
            this.d = true;
            if(this.getAndIncrement() == 0) {
                this.a();
            }
        }
    }

    @Override  // io.reactivex.Emitter
    public final void onError(Throwable throwable0) {
        if(!this.tryOnError(throwable0)) {
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // io.reactivex.Emitter
    public final void onNext(Object object0) {
        if(!this.a.b.isDisposed() && !this.d) {
            if(object0 == null) {
                this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if(this.get() != 0 || !this.compareAndSet(0, 1)) {
                synchronized(this.c) {
                    this.c.offer(object0);
                }
                if(this.getAndIncrement() != 0) {
                    return;
                }
            }
            else {
                this.a.onNext(object0);
                if(this.decrementAndGet() == 0) {
                    return;
                }
            }
            this.a();
        }
    }

    @Override  // io.reactivex.FlowableEmitter
    public final long requested() {
        return this.a.get();
    }

    @Override  // io.reactivex.FlowableEmitter
    public final FlowableEmitter serialize() {
        return this;
    }

    @Override  // io.reactivex.FlowableEmitter
    public final void setCancellable(Cancellable cancellable0) {
        this.a.setCancellable(cancellable0);
    }

    @Override  // io.reactivex.FlowableEmitter
    public final void setDisposable(Disposable disposable0) {
        this.a.setDisposable(disposable0);
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }

    @Override  // io.reactivex.FlowableEmitter
    public final boolean tryOnError(Throwable throwable0) {
        if(!this.a.b.isDisposed() && !this.d) {
            if(throwable0 == null) {
                throwable0 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if(this.b.addThrowable(throwable0)) {
                this.d = true;
                if(this.getAndIncrement() == 0) {
                    this.a();
                }
                return true;
            }
        }
        return false;
    }
}

