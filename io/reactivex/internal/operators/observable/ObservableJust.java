package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.fuseable.ScalarCallable;

public final class ObservableJust extends Observable implements ScalarCallable {
    public final Object a;

    public ObservableJust(Object object0) {
        this.a = object0;
    }

    @Override  // io.reactivex.internal.fuseable.ScalarCallable
    public Object call() {
        return this.a;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        ScalarDisposable observableScalarXMap$ScalarDisposable0 = new ScalarDisposable(observer0, this.a);
        observer0.onSubscribe(observableScalarXMap$ScalarDisposable0);
        observableScalarXMap$ScalarDisposable0.run();
    }
}

