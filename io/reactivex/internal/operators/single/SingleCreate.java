package io.reactivex.internal.operators.single;

import gd.d;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.exceptions.Exceptions;

public final class SingleCreate extends Single {
    public final SingleOnSubscribe a;

    public SingleCreate(SingleOnSubscribe singleOnSubscribe0) {
        this.a = singleOnSubscribe0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        d d0 = new d(singleObserver0);
        singleObserver0.onSubscribe(d0);
        try {
            this.a.subscribe(d0);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            d0.onError(throwable0);
        }
    }
}

