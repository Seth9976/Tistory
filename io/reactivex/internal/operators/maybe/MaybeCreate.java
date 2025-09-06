package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeOnSubscribe;
import io.reactivex.exceptions.Exceptions;

public final class MaybeCreate extends Maybe {
    public final MaybeOnSubscribe a;

    public MaybeCreate(MaybeOnSubscribe maybeOnSubscribe0) {
        this.a = maybeOnSubscribe0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        i i0 = new i(maybeObserver0);
        maybeObserver0.onSubscribe(i0);
        try {
            this.a.subscribe(i0);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            i0.onError(throwable0);
        }
    }
}

