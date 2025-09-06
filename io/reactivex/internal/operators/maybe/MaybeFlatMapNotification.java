package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;

public final class MaybeFlatMapNotification extends a {
    public final Function a;
    public final Function b;
    public final Callable c;

    public MaybeFlatMapNotification(MaybeSource maybeSource0, Function function0, Function function1, Callable callable0) {
        super(maybeSource0);
        this.a = function0;
        this.b = function1;
        this.c = callable0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        x x0 = new x(maybeObserver0, this.a, this.b, this.c);
        this.source.subscribe(x0);
    }
}

