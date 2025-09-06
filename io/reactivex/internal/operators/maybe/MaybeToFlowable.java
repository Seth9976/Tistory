package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeSource;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import org.reactivestreams.Subscriber;

public final class MaybeToFlowable extends Flowable implements HasUpstreamMaybeSource {
    public final MaybeSource b;

    public MaybeToFlowable(MaybeSource maybeSource0) {
        this.b = maybeSource0;
    }

    @Override  // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource source() {
        return this.b;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        h0 h00 = new h0(subscriber0);  // 初始化器: Lio/reactivex/internal/subscriptions/DeferredScalarSubscription;-><init>(Lorg/reactivestreams/Subscriber;)V
        this.b.subscribe(h00);
    }
}

