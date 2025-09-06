package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public abstract class BasicFuseableSubscriber implements FlowableSubscriber, QueueSubscription {
    protected boolean done;
    protected final Subscriber downstream;
    protected QueueSubscription qs;
    protected int sourceMode;
    protected Subscription upstream;

    public BasicFuseableSubscriber(Subscriber subscriber0) {
        this.downstream = subscriber0;
    }

    public void afterDownstream() {
    }

    public boolean beforeDownstream() [...] // Inlined contents

    @Override  // org.reactivestreams.Subscription
    public void cancel() {
        this.upstream.cancel();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        this.qs.clear();
    }

    public final void fail(Throwable throwable0) {
        Exceptions.throwIfFatal(throwable0);
        this.upstream.cancel();
        this.onError(throwable0);
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.qs.isEmpty();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object object0) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object object0, Object object1) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override  // org.reactivestreams.Subscriber
    public void onComplete() {
        if(this.done) {
            return;
        }
        this.done = true;
        this.downstream.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        if(this.done) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.done = true;
        this.downstream.onError(throwable0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.upstream, subscription0)) {
            this.upstream = subscription0;
            if(subscription0 instanceof QueueSubscription) {
                this.qs = (QueueSubscription)subscription0;
            }
            this.downstream.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public void request(long v) {
        this.upstream.request(v);
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int v) {
        return this.transitiveBoundaryFusion(v);
    }

    public final int transitiveBoundaryFusion(int v) {
        QueueSubscription queueSubscription0 = this.qs;
        if(queueSubscription0 != null && (v & 4) == 0) {
            int v1 = queueSubscription0.requestFusion(v);
            if(v1 != 0) {
                this.sourceMode = v1;
            }
            return v1;
        }
        return 0;
    }
}

