package fd;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.DeferredScalarSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class a extends DeferredScalarSubscriber {
    public final int a;
    public Object b;
    public boolean c;
    public final Object d;

    public a(Subscriber subscriber0, Object object0, Object object1, int v) {
        this.a = v;
        super(subscriber0);
        this.b = object0;
        this.d = object1;
    }

    @Override  // io.reactivex.internal.subscribers.DeferredScalarSubscriber
    public final void cancel() {
        if(this.a != 0) {
            super.cancel();
            this.upstream.cancel();
            return;
        }
        super.cancel();
        this.upstream.cancel();
    }

    @Override  // io.reactivex.internal.subscribers.DeferredScalarSubscriber
    public final void onComplete() {
        if(this.a != 0) {
            if(!this.c) {
                this.c = true;
                Object object0 = this.b;
                this.b = null;
                this.complete(object0);
            }
            return;
        }
        if(!this.c) {
            this.c = true;
            Object object1 = this.b;
            this.b = null;
            this.complete(object1);
        }
    }

    @Override  // io.reactivex.internal.subscribers.DeferredScalarSubscriber
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            if(this.c) {
                RxJavaPlugins.onError(throwable0);
                return;
            }
            this.c = true;
            this.b = null;
            this.downstream.onError(throwable0);
            return;
        }
        if(this.c) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.c = true;
        this.b = null;
        this.downstream.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.a != 0) {
            if(!this.c) {
                try {
                    this.b = ObjectHelper.requireNonNull(((BiFunction)this.d).apply(this.b, object0), "The reducer returned a null value");
                    return;
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    this.cancel();
                    this.onError(throwable0);
                }
            }
            return;
        }
        if(!this.c) {
            try {
                ((BiConsumer)this.d).accept(this.b, object0);
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                this.cancel();
                this.onError(throwable1);
            }
        }
    }

    @Override  // io.reactivex.internal.subscribers.DeferredScalarSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(this.a != 0) {
            if(SubscriptionHelper.validate(this.upstream, subscription0)) {
                this.upstream = subscription0;
                this.downstream.onSubscribe(this);
                subscription0.request(0x7FFFFFFFFFFFFFFFL);
            }
            return;
        }
        if(SubscriptionHelper.validate(this.upstream, subscription0)) {
            this.upstream = subscription0;
            this.downstream.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }
}

