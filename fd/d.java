package fd;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class d implements ConditionalSubscriber, Subscription {
    public final Predicate a;
    public Subscription b;
    public boolean c;
    public final int d;
    public final Subscriber e;

    public d(Subscriber subscriber0, Predicate predicate0, int v) {
        this.d = v;
        super();
        this.a = predicate0;
        this.e = subscriber0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.b.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.d != 0) {
            if(!this.c) {
                this.c = true;
                this.e.onComplete();
            }
            return;
        }
        if(!this.c) {
            this.c = true;
            ((ConditionalSubscriber)this.e).onComplete();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.d != 0) {
            if(this.c) {
                RxJavaPlugins.onError(throwable0);
                return;
            }
            this.c = true;
            this.e.onError(throwable0);
            return;
        }
        if(this.c) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.c = true;
        ((ConditionalSubscriber)this.e).onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(!this.tryOnNext(object0) && !this.c) {
            this.b.request(1L);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(this.d != 0) {
            if(SubscriptionHelper.validate(this.b, subscription0)) {
                this.b = subscription0;
                this.e.onSubscribe(this);
            }
            return;
        }
        if(SubscriptionHelper.validate(this.b, subscription0)) {
            this.b = subscription0;
            ((ConditionalSubscriber)this.e).onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        this.b.request(v);
    }

    @Override  // io.reactivex.internal.fuseable.ConditionalSubscriber
    public final boolean tryOnNext(Object object0) {
        if(this.d != 0) {
            if(!this.c) {
                try {
                    if(this.a.test(object0)) {
                        goto label_9;
                    }
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    this.cancel();
                    this.onError(throwable0);
                }
                return false;
            label_9:
                this.e.onNext(object0);
                return true;
            }
            return false;
        }
        if(!this.c) {
            try {
                if(this.a.test(object0)) {
                    return ((ConditionalSubscriber)this.e).tryOnNext(object0);
                }
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                this.cancel();
                this.onError(throwable1);
            }
            return false;
        }
        return false;
    }
}

