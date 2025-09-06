package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class MaybeFromFuture extends Maybe {
    public final Future a;
    public final long b;
    public final TimeUnit c;

    public MaybeFromFuture(Future future0, long v, TimeUnit timeUnit0) {
        this.a = future0;
        this.b = v;
        this.c = timeUnit0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        Object object0;
        Disposable disposable0 = Disposables.empty();
        maybeObserver0.onSubscribe(disposable0);
        if(!disposable0.isDisposed()) {
            try {
                long v = this.b;
                Future future0 = this.a;
                if(Long.compare(v, 0L) <= 0) {
                    object0 = future0.get();
                    goto label_17;
                }
                else {
                    object0 = future0.get(v, this.c);
                    goto label_17;
                label_11:
                    if(throwable0 instanceof ExecutionException) {
                        goto label_12;
                    }
                    goto label_13;
                }
                return;
            }
            catch(Throwable throwable0) {
                goto label_11;
            }
        label_12:
            throwable0 = throwable0.getCause();
        label_13:
            Exceptions.throwIfFatal(throwable0);
            if(!disposable0.isDisposed()) {
                maybeObserver0.onError(throwable0);
                return;
            label_17:
                if(!disposable0.isDisposed()) {
                    if(object0 == null) {
                        maybeObserver0.onComplete();
                        return;
                    }
                    maybeObserver0.onSuccess(object0);
                }
            }
        }
    }
}

