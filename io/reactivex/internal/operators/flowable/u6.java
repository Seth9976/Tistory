package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class u6 extends AtomicReference implements ConditionalSubscriber, Subscription {
    public final SerializedSubscriber a;
    public final BiFunction b;
    public final AtomicReference c;
    public final AtomicLong d;
    public final AtomicReference e;

    public u6(SerializedSubscriber serializedSubscriber0, BiFunction biFunction0) {
        this.c = new AtomicReference();
        this.d = new AtomicLong();
        this.e = new AtomicReference();
        this.a = serializedSubscriber0;
        this.b = biFunction0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        SubscriptionHelper.cancel(this.c);
        SubscriptionHelper.cancel(this.e);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        SubscriptionHelper.cancel(this.e);
        this.a.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        SubscriptionHelper.cancel(this.e);
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(!this.tryOnNext(object0)) {
            ((Subscription)this.c.get()).request(1L);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.deferredSetOnce(this.c, this.d, subscription0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        SubscriptionHelper.deferredRequest(this.c, this.d, v);
    }

    @Override  // io.reactivex.internal.fuseable.ConditionalSubscriber
    public final boolean tryOnNext(Object object0) {
        Object object2;
        SerializedSubscriber serializedSubscriber0 = this.a;
        Object object1 = this.get();
        if(object1 != null) {
            try {
                object2 = ObjectHelper.requireNonNull(this.b.apply(object0, object1), "The combiner returned a null value");
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                this.cancel();
                serializedSubscriber0.onError(throwable0);
                return false;
            }
            serializedSubscriber0.onNext(object2);
            return true;
        }
        return false;
    }
}

