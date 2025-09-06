package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class y3 extends AtomicBoolean implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final FlowableRefCount b;
    public final x3 c;
    public Subscription d;

    public y3(Subscriber subscriber0, FlowableRefCount flowableRefCount0, x3 x30) {
        this.a = subscriber0;
        this.b = flowableRefCount0;
        this.c = x30;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.d.cancel();
        if(this.compareAndSet(false, true)) {
            FlowableRefCount flowableRefCount0 = this.b;
            x3 x30 = this.c;
            synchronized(flowableRefCount0) {
                if(flowableRefCount0.g != null && flowableRefCount0.g == x30) {
                    long v1 = x30.c - 1L;
                    x30.c = v1;
                    if(v1 == 0L && x30.d) {
                        if(flowableRefCount0.d == 0L) {
                            flowableRefCount0.f(x30);
                            return;
                        }
                        SequentialDisposable sequentialDisposable0 = new SequentialDisposable();
                        x30.b = sequentialDisposable0;
                        sequentialDisposable0.replace(flowableRefCount0.f.scheduleDirect(x30, flowableRefCount0.d, flowableRefCount0.e));
                    }
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.compareAndSet(false, true)) {
            this.b.e(this.c);
            this.a.onComplete();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.compareAndSet(false, true)) {
            this.b.e(this.c);
            this.a.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.d, subscription0)) {
            this.d = subscription0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        this.d.request(v);
    }
}

