package io.reactivex.internal.operators.mixed;

import ed.b;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class CompletableAndThenPublisher extends Flowable {
    public final CompletableSource b;
    public final Publisher c;

    public CompletableAndThenPublisher(CompletableSource completableSource0, Publisher publisher0) {
        this.b = completableSource0;
        this.c = publisher0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        b b0 = new b(this.c, subscriber0);
        this.b.subscribe(b0);
    }
}

