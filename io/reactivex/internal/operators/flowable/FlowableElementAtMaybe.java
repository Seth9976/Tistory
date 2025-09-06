package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.plugins.RxJavaPlugins;

public final class FlowableElementAtMaybe extends Maybe implements FuseToFlowable {
    public final Flowable a;
    public final long b;

    public FlowableElementAtMaybe(Flowable flowable0, long v) {
        this.a = flowable0;
        this.b = v;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableElementAt(this.a, this.b, null, false));
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        q1 q10 = new q1(maybeObserver0, this.b);
        this.a.subscribe(q10);
    }
}

