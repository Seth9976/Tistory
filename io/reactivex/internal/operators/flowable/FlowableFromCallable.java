package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

public final class FlowableFromCallable extends Flowable implements Callable {
    public final Callable b;

    public FlowableFromCallable(Callable callable0) {
        this.b = callable0;
    }

    @Override
    public Object call() throws Exception {
        return ObjectHelper.requireNonNull(this.b.call(), "The callable returned a null value");
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Object object0;
        DeferredScalarSubscription deferredScalarSubscription0 = new DeferredScalarSubscription(subscriber0);
        subscriber0.onSubscribe(deferredScalarSubscription0);
        try {
            object0 = ObjectHelper.requireNonNull(this.b.call(), "The callable returned a null value");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            if(deferredScalarSubscription0.isCancelled()) {
                RxJavaPlugins.onError(throwable0);
                return;
            }
            subscriber0.onError(throwable0);
            return;
        }
        deferredScalarSubscription0.complete(object0);
    }
}

