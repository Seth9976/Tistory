package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleOperator;
import io.reactivex.SingleSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;

public final class SingleLift extends Single {
    public final SingleSource a;
    public final SingleOperator b;

    public SingleLift(SingleSource singleSource0, SingleOperator singleOperator0) {
        this.a = singleSource0;
        this.b = singleOperator0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        SingleObserver singleObserver1;
        try {
            singleObserver1 = (SingleObserver)ObjectHelper.requireNonNull(this.b.apply(singleObserver0), "The onLift returned a null SingleObserver");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, singleObserver0);
            return;
        }
        this.a.subscribe(singleObserver1);
    }
}

