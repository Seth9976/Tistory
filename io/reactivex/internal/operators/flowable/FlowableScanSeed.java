package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

public final class FlowableScanSeed extends a {
    public final BiFunction b;
    public final Callable c;

    public FlowableScanSeed(Flowable flowable0, Callable callable0, BiFunction biFunction0) {
        super(flowable0);
        this.b = biFunction0;
        this.c = callable0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Object object0;
        try {
            object0 = ObjectHelper.requireNonNull(this.c.call(), "The seed supplied is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptySubscription.error(throwable0, subscriber0);
            return;
        }
        z4 z40 = new z4(0x80, this.b, object0, subscriber0);
        this.source.subscribe(z40);
    }
}

