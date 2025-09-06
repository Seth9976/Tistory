package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

public final class ObservableCollect extends a {
    public final Callable a;
    public final BiConsumer b;

    public ObservableCollect(ObservableSource observableSource0, Callable callable0, BiConsumer biConsumer0) {
        super(observableSource0);
        this.a = callable0;
        this.b = biConsumer0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Object object0;
        try {
            object0 = ObjectHelper.requireNonNull(this.a.call(), "The initialSupplier returned a null value");
        }
        catch(Throwable throwable0) {
            EmptyDisposable.error(throwable0, observer0);
            return;
        }
        y y0 = new y(observer0, object0, this.b, 0);
        this.source.subscribe(y0);
    }
}

