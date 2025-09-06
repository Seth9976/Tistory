package io.reactivex.internal.operators.observable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableIgnoreElementsCompletable extends Completable implements FuseToObservable {
    public final ObservableSource a;

    public ObservableIgnoreElementsCompletable(ObservableSource observableSource0) {
        this.a = observableSource0;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToObservable
    public Observable fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableIgnoreElements(this.a));
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        t0 t00 = new t0(completableObserver0, 4);
        this.a.subscribe(t00);
    }
}

