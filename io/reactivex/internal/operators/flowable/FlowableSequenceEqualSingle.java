package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Publisher;

public final class FlowableSequenceEqualSingle extends Single implements FuseToFlowable {
    public final Publisher a;
    public final Publisher b;
    public final BiPredicate c;
    public final int d;

    public FlowableSequenceEqualSingle(Publisher publisher0, Publisher publisher1, BiPredicate biPredicate0, int v) {
        this.a = publisher0;
        this.b = publisher1;
        this.c = biPredicate0;
        this.d = v;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableSequenceEqual(this.a, this.b, this.c, this.d));
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        c5 c50 = new c5(singleObserver0, this.d, this.c);
        singleObserver0.onSubscribe(c50);
        this.a.subscribe(c50.c);
        this.b.subscribe(c50.d);
    }
}

