package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;

public final class MaybeCount extends Single implements HasUpstreamMaybeSource {
    public final MaybeSource a;

    public MaybeCount(MaybeSource maybeSource0) {
        this.a = maybeSource0;
    }

    @Override  // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource source() {
        return this.a;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        h h0 = new h(singleObserver0, 0);
        this.a.subscribe(h0);
    }
}

