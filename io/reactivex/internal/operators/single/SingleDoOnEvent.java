package io.reactivex.internal.operators.single;

import gd.c;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiConsumer;

public final class SingleDoOnEvent extends Single {
    public final SingleSource a;
    public final BiConsumer b;

    public SingleDoOnEvent(SingleSource singleSource0, BiConsumer biConsumer0) {
        this.a = singleSource0;
        this.b = biConsumer0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        c c0 = new c(2, singleObserver0, this);
        this.a.subscribe(c0);
    }
}

