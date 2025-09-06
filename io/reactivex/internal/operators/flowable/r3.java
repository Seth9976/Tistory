package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class r3 extends Flowable implements FlowableSubscriber, Disposable {
    public final AtomicInteger b;
    public final AtomicReference c;
    public final int d;
    public final int e;
    public final boolean f;
    public final AtomicReference g;
    public volatile SimpleQueue h;
    public int i;
    public volatile boolean j;
    public Throwable k;
    public int l;
    public static final s3[] m;
    public static final s3[] n;

    static {
        r3.m = new s3[0];
        r3.n = new s3[0];
    }

    public r3(int v, boolean z) {
        this.d = v;
        this.e = v - (v >> 2);
        this.f = z;
        this.b = new AtomicInteger();
        this.g = new AtomicReference();
        this.c = new AtomicReference(r3.m);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.cancel(this.g);
        if(this.b.getAndIncrement() == 0) {
            SimpleQueue simpleQueue0 = this.h;
            if(simpleQueue0 != null) {
                simpleQueue0.clear();
            }
        }
    }

    public final void e() {
        s3[] arr_s3 = (s3[])this.c.getAndSet(r3.n);
        for(int v = 0; v < arr_s3.length; ++v) {
            s3 s30 = arr_s3[v];
            if(s30.get() != 0x8000000000000000L) {
                s30.a.onComplete();
            }
        }
    }

    public final void f() {
        s3[] arr_s31;
        Object object0;
        AtomicReference atomicReference1;
        if(this.b.getAndIncrement() != 0) {
            return;
        }
        SimpleQueue simpleQueue0 = this.h;
        int v = this.l;
        int v1 = this.e;
        boolean z = this.i != 1;
        AtomicReference atomicReference0 = this.c;
        s3[] arr_s3 = (s3[])atomicReference0.get();
        int v2 = 1;
        while(true) {
            int v3 = arr_s3.length;
            if(simpleQueue0 == null || v3 == 0) {
                atomicReference1 = atomicReference0;
            }
            else {
                int v4 = arr_s3.length;
                long v5 = 0x7FFFFFFFFFFFFFFFL;
                for(int v6 = 0; v6 < v4; ++v6) {
                    s3 s30 = arr_s3[v6];
                    long v7 = s30.get() - s30.c;
                    if(v7 == 0x8000000000000000L) {
                        --v3;
                    }
                    else if(v5 > v7) {
                        v5 = v7;
                    }
                }
                atomicReference1 = atomicReference0;
                if(v3 == 0) {
                    v5 = 0L;
                }
                do {
                    int v8 = Long.compare(v5, 0L);
                    if(v8 == 0) {
                        goto label_78;
                    }
                    if(this.isDisposed()) {
                        simpleQueue0.clear();
                        return;
                    }
                    boolean z1 = this.j;
                    if(z1 && !this.f) {
                        Throwable throwable0 = this.k;
                        if(throwable0 != null) {
                            this.g(throwable0);
                            return;
                        }
                    }
                    try {
                        object0 = simpleQueue0.poll();
                    }
                    catch(Throwable throwable1) {
                        Exceptions.throwIfFatal(throwable1);
                        SubscriptionHelper.cancel(this.g);
                        this.g(throwable1);
                        return;
                    }
                    if(z1 && object0 == null) {
                        Throwable throwable2 = this.k;
                        if(throwable2 != null) {
                            this.g(throwable2);
                            return;
                        }
                        this.e();
                        return;
                    }
                    if(object0 == null) {
                        goto label_78;
                    }
                    int v9 = arr_s3.length;
                    boolean z2 = false;
                    for(int v10 = 0; v10 < v9; ++v10) {
                        s3 s31 = arr_s3[v10];
                        long v11 = s31.get();
                        if(v11 == 0x8000000000000000L) {
                            z2 = true;
                        }
                        else {
                            if(v11 != 0x7FFFFFFFFFFFFFFFL) {
                                ++s31.c;
                            }
                            s31.a.onNext(object0);
                        }
                    }
                    --v5;
                    if(z) {
                        if(v + 1 == v1) {
                            ((Subscription)this.g.get()).request(((long)v1));
                            v = 0;
                        }
                        else {
                            ++v;
                        }
                    }
                    arr_s31 = (s3[])atomicReference1.get();
                }
                while(!z2 && arr_s31 == arr_s3);
                arr_s3 = arr_s31;
                goto label_103;
            label_78:
                if(v8 == 0) {
                    if(this.isDisposed()) {
                        simpleQueue0.clear();
                        return;
                    }
                    boolean z3 = this.j;
                    if(z3 && !this.f) {
                        Throwable throwable3 = this.k;
                        if(throwable3 != null) {
                            this.g(throwable3);
                            return;
                        }
                    }
                    if(z3 && simpleQueue0.isEmpty()) {
                        Throwable throwable4 = this.k;
                        if(throwable4 != null) {
                            this.g(throwable4);
                            return;
                        }
                        this.e();
                        return;
                    }
                }
            }
            this.l = v;
            v2 = this.b.addAndGet(-v2);
            if(v2 == 0) {
                return;
            }
            if(simpleQueue0 == null) {
                simpleQueue0 = this.h;
            }
            arr_s3 = (s3[])atomicReference1.get();
        label_103:
            atomicReference0 = atomicReference1;
        }
    }

    public final void g(Throwable throwable0) {
        s3[] arr_s3 = (s3[])this.c.getAndSet(r3.n);
        for(int v = 0; v < arr_s3.length; ++v) {
            s3 s30 = arr_s3[v];
            if(s30.get() != 0x8000000000000000L) {
                s30.a.onError(throwable0);
            }
        }
    }

    public final void h(s3 s30) {
        s3[] arr_s31;
        while(true) {
            AtomicReference atomicReference0 = this.c;
            s3[] arr_s3 = (s3[])atomicReference0.get();
            int v = arr_s3.length;
            if(v == 0) {
                return;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_s3[v1] == s30) {
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
                arr_s31 = r3.m;
            }
            else {
                s3[] arr_s32 = new s3[v - 1];
                System.arraycopy(arr_s3, 0, arr_s32, 0, v1);
                System.arraycopy(arr_s3, v1 + 1, arr_s32, v1, v - v1 - 1);
                arr_s31 = arr_s32;
            }
            do {
                if(atomicReference0.compareAndSet(arr_s3, arr_s31)) {
                    return;
                }
            }
            while(atomicReference0.get() == arr_s3);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.g.get() == SubscriptionHelper.CANCELLED;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(!this.j) {
            this.j = true;
            this.f();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.j) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.k = throwable0;
        this.j = true;
        this.f();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.j) {
            return;
        }
        if(this.i == 0 && !this.h.offer(object0)) {
            ((Subscription)this.g.get()).cancel();
            this.onError(new MissingBackpressureException());
            return;
        }
        this.f();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.setOnce(this.g, subscription0)) {
            if(subscription0 instanceof QueueSubscription) {
                int v = ((QueueSubscription)subscription0).requestFusion(3);
                if(v == 1) {
                    this.i = 1;
                    this.h = (QueueSubscription)subscription0;
                    this.j = true;
                    this.f();
                    return;
                }
                if(v == 2) {
                    this.i = 2;
                    this.h = (QueueSubscription)subscription0;
                    QueueDrainHelper.request(subscription0, this.d);
                    return;
                }
            }
            this.h = QueueDrainHelper.createQueue(this.d);
            QueueDrainHelper.request(subscription0, this.d);
        }
    }

    @Override  // io.reactivex.Flowable
    public final void subscribeActual(Subscriber subscriber0) {
        s3 s30 = new s3(subscriber0, this);
        subscriber0.onSubscribe(s30);
        while(true) {
            AtomicReference atomicReference0 = this.c;
            s3[] arr_s3 = (s3[])atomicReference0.get();
            if(arr_s3 == r3.n) {
                Throwable throwable0 = this.k;
                if(throwable0 != null) {
                    subscriber0.onError(throwable0);
                    return;
                }
                subscriber0.onComplete();
                return;
            }
            s3[] arr_s31 = new s3[arr_s3.length + 1];
            System.arraycopy(arr_s3, 0, arr_s31, 0, arr_s3.length);
            arr_s31[arr_s3.length] = s30;
            do {
                if(atomicReference0.compareAndSet(arr_s3, arr_s31)) {
                    if(s30.get() == 0x8000000000000000L) {
                        this.h(s30);
                        return;
                    }
                    this.f();
                    return;
                }
            }
            while(atomicReference0.get() == arr_s3);
        }
    }
}

