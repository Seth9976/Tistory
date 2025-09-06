package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public abstract class ResourceSubscriber implements FlowableSubscriber, Disposable {
    public final AtomicReference a;
    public final ListCompositeDisposable b;
    public final AtomicLong c;

    public ResourceSubscriber() {
        this.a = new AtomicReference();
        this.b = new ListCompositeDisposable();
        this.c = new AtomicLong();
    }

    public final void add(Disposable disposable0) {
        ObjectHelper.requireNonNull(disposable0, "resource is null");
        this.b.add(disposable0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(SubscriptionHelper.cancel(this.a)) {
            this.b.dispose();
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.a.get() == SubscriptionHelper.CANCELLED;
    }

    public void onStart() {
        this.request(0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        Class class0 = this.getClass();
        if(EndConsumerHelper.setOnce(this.a, subscription0, class0)) {
            long v = this.c.getAndSet(0L);
            if(v != 0L) {
                subscription0.request(v);
            }
            this.onStart();
        }
    }

    public final void request(long v) {
        SubscriptionHelper.deferredRequest(this.a, this.c, v);
    }
}

