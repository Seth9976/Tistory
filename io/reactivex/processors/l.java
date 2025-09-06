package io.reactivex.processors;

import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;

public final class l extends BasicIntQueueSubscription {
    public final UnicastProcessor a;

    public l(UnicastProcessor unicastProcessor0) {
        this.a = unicastProcessor0;
        super();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.a.h) {
            return;
        }
        this.a.h = true;
        Runnable runnable0 = (Runnable)this.a.c.getAndSet(null);
        if(runnable0 != null) {
            runnable0.run();
        }
        this.a.g.lazySet(null);
        if(this.a.j.getAndIncrement() == 0) {
            this.a.g.lazySet(null);
            UnicastProcessor unicastProcessor0 = this.a;
            if(!unicastProcessor0.l) {
                unicastProcessor0.b.clear();
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.a.b.clear();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.a.b.isEmpty();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        return this.a.b.poll();
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.a.k, v);
            this.a.f();
        }
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int v) {
        if((v & 2) != 0) {
            this.a.l = true;
            return 2;
        }
        return 0;
    }
}

