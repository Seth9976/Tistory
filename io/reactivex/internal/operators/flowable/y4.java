package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class y4 implements FlowableSubscriber, Subscription {
    public final int a;
    public final Subscriber b;
    public final BiFunction c;
    public Subscription d;
    public boolean e;
    public Object f;

    public y4(Subscriber subscriber0, BiFunction biFunction0) {
        this.a = 0;
        super();
        this.b = subscriber0;
        this.c = biFunction0;
    }

    public y4(Subscriber subscriber0, Iterator iterator0, BiFunction biFunction0) {
        this.a = 1;
        super();
        this.b = subscriber0;
        this.f = iterator0;
        this.c = biFunction0;
    }

    public void a(Throwable throwable0) {
        Exceptions.throwIfFatal(throwable0);
        this.e = true;
        this.d.cancel();
        this.b.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.a != 0) {
            this.d.cancel();
            return;
        }
        this.d.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.a != 0) {
            if(!this.e) {
                this.e = true;
                this.b.onComplete();
            }
            return;
        }
        if(!this.e) {
            this.e = true;
            this.b.onComplete();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            if(this.e) {
                RxJavaPlugins.onError(throwable0);
                return;
            }
            this.e = true;
            this.b.onError(throwable0);
            return;
        }
        if(this.e) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.e = true;
        this.b.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Object object5;
        Object object3;
        Object object2;
        if(this.a != 0) {
            Iterator iterator0 = (Iterator)this.f;
            if(!this.e) {
                try {
                    Object object1 = iterator0.next();
                    object2 = ObjectHelper.requireNonNull(object1, "The iterator returned a null value");
                }
                catch(Throwable throwable0) {
                    this.a(throwable0);
                    return;
                }
                try {
                    object3 = ObjectHelper.requireNonNull(this.c.apply(object0, object2), "The zipper function returned a null value");
                }
                catch(Throwable throwable1) {
                    this.a(throwable1);
                    return;
                }
                Subscriber subscriber0 = this.b;
                subscriber0.onNext(object3);
                try {
                    if(!iterator0.hasNext()) {
                        goto label_21;
                    }
                }
                catch(Throwable throwable2) {
                    this.a(throwable2);
                }
                return;
            label_21:
                this.e = true;
                this.d.cancel();
                subscriber0.onComplete();
                return;
            }
            return;
        }
        if(!this.e) {
            Object object4 = this.f;
            Subscriber subscriber1 = this.b;
            if(object4 == null) {
                this.f = object0;
                subscriber1.onNext(object0);
                return;
            }
            try {
                object5 = ObjectHelper.requireNonNull(this.c.apply(object4, object0), "The value returned by the accumulator is null");
            }
            catch(Throwable throwable3) {
                Exceptions.throwIfFatal(throwable3);
                this.d.cancel();
                this.onError(throwable3);
                return;
            }
            this.f = object5;
            subscriber1.onNext(object5);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(this.a != 0) {
            if(SubscriptionHelper.validate(this.d, subscription0)) {
                this.d = subscription0;
                this.b.onSubscribe(this);
            }
            return;
        }
        if(SubscriptionHelper.validate(this.d, subscription0)) {
            this.d = subscription0;
            this.b.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(this.a != 0) {
            this.d.request(v);
            return;
        }
        this.d.request(v);
    }
}

