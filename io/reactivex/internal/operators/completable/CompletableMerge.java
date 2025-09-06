package io.reactivex.internal.operators.completable;

import dd.r;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import org.reactivestreams.Publisher;

public final class CompletableMerge extends Completable {
    public final Publisher a;
    public final int b;
    public final boolean c;

    public CompletableMerge(Publisher publisher0, int v, boolean z) {
        this.a = publisher0;
        this.b = v;
        this.c = z;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        r r0 = new r(completableObserver0, this.b, this.c);
        this.a.subscribe(r0);
    }
}

