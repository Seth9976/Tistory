package io.reactivex.internal.operators.flowable;

import io.reactivex.Scheduler.Worker;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscription;

public final class d3 extends c3 {
    public final ConditionalSubscriber n;
    public long o;

    public d3(ConditionalSubscriber conditionalSubscriber0, Worker scheduler$Worker0, boolean z, int v) {
        super(scheduler$Worker0, z, v);
        this.n = conditionalSubscriber0;
    }

    @Override  // io.reactivex.internal.operators.flowable.c3
    public final void b() {
        ConditionalSubscriber conditionalSubscriber0 = this.n;
        SimpleQueue simpleQueue0 = this.g;
        long v = this.l;
        long v1 = this.o;
        int v2 = 1;
        while(true) {
            long v3 = this.e.get();
            int v4;
            while((v4 = Long.compare(v, v3)) != 0) {
                try {
                    boolean z = this.i;
                    Object object0 = simpleQueue0.poll();
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    this.h = true;
                    this.f.cancel();
                    simpleQueue0.clear();
                    conditionalSubscriber0.onError(throwable0);
                    this.a.dispose();
                    return;
                }
                if(this.a(conditionalSubscriber0, z, object0 == null)) {
                    return;
                }
                if(object0 == null) {
                    break;
                }
                if(conditionalSubscriber0.tryOnNext(object0)) {
                    ++v;
                }
                ++v1;
                if(v1 == ((long)this.d)) {
                    this.f.request(v1);
                    v1 = 0L;
                }
            }
            if(v4 == 0 && this.a(conditionalSubscriber0, this.i, simpleQueue0.isEmpty())) {
                return;
            }
            int v5 = this.get();
            if(v2 == v5) {
                this.l = v;
                this.o = v1;
                v2 = this.addAndGet(-v2);
                if(v2 != 0) {
                    continue;
                }
                return;
            }
            v2 = v5;
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
        ConditionalSubscriber conditionalSubscriber0 = this.n;
        SimpleQueue simpleQueue0 = this.g;
        long v = this.l;
        int v1 = 1;
        while(true) {
            long v2 = this.e.get();
            while(v != v2) {
                try {
                    Object object0 = simpleQueue0.poll();
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    this.h = true;
                    this.f.cancel();
                    conditionalSubscriber0.onError(throwable0);
                    this.a.dispose();
                    return;
                }
                if(this.h) {
                    return;
                }
                if(object0 == null) {
                    this.h = true;
                    conditionalSubscriber0.onComplete();
                    this.a.dispose();
                    return;
                }
                if(conditionalSubscriber0.tryOnNext(object0)) {
                    ++v;
                }
            }
            if(this.h) {
                return;
            }
            if(simpleQueue0.isEmpty()) {
                this.h = true;
                conditionalSubscriber0.onComplete();
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
            long v = this.o + 1L;
            if(v == ((long)this.d)) {
                this.o = 0L;
                this.f.request(v);
                return object0;
            }
            this.o = v;
        }
        return object0;
    }
}

