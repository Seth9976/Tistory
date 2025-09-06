package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;

public final class MaybeToSingle extends Single implements HasUpstreamMaybeSource {
    public final MaybeSource a;
    public final Object b;

    public MaybeToSingle(MaybeSource maybeSource0, Object object0) {
        this.a = maybeSource0;
        this.b = object0;
    }

    @Override  // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource source() {
        return this.a;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        g g0 = new g(1, singleObserver0, this.b);
        this.a.subscribe(g0);
    }
}

