package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class q3 extends AtomicInteger implements FlowableSubscriber, Disposable {
    public final AtomicReference a;
    public final AtomicReference b;
    public final AtomicBoolean c;
    public final AtomicReference d;
    public final int e;
    public volatile SimpleQueue f;
    public int g;
    public volatile boolean h;
    public Throwable i;
    public int j;
    public static final p3[] k;
    public static final p3[] l;

    static {
        q3.k = new p3[0];
        q3.l = new p3[0];
    }

    public q3(AtomicReference atomicReference0, int v) {
        this.a = atomicReference0;
        this.b = new AtomicReference();
        this.c = new AtomicBoolean();
        this.e = v;
        this.d = new AtomicReference(q3.k);
    }

    public final boolean a(boolean z, boolean z1) {
        if(z && z1) {
            Throwable throwable0 = this.i;
            if(throwable0 != null) {
                this.d(throwable0);
                return true;
            }
            p3[] arr_p3 = (p3[])this.d.getAndSet(q3.l);
            for(int v = 0; v < arr_p3.length; ++v) {
                p3 p30 = arr_p3[v];
                if(!p30.a()) {
                    p30.a.onComplete();
                }
            }
            return true;
        }
        return false;
    }

    public final void b() {
        Object object0;
        if(this.getAndIncrement() != 0) {
            return;
        }
        int v = this.e - (this.e >> 2);
        boolean z = this.g != 1;
        int v1 = 1;
        SimpleQueue simpleQueue0 = this.f;
        int v2 = this.j;
    alab1:
        while(true) {
            if(simpleQueue0 != null) {
                p3[] arr_p3 = (p3[])this.d.get();
                long v3 = 0x7FFFFFFFFFFFFFFFL;
                boolean z1 = false;
                for(int v4 = 0; v4 < arr_p3.length; ++v4) {
                    p3 p30 = arr_p3[v4];
                    long v5 = p30.get();
                    if(v5 != 0x8000000000000000L) {
                        v3 = Math.min(v5 - p30.c, v3);
                        z1 = true;
                    }
                }
                if(!z1) {
                    v3 = 0L;
                }
                while(v3 != 0L) {
                    try {
                        boolean z2 = this.h;
                        object0 = simpleQueue0.poll();
                    }
                    catch(Throwable throwable0) {
                        Exceptions.throwIfFatal(throwable0);
                        ((Subscription)this.b.get()).cancel();
                        simpleQueue0.clear();
                        this.h = true;
                        this.d(throwable0);
                        return;
                    }
                    if(this.a(z2, object0 == null)) {
                        return;
                    }
                    if(object0 == null) {
                        break;
                    }
                    int v6 = arr_p3.length;
                    for(int v7 = 0; v7 < v6; ++v7) {
                        p3 p31 = arr_p3[v7];
                        if(!p31.a()) {
                            p31.a.onNext(object0);
                            ++p31.c;
                        }
                    }
                    if(z) {
                        if(v2 + 1 == v) {
                            ((Subscription)this.b.get()).request(((long)v));
                            v2 = 0;
                        }
                        else {
                            ++v2;
                        }
                    }
                    --v3;
                    if(arr_p3 != this.d.get()) {
                        continue alab1;
                    }
                }
                if(this.a(this.h, simpleQueue0.isEmpty())) {
                    return;
                }
            }
            this.j = v2;
            v1 = this.addAndGet(-v1);
            if(v1 == 0) {
                return;
            }
            if(simpleQueue0 == null) {
                simpleQueue0 = this.f;
            }
        }
    }

    public final void c(p3 p30) {
        p3[] arr_p31;
        while(true) {
            AtomicReference atomicReference0 = this.d;
            p3[] arr_p3 = (p3[])atomicReference0.get();
            int v = arr_p3.length;
            if(v == 0) {
                break;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_p3[v1] == p30) {
                        break;
                    }
                    else {
                        ++v1;
                        continue;
                    }
                }
                v1 = -1;
                break;
            }
            if(v1 < 0) {
                return;
            }
            if(v == 1) {
                arr_p31 = q3.k;
            }
            else {
                p3[] arr_p32 = new p3[v - 1];
                System.arraycopy(arr_p3, 0, arr_p32, 0, v1);
                System.arraycopy(arr_p3, v1 + 1, arr_p32, v1, v - v1 - 1);
                arr_p31 = arr_p32;
            }
        label_20:
            if(atomicReference0.compareAndSet(arr_p3, arr_p31)) {
                break;
            }
            if(atomicReference0.get() != arr_p3) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_20;
        }
    }

    public final void d(Throwable throwable0) {
        p3[] arr_p3 = (p3[])this.d.getAndSet(q3.l);
        for(int v = 0; v < arr_p3.length; ++v) {
            p3 p30 = arr_p3[v];
            if(!p30.a()) {
                p30.a.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.d.getAndSet(q3.l);
        while(!this.a.compareAndSet(this, null) && this.a.get() == this) {
        }
        SubscriptionHelper.cancel(this.b);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.d.get() == q3.l;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.h = true;
        this.b();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.h) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.i = throwable0;
        this.h = true;
        this.b();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.g == 0 && !this.f.offer(object0)) {
            this.onError(new MissingBackpressureException("Prefetch queue is full?!"));
            return;
        }
        this.b();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.setOnce(this.b, subscription0)) {
            if(subscription0 instanceof QueueSubscription) {
                int v = ((QueueSubscription)subscription0).requestFusion(7);
                if(v == 1) {
                    this.g = 1;
                    this.f = (QueueSubscription)subscription0;
                    this.h = true;
                    this.b();
                    return;
                }
                if(v == 2) {
                    this.g = 2;
                    this.f = (QueueSubscription)subscription0;
                    subscription0.request(((long)this.e));
                    return;
                }
            }
            this.f = new SpscArrayQueue(this.e);
            subscription0.request(((long)this.e));
        }
    }
}

