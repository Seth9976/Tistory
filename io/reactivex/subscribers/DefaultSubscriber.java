package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import org.reactivestreams.Subscription;

public abstract class DefaultSubscriber implements FlowableSubscriber {
    public Subscription a;

    public final void cancel() {
        Subscription subscription0 = this.a;
        this.a = SubscriptionHelper.CANCELLED;
        subscription0.cancel();
    }

    public void onStart() {
        this.request(0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(EndConsumerHelper.validate(this.a, subscription0, this.getClass())) {
            this.a = subscription0;
            this.onStart();
        }
    }

    public final void request(long v) {
        Subscription subscription0 = this.a;
        if(subscription0 != null) {
            subscription0.request(v);
        }
    }
}

