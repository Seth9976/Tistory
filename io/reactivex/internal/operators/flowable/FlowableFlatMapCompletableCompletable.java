package io.reactivex.internal.operators.flowable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.plugins.RxJavaPlugins;

public final class FlowableFlatMapCompletableCompletable extends Completable implements FuseToFlowable {
    public final Flowable a;
    public final Function b;
    public final int c;
    public final boolean d;

    public FlowableFlatMapCompletableCompletable(Flowable flowable0, Function function0, boolean z, int v) {
        this.a = flowable0;
        this.b = function0;
        this.d = z;
        this.c = v;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableFlatMapCompletable(this.a, this.b, this.d, this.c));
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        w1 w10 = new w1(completableObserver0, this.b, this.d, this.c);
        this.a.subscribe(w10);
    }
}

