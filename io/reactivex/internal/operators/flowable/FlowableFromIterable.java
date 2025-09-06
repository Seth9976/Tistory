package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.Iterator;
import org.reactivestreams.Subscriber;

public final class FlowableFromIterable extends Flowable {
    public final Iterable b;

    public FlowableFromIterable(Iterable iterable0) {
        this.b = iterable0;
    }

    public static void subscribe(Subscriber subscriber0, Iterator iterator0) {
        try {
            if(!iterator0.hasNext()) {
                goto label_6;
            }
            goto label_8;
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptySubscription.error(throwable0, subscriber0);
            return;
        }
    label_6:
        EmptySubscription.complete(subscriber0);
        return;
    label_8:
        if(subscriber0 instanceof ConditionalSubscriber) {
            subscriber0.onSubscribe(new c2(((ConditionalSubscriber)subscriber0), iterator0, 0));
            return;
        }
        subscriber0.onSubscribe(new c2(subscriber0, iterator0, 1));
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Iterator iterator0;
        try {
            iterator0 = this.b.iterator();
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptySubscription.error(throwable0, subscriber0);
            return;
        }
        FlowableFromIterable.subscribe(subscriber0, iterator0);
    }
}

