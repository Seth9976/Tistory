package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class BlockingSubscriber extends AtomicReference implements FlowableSubscriber, Subscription {
    public static final Object TERMINATED;
    public final Queue a;

    static {
        BlockingSubscriber.TERMINATED = new Object();
    }

    public BlockingSubscriber(Queue queue0) {
        this.a = queue0;
    }

    @Override  // org.reactivestreams.Subscription
    public void cancel() {
        if(SubscriptionHelper.cancel(this)) {
            this.a.offer(BlockingSubscriber.TERMINATED);
        }
    }

    public boolean isCancelled() {
        return this.get() == SubscriptionHelper.CANCELLED;
    }

    @Override  // org.reactivestreams.Subscriber
    public void onComplete() {
        this.a.offer(NotificationLite.complete());
    }

    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        Object object0 = NotificationLite.error(throwable0);
        this.a.offer(object0);
    }

    @Override  // org.reactivestreams.Subscriber
    public void onNext(Object object0) {
        this.a.offer(object0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.setOnce(this, subscription0)) {
            Object object0 = NotificationLite.subscription(this);
            this.a.offer(object0);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public void request(long v) {
        ((Subscription)this.get()).request(v);
    }
}

