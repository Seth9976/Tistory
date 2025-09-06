package io.reactivex.internal.operators.flowable;

import androidx.appcompat.widget.a;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class f6 extends AtomicBoolean implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final Scheduler b;
    public Subscription c;

    public f6(Subscriber subscriber0, Scheduler scheduler0) {
        this.a = subscriber0;
        this.b = scheduler0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.compareAndSet(false, true)) {
            a a0 = new a(this, 16);
            this.b.scheduleDirect(a0);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(!this.get()) {
            this.a.onComplete();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.get()) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(!this.get()) {
            this.a.onNext(object0);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.c, subscription0)) {
            this.c = subscription0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        this.c.request(v);
    }
}

