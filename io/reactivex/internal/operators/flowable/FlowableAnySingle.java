package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.plugins.RxJavaPlugins;

public final class FlowableAnySingle extends Single implements FuseToFlowable {
    public final Flowable a;
    public final Predicate b;

    public FlowableAnySingle(Flowable flowable0, Predicate predicate0) {
        this.a = flowable0;
        this.b = predicate0;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableAny(this.a, this.b));
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        h h0 = new h(singleObserver0, this.b, 1);
        this.a.subscribe(h0);
    }
}

