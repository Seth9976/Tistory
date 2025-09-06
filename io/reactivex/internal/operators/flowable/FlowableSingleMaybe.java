package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.plugins.RxJavaPlugins;

public final class FlowableSingleMaybe extends Maybe implements FuseToFlowable {
    public final Flowable a;

    public FlowableSingleMaybe(Flowable flowable0) {
        this.a = flowable0;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableSingle(this.a, null, false));
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        h h0 = new h(maybeObserver0);
        this.a.subscribe(h0);
    }
}

