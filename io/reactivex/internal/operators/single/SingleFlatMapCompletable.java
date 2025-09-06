package io.reactivex.internal.operators.single;

import gd.o;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

public final class SingleFlatMapCompletable extends Completable {
    public final SingleSource a;
    public final Function b;

    public SingleFlatMapCompletable(SingleSource singleSource0, Function function0) {
        this.a = singleSource0;
        this.b = function0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        o o0 = new o(completableObserver0, this.b);
        completableObserver0.onSubscribe(o0);
        this.a.subscribe(o0);
    }
}

