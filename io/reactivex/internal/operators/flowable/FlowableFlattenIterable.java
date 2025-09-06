package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

public final class FlowableFlattenIterable extends a {
    public final Function b;
    public final int c;

    public FlowableFlattenIterable(Flowable flowable0, Function function0, int v) {
        super(flowable0);
        this.b = function0;
        this.c = v;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Iterator iterator0;
        Object object0;
        Flowable flowable0 = this.source;
        Function function0 = this.b;
        if(flowable0 instanceof Callable) {
            try {
                object0 = ((Callable)flowable0).call();
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                EmptySubscription.error(throwable0, subscriber0);
                return;
            }
            if(object0 == null) {
                EmptySubscription.complete(subscriber0);
                return;
            }
            try {
                iterator0 = ((Iterable)function0.apply(object0)).iterator();
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                EmptySubscription.error(throwable1, subscriber0);
                return;
            }
            FlowableFromIterable.subscribe(subscriber0, iterator0);
            return;
        }
        flowable0.subscribe(new a2(subscriber0, function0, this.c));
    }
}

