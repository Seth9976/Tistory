package io.reactivex.internal.operators.single;

import gd.c;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;

public final class SingleDoOnError extends Single {
    public final SingleSource a;
    public final Consumer b;

    public SingleDoOnError(SingleSource singleSource0, Consumer consumer0) {
        this.a = singleSource0;
        this.b = consumer0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        c c0 = new c(1, singleObserver0, this);
        this.a.subscribe(c0);
    }
}

