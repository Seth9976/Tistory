package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Action;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class h3 extends AtomicInteger implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final Action b;
    public final BackpressureOverflowStrategy c;
    public final long d;
    public final AtomicLong e;
    public final ArrayDeque f;
    public Subscription g;
    public volatile boolean h;
    public volatile boolean i;
    public Throwable j;

    public h3(Subscriber subscriber0, Action action0, BackpressureOverflowStrategy backpressureOverflowStrategy0, long v) {
        this.a = subscriber0;
        this.b = action0;
        this.c = backpressureOverflowStrategy0;
        this.d = v;
        this.e = new AtomicLong();
        this.f = new ArrayDeque();
    }

    public static void a(ArrayDeque arrayDeque0) {
        synchronized(arrayDeque0) {
            arrayDeque0.clear();
        }
    }

    public final void b() {
        Object object0;
        if(this.getAndIncrement() != 0) {
            return;
        }
        ArrayDeque arrayDeque0 = this.f;
        Subscriber subscriber0 = this.a;
        int v = 1;
        do {
            long v1 = this.e.get();
            long v2 = 0L;
            int v3;
            while((v3 = Long.compare(v2, v1)) != 0) {
                if(this.h) {
                    h3.a(arrayDeque0);
                    return;
                }
                boolean z = this.i;
                synchronized(arrayDeque0) {
                    object0 = arrayDeque0.poll();
                }
                if(z) {
                    Throwable throwable1 = this.j;
                    if(throwable1 != null) {
                        h3.a(arrayDeque0);
                        subscriber0.onError(throwable1);
                        return;
                    }
                    if(object0 == null) {
                        subscriber0.onComplete();
                        return;
                    }
                }
                if(object0 == null) {
                    break;
                }
                subscriber0.onNext(object0);
                ++v2;
            }
            if(v3 == 0) {
                if(this.h) {
                    h3.a(arrayDeque0);
                    return;
                }
                boolean z1 = this.i;
                synchronized(arrayDeque0) {
                    boolean z2 = arrayDeque0.isEmpty();
                }
                if(z1) {
                    Throwable throwable3 = this.j;
                    if(throwable3 != null) {
                        h3.a(arrayDeque0);
                        subscriber0.onError(throwable3);
                        return;
                    }
                    if(z2) {
                        subscriber0.onComplete();
                        return;
                    }
                }
            }
            if(v2 != 0L) {
                BackpressureHelper.produced(this.e, v2);
            }
            v = this.addAndGet(-v);
        }
        while(v != 0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.h = true;
        this.g.cancel();
        if(this.getAndIncrement() == 0) {
            h3.a(this.f);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.i = true;
        this.b();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.i) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.j = throwable0;
        this.i = true;
        this.b();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        boolean z1;
        if(this.i) {
            return;
        }
        boolean z = false;
        ArrayDeque arrayDeque0 = this.f;
        synchronized(arrayDeque0) {
            if(Long.compare(arrayDeque0.size(), this.d) == 0) {
                z1 = true;
                switch(this.c) {
                    case 1: {
                        arrayDeque0.pollLast();
                        arrayDeque0.offer(object0);
                        break;
                    }
                    case 2: {
                        arrayDeque0.poll();
                        arrayDeque0.offer(object0);
                        break;
                    }
                    default: {
                        goto label_20;
                    }
                }
                z1 = false;
                z = true;
            }
            else {
                arrayDeque0.offer(object0);
                z1 = false;
            }
        }
    label_20:
        if(z) {
            Action action0 = this.b;
            if(action0 != null) {
                try {
                    action0.run();
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    this.g.cancel();
                    this.onError(throwable0);
                }
            }
        }
        else {
            if(z1) {
                this.g.cancel();
                this.onError(new MissingBackpressureException());
                return;
            }
            this.b();
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.g, subscription0)) {
            this.g = subscription0;
            this.a.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.e, v);
            this.b();
        }
    }
}

