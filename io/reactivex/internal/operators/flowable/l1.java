package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class l1 extends BasicIntQueueSubscription implements FlowableSubscriber {
    public final Subscriber a;
    public final Action b;
    public Subscription c;
    public QueueSubscription d;
    public boolean e;

    public l1(Subscriber subscriber0, Action action0) {
        this.a = subscriber0;
        this.b = action0;
    }

    public final void a() {
        if(this.compareAndSet(0, 1)) {
            try {
                this.b.run();
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                RxJavaPlugins.onError(throwable0);
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.c.cancel();
        this.a();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.d.clear();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.a.onComplete();
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.c, subscription0)) {
            this.c = subscription0;
            if(subscription0 instanceof QueueSubscription) {
                this.d = (QueueSubscription)subscription0;
            }
            this.a.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        Object object0 = this.d.poll();
        if(object0 == null && this.e) {
            this.a();
        }
        return object0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        this.c.request(v);
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int v) {
        QueueSubscription queueSubscription0 = this.d;
        boolean z = false;
        if(queueSubscription0 != null && (v & 4) == 0) {
            int v1 = queueSubscription0.requestFusion(v);
            if(v1 != 0) {
                if(v1 == 1) {
                    z = true;
                }
                this.e = z;
            }
            return v1;
        }
        return 0;
    }
}

