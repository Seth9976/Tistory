package io.reactivex.processors;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class f extends AtomicInteger implements Subscription {
    public final Subscriber a;
    public final ReplayProcessor b;
    public Serializable c;
    public final AtomicLong d;
    public volatile boolean e;
    public long f;

    public f(Subscriber subscriber0, ReplayProcessor replayProcessor0) {
        this.a = subscriber0;
        this.b = replayProcessor0;
        this.d = new AtomicLong();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(!this.e) {
            this.e = true;
            this.b.e(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.d, v);
            this.b.b.replay(this);
        }
    }
}

