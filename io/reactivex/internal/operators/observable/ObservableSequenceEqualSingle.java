package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableSequenceEqualSingle extends Single implements FuseToObservable {
    public final ObservableSource a;
    public final ObservableSource b;
    public final BiPredicate c;
    public final int d;

    public ObservableSequenceEqualSingle(ObservableSource observableSource0, ObservableSource observableSource1, BiPredicate biPredicate0, int v) {
        this.a = observableSource0;
        this.b = observableSource1;
        this.c = biPredicate0;
        this.d = v;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToObservable
    public Observable fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableSequenceEqual(this.a, this.b, this.c, this.d));
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        n3 n30 = new n3(singleObserver0, this.d, this.a, this.b, this.c);
        singleObserver0.onSubscribe(n30);
        n30.d.subscribe(((o3[])n30.j)[0]);
        n30.e.subscribe(((o3[])n30.j)[1]);
    }
}

