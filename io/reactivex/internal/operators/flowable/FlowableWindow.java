package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Subscriber;

public final class FlowableWindow extends a {
    public final long b;
    public final long c;
    public final int d;

    public FlowableWindow(Flowable flowable0, long v, long v1, int v2) {
        super(flowable0);
        this.b = v;
        this.c = v1;
        this.d = v2;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        long v = this.c;
        long v1 = this.b;
        if(v == v1) {
            h6 h60 = new h6(subscriber0, v1, this.d);
            this.source.subscribe(h60);
            return;
        }
        if(v > v1) {
            j6 j60 = new j6(subscriber0, this.b, this.c, this.d);
            this.source.subscribe(j60);
            return;
        }
        i6 i60 = new i6(subscriber0, this.b, this.c, this.d);
        this.source.subscribe(i60);
    }
}

