package io.reactivex.internal.operators.flowable;

import androidx.core.app.o;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler.Worker;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class c1 implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final long b;
    public final TimeUnit c;
    public final Worker d;
    public final boolean e;
    public Subscription f;

    public c1(Subscriber subscriber0, long v, TimeUnit timeUnit0, Worker scheduler$Worker0, boolean z) {
        this.a = subscriber0;
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler$Worker0;
        this.e = z;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.f.cancel();
        this.d.dispose();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        a1 a10 = new a1(this);
        this.d.schedule(a10, this.b, this.c);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        b1 b10 = new b1(this, throwable0);
        this.d.schedule(b10, (this.e ? this.b : 0L), this.c);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        o o0 = new o(22, this, object0);
        this.d.schedule(o0, this.b, this.c);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.f, subscription0)) {
            this.f = subscription0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        this.f.request(v);
    }
}

