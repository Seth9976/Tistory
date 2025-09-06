package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;

public final class FlowableFromFuture extends Flowable {
    public final Future b;
    public final long c;
    public final TimeUnit d;

    public FlowableFromFuture(Future future0, long v, TimeUnit timeUnit0) {
        this.b = future0;
        this.c = v;
        this.d = timeUnit0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Object object0;
        DeferredScalarSubscription deferredScalarSubscription0 = new DeferredScalarSubscription(subscriber0);
        subscriber0.onSubscribe(deferredScalarSubscription0);
        try {
            TimeUnit timeUnit0 = this.d;
            Future future0 = this.b;
            object0 = timeUnit0 == null ? future0.get() : future0.get(this.c, timeUnit0);
            goto label_14;
        }
        catch(Throwable throwable0) {
        }
        Exceptions.throwIfFatal(throwable0);
        if(!deferredScalarSubscription0.isCancelled()) {
            subscriber0.onError(throwable0);
        }
        return;
    label_14:
        if(object0 == null) {
            subscriber0.onError(new NullPointerException("The future returned null"));
            return;
        }
        deferredScalarSubscription0.complete(object0);
    }
}

