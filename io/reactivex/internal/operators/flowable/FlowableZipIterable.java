package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.Iterator;
import org.reactivestreams.Subscriber;

public final class FlowableZipIterable extends a {
    public final Iterable b;
    public final BiFunction c;

    public FlowableZipIterable(Flowable flowable0, Iterable iterable0, BiFunction biFunction0) {
        super(flowable0);
        this.b = iterable0;
        this.c = biFunction0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Iterator iterator0;
        try {
            iterator0 = (Iterator)ObjectHelper.requireNonNull(this.b.iterator(), "The iterator returned by other is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptySubscription.error(throwable0, subscriber0);
            return;
        }
        try {
            if(!iterator0.hasNext()) {
                goto label_12;
            }
            goto label_14;
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            EmptySubscription.error(throwable1, subscriber0);
            return;
        }
    label_12:
        EmptySubscription.complete(subscriber0);
        return;
    label_14:
        y4 y40 = new y4(subscriber0, iterator0, this.c);
        this.source.subscribe(y40);
    }
}

