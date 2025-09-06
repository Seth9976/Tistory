package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class SafeSubscriber implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public Subscription b;
    public boolean c;

    public SafeSubscriber(Subscriber subscriber0) {
        this.a = subscriber0;
    }

    @Override  // org.reactivestreams.Subscription
    public void cancel() {
        try {
            this.b.cancel();
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public void onComplete() {
        if(this.c) {
            return;
        }
        this.c = true;
        Subscriber subscriber0 = this.a;
        if(this.b == null) {
            NullPointerException nullPointerException0 = new NullPointerException("Subscription not set!");
            try {
                subscriber0.onSubscribe(EmptySubscription.INSTANCE);
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                RxJavaPlugins.onError(new CompositeException(new Throwable[]{nullPointerException0, throwable0}));
                return;
            }
            try {
                subscriber0.onError(nullPointerException0);
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                RxJavaPlugins.onError(new CompositeException(new Throwable[]{nullPointerException0, throwable1}));
            }
            return;
        }
        try {
            subscriber0.onComplete();
        }
        catch(Throwable throwable2) {
            Exceptions.throwIfFatal(throwable2);
            RxJavaPlugins.onError(throwable2);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        if(this.c) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.c = true;
        Subscriber subscriber0 = this.a;
        if(this.b == null) {
            NullPointerException nullPointerException0 = new NullPointerException("Subscription not set!");
            try {
                subscriber0.onSubscribe(EmptySubscription.INSTANCE);
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                RxJavaPlugins.onError(new CompositeException(new Throwable[]{throwable0, nullPointerException0, throwable1}));
                return;
            }
            try {
                subscriber0.onError(new CompositeException(new Throwable[]{throwable0, nullPointerException0}));
            }
            catch(Throwable throwable2) {
                Exceptions.throwIfFatal(throwable2);
                RxJavaPlugins.onError(new CompositeException(new Throwable[]{throwable0, nullPointerException0, throwable2}));
            }
            return;
        }
        if(throwable0 == null) {
            throwable0 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        try {
            subscriber0.onError(throwable0);
        }
        catch(Throwable throwable3) {
            Exceptions.throwIfFatal(throwable3);
            RxJavaPlugins.onError(new CompositeException(new Throwable[]{throwable0, throwable3}));
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public void onNext(Object object0) {
        if(this.c) {
            return;
        }
        Subscriber subscriber0 = this.a;
        if(this.b == null) {
            this.c = true;
            NullPointerException nullPointerException0 = new NullPointerException("Subscription not set!");
            try {
                subscriber0.onSubscribe(EmptySubscription.INSTANCE);
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                RxJavaPlugins.onError(new CompositeException(new Throwable[]{nullPointerException0, throwable0}));
                return;
            }
            try {
                subscriber0.onError(nullPointerException0);
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                RxJavaPlugins.onError(new CompositeException(new Throwable[]{nullPointerException0, throwable1}));
            }
            return;
        }
        if(object0 == null) {
            NullPointerException nullPointerException1 = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.b.cancel();
            }
            catch(Throwable throwable2) {
                Exceptions.throwIfFatal(throwable2);
                this.onError(new CompositeException(new Throwable[]{nullPointerException1, throwable2}));
                return;
            }
            this.onError(nullPointerException1);
            return;
        }
        try {
            subscriber0.onNext(object0);
        }
        catch(Throwable throwable3) {
            Exceptions.throwIfFatal(throwable3);
            try {
                this.b.cancel();
            }
            catch(Throwable throwable4) {
                Exceptions.throwIfFatal(throwable4);
                this.onError(new CompositeException(new Throwable[]{throwable3, throwable4}));
                return;
            }
            this.onError(throwable3);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.b, subscription0)) {
            try {
                this.b = subscription0;
                this.a.onSubscribe(this);
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                this.c = true;
                try {
                    subscription0.cancel();
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    RxJavaPlugins.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
                    return;
                }
                RxJavaPlugins.onError(throwable0);
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public void request(long v) {
        try {
            this.b.request(v);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            try {
                this.b.cancel();
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                RxJavaPlugins.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
                return;
            }
            RxJavaPlugins.onError(throwable0);
        }
    }
}

