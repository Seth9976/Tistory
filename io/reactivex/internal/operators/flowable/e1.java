package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EmptyComponent;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class e1 implements FlowableSubscriber, Subscription {
    public final int a;
    public Subscriber b;
    public Subscription c;

    public e1() {
        this.a = 0;
        super();
    }

    public e1(Subscriber subscriber0) {
        this.a = 1;
        super();
        this.b = subscriber0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.a != 0) {
            this.c.cancel();
            return;
        }
        Subscription subscription0 = this.c;
        this.c = EmptyComponent.INSTANCE;
        this.b = EmptyComponent.asSubscriber();
        subscription0.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.a != 0) {
            this.b.onComplete();
            return;
        }
        Subscriber subscriber0 = this.b;
        this.c = EmptyComponent.INSTANCE;
        this.b = EmptyComponent.asSubscriber();
        subscriber0.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            this.b.onError(throwable0);
            return;
        }
        Subscriber subscriber0 = this.b;
        this.c = EmptyComponent.INSTANCE;
        this.b = EmptyComponent.asSubscriber();
        subscriber0.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.a != 0) {
            this.b.onNext(object0);
            return;
        }
        this.b.onNext(object0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(this.a != 0) {
            if(SubscriptionHelper.validate(this.c, subscription0)) {
                this.c = subscription0;
                this.b.onSubscribe(this);
            }
            return;
        }
        if(SubscriptionHelper.validate(this.c, subscription0)) {
            this.c = subscription0;
            this.b.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(this.a != 0) {
            this.c.request(v);
            return;
        }
        this.c.request(v);
    }
}

