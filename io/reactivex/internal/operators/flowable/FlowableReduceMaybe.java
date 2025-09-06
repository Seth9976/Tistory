package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Publisher;

public final class FlowableReduceMaybe extends Maybe implements FuseToFlowable, HasUpstreamPublisher {
    public final Flowable a;
    public final BiFunction b;

    public FlowableReduceMaybe(Flowable flowable0, BiFunction biFunction0) {
        this.a = flowable0;
        this.b = biFunction0;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableReduce(this.a, this.b));
    }

    @Override  // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public Publisher source() {
        return this.a;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        a0 a00 = new a0(maybeObserver0, this.b);
        this.a.subscribe(a00);
    }
}

