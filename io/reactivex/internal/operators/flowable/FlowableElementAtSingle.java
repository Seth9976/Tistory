package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.plugins.RxJavaPlugins;

public final class FlowableElementAtSingle extends Single implements FuseToFlowable {
    public final Flowable a;
    public final long b;
    public final Object c;

    public FlowableElementAtSingle(Flowable flowable0, long v, Object object0) {
        this.a = flowable0;
        this.b = v;
        this.c = object0;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableElementAt(this.a, this.b, this.c, true));
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        r1 r10 = new r1(singleObserver0, this.b, this.c);
        this.a.subscribe(r10);
    }
}

