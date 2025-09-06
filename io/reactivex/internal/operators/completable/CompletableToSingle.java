package io.reactivex.internal.operators.completable;

import dd.b;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import java.util.concurrent.Callable;

public final class CompletableToSingle extends Single {
    public final CompletableSource a;
    public final Callable b;
    public final Object c;

    public CompletableToSingle(CompletableSource completableSource0, Callable callable0, Object object0) {
        this.a = completableSource0;
        this.c = object0;
        this.b = callable0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        b b0 = new b(this, singleObserver0);
        this.a.subscribe(b0);
    }
}

