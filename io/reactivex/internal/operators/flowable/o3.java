package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class o3 extends AtomicInteger implements FlowableSubscriber, Disposable {
    public final AtomicReference a;
    public final int b;
    public final AtomicReference c;
    public final AtomicBoolean d;
    public final AtomicReference e;
    public volatile Object f;
    public int g;
    public volatile SimpleQueue h;
    public static final n3[] i;
    public static final n3[] j;

    static {
        o3.i = new n3[0];
        o3.j = new n3[0];
    }

    public o3(AtomicReference atomicReference0, int v) {
        this.e = new AtomicReference();
        this.c = new AtomicReference(o3.i);
        this.a = atomicReference0;
        this.d = new AtomicBoolean();
        this.b = v;
    }

    public final boolean a(Object object0, boolean z) {
        int v = 0;
        if(object0 != null) {
            n3[] arr_n3 = o3.j;
            AtomicReference atomicReference0 = this.c;
            AtomicReference atomicReference1 = this.a;
            if(!NotificationLite.isComplete(object0)) {
                Throwable throwable0 = NotificationLite.getError(object0);
                while(!atomicReference1.compareAndSet(this, null) && atomicReference1.get() == this) {
                }
                n3[] arr_n32 = (n3[])atomicReference0.getAndSet(arr_n3);
                if(arr_n32.length != 0) {
                    while(v < arr_n32.length) {
                        arr_n32[v].a.onError(throwable0);
                        ++v;
                    }
                    return true;
                }
                RxJavaPlugins.onError(throwable0);
                return true;
            }
            else if(z) {
                while(!atomicReference1.compareAndSet(this, null) && atomicReference1.get() == this) {
                }
                n3[] arr_n31 = (n3[])atomicReference0.getAndSet(arr_n3);
                while(v < arr_n31.length) {
                    arr_n31[v].a.onComplete();
                    ++v;
                }
                return true;
            }
        }
        return false;
    }

    public final void b() {
        SimpleQueue simpleQueue1;
        Object object4;
        Object object3;
        Object object2;
        Object object1;
        if(this.getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference0 = this.c;
        n3[] arr_n3 = (n3[])atomicReference0.get();
        int v = 1;
    alab1:
        while(true) {
            Object object0 = this.f;
            SimpleQueue simpleQueue0 = this.h;
            boolean z = simpleQueue0 == null || simpleQueue0.isEmpty();
            if(this.a(object0, z)) {
                return;
            }
            if(z) {
            label_87:
                v = this.addAndGet(-v);
                if(v == 0) {
                    return;
                }
                arr_n3 = (n3[])atomicReference0.get();
            }
            else {
                int v1 = arr_n3.length;
                int v3 = 0;
                long v4 = 0x7FFFFFFFFFFFFFFFL;
                for(int v2 = 0; v2 < v1; ++v2) {
                    n3 n30 = arr_n3[v2];
                    long v5 = n30.get();
                    if(v5 == 0x8000000000000000L) {
                        ++v3;
                    }
                    else {
                        v4 = Math.min(v4, v5 - n30.c);
                    }
                }
                if(arr_n3.length == v3) {
                    try {
                        object1 = this.f;
                        object2 = simpleQueue0.poll();
                    }
                    catch(Throwable throwable0) {
                        Exceptions.throwIfFatal(throwable0);
                        ((Subscription)this.e.get()).cancel();
                        object1 = NotificationLite.error(throwable0);
                        this.f = object1;
                        object2 = null;
                    }
                    if(this.a(object1, object2 == null)) {
                        return;
                    }
                    if(this.g == 1) {
                        continue;
                    }
                    ((Subscription)this.e.get()).request(1L);
                }
                else {
                    int v6 = 0;
                    while(((long)v6) < v4) {
                        try {
                            object3 = this.f;
                            object4 = simpleQueue0.poll();
                        }
                        catch(Throwable throwable1) {
                            Exceptions.throwIfFatal(throwable1);
                            ((Subscription)this.e.get()).cancel();
                            object3 = NotificationLite.error(throwable1);
                            this.f = object3;
                            object4 = null;
                        }
                        if(this.a(object3, object4 == null)) {
                            return;
                        }
                        if(object4 == null) {
                            z = true;
                            break;
                        }
                        Object object5 = object4;
                        int v7 = arr_n3.length;
                        int v8 = 0;
                        boolean z1 = false;
                        while(v8 < v7) {
                            n3 n31 = arr_n3[v8];
                            long v9 = n31.get();
                            if(v9 == 0x8000000000000000L) {
                                simpleQueue1 = simpleQueue0;
                                z1 = true;
                            }
                            else {
                                if(v9 == 0x7FFFFFFFFFFFFFFFL) {
                                    simpleQueue1 = simpleQueue0;
                                }
                                else {
                                    simpleQueue1 = simpleQueue0;
                                    ++n31.c;
                                }
                                n31.a.onNext(object5);
                            }
                            ++v8;
                            simpleQueue0 = simpleQueue1;
                        }
                        ++v6;
                        n3[] arr_n31 = (n3[])atomicReference0.get();
                        if(z1 || arr_n31 != arr_n3) {
                            if(v6 != 0 && this.g != 1) {
                                ((Subscription)this.e.get()).request(((long)v6));
                            }
                            arr_n3 = arr_n31;
                            continue alab1;
                        }
                        z = false;
                    }
                    if(v6 != 0 && this.g != 1) {
                        ((Subscription)this.e.get()).request(((long)v6));
                    }
                    if(v4 == 0L || z) {
                        goto label_87;
                    }
                }
            }
        }
    }

    public final void c(n3 n30) {
        n3[] arr_n31;
        while(true) {
            AtomicReference atomicReference0 = this.c;
            n3[] arr_n3 = (n3[])atomicReference0.get();
            int v = arr_n3.length;
            if(v == 0) {
                break;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_n3[v1].equals(n30)) {
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
                arr_n31 = o3.i;
            }
            else {
                n3[] arr_n32 = new n3[v - 1];
                System.arraycopy(arr_n3, 0, arr_n32, 0, v1);
                System.arraycopy(arr_n3, v1 + 1, arr_n32, v1, v - v1 - 1);
                arr_n31 = arr_n32;
            }
        label_20:
            if(atomicReference0.compareAndSet(arr_n3, arr_n31)) {
                break;
            }
            if(atomicReference0.get() != arr_n3) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_20;
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.c.get() != o3.j && ((n3[])this.c.getAndSet(o3.j)) != o3.j) {
            while(!this.a.compareAndSet(this, null) && this.a.get() == this) {
            }
            SubscriptionHelper.cancel(this.e);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c.get() == o3.j;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.f == null) {
            this.f = NotificationLite.complete();
            this.b();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.f == null) {
            this.f = NotificationLite.error(throwable0);
            this.b();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.g == 0 && !this.h.offer(object0)) {
            this.onError(new MissingBackpressureException("Prefetch queue is full?!"));
            return;
        }
        this.b();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.setOnce(this.e, subscription0)) {
            if(subscription0 instanceof QueueSubscription) {
                int v = ((QueueSubscription)subscription0).requestFusion(7);
                if(v == 1) {
                    this.g = 1;
                    this.h = (QueueSubscription)subscription0;
                    this.f = NotificationLite.complete();
                    this.b();
                    return;
                }
                if(v == 2) {
                    this.g = 2;
                    this.h = (QueueSubscription)subscription0;
                    subscription0.request(((long)this.b));
                    return;
                }
            }
            this.h = new SpscArrayQueue(this.b);
            subscription0.request(((long)this.b));
        }
    }
}

