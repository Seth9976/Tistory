package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.plugins.RxJavaPlugins;

public final class FlowableAllSingle extends Single implements FuseToFlowable {
    public final Flowable a;
    public final Predicate b;

    public FlowableAllSingle(Flowable flowable0, Predicate predicate0) {
        this.a = flowable0;
        this.b = predicate0;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableAll(this.a, this.b));
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        h h0 = new h(singleObserver0, this.b, 0);
        this.a.subscribe(h0);
    }
}

