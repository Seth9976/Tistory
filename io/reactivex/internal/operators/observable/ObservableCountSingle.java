package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableCountSingle extends Single implements FuseToObservable {
    public final ObservableSource a;

    public ObservableCountSingle(ObservableSource observableSource0) {
        this.a = observableSource0;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToObservable
    public Observable fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableCount(this.a));
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        i0 i00 = new i0(singleObserver0, 2);
        this.a.subscribe(i00);
    }
}

