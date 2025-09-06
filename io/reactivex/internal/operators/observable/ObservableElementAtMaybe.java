package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableElementAtMaybe extends Maybe implements FuseToObservable {
    public final ObservableSource a;
    public final long b;

    public ObservableElementAtMaybe(ObservableSource observableSource0, long v) {
        this.a = observableSource0;
        this.b = v;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToObservable
    public Observable fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableElementAt(this.a, this.b, null, false));
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        a1 a10 = new a1(maybeObserver0, this.b);
        this.a.subscribe(a10);
    }
}

