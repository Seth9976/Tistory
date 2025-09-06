package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class d5 extends DeferredScalarSubscription implements FlowableSubscriber {
    public final Object a;
    public final boolean b;
    public Subscription c;
    public boolean d;

    public d5(Subscriber subscriber0, Object object0, boolean z) {
        super(subscriber0);
        this.a = object0;
        this.b = z;
    }

    @Override  // io.reactivex.internal.subscriptions.DeferredScalarSubscription
    public final void cancel() {
        super.cancel();
        this.c.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.d) {
            return;
        }
        this.d = true;
        Object object0 = this.value;
        this.value = null;
        if(object0 == null) {
            object0 = this.a;
        }
        if(object0 == null) {
            if(this.b) {
                NoSuchElementException noSuchElementException0 = new NoSuchElementException();
                this.downstream.onError(noSuchElementException0);
                return;
            }
            this.downstream.onComplete();
            return;
        }
        this.complete(object0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.d) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.d = true;
        this.downstream.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.d) {
            return;
        }
        if(this.value != null) {
            this.d = true;
            this.c.cancel();
            IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException("Sequence contains more than one element!");
            this.downstream.onError(illegalArgumentException0);
            return;
        }
        this.value = object0;
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.c, subscription0)) {
            this.c = subscription0;
            this.downstream.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }
}

