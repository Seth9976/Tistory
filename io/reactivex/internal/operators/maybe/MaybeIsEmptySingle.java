package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.internal.fuseable.FuseToMaybe;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import io.reactivex.plugins.RxJavaPlugins;

public final class MaybeIsEmptySingle extends Single implements FuseToMaybe, HasUpstreamMaybeSource {
    public final MaybeSource a;

    public MaybeIsEmptySingle(MaybeSource maybeSource0) {
        this.a = maybeSource0;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToMaybe
    public Maybe fuseToMaybe() {
        return RxJavaPlugins.onAssembly(new MaybeIsEmpty(this.a));
    }

    @Override  // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource source() {
        return this.a;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        h h0 = new h(singleObserver0, 1);
        this.a.subscribe(h0);
    }
}

