package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class y6 extends AtomicReference implements FlowableSubscriber, Subscription {
    public final x6 a;
    public final int b;
    public final int c;
    public SimpleQueue d;
    public long e;
    public volatile boolean f;
    public int g;

    public y6(x6 x60, int v) {
        this.a = x60;
        this.b = v;
        this.c = v - (v >> 2);
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.f = true;
        this.a.b();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        x6 x60 = this.a;
        if(x60.e.addThrowable(throwable0)) {
            this.f = true;
            x60.b();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.g != 2) {
            this.d.offer(object0);
        }
        this.a.b();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.setOnce(this, subscription0)) {
            if(subscription0 instanceof QueueSubscription) {
                int v = ((QueueSubscription)subscription0).requestFusion(7);
                if(v == 1) {
                    this.g = 1;
                    this.d = (QueueSubscription)subscription0;
                    this.f = true;
                    this.a.b();
                    return;
                }
                if(v == 2) {
                    this.g = 2;
                    this.d = (QueueSubscription)subscription0;
                    subscription0.request(((long)this.b));
                    return;
                }
            }
            this.d = new SpscArrayQueue(this.b);
            subscription0.request(((long)this.b));
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(this.g != 1) {
            long v1 = this.e + v;
            if(v1 >= ((long)this.c)) {
                this.e = 0L;
                ((Subscription)this.get()).request(v1);
                return;
            }
            this.e = v1;
        }
    }
}

