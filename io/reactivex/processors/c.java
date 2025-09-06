package io.reactivex.processors;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class c extends AtomicLong implements Subscription {
    public final Subscriber a;
    public final MulticastProcessor b;
    public long c;

    public c(Subscriber subscriber0, MulticastProcessor multicastProcessor0) {
        this.a = subscriber0;
        this.b = multicastProcessor0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.getAndSet(0x8000000000000000L) != 0x8000000000000000L) {
            this.b.f(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            while(true) {
                long v1 = 0x7FFFFFFFFFFFFFFFL;
                long v2 = this.get();
                if(v2 == 0x8000000000000000L || v2 == 0x7FFFFFFFFFFFFFFFL) {
                    break;
                }
                long v3 = v2 + v;
                if(v3 >= 0L) {
                    v1 = v3;
                }
                if(this.compareAndSet(v2, v1)) {
                    this.b.e();
                    return;
                }
            }
        }
    }
}

