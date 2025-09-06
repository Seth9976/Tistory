package fd;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class h extends AtomicInteger implements FlowableSubscriber {
    public final Subscriber[] a;
    public final AtomicLongArray b;
    public final long[] c;
    public final int d;
    public final int e;
    public Subscription f;
    public SimpleQueue g;
    public Throwable h;
    public volatile boolean i;
    public int j;
    public volatile boolean k;
    public final AtomicInteger l;
    public int m;
    public int n;

    public h(Subscriber[] arr_subscriber, int v) {
        this.l = new AtomicInteger();
        this.a = arr_subscriber;
        this.d = v;
        this.e = v - (v >> 2);
        int v1 = arr_subscriber.length + arr_subscriber.length;
        AtomicLongArray atomicLongArray0 = new AtomicLongArray(v1 + 1);
        this.b = atomicLongArray0;
        atomicLongArray0.lazySet(v1, ((long)arr_subscriber.length));
        this.c = new long[arr_subscriber.length];
    }

    public final void a() {
        Object object1;
        Object object0;
        if(this.getAndIncrement() != 0) {
            return;
        }
        if(this.n == 1) {
            SimpleQueue simpleQueue0 = this.g;
            Subscriber[] arr_subscriber = this.a;
            AtomicLongArray atomicLongArray0 = this.b;
            long[] arr_v = this.c;
            int v = this.j;
            int v1 = 1;
            while(true) {
                int v2 = 0;
                do {
                    if(this.k) {
                        simpleQueue0.clear();
                        return;
                    }
                    if(simpleQueue0.isEmpty()) {
                        for(int v3 = 0; v3 < arr_subscriber.length; ++v3) {
                            arr_subscriber[v3].onComplete();
                        }
                        return;
                    }
                    long v4 = atomicLongArray0.get(v);
                    long v5 = arr_v[v];
                    if(v4 == v5 || atomicLongArray0.get(arr_v.length + v) != 0L) {
                        ++v2;
                    }
                    else {
                        try {
                            object0 = simpleQueue0.poll();
                        }
                        catch(Throwable throwable0) {
                            Exceptions.throwIfFatal(throwable0);
                            this.f.cancel();
                            for(int v6 = 0; v6 < arr_subscriber.length; ++v6) {
                                arr_subscriber[v6].onError(throwable0);
                            }
                            return;
                        }
                        if(object0 == null) {
                            for(int v7 = 0; v7 < arr_subscriber.length; ++v7) {
                                arr_subscriber[v7].onComplete();
                            }
                            return;
                        }
                        arr_subscriber[v].onNext(object0);
                        arr_v[v] = v5 + 1L;
                        v2 = 0;
                    }
                    ++v;
                    v = v == arr_v.length ? 0 : v + 1;
                }
                while(v2 != arr_v.length);
                int v8 = this.get();
                if(v8 == v1) {
                    this.j = v;
                    v1 = this.addAndGet(-v1);
                    if(v1 != 0) {
                        continue;
                    }
                    return;
                }
                v1 = v8;
            }
        }
        SimpleQueue simpleQueue1 = this.g;
        Subscriber[] arr_subscriber1 = this.a;
        AtomicLongArray atomicLongArray1 = this.b;
        long[] arr_v1 = this.c;
        int v9 = this.j;
        int v10 = this.m;
        int v11 = 1;
        while(true) {
            int v12 = 0;
            do {
                if(this.k) {
                    simpleQueue1.clear();
                    return;
                }
                boolean z = this.i;
                if(z) {
                    Throwable throwable1 = this.h;
                    if(throwable1 != null) {
                        simpleQueue1.clear();
                        for(int v13 = 0; v13 < arr_subscriber1.length; ++v13) {
                            arr_subscriber1[v13].onError(throwable1);
                        }
                        return;
                    }
                }
                boolean z1 = simpleQueue1.isEmpty();
                if(z && z1) {
                    for(int v14 = 0; v14 < arr_subscriber1.length; ++v14) {
                        arr_subscriber1[v14].onComplete();
                    }
                    return;
                }
                if(z1) {
                    break;
                }
                long v15 = atomicLongArray1.get(v9);
                long v16 = arr_v1[v9];
                if(v15 == v16 || atomicLongArray1.get(arr_v1.length + v9) != 0L) {
                label_111:
                    ++v12;
                }
                else {
                    try {
                        object1 = simpleQueue1.poll();
                    }
                    catch(Throwable throwable2) {
                        Exceptions.throwIfFatal(throwable2);
                        this.f.cancel();
                        for(int v17 = 0; v17 < arr_subscriber1.length; ++v17) {
                            arr_subscriber1[v17].onError(throwable2);
                        }
                        return;
                    }
                    if(object1 == null) {
                        break;
                    }
                    else {
                        arr_subscriber1[v9].onNext(object1);
                        arr_v1[v9] = v16 + 1L;
                        ++v10;
                        if(v10 == this.e) {
                            this.f.request(((long)v10));
                            v10 = 0;
                        }
                        v12 = 0;
                        goto label_112;
                    }
                    goto label_111;
                }
            label_112:
                ++v9;
                v9 = v9 == arr_v1.length ? 0 : v9 + 1;
            }
            while(v12 != arr_v1.length);
            int v18 = this.get();
            if(v18 == v11) {
                this.j = v9;
                this.m = v10;
                v18 = this.addAndGet(-v11);
                if(v18 == 0) {
                    return;
                }
            }
            v11 = v18;
        }
    }

    public final void b() {
        Subscriber[] arr_subscriber = this.a;
        for(int v = 0; v < arr_subscriber.length && !this.k; ++v) {
            this.l.lazySet(v + 1);
            arr_subscriber[v].onSubscribe(new g(this, v, arr_subscriber.length));
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.i = true;
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.h = throwable0;
        this.i = true;
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.n == 0 && !this.g.offer(object0)) {
            this.f.cancel();
            this.onError(new MissingBackpressureException("Queue is full?"));
            return;
        }
        this.a();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.f, subscription0)) {
            this.f = subscription0;
            if(subscription0 instanceof QueueSubscription) {
                int v = ((QueueSubscription)subscription0).requestFusion(7);
                if(v == 1) {
                    this.n = 1;
                    this.g = (QueueSubscription)subscription0;
                    this.i = true;
                    this.b();
                    this.a();
                    return;
                }
                if(v == 2) {
                    this.n = 2;
                    this.g = (QueueSubscription)subscription0;
                    this.b();
                    subscription0.request(((long)this.d));
                    return;
                }
            }
            this.g = new SpscArrayQueue(this.d);
            this.b();
            subscription0.request(((long)this.d));
        }
    }
}

