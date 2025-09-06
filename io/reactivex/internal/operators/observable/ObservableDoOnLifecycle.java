package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.observers.DisposableLambdaObserver;

public final class ObservableDoOnLifecycle extends a {
    public final Consumer a;
    public final Action b;

    public ObservableDoOnLifecycle(Observable observable0, Consumer consumer0, Action action0) {
        super(observable0);
        this.a = consumer0;
        this.b = action0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        DisposableLambdaObserver disposableLambdaObserver0 = new DisposableLambdaObserver(observer0, this.a, this.b);
        this.source.subscribe(disposableLambdaObserver0);
    }
}

