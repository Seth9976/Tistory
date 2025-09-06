package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class f4 extends AtomicLong implements Disposable, Subscription {
    public final k4 a;
    public final Subscriber b;
    public Serializable c;
    public final AtomicLong d;
    public boolean e;
    public boolean f;

    public f4(k4 k40, Subscriber subscriber0) {
        this.a = k40;
        this.b = subscriber0;
        this.d = new AtomicLong();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.getAndSet(0x8000000000000000L) != 0x8000000000000000L) {
            this.a.b(this);
            this.a.a();
            this.c = null;
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() == 0x8000000000000000L;
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v) && BackpressureHelper.addCancel(this, v) != 0x8000000000000000L) {
            BackpressureHelper.add(this.d, v);
            this.a.a();
            this.a.a.replay(this);
        }
    }
}

