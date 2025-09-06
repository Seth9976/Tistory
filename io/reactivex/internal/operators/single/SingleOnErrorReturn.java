package io.reactivex.internal.operators.single;

import gd.c;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

public final class SingleOnErrorReturn extends Single {
    public final SingleSource a;
    public final Function b;
    public final Object c;

    public SingleOnErrorReturn(SingleSource singleSource0, Function function0, Object object0) {
        this.a = singleSource0;
        this.b = function0;
        this.c = object0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        c c0 = new c(7, singleObserver0, this);
        this.a.subscribe(c0);
    }
}

