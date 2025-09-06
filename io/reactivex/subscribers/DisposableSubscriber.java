package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public abstract class DisposableSubscriber implements FlowableSubscriber, Disposable {
    public final AtomicReference a;

    public DisposableSubscriber() {
        this.a = new AtomicReference();
    }

    public final void cancel() {
        this.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.cancel(this.a);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.a.get() == SubscriptionHelper.CANCELLED;
    }

    public void onStart() {
        ((Subscription)this.a.get()).request(0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        Class class0 = this.getClass();
        if(EndConsumerHelper.setOnce(this.a, subscription0, class0)) {
            this.onStart();
        }
    }

    public final void request(long v) {
        ((Subscription)this.a.get()).request(v);
    }
}

