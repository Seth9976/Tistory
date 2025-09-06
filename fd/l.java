package fd;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Notification;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.parallel.ParallelPeek;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class l implements FlowableSubscriber, Subscription {
    public final int a;
    public final Subscriber b;
    public final Object c;
    public boolean d;
    public Subscription e;

    public l(Subscriber subscriber0, Object object0, int v) {
        this.a = v;
        this.b = subscriber0;
        this.c = object0;
        super();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        switch(this.a) {
            case 0: {
                this.e.cancel();
                return;
            }
            case 1: {
                this.e.cancel();
                return;
            }
            default: {
                try {
                    ((ParallelPeek)this.c).i.run();
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    RxJavaPlugins.onError(throwable0);
                }
                this.e.cancel();
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                if(!this.d) {
                    this.d = true;
                    this.b.onComplete();
                }
                return;
            }
            case 1: {
                if(!this.d) {
                    this.d = true;
                    this.b.onComplete();
                }
                return;
            }
            default: {
                Subscriber subscriber0 = this.b;
                ParallelPeek parallelPeek0 = (ParallelPeek)this.c;
                if(!this.d) {
                    try {
                        this.d = true;
                        parallelPeek0.e.run();
                    }
                    catch(Throwable throwable0) {
                        Exceptions.throwIfFatal(throwable0);
                        subscriber0.onError(throwable0);
                        return;
                    }
                    subscriber0.onComplete();
                    try {
                        parallelPeek0.f.run();
                    }
                    catch(Throwable throwable1) {
                        Exceptions.throwIfFatal(throwable1);
                        RxJavaPlugins.onError(throwable1);
                    }
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                if(this.d) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.d = true;
                this.b.onError(throwable0);
                return;
            }
            case 1: {
                if(this.d) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.d = true;
                this.b.onError(throwable0);
                return;
            }
            default: {
                ParallelPeek parallelPeek0 = (ParallelPeek)this.c;
                if(this.d) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                try {
                    this.d = true;
                    parallelPeek0.d.accept(throwable0);
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    throwable0 = new CompositeException(new Throwable[]{throwable0, throwable1});
                }
                this.b.onError(throwable0);
                try {
                    parallelPeek0.f.run();
                }
                catch(Throwable throwable2) {
                    Exceptions.throwIfFatal(throwable2);
                    RxJavaPlugins.onError(throwable2);
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Notification notification0;
        Object object1;
        switch(this.a) {
            case 0: {
                if(!this.d) {
                    try {
                        object1 = ObjectHelper.requireNonNull(((Function)this.c).apply(object0), "The mapper returned a null value");
                    }
                    catch(Throwable throwable2) {
                        Exceptions.throwIfFatal(throwable2);
                        this.cancel();
                        this.onError(throwable2);
                        return;
                    }
                    this.b.onNext(object1);
                    return;
                }
                return;
            }
            case 1: {
                if(this.d) {
                    if(object0 instanceof Notification && ((Notification)object0).isOnError()) {
                        RxJavaPlugins.onError(((Notification)object0).getError());
                        return;
                    }
                    return;
                }
                else {
                    notification0 = (Notification)ObjectHelper.requireNonNull(((Function)this.c).apply(object0), "The selector returned a null Notification");
                }
                if(notification0.isOnError()) {
                    this.e.cancel();
                    this.onError(notification0.getError());
                    return;
                }
                if(notification0.isOnComplete()) {
                    this.e.cancel();
                    this.onComplete();
                    return;
                }
                Object object2 = notification0.getValue();
                this.b.onNext(object2);
                return;
            }
            default: {
                ParallelPeek parallelPeek0 = (ParallelPeek)this.c;
                if(!this.d) {
                    try {
                        parallelPeek0.b.accept(object0);
                    }
                    catch(Throwable throwable0) {
                        Exceptions.throwIfFatal(throwable0);
                        this.onError(throwable0);
                        return;
                    }
                    this.b.onNext(object0);
                    try {
                        parallelPeek0.c.accept(object0);
                    }
                    catch(Throwable throwable1) {
                        Exceptions.throwIfFatal(throwable1);
                        this.onError(throwable1);
                    }
                }
            }
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        switch(this.a) {
            case 0: {
                if(SubscriptionHelper.validate(this.e, subscription0)) {
                    this.e = subscription0;
                    this.b.onSubscribe(this);
                }
                return;
            }
            case 1: {
                if(SubscriptionHelper.validate(this.e, subscription0)) {
                    this.e = subscription0;
                    this.b.onSubscribe(this);
                }
                return;
            }
            default: {
                Subscriber subscriber0 = this.b;
                if(SubscriptionHelper.validate(this.e, subscription0)) {
                    try {
                        this.e = subscription0;
                        ((ParallelPeek)this.c).g.accept(subscription0);
                    }
                    catch(Throwable throwable0) {
                        Exceptions.throwIfFatal(throwable0);
                        subscription0.cancel();
                        subscriber0.onSubscribe(EmptySubscription.INSTANCE);
                        this.onError(throwable0);
                        return;
                    }
                    subscriber0.onSubscribe(this);
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        switch(this.a) {
            case 0: {
                this.e.request(v);
                return;
            }
            case 1: {
                this.e.request(v);
                return;
            }
            default: {
                try {
                    ((ParallelPeek)this.c).h.accept(v);
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    RxJavaPlugins.onError(throwable0);
                }
                this.e.request(v);
            }
        }
    }
}

