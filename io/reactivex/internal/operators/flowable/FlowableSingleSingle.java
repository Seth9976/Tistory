package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.plugins.RxJavaPlugins;

public final class FlowableSingleSingle extends Single implements FuseToFlowable {
    public final Flowable a;
    public final Object b;

    public FlowableSingleSingle(Flowable flowable0, Object object0) {
        this.a = flowable0;
        this.b = object0;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableSingle(this.a, this.b, true));
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        a0 a00 = new a0(singleObserver0, this.b);
        this.a.subscribe(a00);
    }
}

