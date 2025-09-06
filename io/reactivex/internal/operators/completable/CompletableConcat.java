package io.reactivex.internal.operators.completable;

import dd.f;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import org.reactivestreams.Publisher;

public final class CompletableConcat extends Completable {
    public final Publisher a;
    public final int b;

    public CompletableConcat(Publisher publisher0, int v) {
        this.a = publisher0;
        this.b = v;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        f f0 = new f(completableObserver0, this.b);
        this.a.subscribe(f0);
    }
}

