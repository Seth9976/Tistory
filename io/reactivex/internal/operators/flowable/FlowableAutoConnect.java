package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

public final class FlowableAutoConnect extends Flowable {
    public final ConnectableFlowable b;
    public final int c;
    public final Consumer d;
    public final AtomicInteger e;

    public FlowableAutoConnect(ConnectableFlowable connectableFlowable0, int v, Consumer consumer0) {
        this.b = connectableFlowable0;
        this.c = v;
        this.d = consumer0;
        this.e = new AtomicInteger();
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        ConnectableFlowable connectableFlowable0 = this.b;
        connectableFlowable0.subscribe(subscriber0);
        if(this.e.incrementAndGet() == this.c) {
            connectableFlowable0.connect(this.d);
        }
    }
}

