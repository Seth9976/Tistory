package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableRepeatWhen extends a {
    public final Function b;

    public FlowableRepeatWhen(Flowable flowable0, Function function0) {
        super(flowable0);
        this.b = function0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Publisher publisher0;
        SerializedSubscriber serializedSubscriber0 = new SerializedSubscriber(subscriber0);
        FlowableProcessor flowableProcessor0 = UnicastProcessor.create(8).toSerialized();
        try {
            publisher0 = (Publisher)ObjectHelper.requireNonNull(this.b.apply(flowableProcessor0), "handler returned a null Publisher");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptySubscription.error(throwable0, subscriber0);
            return;
        }
        c4 c40 = new c4(this.source);
        b4 b40 = new b4(serializedSubscriber0, flowableProcessor0, c40, 0);
        c40.d = b40;
        subscriber0.onSubscribe(b40);
        publisher0.subscribe(c40);
        c40.onNext(0);
    }
}

