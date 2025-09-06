package io.reactivex.internal.operators.flowable;

import cd.a;
import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.SubscriberResourceWrapper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class g4 extends Flowable {
    public final int b;
    public final Function c;
    public final Object d;

    public g4(Object object0, Function function0, int v) {
        this.b = v;
        super();
        this.d = object0;
        this.c = function0;
    }

    @Override  // io.reactivex.Flowable
    public final void subscribeActual(Subscriber subscriber0) {
        Publisher publisher1;
        ConnectableFlowable connectableFlowable0;
        Object object0;
        Publisher publisher0;
        if(this.b != 0) {
            try {
                publisher0 = (Publisher)ObjectHelper.requireNonNull(this.c.apply(this.d), "The mapper returned a null Publisher");
            }
            catch(Throwable throwable0) {
                EmptySubscription.error(throwable0, subscriber0);
                return;
            }
            if(publisher0 instanceof Callable) {
                try {
                    object0 = ((Callable)publisher0).call();
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    EmptySubscription.error(throwable1, subscriber0);
                    return;
                }
                if(object0 == null) {
                    EmptySubscription.complete(subscriber0);
                    return;
                }
                subscriber0.onSubscribe(new ScalarSubscription(subscriber0, object0));
                return;
            }
            publisher0.subscribe(subscriber0);
            return;
        }
        try {
            connectableFlowable0 = (ConnectableFlowable)ObjectHelper.requireNonNull(((Callable)this.d).call(), "The connectableFactory returned null");
        }
        catch(Throwable throwable2) {
            Exceptions.throwIfFatal(throwable2);
            EmptySubscription.error(throwable2, subscriber0);
            return;
        }
        try {
            publisher1 = (Publisher)ObjectHelper.requireNonNull(this.c.apply(connectableFlowable0), "The selector returned a null Publisher");
        }
        catch(Throwable throwable3) {
            Exceptions.throwIfFatal(throwable3);
            EmptySubscription.error(throwable3, subscriber0);
            return;
        }
        SubscriberResourceWrapper subscriberResourceWrapper0 = new SubscriberResourceWrapper(subscriber0);
        publisher1.subscribe(subscriberResourceWrapper0);
        connectableFlowable0.connect(new a(subscriberResourceWrapper0, 2));
    }
}

