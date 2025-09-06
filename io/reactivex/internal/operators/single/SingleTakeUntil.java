package io.reactivex.internal.operators.single;

import gd.a0;
import gd.h;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import org.reactivestreams.Publisher;

public final class SingleTakeUntil extends Single {
    public final SingleSource a;
    public final Publisher b;

    public SingleTakeUntil(SingleSource singleSource0, Publisher publisher0) {
        this.a = singleSource0;
        this.b = publisher0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        h h0 = new h(singleObserver0);
        singleObserver0.onSubscribe(h0);
        this.b.subscribe(((a0)h0.c));
        this.a.subscribe(h0);
    }
}

