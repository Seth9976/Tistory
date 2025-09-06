package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

public final class FlowableError extends Flowable {
    public final Callable b;

    public FlowableError(Callable callable0) {
        this.b = callable0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        try {
            throwable0 = (Throwable)ObjectHelper.requireNonNull(this.b.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
        }
        EmptySubscription.error(throwable0, subscriber0);
    }
}

