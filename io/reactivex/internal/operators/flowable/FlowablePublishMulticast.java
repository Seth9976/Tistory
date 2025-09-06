package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowablePublishMulticast extends a {
    public final Function b;
    public final int c;
    public final boolean d;

    public FlowablePublishMulticast(Flowable flowable0, Function function0, int v, boolean z) {
        super(flowable0);
        this.b = function0;
        this.c = v;
        this.d = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Publisher publisher0;
        r3 r30 = new r3(this.c, this.d);
        try {
            publisher0 = (Publisher)ObjectHelper.requireNonNull(this.b.apply(r30), "selector returned a null Publisher");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptySubscription.error(throwable0, subscriber0);
            return;
        }
        publisher0.subscribe(new t3(subscriber0, r30));
        this.source.subscribe(r30);
    }
}

