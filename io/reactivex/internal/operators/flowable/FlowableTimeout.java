package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableTimeout extends a {
    interface TimeoutSelectorSupport extends TimeoutSupport {
        void onTimeoutError(long arg1, Throwable arg2);
    }

    public final Publisher b;
    public final Function c;
    public final Publisher d;

    public FlowableTimeout(Flowable flowable0, Publisher publisher0, Function function0, Publisher publisher1) {
        super(flowable0);
        this.b = publisher0;
        this.c = function0;
        this.d = publisher1;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Publisher publisher0 = this.b;
        Function function0 = this.c;
        Publisher publisher1 = this.d;
        if(publisher1 == null) {
            y5 y50 = new y5(subscriber0, function0);
            subscriber0.onSubscribe(y50);
            if(publisher0 != null) {
                w5 w50 = new w5(0L, y50);
                if(y50.c.replace(w50)) {
                    publisher0.subscribe(w50);
                }
            }
            this.source.subscribe(y50);
            return;
        }
        x5 x50 = new x5(publisher1, subscriber0, function0);
        subscriber0.onSubscribe(x50);
        if(publisher0 != null) {
            w5 w51 = new w5(0L, x50);
            if(x50.j.replace(w51)) {
                publisher0.subscribe(w51);
            }
        }
        this.source.subscribe(x50);
    }
}

