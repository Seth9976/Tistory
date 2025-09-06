package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

public final class FlowableGenerate extends Flowable {
    public final Callable b;
    public final BiFunction c;
    public final Consumer d;

    public FlowableGenerate(Callable callable0, BiFunction biFunction0, Consumer consumer0) {
        this.b = callable0;
        this.c = biFunction0;
        this.d = consumer0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Object object0;
        try {
            object0 = this.b.call();
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptySubscription.error(throwable0, subscriber0);
            return;
        }
        subscriber0.onSubscribe(new e2(subscriber0, this.c, this.d, object0));
    }
}

