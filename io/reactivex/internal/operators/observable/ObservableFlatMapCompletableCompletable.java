package io.reactivex.internal.operators.observable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableFlatMapCompletableCompletable extends Completable implements FuseToObservable {
    public final ObservableSource a;
    public final Function b;
    public final boolean c;

    public ObservableFlatMapCompletableCompletable(ObservableSource observableSource0, Function function0, boolean z) {
        this.a = observableSource0;
        this.b = function0;
        this.c = z;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToObservable
    public Observable fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableFlatMapCompletable(this.a, this.b, this.c));
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        f1 f10 = new f1(completableObserver0, this.b, this.c);
        this.a.subscribe(f10);
    }
}

