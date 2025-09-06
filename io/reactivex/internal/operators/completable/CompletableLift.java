package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableOperator;
import io.reactivex.CompletableSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

public final class CompletableLift extends Completable {
    public final CompletableSource a;
    public final CompletableOperator b;

    public CompletableLift(CompletableSource completableSource0, CompletableOperator completableOperator0) {
        this.a = completableSource0;
        this.b = completableOperator0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        try {
            CompletableObserver completableObserver1 = this.b.apply(completableObserver0);
            this.a.subscribe(completableObserver1);
        }
        catch(NullPointerException nullPointerException0) {
            throw nullPointerException0;
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            RxJavaPlugins.onError(throwable0);
        }
    }
}

