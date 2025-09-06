package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.Subscription;

public final class ArrayCompositeSubscription extends AtomicReferenceArray implements Disposable {
    public ArrayCompositeSubscription(int v) {
        super(v);
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        if(this.get(0) != SubscriptionHelper.CANCELLED) {
            int v1 = this.length();
            for(int v = 0; v < v1; ++v) {
                Subscription subscription0 = (Subscription)this.get(v);
                SubscriptionHelper subscriptionHelper0 = SubscriptionHelper.CANCELLED;
                if(subscription0 != subscriptionHelper0) {
                    Subscription subscription1 = (Subscription)this.getAndSet(v, subscriptionHelper0);
                    if(subscription1 != subscriptionHelper0 && subscription1 != null) {
                        subscription1.cancel();
                    }
                }
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.get(0) == SubscriptionHelper.CANCELLED;
    }

    public Subscription replaceResource(int v, Subscription subscription0) {
        Subscription subscription1;
        do {
            subscription1 = (Subscription)this.get(v);
            if(subscription1 == SubscriptionHelper.CANCELLED) {
                if(subscription0 != null) {
                    subscription0.cancel();
                }
                return null;
            }
        }
        while(!this.compareAndSet(v, subscription1, subscription0));
        return subscription1;
    }

    public boolean setResource(int v, Subscription subscription0) {
        Subscription subscription1;
        do {
            subscription1 = (Subscription)this.get(v);
            if(subscription1 == SubscriptionHelper.CANCELLED) {
                if(subscription0 != null) {
                    subscription0.cancel();
                }
                return false;
            }
        }
        while(!this.compareAndSet(v, subscription1, subscription0));
        if(subscription1 != null) {
            subscription1.cancel();
        }
        return true;
    }
}

