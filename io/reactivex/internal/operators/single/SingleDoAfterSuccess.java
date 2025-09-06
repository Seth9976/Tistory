package io.reactivex.internal.operators.single;

import gd.i;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;

public final class SingleDoAfterSuccess extends Single {
    public final SingleSource a;
    public final Consumer b;

    public SingleDoAfterSuccess(SingleSource singleSource0, Consumer consumer0) {
        this.a = singleSource0;
        this.b = consumer0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        i i0 = new i(1, singleObserver0, this.b);
        this.a.subscribe(i0);
    }
}

