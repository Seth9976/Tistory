package io.reactivex.internal.operators.completable;

import dd.o;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import org.reactivestreams.Publisher;

public final class CompletableFromPublisher extends Completable {
    public final Publisher a;

    public CompletableFromPublisher(Publisher publisher0) {
        this.a = publisher0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        o o0 = new o(completableObserver0, 0);
        this.a.subscribe(o0);
    }
}

