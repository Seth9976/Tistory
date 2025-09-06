package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableElementAtSingle extends Single implements FuseToObservable {
    public final ObservableSource a;
    public final long b;
    public final Object c;

    public ObservableElementAtSingle(ObservableSource observableSource0, long v, Object object0) {
        this.a = observableSource0;
        this.b = v;
        this.c = object0;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToObservable
    public Observable fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableElementAt(this.a, this.b, this.c, true));
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        b1 b10 = new b1(singleObserver0, this.b, this.c);
        this.a.subscribe(b10);
    }
}

