package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class g6 extends AtomicBoolean implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final Object b;
    public final Consumer c;
    public final boolean d;
    public Subscription e;

    public g6(Subscriber subscriber0, Object object0, Consumer consumer0, boolean z) {
        this.a = subscriber0;
        this.b = object0;
        this.c = consumer0;
        this.d = z;
    }

    public final void a() {
        if(this.compareAndSet(false, true)) {
            try {
                this.c.accept(this.b);
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                RxJavaPlugins.onError(throwable0);
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.a();
        this.e.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        Subscriber subscriber0 = this.a;
        if(this.d) {
            if(this.compareAndSet(false, true)) {
                try {
                    this.c.accept(this.b);
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    subscriber0.onError(throwable0);
                    return;
                }
            }
            this.e.cancel();
            subscriber0.onComplete();
            return;
        }
        subscriber0.onComplete();
        this.e.cancel();
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        Subscriber subscriber0 = this.a;
        if(this.d) {
            if(this.compareAndSet(false, true)) {
                try {
                    this.c.accept(this.b);
                    goto label_8;
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                }
            }
            else {
            label_8:
                throwable1 = null;
            }
            this.e.cancel();
            if(throwable1 != null) {
                subscriber0.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
                return;
            }
            subscriber0.onError(throwable0);
            return;
        }
        subscriber0.onError(throwable0);
        this.e.cancel();
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.e, subscription0)) {
            this.e = subscription0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        this.e.request(v);
    }
}

