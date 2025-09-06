package io.reactivex.internal.operators.completable;

import dd.h;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Iterator;

public final class CompletableConcatIterable extends Completable {
    public final Iterable a;

    public CompletableConcatIterable(Iterable iterable0) {
        this.a = iterable0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        Iterator iterator0;
        try {
            iterator0 = (Iterator)ObjectHelper.requireNonNull(this.a.iterator(), "The iterator returned is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, completableObserver0);
            return;
        }
        h h0 = new h(completableObserver0, iterator0);
        completableObserver0.onSubscribe(((SequentialDisposable)h0.d));
        h0.a();
    }
}

