package io.reactivex.internal.operators.single;

import dd.c;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;

public final class SingleDelayWithCompletable extends Single {
    public final SingleSource a;
    public final CompletableSource b;

    public SingleDelayWithCompletable(SingleSource singleSource0, CompletableSource completableSource0) {
        this.a = singleSource0;
        this.b = completableSource0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        c c0 = new c(1, singleObserver0, this.a);
        this.b.subscribe(c0);
    }
}

