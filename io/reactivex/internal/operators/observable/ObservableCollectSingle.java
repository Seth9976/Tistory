package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

public final class ObservableCollectSingle extends Single implements FuseToObservable {
    public final ObservableSource a;
    public final Callable b;
    public final BiConsumer c;

    public ObservableCollectSingle(ObservableSource observableSource0, Callable callable0, BiConsumer biConsumer0) {
        this.a = observableSource0;
        this.b = callable0;
        this.c = biConsumer0;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToObservable
    public Observable fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableCollect(this.a, this.b, this.c));
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        Object object0;
        try {
            object0 = ObjectHelper.requireNonNull(this.b.call(), "The initialSupplier returned a null value");
        }
        catch(Throwable throwable0) {
            EmptyDisposable.error(throwable0, singleObserver0);
            return;
        }
        y y0 = new y(singleObserver0, object0, this.c, 1);
        this.a.subscribe(y0);
    }
}

