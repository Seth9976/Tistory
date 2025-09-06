package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.plugins.RxJavaPlugins;

public final class FlowableCountSingle extends Single implements FuseToFlowable {
    public final Flowable a;

    public FlowableCountSingle(Flowable flowable0) {
        this.a = flowable0;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableCount(this.a));
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        p0 p00 = new p0(singleObserver0);
        this.a.subscribe(p00);
    }
}

