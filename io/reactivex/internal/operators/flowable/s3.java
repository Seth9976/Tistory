package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class s3 extends AtomicLong implements Subscription {
    public final Subscriber a;
    public final r3 b;
    public long c;

    public s3(Subscriber subscriber0, r3 r30) {
        this.a = subscriber0;
        this.b = r30;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.getAndSet(0x8000000000000000L) != 0x8000000000000000L) {
            this.b.h(this);
            this.b.f();
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.addCancel(this, v);
            this.b.f();
        }
    }
}

