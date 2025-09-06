package io.reactivex.internal.operators.maybe;

import dd.k;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.internal.fuseable.HasUpstreamCompletableSource;

public final class MaybeFromCompletable extends Maybe implements HasUpstreamCompletableSource {
    public final CompletableSource a;

    public MaybeFromCompletable(CompletableSource completableSource0) {
        this.a = completableSource0;
    }

    @Override  // io.reactivex.internal.fuseable.HasUpstreamCompletableSource
    public CompletableSource source() {
        return this.a;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        k k0 = new k(maybeObserver0, 2);
        this.a.subscribe(k0);
    }
}

