package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class BoundedSubscriber extends AtomicReference implements FlowableSubscriber, Disposable, LambdaConsumerIntrospection, Subscription {
    public final Consumer a;
    public final Consumer b;
    public final Action c;
    public final Consumer d;
    public int e;
    public final int f;

    public BoundedSubscriber(Consumer consumer0, Consumer consumer1, Action action0, Consumer consumer2, int v) {
        this.a = consumer0;
        this.b = consumer1;
        this.c = action0;
        this.d = consumer2;
        this.f = v - (v >> 2);
    }

    @Override  // org.reactivestreams.Subscription
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        this.cancel();
    }

    @Override  // io.reactivex.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        return this.b != Functions.ON_ERROR_MISSING;
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.get() == SubscriptionHelper.CANCELLED;
    }

    @Override  // org.reactivestreams.Subscriber
    public void onComplete() {
        Object object0 = this.get();
        SubscriptionHelper subscriptionHelper0 = SubscriptionHelper.CANCELLED;
        if(object0 != subscriptionHelper0) {
            this.lazySet(subscriptionHelper0);
            try {
                this.c.run();
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                RxJavaPlugins.onError(throwable0);
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        Object object0 = this.get();
        SubscriptionHelper subscriptionHelper0 = SubscriptionHelper.CANCELLED;
        if(object0 != subscriptionHelper0) {
            this.lazySet(subscriptionHelper0);
            try {
                this.b.accept(throwable0);
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                RxJavaPlugins.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
            }
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public void onNext(Object object0) {
        if(!this.isDisposed()) {
            try {
                this.a.accept(object0);
                int v = this.e + 1;
                int v1 = this.f;
                if(v == v1) {
                    this.e = 0;
                    ((Subscription)this.get()).request(((long)v1));
                    return;
                }
                this.e = v;
                return;
            }
            catch(Throwable throwable0) {
            }
            Exceptions.throwIfFatal(throwable0);
            ((Subscription)this.get()).cancel();
            this.onError(throwable0);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.setOnce(this, subscription0)) {
            try {
                this.d.accept(this);
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                subscription0.cancel();
                this.onError(throwable0);
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public void request(long v) {
        ((Subscription)this.get()).request(v);
    }
}

