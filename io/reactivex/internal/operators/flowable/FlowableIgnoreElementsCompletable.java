package io.reactivex.internal.operators.flowable;

import dd.o;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.plugins.RxJavaPlugins;

public final class FlowableIgnoreElementsCompletable extends Completable implements FuseToFlowable {
    public final Flowable a;

    public FlowableIgnoreElementsCompletable(Flowable flowable0) {
        this.a = flowable0;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableIgnoreElements(this.a));
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        o o0 = new o(completableObserver0, 1);
        this.a.subscribe(o0);
    }
}

