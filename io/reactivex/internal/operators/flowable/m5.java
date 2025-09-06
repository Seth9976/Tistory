package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class m5 extends AtomicReference implements FlowableSubscriber {
    public final n5 a;
    public final long b;
    public final int c;
    public volatile SimpleQueue d;
    public volatile boolean e;
    public int f;

    public m5(n5 n50, long v, int v1) {
        this.a = n50;
        this.b = v;
        this.c = v1;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        n5 n50 = this.a;
        if(this.b == n50.k) {
            this.e = true;
            n50.b();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        n5 n50 = this.a;
        if(this.b == n50.k && n50.f.addThrowable(throwable0)) {
            if(!n50.d) {
                n50.h.cancel();
                n50.e = true;
            }
            this.e = true;
            n50.b();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        n5 n50 = this.a;
        if(this.b == n50.k) {
            if(this.f == 0 && !this.d.offer(object0)) {
                this.onError(new MissingBackpressureException("Queue full?!"));
                return;
            }
            n50.b();
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.setOnce(this, subscription0)) {
            if(subscription0 instanceof QueueSubscription) {
                int v = ((QueueSubscription)subscription0).requestFusion(7);
                if(v == 1) {
                    this.f = 1;
                    this.d = (QueueSubscription)subscription0;
                    this.e = true;
                    this.a.b();
                    return;
                }
                if(v == 2) {
                    this.f = 2;
                    this.d = (QueueSubscription)subscription0;
                    subscription0.request(((long)this.c));
                    return;
                }
            }
            this.d = new SpscArrayQueue(this.c);
            subscription0.request(((long)this.c));
        }
    }
}

