package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class b5 extends AtomicReference implements FlowableSubscriber {
    public final AtomicInteger a;
    public final int b;
    public final int c;
    public long d;
    public volatile SimpleQueue e;
    public volatile boolean f;
    public int g;

    public b5(EqualCoordinatorHelper flowableSequenceEqual$EqualCoordinatorHelper0, int v) {
        this.a = (AtomicInteger)flowableSequenceEqual$EqualCoordinatorHelper0;
        this.c = v - (v >> 2);
        this.b = v;
    }

    public final void a() {
        SimpleQueue simpleQueue0 = this.e;
        if(simpleQueue0 != null) {
            simpleQueue0.clear();
        }
    }

    public final void b() {
        if(this.g != 1) {
            long v = this.d + 1L;
            if(v >= ((long)this.c)) {
                this.d = 0L;
                ((Subscription)this.get()).request(v);
                return;
            }
            this.d = v;
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.f = true;
        ((EqualCoordinatorHelper)this.a).drain();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        ((EqualCoordinatorHelper)this.a).innerError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.g == 0 && !this.e.offer(object0)) {
            this.onError(new MissingBackpressureException());
            return;
        }
        ((EqualCoordinatorHelper)this.a).drain();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.setOnce(this, subscription0)) {
            if(subscription0 instanceof QueueSubscription) {
                int v = ((QueueSubscription)subscription0).requestFusion(3);
                if(v == 1) {
                    this.g = 1;
                    this.e = (QueueSubscription)subscription0;
                    this.f = true;
                    ((EqualCoordinatorHelper)this.a).drain();
                    return;
                }
                if(v == 2) {
                    this.g = 2;
                    this.e = (QueueSubscription)subscription0;
                    subscription0.request(((long)this.b));
                    return;
                }
            }
            this.e = new SpscArrayQueue(this.b);
            subscription0.request(((long)this.b));
        }
    }
}

