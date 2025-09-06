package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

public final class FlowableBuffer extends a {
    public final int b;
    public final int c;
    public final Callable d;

    public FlowableBuffer(Flowable flowable0, int v, int v1, Callable callable0) {
        super(flowable0);
        this.b = v;
        this.c = v1;
        this.d = callable0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Callable callable0 = this.d;
        int v = this.b;
        int v1 = this.c;
        if(v == v1) {
            k k0 = new k(subscriber0, v, callable0);
            this.source.subscribe(k0);
            return;
        }
        if(v1 > v) {
            m m0 = new m(subscriber0, v, v1, callable0);
            this.source.subscribe(m0);
            return;
        }
        l l0 = new l(subscriber0, v, v1, callable0);
        this.source.subscribe(l0);
    }
}

