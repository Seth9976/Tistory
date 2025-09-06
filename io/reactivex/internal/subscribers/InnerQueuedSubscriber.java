package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class InnerQueuedSubscriber extends AtomicReference implements FlowableSubscriber, Subscription {
    public final InnerQueuedSubscriberSupport a;
    public final int b;
    public final int c;
    public volatile SimpleQueue d;
    public volatile boolean e;
    public long f;
    public int g;

    public InnerQueuedSubscriber(InnerQueuedSubscriberSupport innerQueuedSubscriberSupport0, int v) {
        this.a = innerQueuedSubscriberSupport0;
        this.b = v;
        this.c = v - (v >> 2);
    }

    @Override  // org.reactivestreams.Subscription
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public boolean isDone() {
        return this.e;
    }

    @Override  // org.reactivestreams.Subscriber
    public void onComplete() {
        this.a.innerComplete(this);
    }

    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        this.a.innerError(this, throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public void onNext(Object object0) {
        InnerQueuedSubscriberSupport innerQueuedSubscriberSupport0 = this.a;
        if(this.g == 0) {
            innerQueuedSubscriberSupport0.innerNext(this, object0);
            return;
        }
        innerQueuedSubscriberSupport0.drain();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.setOnce(this, subscription0)) {
            if(subscription0 instanceof QueueSubscription) {
                int v = ((QueueSubscription)subscription0).requestFusion(3);
                if(v == 1) {
                    this.g = 1;
                    this.d = (QueueSubscription)subscription0;
                    this.e = true;
                    this.a.innerComplete(this);
                    return;
                }
                if(v == 2) {
                    this.g = 2;
                    this.d = (QueueSubscription)subscription0;
                    QueueDrainHelper.request(subscription0, this.b);
                    return;
                }
            }
            this.d = QueueDrainHelper.createQueue(this.b);
            QueueDrainHelper.request(subscription0, this.b);
        }
    }

    public SimpleQueue queue() {
        return this.d;
    }

    @Override  // org.reactivestreams.Subscription
    public void request(long v) {
        if(this.g != 1) {
            long v1 = this.f + v;
            if(v1 >= ((long)this.c)) {
                this.f = 0L;
                ((Subscription)this.get()).request(v1);
                return;
            }
            this.f = v1;
        }
    }

    public void requestOne() {
        if(this.g != 1) {
            long v = this.f + 1L;
            if(v == ((long)this.c)) {
                this.f = 0L;
                ((Subscription)this.get()).request(v);
                return;
            }
            this.f = v;
        }
    }

    public void setDone() {
        this.e = true;
    }
}

