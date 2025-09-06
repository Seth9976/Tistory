package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableOperator;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;

public final class FlowableLift extends a {
    public final FlowableOperator b;

    public FlowableLift(Flowable flowable0, FlowableOperator flowableOperator0) {
        super(flowable0);
        this.b = flowableOperator0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        try {
            FlowableOperator flowableOperator0 = this.b;
            Subscriber subscriber1 = flowableOperator0.apply(subscriber0);
            if(subscriber1 == null) {
                throw new NullPointerException("Operator " + flowableOperator0 + " returned a null Subscriber");
            }
            this.source.subscribe(subscriber1);
            return;
        }
        catch(NullPointerException nullPointerException0) {
        }
        catch(Throwable throwable0) {
            goto label_10;
        }
        throw nullPointerException0;
    label_10:
        Exceptions.throwIfFatal(throwable0);
        RxJavaPlugins.onError(throwable0);
        NullPointerException nullPointerException1 = new NullPointerException("Actually not, but can\'t throw other exceptions due to RS");
        nullPointerException1.initCause(throwable0);
        throw nullPointerException1;
    }
}

