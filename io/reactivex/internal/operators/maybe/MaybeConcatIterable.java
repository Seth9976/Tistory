package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.Iterator;
import org.reactivestreams.Subscriber;

public final class MaybeConcatIterable extends Flowable {
    public final Iterable b;

    public MaybeConcatIterable(Iterable iterable0) {
        this.b = iterable0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Iterator iterator0;
        try {
            iterator0 = (Iterator)ObjectHelper.requireNonNull(this.b.iterator(), "The sources Iterable returned a null Iterator");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptySubscription.error(throwable0, subscriber0);
            return;
        }
        f f0 = new f(subscriber0, iterator0);
        subscriber0.onSubscribe(f0);
        f0.a();
    }
}

