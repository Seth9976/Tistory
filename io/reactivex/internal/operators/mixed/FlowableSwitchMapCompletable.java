package io.reactivex.internal.operators.mixed;

import ed.h;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;

public final class FlowableSwitchMapCompletable extends Completable {
    public final Flowable a;
    public final Function b;
    public final boolean c;

    public FlowableSwitchMapCompletable(Flowable flowable0, Function function0, boolean z) {
        this.a = flowable0;
        this.b = function0;
        this.c = z;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        h h0 = new h(completableObserver0, this.b, this.c);
        this.a.subscribe(h0);
    }
}

