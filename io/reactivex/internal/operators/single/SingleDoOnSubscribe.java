package io.reactivex.internal.operators.single;

import gd.l;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;

public final class SingleDoOnSubscribe extends Single {
    public final SingleSource a;
    public final Consumer b;

    public SingleDoOnSubscribe(SingleSource singleSource0, Consumer consumer0) {
        this.a = singleSource0;
        this.b = consumer0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        l l0 = new l(singleObserver0, this.b);
        this.a.subscribe(l0);
    }
}

