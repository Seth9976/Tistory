package fd;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

public final class k implements ConditionalSubscriber, Subscription {
    public final ConditionalSubscriber a;
    public final Function b;
    public Subscription c;
    public boolean d;

    public k(ConditionalSubscriber conditionalSubscriber0, Function function0) {
        this.a = conditionalSubscriber0;
        this.b = function0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.c.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.d) {
            return;
        }
        this.d = true;
        this.a.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.d) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.d = true;
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Object object1;
        if(this.d) {
            return;
        }
        try {
            object1 = ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null value");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.cancel();
            this.onError(throwable0);
            return;
        }
        this.a.onNext(object1);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.c, subscription0)) {
            this.c = subscription0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        this.c.request(v);
    }

    @Override  // io.reactivex.internal.fuseable.ConditionalSubscriber
    public final boolean tryOnNext(Object object0) {
        if(this.d) {
            return false;
        }
        try {
            Object object1 = ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null value");
            return this.a.tryOnNext(object1);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.cancel();
            this.onError(throwable0);
            return false;
        }
    }
}

