package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;

public final class MaybeOnErrorNext extends a {
    public final Function a;
    public final boolean b;

    public MaybeOnErrorNext(MaybeSource maybeSource0, Function function0, boolean z) {
        super(maybeSource0);
        this.a = function0;
        this.b = z;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        f0 f00 = new f0(maybeObserver0, this.a, this.b);
        this.source.subscribe(f00);
    }
}

