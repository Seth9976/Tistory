package io.reactivex.internal.operators.maybe;

import gd.j;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleSource;
import io.reactivex.internal.fuseable.HasUpstreamSingleSource;

public final class MaybeFromSingle extends Maybe implements HasUpstreamSingleSource {
    public final SingleSource a;

    public MaybeFromSingle(SingleSource singleSource0) {
        this.a = singleSource0;
    }

    @Override  // io.reactivex.internal.fuseable.HasUpstreamSingleSource
    public SingleSource source() {
        return this.a;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        j j0 = new j(maybeObserver0, 2);
        this.a.subscribe(j0);
    }
}

