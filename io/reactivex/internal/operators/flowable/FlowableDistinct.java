package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.Collection;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

public final class FlowableDistinct extends a {
    public final Function b;
    public final Callable c;

    public FlowableDistinct(Flowable flowable0, Function function0, Callable callable0) {
        super(flowable0);
        this.b = function0;
        this.c = callable0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Collection collection0;
        try {
            collection0 = (Collection)ObjectHelper.requireNonNull(this.c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptySubscription.error(throwable0, subscriber0);
            return;
        }
        f1 f10 = new f1(subscriber0, this.b, collection0);
        this.source.subscribe(f10);
    }
}

