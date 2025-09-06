package io.reactivex.internal.operators.flowable;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;

public final class FlowableReduceWithSingle extends Single {
    public final Publisher a;
    public final Callable b;
    public final BiFunction c;

    public FlowableReduceWithSingle(Publisher publisher0, Callable callable0, BiFunction biFunction0) {
        this.a = publisher0;
        this.b = callable0;
        this.c = biFunction0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        Object object0;
        try {
            object0 = ObjectHelper.requireNonNull(this.b.call(), "The seedSupplier returned a null value");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, singleObserver0);
            return;
        }
        w2 w20 = new w2(singleObserver0, this.c, object0);
        this.a.subscribe(w20);
    }
}

