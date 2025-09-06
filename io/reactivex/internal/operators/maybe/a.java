package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;

public abstract class a extends Maybe implements HasUpstreamMaybeSource {
    protected final MaybeSource source;

    public a(MaybeSource maybeSource0) {
        this.source = maybeSource0;
    }

    @Override  // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public final MaybeSource source() {
        return this.source;
    }
}

