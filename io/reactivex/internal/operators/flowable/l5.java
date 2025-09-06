package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class l5 implements FlowableSubscriber {
    public final Subscriber a;
    public final Publisher b;
    public final SubscriptionArbiter c;
    public boolean d;

    public l5(Publisher publisher0, Subscriber subscriber0) {
        this.a = subscriber0;
        this.b = publisher0;
        this.d = true;
        this.c = new SubscriptionArbiter(false);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.d) {
            this.d = false;
            this.b.subscribe(this);
            return;
        }
        this.a.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.d) {
            this.d = false;
        }
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        this.c.setSubscription(subscription0);
    }
}

