package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

public final class s0 extends r0 {
    public final int c;
    public Throwable d;
    public volatile boolean e;
    public final AtomicInteger f;
    public final Object g;

    public s0(Subscriber subscriber0) {
        this.c = 1;
        super(subscriber0);
        this.g = new AtomicReference();
        this.f = new AtomicInteger();
    }

    public s0(Subscriber subscriber0, int v) {
        this.c = 0;
        super(subscriber0);
        this.g = new SpscLinkedArrayQueue(v);
        this.f = new AtomicInteger();
    }

    @Override  // io.reactivex.internal.operators.flowable.r0
    public final void c() {
        if(this.c != 0) {
            this.e();
            return;
        }
        this.e();
    }

    @Override  // io.reactivex.internal.operators.flowable.r0
    public final void d() {
        if(this.c != 0) {
            if(this.f.getAndIncrement() == 0) {
                ((AtomicReference)this.g).lazySet(null);
            }
            return;
        }
        if(this.f.getAndIncrement() == 0) {
            ((SpscLinkedArrayQueue)this.g).clear();
        }
    }

    public final void e() {
        boolean z;
        if(this.c != 0) {
            if(this.f.getAndIncrement() == 0) {
                Subscriber subscriber0 = this.a;
                AtomicReference atomicReference0 = (AtomicReference)this.g;
                int v = 1;
                while(true) {
                    long v1 = this.get();
                    long v2;
                    for(v2 = 0L; true; ++v2) {
                        int v3 = Long.compare(v2, v1);
                        z = false;
                        if(v3 == 0) {
                            break;
                        }
                        if(this.b.isDisposed()) {
                            atomicReference0.lazySet(null);
                            return;
                        }
                        boolean z1 = this.e;
                        Object object0 = atomicReference0.getAndSet(null);
                        if(z1 && object0 == null) {
                            Throwable throwable0 = this.d;
                            if(throwable0 != null) {
                                this.b(throwable0);
                                return;
                            }
                            this.a();
                            return;
                        }
                        if(object0 == null) {
                            break;
                        }
                        subscriber0.onNext(object0);
                    }
                    if(v3 == 0) {
                        if(this.b.isDisposed()) {
                            atomicReference0.lazySet(null);
                            return;
                        }
                        boolean z2 = this.e;
                        if(atomicReference0.get() == null) {
                            z = true;
                        }
                        if(z2 && z) {
                            Throwable throwable1 = this.d;
                            if(throwable1 != null) {
                                this.b(throwable1);
                                return;
                            }
                            this.a();
                            return;
                        }
                    }
                    if(v2 != 0L) {
                        BackpressureHelper.produced(this, v2);
                    }
                    v = this.f.addAndGet(-v);
                    if(v == 0) {
                        break;
                    }
                }
            }
            return;
        }
        if(this.f.getAndIncrement() == 0) {
            Subscriber subscriber1 = this.a;
            SpscLinkedArrayQueue spscLinkedArrayQueue0 = (SpscLinkedArrayQueue)this.g;
            int v4 = 1;
            while(true) {
                long v5 = this.get();
                long v6 = 0L;
                int v7;
                while((v7 = Long.compare(v6, v5)) != 0) {
                    if(this.b.isDisposed()) {
                        spscLinkedArrayQueue0.clear();
                        return;
                    }
                    boolean z3 = this.e;
                    Object object1 = spscLinkedArrayQueue0.poll();
                    if(z3 && object1 == null) {
                        Throwable throwable2 = this.d;
                        if(throwable2 != null) {
                            this.b(throwable2);
                            return;
                        }
                        this.a();
                        return;
                    }
                    if(object1 == null) {
                        break;
                    }
                    subscriber1.onNext(object1);
                    ++v6;
                }
                if(v7 == 0) {
                    if(this.b.isDisposed()) {
                        spscLinkedArrayQueue0.clear();
                        return;
                    }
                    if(this.e && spscLinkedArrayQueue0.isEmpty()) {
                        Throwable throwable3 = this.d;
                        if(throwable3 != null) {
                            this.b(throwable3);
                            return;
                        }
                        this.a();
                        return;
                    }
                }
                if(v6 != 0L) {
                    BackpressureHelper.produced(this, v6);
                }
                v4 = this.f.addAndGet(-v4);
                if(v4 == 0) {
                    break;
                }
            }
        }
    }

    @Override  // io.reactivex.internal.operators.flowable.r0
    public final void onComplete() {
        if(this.c != 0) {
            this.e = true;
            this.e();
            return;
        }
        this.e = true;
        this.e();
    }

    @Override  // io.reactivex.Emitter
    public final void onNext(Object object0) {
        if(this.c != 0) {
            if(!this.e && !this.b.isDisposed()) {
                if(object0 == null) {
                    this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                ((AtomicReference)this.g).set(object0);
                this.e();
            }
            return;
        }
        if(!this.e && !this.b.isDisposed()) {
            if(object0 == null) {
                this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            ((SpscLinkedArrayQueue)this.g).offer(object0);
            this.e();
        }
    }

    @Override  // io.reactivex.internal.operators.flowable.r0
    public final boolean tryOnError(Throwable throwable0) {
        if(this.c != 0) {
            if(!this.e && !this.b.isDisposed()) {
                if(throwable0 == null) {
                    this.onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
                }
                this.d = throwable0;
                this.e = true;
                this.e();
                return true;
            }
            return false;
        }
        if(!this.e && !this.b.isDisposed()) {
            if(throwable0 == null) {
                throwable0 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.d = throwable0;
            this.e = true;
            this.e();
            return true;
        }
        return false;
    }
}

