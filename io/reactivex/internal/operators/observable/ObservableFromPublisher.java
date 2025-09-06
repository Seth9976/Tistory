package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import org.reactivestreams.Publisher;

public final class ObservableFromPublisher extends Observable {
    public final Publisher a;

    public ObservableFromPublisher(Publisher publisher0) {
        this.a = publisher0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        k1 k10 = new k1(observer0);
        this.a.subscribe(k10);
    }
}

