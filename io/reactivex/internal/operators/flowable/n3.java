package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class n3 extends AtomicLong implements Subscription {
    public final Subscriber a;
    public volatile o3 b;
    public long c;

    public n3(Subscriber subscriber0) {
        this.a = subscriber0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.get() != 0x8000000000000000L && this.getAndSet(0x8000000000000000L) != 0x8000000000000000L) {
            o3 o30 = this.b;
            if(o30 != null) {
                o30.c(this);
                o30.b();
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.addCancel(this, v);
            o3 o30 = this.b;
            if(o30 != null) {
                o30.b();
            }
        }
    }
}

