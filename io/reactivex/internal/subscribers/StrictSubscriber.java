package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.q;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class StrictSubscriber extends AtomicInteger implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final AtomicThrowable b;
    public final AtomicLong c;
    public final AtomicReference d;
    public final AtomicBoolean e;
    public volatile boolean f;

    public StrictSubscriber(Subscriber subscriber0) {
        this.a = subscriber0;
        this.b = new AtomicThrowable();
        this.c = new AtomicLong();
        this.d = new AtomicReference();
        this.e = new AtomicBoolean();
    }

    @Override  // org.reactivestreams.Subscription
    public void cancel() {
        if(!this.f) {
            SubscriptionHelper.cancel(this.d);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public void onComplete() {
        this.f = true;
        HalfSerializer.onComplete(this.a, this, this.b);
    }

    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        this.f = true;
        HalfSerializer.onError(this.a, throwable0, this, this.b);
    }

    @Override  // org.reactivestreams.Subscriber
    public void onNext(Object object0) {
        HalfSerializer.onNext(this.a, object0, this, this.b);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription0) {
        if(this.e.compareAndSet(false, true)) {
            this.a.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.d, this.c, subscription0);
            return;
        }
        subscription0.cancel();
        this.cancel();
        this.onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    @Override  // org.reactivestreams.Subscription
    public void request(long v) {
        if(v <= 0L) {
            this.cancel();
            this.onError(new IllegalArgumentException(q.n(v, "§3.9 violated: positive request amount required but it was ")));
            return;
        }
        SubscriptionHelper.deferredRequest(this.d, this.c, v);
    }
}

