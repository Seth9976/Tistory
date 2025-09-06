package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

public abstract class t4 extends AtomicReference implements FlowableSubscriber, Subscription {
    public final SerializedSubscriber a;
    public final Publisher b;
    public final AtomicLong c;
    public final AtomicReference d;
    public Subscription e;

    public t4(SerializedSubscriber serializedSubscriber0, Publisher publisher0) {
        this.c = new AtomicLong();
        this.d = new AtomicReference();
        this.a = serializedSubscriber0;
        this.b = publisher0;
    }

    public abstract void a();

    public final void b() {
        Object object0 = this.getAndSet(null);
        if(object0 != null) {
            AtomicLong atomicLong0 = this.c;
            int v = Long.compare(atomicLong0.get(), 0L);
            SerializedSubscriber serializedSubscriber0 = this.a;
            if(v != 0) {
                serializedSubscriber0.onNext(object0);
                BackpressureHelper.produced(atomicLong0, 1L);
                return;
            }
            this.cancel();
            serializedSubscriber0.onError(new MissingBackpressureException("Couldn\'t emit value due to lack of requests!"));
        }
    }

    public abstract void c();

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        SubscriptionHelper.cancel(this.d);
        this.e.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        SubscriptionHelper.cancel(this.d);
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        SubscriptionHelper.cancel(this.d);
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.lazySet(object0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.e, subscription0)) {
            this.e = subscription0;
            this.a.onSubscribe(this);
            if(this.d.get() == null) {
                u4 u40 = new u4(this, 0);
                this.b.subscribe(u40);
                subscription0.request(0x7FFFFFFFFFFFFFFFL);
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.c, v);
        }
    }
}

