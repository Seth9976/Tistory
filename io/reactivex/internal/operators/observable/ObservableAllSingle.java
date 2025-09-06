package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableAllSingle extends Single implements FuseToObservable {
    public final ObservableSource a;
    public final Predicate b;

    public ObservableAllSingle(ObservableSource observableSource0, Predicate predicate0) {
        this.a = observableSource0;
        this.b = predicate0;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToObservable
    public Observable fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableAll(this.a, this.b));
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        h h0 = new h(singleObserver0, this.b, 0);
        this.a.subscribe(h0);
    }
}

