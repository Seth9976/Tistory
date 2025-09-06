package io.reactivex.internal.operators.completable;

import dd.i;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableOnSubscribe;
import io.reactivex.exceptions.Exceptions;

public final class CompletableCreate extends Completable {
    public final CompletableOnSubscribe a;

    public CompletableCreate(CompletableOnSubscribe completableOnSubscribe0) {
        this.a = completableOnSubscribe0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        i i0 = new i(completableObserver0);
        completableObserver0.onSubscribe(i0);
        try {
            this.a.subscribe(i0);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            i0.onError(throwable0);
        }
    }
}

