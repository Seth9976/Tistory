package io.reactivex.internal.operators.mixed;

import ed.c;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;

public final class FlowableConcatMapCompletable extends Completable {
    public final Flowable a;
    public final Function b;
    public final ErrorMode c;
    public final int d;

    public FlowableConcatMapCompletable(Flowable flowable0, Function function0, ErrorMode errorMode0, int v) {
        this.a = flowable0;
        this.b = function0;
        this.c = errorMode0;
        this.d = v;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        c c0 = new c(completableObserver0, this.b, this.c, this.d);
        this.a.subscribe(c0);
    }
}

