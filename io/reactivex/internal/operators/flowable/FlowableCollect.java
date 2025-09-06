package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

public final class FlowableCollect extends a {
    public final Callable b;
    public final BiConsumer c;

    public FlowableCollect(Flowable flowable0, Callable callable0, BiConsumer biConsumer0) {
        super(flowable0);
        this.b = callable0;
        this.c = biConsumer0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Object object0;
        try {
            object0 = ObjectHelper.requireNonNull(this.b.call(), "The initial value supplied is null");
        }
        catch(Throwable throwable0) {
            EmptySubscription.error(throwable0, subscriber0);
            return;
        }
        z z0 = new z(subscriber0, object0, this.c);
        this.source.subscribe(z0);
    }
}

