package io.reactivex.processors;

import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

@BackpressureSupport(BackpressureKind.FULL)
@SchedulerSupport("none")
public final class MulticastProcessor extends FlowableProcessor {
    public final AtomicInteger b;
    public final AtomicReference c;
    public final AtomicReference d;
    public final AtomicBoolean e;
    public final int f;
    public final int g;
    public final boolean h;
    public volatile SimpleQueue i;
    public volatile boolean j;
    public volatile Throwable k;
    public int l;
    public int m;
    public static final c[] n;
    public static final c[] o;

    static {
        MulticastProcessor.n = new c[0];
        MulticastProcessor.o = new c[0];
    }

    public MulticastProcessor(int v, boolean z) {
        ObjectHelper.verifyPositive(v, "bufferSize");
        this.f = v;
        this.g = v - (v >> 2);
        this.b = new AtomicInteger();
        this.d = new AtomicReference(MulticastProcessor.n);
        this.c = new AtomicReference();
        this.h = z;
        this.e = new AtomicBoolean();
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @NonNull
    public static MulticastProcessor create() {
        return new MulticastProcessor(0x80, false);
    }

    @CheckReturnValue
    @NonNull
    public static MulticastProcessor create(int v) {
        return new MulticastProcessor(v, false);
    }

    @CheckReturnValue
    @NonNull
    public static MulticastProcessor create(int v, boolean z) {
        return new MulticastProcessor(v, z);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @NonNull
    public static MulticastProcessor create(boolean z) {
        return new MulticastProcessor(0x80, z);
    }

    public final void e() {
        int v14;
        Object object0;
        boolean z;
        c[] arr_c1;
        if(this.b.getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference0 = this.d;
        int v = this.l;
        int v1 = this.g;
        int v2 = this.m;
        int v3 = 1;
    alab1:
        while(true) {
            SimpleQueue simpleQueue0 = this.i;
            if(simpleQueue0 == null) {
                v14 = v3;
            }
            else {
                c[] arr_c = (c[])atomicReference0.get();
                if(arr_c.length != 0) {
                    int v4 = arr_c.length;
                    long v5 = -1L;
                    for(int v6 = 0; v6 < v4; ++v6) {
                        c c0 = arr_c[v6];
                        long v7 = c0.get();
                        if(v7 >= 0L) {
                            v5 = v5 == -1L ? v7 - c0.c : Math.min(v5, v7 - c0.c);
                        }
                    }
                    int v8 = v;
                    while(true) {
                        int v9 = Long.compare(v5, 0L);
                        arr_c1 = MulticastProcessor.o;
                        if(v9 <= 0) {
                            goto label_84;
                        }
                        c[] arr_c2 = (c[])atomicReference0.get();
                        if(arr_c2 == arr_c1) {
                            simpleQueue0.clear();
                            return;
                        }
                        if(arr_c != arr_c2) {
                            v = v8;
                            continue alab1;
                        }
                        try {
                            z = this.j;
                            object0 = simpleQueue0.poll();
                        }
                        catch(Throwable throwable0) {
                            Exceptions.throwIfFatal(throwable0);
                            SubscriptionHelper.cancel(this.c);
                            this.k = throwable0;
                            this.j = true;
                            object0 = null;
                            z = true;
                        }
                        Object object1 = object0;
                        if(z && object1 == null) {
                            Throwable throwable1 = this.k;
                            if(throwable1 != null) {
                                c[] arr_c3 = (c[])atomicReference0.getAndSet(arr_c1);
                                for(int v10 = 0; v10 < arr_c3.length; ++v10) {
                                    c c1 = arr_c3[v10];
                                    if(c1.get() != 0x8000000000000000L) {
                                        c1.a.onError(throwable1);
                                    }
                                }
                                return;
                            }
                            c[] arr_c4 = (c[])atomicReference0.getAndSet(arr_c1);
                            for(int v11 = 0; v11 < arr_c4.length; ++v11) {
                                c c2 = arr_c4[v11];
                                if(c2.get() != 0x8000000000000000L) {
                                    c2.a.onComplete();
                                }
                            }
                            return;
                        }
                        if(object1 == null) {
                            break;
                        }
                        else {
                            int v12 = arr_c.length;
                            for(int v13 = 0; v13 < v12; ++v13) {
                                c c3 = arr_c[v13];
                                if(Long.compare(c3.get(), 0x8000000000000000L) != 0) {
                                    ++c3.c;
                                    c3.a.onNext(object1);
                                }
                            }
                            --v5;
                            if(v2 == 1) {
                                continue;
                            }
                            if(v8 + 1 == v1) {
                                ((Subscription)this.c.get()).request(((long)v1));
                                v8 = 0;
                            }
                            else {
                                ++v8;
                            }
                            continue;
                        }
                        goto label_84;
                    }
                    v14 = v3;
                    goto label_85;
                label_84:
                    v14 = v3;
                label_85:
                    if(v9 == 0) {
                        c[] arr_c5 = (c[])atomicReference0.get();
                        if(arr_c5 == arr_c1) {
                            simpleQueue0.clear();
                            return;
                        }
                        if(arr_c != arr_c5) {
                            v = v8;
                            v3 = v14;
                            continue;
                        }
                        else if(this.j && simpleQueue0.isEmpty()) {
                            Throwable throwable2 = this.k;
                            if(throwable2 != null) {
                                c[] arr_c6 = (c[])atomicReference0.getAndSet(arr_c1);
                                for(int v15 = 0; v15 < arr_c6.length; ++v15) {
                                    c c4 = arr_c6[v15];
                                    if(c4.get() != 0x8000000000000000L) {
                                        c4.a.onError(throwable2);
                                    }
                                }
                                return;
                            }
                            c[] arr_c7 = (c[])atomicReference0.getAndSet(arr_c1);
                            for(int v16 = 0; v16 < arr_c7.length; ++v16) {
                                c c5 = arr_c7[v16];
                                if(c5.get() != 0x8000000000000000L) {
                                    c5.a.onComplete();
                                }
                            }
                            return;
                        }
                    }
                    v = v8;
                }
            }
            this.l = v;
            v3 = this.b.addAndGet(-v14);
            if(v3 == 0) {
                break;
            }
        }
    }

    public final void f(c c0) {
    alab1:
        while(true) {
            AtomicReference atomicReference0 = this.d;
            c[] arr_c = (c[])atomicReference0.get();
            int v = arr_c.length;
            if(v == 0) {
                return;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_c[v1] == c0) {
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
            if(v1 >= 0) {
                if(v == 1) {
                    if(this.h) {
                        c[] arr_c1 = MulticastProcessor.o;
                        do {
                            if(atomicReference0.compareAndSet(arr_c, arr_c1)) {
                                SubscriptionHelper.cancel(this.c);
                                this.e.set(true);
                                return;
                            }
                        }
                        while(atomicReference0.get() == arr_c);
                        continue;
                    }
                    else {
                        c[] arr_c2 = MulticastProcessor.n;
                        while(true) {
                            if(atomicReference0.compareAndSet(arr_c, arr_c2)) {
                                break alab1;
                            }
                            if(atomicReference0.get() == arr_c) {
                                continue;
                            }
                            continue alab1;
                        }
                    }
                    goto label_26;
                }
                else {
                label_26:
                    c[] arr_c3 = new c[v - 1];
                    System.arraycopy(arr_c, 0, arr_c3, 0, v1);
                    System.arraycopy(arr_c, v1 + 1, arr_c3, v1, v - v1 - 1);
                label_29:
                    if(!atomicReference0.compareAndSet(arr_c, arr_c3)) {
                        if(atomicReference0.get() != arr_c) {
                            continue;
                        }
                        if(false) {
                            break;
                        }
                        goto label_29;
                    }
                }
            }
            break;
        }
    }

    // 去混淆评级： 低(20)
    @Override  // io.reactivex.processors.FlowableProcessor
    public Throwable getThrowable() {
        return this.e.get() ? this.k : null;
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.e.get() && this.k == null;
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return ((c[])this.d.get()).length != 0;
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.e.get() && this.k != null;
    }

    public boolean offer(Object object0) {
        if(this.e.get()) {
            return false;
        }
        ObjectHelper.requireNonNull(object0, "offer called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.m == 0 && this.i.offer(object0)) {
            this.e();
            return true;
        }
        return false;
    }

    @Override  // org.reactivestreams.Subscriber
    public void onComplete() {
        if(this.e.compareAndSet(false, true)) {
            this.j = true;
            this.e();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        ObjectHelper.requireNonNull(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.e.compareAndSet(false, true)) {
            this.k = throwable0;
            this.j = true;
            this.e();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public void onNext(Object object0) {
        if(this.e.get()) {
            return;
        }
        if(this.m == 0) {
            ObjectHelper.requireNonNull(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if(!this.i.offer(object0)) {
                SubscriptionHelper.cancel(this.c);
                this.onError(new MissingBackpressureException());
                return;
            }
        }
        this.e();
    }

    @Override  // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.setOnce(this.c, subscription0)) {
            if(subscription0 instanceof QueueSubscription) {
                int v = ((QueueSubscription)subscription0).requestFusion(3);
                if(v == 1) {
                    this.m = 1;
                    this.i = (QueueSubscription)subscription0;
                    this.j = true;
                    this.e();
                    return;
                }
                if(v == 2) {
                    this.m = 2;
                    this.i = (QueueSubscription)subscription0;
                    subscription0.request(((long)this.f));
                    return;
                }
            }
            this.i = new SpscArrayQueue(this.f);
            subscription0.request(((long)this.f));
        }
    }

    public void start() {
        if(SubscriptionHelper.setOnce(this.c, EmptySubscription.INSTANCE)) {
            this.i = new SpscArrayQueue(this.f);
        }
    }

    public void startUnbounded() {
        if(SubscriptionHelper.setOnce(this.c, EmptySubscription.INSTANCE)) {
            this.i = new SpscLinkedArrayQueue(this.f);
        }
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        c c0 = new c(subscriber0, this);
        subscriber0.onSubscribe(c0);
        while(true) {
            AtomicReference atomicReference0 = this.d;
            c[] arr_c = (c[])atomicReference0.get();
            if(arr_c == MulticastProcessor.o) {
                if(this.e.get() || !this.h) {
                    Throwable throwable0 = this.k;
                    if(throwable0 != null) {
                        subscriber0.onError(throwable0);
                        return;
                    }
                }
                subscriber0.onComplete();
                return;
            }
            c[] arr_c1 = new c[arr_c.length + 1];
            System.arraycopy(arr_c, 0, arr_c1, 0, arr_c.length);
            arr_c1[arr_c.length] = c0;
            do {
                if(atomicReference0.compareAndSet(arr_c, arr_c1)) {
                    if(c0.get() == 0x8000000000000000L) {
                        this.f(c0);
                        return;
                    }
                    this.e();
                    return;
                }
            }
            while(atomicReference0.get() == arr_c);
        }
    }
}

