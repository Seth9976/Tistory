package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

public final class MaybePeek extends a {
    public final Consumer a;
    public final Consumer b;
    public final Consumer c;
    public final Action d;
    public final Action e;
    public final Action f;

    public MaybePeek(MaybeSource maybeSource0, Consumer consumer0, Consumer consumer1, Consumer consumer2, Action action0, Action action1, Action action2) {
        super(maybeSource0);
        this.a = consumer0;
        this.b = consumer1;
        this.c = consumer2;
        this.d = action0;
        this.e = action1;
        this.f = action2;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        k k0 = new k(3, maybeObserver0, this);
        this.source.subscribe(k0);
    }
}

