package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class w6 extends AtomicReference implements FlowableSubscriber {
    public final v6 a;
    public final int b;
    public boolean c;

    public w6(v6 v60, int v) {
        this.a = v60;
        this.b = v;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        v6 v60 = this.a;
        int v = this.b;
        if(!this.c) {
            v60.h = true;
            SubscriptionHelper.cancel(v60.e);
            v60.a(v);
            HalfSerializer.onComplete(v60.a, v60, v60.g);
            return;
        }
        v60.getClass();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.a.h = true;
        SubscriptionHelper.cancel(this.a.e);
        this.a.a(this.b);
        HalfSerializer.onError(this.a.a, throwable0, this.a, this.a.g);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(!this.c) {
            this.c = true;
        }
        this.a.d.set(this.b, object0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.setOnce(this, subscription0, 0x7FFFFFFFFFFFFFFFL);
    }
}

