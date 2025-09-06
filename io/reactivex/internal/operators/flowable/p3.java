package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class p3 extends AtomicLong implements Subscription {
    public final Subscriber a;
    public final q3 b;
    public long c;

    public p3(Subscriber subscriber0, q3 q30) {
        this.a = subscriber0;
        this.b = q30;
    }

    public final boolean a() {
        return this.get() == 0x8000000000000000L;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.getAndSet(0x8000000000000000L) != 0x8000000000000000L) {
            this.b.c(this);
            this.b.b();
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        BackpressureHelper.addCancel(this, v);
        this.b.b();
    }
}

