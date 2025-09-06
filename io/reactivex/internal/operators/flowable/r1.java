package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;

public final class r1 implements FlowableSubscriber, Disposable {
    public final SingleObserver a;
    public final long b;
    public final Object c;
    public Subscription d;
    public long e;
    public boolean f;

    public r1(SingleObserver singleObserver0, long v, Object object0) {
        this.a = singleObserver0;
        this.b = v;
        this.c = object0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.d.cancel();
        this.d = SubscriptionHelper.CANCELLED;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.d == SubscriptionHelper.CANCELLED;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.d = SubscriptionHelper.CANCELLED;
        if(!this.f) {
            this.f = true;
            SingleObserver singleObserver0 = this.a;
            Object object0 = this.c;
            if(object0 != null) {
                singleObserver0.onSuccess(object0);
                return;
            }
            singleObserver0.onError(new NoSuchElementException());
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.f) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.f = true;
        this.d = SubscriptionHelper.CANCELLED;
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.f) {
            return;
        }
        long v = this.e;
        if(v == this.b) {
            this.f = true;
            this.d.cancel();
            this.d = SubscriptionHelper.CANCELLED;
            this.a.onSuccess(object0);
            return;
        }
        this.e = v + 1L;
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.d, subscription0)) {
            this.d = subscription0;
            this.a.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }
}

