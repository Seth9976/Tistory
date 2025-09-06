package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class p1 extends DeferredScalarSubscription implements FlowableSubscriber {
    public final long a;
    public final Object b;
    public final boolean c;
    public Subscription d;
    public long e;
    public boolean f;

    public p1(Subscriber subscriber0, long v, Object object0, boolean z) {
        super(subscriber0);
        this.a = v;
        this.b = object0;
        this.c = z;
    }

    @Override  // io.reactivex.internal.subscriptions.DeferredScalarSubscription
    public final void cancel() {
        super.cancel();
        this.d.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(!this.f) {
            this.f = true;
            Object object0 = this.b;
            if(object0 == null) {
                if(this.c) {
                    NoSuchElementException noSuchElementException0 = new NoSuchElementException();
                    this.downstream.onError(noSuchElementException0);
                    return;
                }
                this.downstream.onComplete();
                return;
            }
            this.complete(object0);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.f) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.f = true;
        this.downstream.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.f) {
            return;
        }
        long v = this.e;
        if(v == this.a) {
            this.f = true;
            this.d.cancel();
            this.complete(object0);
            return;
        }
        this.e = v + 1L;
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.d, subscription0)) {
            this.d = subscription0;
            this.downstream.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }
}

