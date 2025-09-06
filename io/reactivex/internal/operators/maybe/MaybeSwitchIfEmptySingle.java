package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;

public final class MaybeSwitchIfEmptySingle extends Single implements HasUpstreamMaybeSource {
    public final MaybeSource a;
    public final SingleSource b;

    public MaybeSwitchIfEmptySingle(MaybeSource maybeSource0, SingleSource singleSource0) {
        this.a = maybeSource0;
        this.b = singleSource0;
    }

    @Override  // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource source() {
        return this.a;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        y y0 = new y(4, singleObserver0, this.b);
        this.a.subscribe(y0);
    }
}

