package io.reactivex.internal.operators.flowable;

import ed.d;
import ed.f;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class b3 extends AtomicInteger implements FlowableSubscriber, Subscription {
    public final int a;
    public final Subscriber b;
    public final AtomicReference c;
    public final AtomicThrowable d;
    public final AtomicLong e;
    public final int f;
    public final int g;
    public volatile SpscArrayQueue h;
    public Object i;
    public volatile boolean j;
    public volatile boolean k;
    public volatile int l;
    public long m;
    public int n;
    public final AtomicReference o;

    public b3(Subscriber subscriber0, int v) {
        this.a = v;
        if(v != 1) {
            super();
            this.b = subscriber0;
            this.c = new AtomicReference();
            this.o = new d(this, 2);
            this.d = new AtomicThrowable();
            this.e = new AtomicLong();
            this.f = 0x80;
            this.g = 0x60;
            return;
        }
        super();
        this.b = subscriber0;
        this.c = new AtomicReference();
        this.o = new f(this, 3);
        this.d = new AtomicThrowable();
        this.e = new AtomicLong();
        this.f = 0x80;
        this.g = 0x60;
    }

    public final void a() {
        if(this.a != 0) {
            Subscriber subscriber0 = this.b;
            long v = this.m;
            int v1 = this.n;
            int v2 = this.g;
            int v3 = 1;
            do {
                long v4 = this.e.get();
                int v5;
                while((v5 = Long.compare(v, v4)) != 0) {
                    if(this.j) {
                        this.i = null;
                        this.h = null;
                        return;
                    }
                    if(this.d.get() != null) {
                        this.i = null;
                        this.h = null;
                        subscriber0.onError(this.d.terminate());
                        return;
                    }
                    int v6 = this.l;
                    if(v6 == 1) {
                        Object object0 = this.i;
                        this.i = null;
                        this.l = 2;
                        subscriber0.onNext(object0);
                        ++v;
                    }
                    else {
                        boolean z = this.k;
                        Object object1 = this.h == null ? null : this.h.poll();
                        if(z && object1 == null && v6 == 2) {
                            this.h = null;
                            subscriber0.onComplete();
                            return;
                        }
                        if(object1 == null) {
                            break;
                        }
                        subscriber0.onNext(object1);
                        ++v;
                        if(v1 + 1 == v2) {
                            ((Subscription)this.c.get()).request(((long)v2));
                            v1 = 0;
                        }
                        else {
                            ++v1;
                        }
                    }
                }
                if(v5 == 0) {
                    if(this.j) {
                        this.i = null;
                        this.h = null;
                        return;
                    }
                    if(this.d.get() != null) {
                        this.i = null;
                        this.h = null;
                        subscriber0.onError(this.d.terminate());
                        return;
                    }
                    if(this.k && (this.h == null || this.h.isEmpty()) && this.l == 2) {
                        this.h = null;
                        subscriber0.onComplete();
                        return;
                    }
                }
                this.m = v;
                this.n = v1;
                v3 = this.addAndGet(-v3);
            }
            while(v3 != 0);
            return;
        }
        Subscriber subscriber1 = this.b;
        long v7 = this.m;
        int v8 = this.n;
        int v9 = this.g;
        int v10 = 1;
        do {
            long v11 = this.e.get();
            int v12;
            while((v12 = Long.compare(v7, v11)) != 0) {
                if(this.j) {
                    this.i = null;
                    this.h = null;
                    return;
                }
                if(this.d.get() != null) {
                    this.i = null;
                    this.h = null;
                    subscriber1.onError(this.d.terminate());
                    return;
                }
                int v13 = this.l;
                if(v13 == 1) {
                    Object object2 = this.i;
                    this.i = null;
                    this.l = 2;
                    subscriber1.onNext(object2);
                    ++v7;
                }
                else {
                    boolean z1 = this.k;
                    Object object3 = this.h == null ? null : this.h.poll();
                    if(z1 && object3 == null && v13 == 2) {
                        this.h = null;
                        subscriber1.onComplete();
                        return;
                    }
                    if(object3 == null) {
                        break;
                    }
                    subscriber1.onNext(object3);
                    ++v7;
                    if(v8 + 1 == v9) {
                        ((Subscription)this.c.get()).request(((long)v9));
                        v8 = 0;
                    }
                    else {
                        ++v8;
                    }
                }
            }
            if(v12 == 0) {
                if(this.j) {
                    this.i = null;
                    this.h = null;
                    return;
                }
                if(this.d.get() != null) {
                    this.i = null;
                    this.h = null;
                    subscriber1.onError(this.d.terminate());
                    return;
                }
                if(this.k && (this.h == null || this.h.isEmpty()) && this.l == 2) {
                    this.h = null;
                    subscriber1.onComplete();
                    return;
                }
            }
            this.m = v7;
            this.n = v8;
            v10 = this.addAndGet(-v10);
        }
        while(v10 != 0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.a != 0) {
            this.j = true;
            SubscriptionHelper.cancel(this.c);
            DisposableHelper.dispose(((f)this.o));
            if(this.getAndIncrement() == 0) {
                this.h = null;
                this.i = null;
            }
            return;
        }
        this.j = true;
        SubscriptionHelper.cancel(this.c);
        DisposableHelper.dispose(((d)this.o));
        if(this.getAndIncrement() == 0) {
            this.h = null;
            this.i = null;
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.a != 0) {
            this.k = true;
            if(this.getAndIncrement() == 0) {
                this.a();
            }
            return;
        }
        this.k = true;
        if(this.getAndIncrement() == 0) {
            this.a();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            if(this.d.addThrowable(throwable0)) {
                DisposableHelper.dispose(((f)this.o));
                if(this.getAndIncrement() == 0) {
                    this.a();
                    return;
                }
            }
            else {
                RxJavaPlugins.onError(throwable0);
            }
            return;
        }
        if(this.d.addThrowable(throwable0)) {
            DisposableHelper.dispose(((d)this.o));
            if(this.getAndIncrement() == 0) {
                this.a();
            }
        }
        else {
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.a != 0) {
            if(this.compareAndSet(0, 1)) {
                long v = this.m;
                if(this.e.get() == v) {
                    SpscArrayQueue spscArrayQueue1 = this.h;
                    if(spscArrayQueue1 == null) {
                        spscArrayQueue1 = new SpscArrayQueue(0x80);
                        this.h = spscArrayQueue1;
                    }
                    spscArrayQueue1.offer(object0);
                }
                else {
                    SpscArrayQueue spscArrayQueue0 = this.h;
                    if(spscArrayQueue0 == null || spscArrayQueue0.isEmpty()) {
                        this.m = v + 1L;
                        this.b.onNext(object0);
                        int v1 = this.n + 1;
                        if(v1 == this.g) {
                            this.n = 0;
                            ((Subscription)this.c.get()).request(((long)v1));
                        }
                        else {
                            this.n = v1;
                        }
                    }
                    else {
                        spscArrayQueue0.offer(object0);
                    }
                }
                if(this.decrementAndGet() == 0) {
                    return;
                }
                this.a();
                return;
            }
            SpscArrayQueue spscArrayQueue2 = this.h;
            if(spscArrayQueue2 == null) {
                spscArrayQueue2 = new SpscArrayQueue(0x80);
                this.h = spscArrayQueue2;
            }
            spscArrayQueue2.offer(object0);
            if(this.getAndIncrement() == 0) {
                this.a();
            }
            return;
        }
        if(this.compareAndSet(0, 1)) {
            long v2 = this.m;
            if(this.e.get() == v2) {
                SpscArrayQueue spscArrayQueue4 = this.h;
                if(spscArrayQueue4 == null) {
                    spscArrayQueue4 = new SpscArrayQueue(0x80);
                    this.h = spscArrayQueue4;
                }
                spscArrayQueue4.offer(object0);
            }
            else {
                SpscArrayQueue spscArrayQueue3 = this.h;
                if(spscArrayQueue3 == null || spscArrayQueue3.isEmpty()) {
                    this.m = v2 + 1L;
                    this.b.onNext(object0);
                    int v3 = this.n + 1;
                    if(v3 == this.g) {
                        this.n = 0;
                        ((Subscription)this.c.get()).request(((long)v3));
                    }
                    else {
                        this.n = v3;
                    }
                }
                else {
                    spscArrayQueue3.offer(object0);
                }
            }
            if(this.decrementAndGet() == 0) {
                return;
            }
            this.a();
            return;
        }
        SpscArrayQueue spscArrayQueue5 = this.h;
        if(spscArrayQueue5 == null) {
            spscArrayQueue5 = new SpscArrayQueue(0x80);
            this.h = spscArrayQueue5;
        }
        spscArrayQueue5.offer(object0);
        if(this.getAndIncrement() == 0) {
            this.a();
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(this.a != 0) {
            SubscriptionHelper.setOnce(this.c, subscription0, ((long)this.f));
            return;
        }
        SubscriptionHelper.setOnce(this.c, subscription0, ((long)this.f));
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(this.a != 0) {
            BackpressureHelper.add(this.e, v);
            if(this.getAndIncrement() == 0) {
                this.a();
            }
            return;
        }
        BackpressureHelper.add(this.e, v);
        if(this.getAndIncrement() == 0) {
            this.a();
        }
    }
}

