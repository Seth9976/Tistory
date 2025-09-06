package io.reactivex.processors;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class d extends AtomicLong implements Subscription {
    public final Subscriber a;
    public final PublishProcessor b;

    public d(Subscriber subscriber0, PublishProcessor publishProcessor0) {
        this.a = subscriber0;
        this.b = publishProcessor0;
    }

    public final void a(Object object0) {
        long v = this.get();
        if(v == 0x8000000000000000L) {
            return;
        }
        Subscriber subscriber0 = this.a;
        if(Long.compare(v, 0L) != 0) {
            subscriber0.onNext(object0);
            BackpressureHelper.producedCancel(this, 1L);
            return;
        }
        this.cancel();
        subscriber0.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.getAndSet(0x8000000000000000L) != 0x8000000000000000L) {
            this.b.e(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.addCancel(this, v);
        }
    }
}

