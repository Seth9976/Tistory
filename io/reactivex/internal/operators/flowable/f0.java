package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscription;

public abstract class f0 extends AtomicInteger implements FlowableSubscriber, ConcatMapSupport, Subscription {
    public final i0 a;
    public final Function b;
    public final int c;
    public final int d;
    public Subscription e;
    public int f;
    public SimpleQueue g;
    public volatile boolean h;
    public volatile boolean i;
    public final AtomicThrowable j;
    public volatile boolean k;
    public int l;

    public f0(Function function0, int v) {
        this.b = function0;
        this.c = v;
        this.d = v - (v >> 2);
        this.a = new i0(this);
        this.j = new AtomicThrowable();
    }

    public abstract void a();

    public abstract void b();

    @Override  // io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapSupport
    public final void innerComplete() {
        this.k = false;
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.h = true;
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.l != 2 && !this.g.offer(object0)) {
            this.e.cancel();
            this.onError(new IllegalStateException("Queue full?!"));
            return;
        }
        this.a();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.e, subscription0)) {
            this.e = subscription0;
            if(subscription0 instanceof QueueSubscription) {
                int v = ((QueueSubscription)subscription0).requestFusion(7);
                if(v == 1) {
                    this.l = 1;
                    this.g = (QueueSubscription)subscription0;
                    this.h = true;
                    this.b();
                    this.a();
                    return;
                }
                if(v == 2) {
                    this.l = 2;
                    this.g = (QueueSubscription)subscription0;
                    this.b();
                    subscription0.request(((long)this.c));
                    return;
                }
            }
            this.g = new SpscArrayQueue(this.c);
            this.b();
            subscription0.request(((long)this.c));
        }
    }
}

