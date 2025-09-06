package io.reactivex.internal.operators.flowable;

import io.reactivex.Scheduler.Worker;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class e3 extends c3 {
    public final Subscriber n;

    public e3(Subscriber subscriber0, Worker scheduler$Worker0, boolean z, int v) {
        super(scheduler$Worker0, z, v);
        this.n = subscriber0;
    }

    @Override  // io.reactivex.internal.operators.flowable.c3
    public final void b() {
        Object object0;
        Subscriber subscriber0 = this.n;
        SimpleQueue simpleQueue0 = this.g;
        long v = this.l;
        int v1 = 1;
        while(true) {
            long v2 = this.e.get();
            int v3;
            while((v3 = Long.compare(v, v2)) != 0) {
                try {
                    boolean z = this.i;
                    object0 = simpleQueue0.poll();
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    this.h = true;
                    this.f.cancel();
                    simpleQueue0.clear();
                    subscriber0.onError(throwable0);
                    this.a.dispose();
                    return;
                }
                if(this.a(subscriber0, z, object0 == null)) {
                    return;
                }
                if(object0 == null) {
                    break;
                }
                subscriber0.onNext(object0);
                ++v;
                if(v == ((long)this.d)) {
                    if(v2 != 0x7FFFFFFFFFFFFFFFL) {
                        v2 = this.e.addAndGet(-v);
                    }
                    this.f.request(v);
                    v = 0L;
                }
            }
            if(v3 == 0 && this.a(subscriber0, this.i, simpleQueue0.isEmpty())) {
                return;
            }
            int v4 = this.get();
            if(v1 == v4) {
                this.l = v;
                v1 = this.addAndGet(-v1);
                if(v1 != 0) {
                    continue;
                }
                return;
            }
            v1 = v4;
        }
    }

    @Override  // io.reactivex.internal.operators.flowable.c3
    public final void c() {
        int v = 1;
        do {
            if(this.h) {
                return;
            }
            boolean z = this.i;
            this.n.onNext(null);
            if(z) {
                this.h = true;
                Throwable throwable0 = this.j;
                if(throwable0 == null) {
                    this.n.onComplete();
                }
                else {
                    this.n.onError(throwable0);
                }
                this.a.dispose();
                return;
            }
            v = this.addAndGet(-v);
        }
        while(v != 0);
    }

    @Override  // io.reactivex.internal.operators.flowable.c3
    public final void d() {
        Object object0;
        Subscriber subscriber0 = this.n;
        SimpleQueue simpleQueue0 = this.g;
        long v = this.l;
        int v1 = 1;
        while(true) {
            long v2 = this.e.get();
            while(v != v2) {
                try {
                    object0 = simpleQueue0.poll();
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    this.h = true;
                    this.f.cancel();
                    subscriber0.onError(throwable0);
                    this.a.dispose();
                    return;
                }
                if(this.h) {
                    return;
                }
                if(object0 == null) {
                    this.h = true;
                    subscriber0.onComplete();
                    this.a.dispose();
                    return;
                }
                subscriber0.onNext(object0);
                ++v;
            }
            if(this.h) {
                return;
            }
            if(simpleQueue0.isEmpty()) {
                this.h = true;
                subscriber0.onComplete();
                this.a.dispose();
                return;
            }
            int v3 = this.get();
            if(v1 == v3) {
                this.l = v;
                v1 = this.addAndGet(-v1);
                if(v1 != 0) {
                    continue;
                }
                return;
            }
            v1 = v3;
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.f, subscription0)) {
            this.f = subscription0;
            if(subscription0 instanceof QueueSubscription) {
                int v = ((QueueSubscription)subscription0).requestFusion(7);
                if(v == 1) {
                    this.k = 1;
                    this.g = (QueueSubscription)subscription0;
                    this.i = true;
                    this.n.onSubscribe(this);
                    return;
                }
                if(v == 2) {
                    this.k = 2;
                    this.g = (QueueSubscription)subscription0;
                    this.n.onSubscribe(this);
                    subscription0.request(((long)this.c));
                    return;
                }
            }
            this.g = new SpscArrayQueue(this.c);
            this.n.onSubscribe(this);
            subscription0.request(((long)this.c));
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        Object object0 = this.g.poll();
        if(object0 != null && this.k != 1) {
            long v = this.l + 1L;
            if(v == ((long)this.d)) {
                this.l = 0L;
                this.f.request(v);
                return object0;
            }
            this.l = v;
        }
        return object0;
    }
}

