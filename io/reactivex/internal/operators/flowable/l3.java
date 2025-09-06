package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import org.reactivestreams.Subscriber;

public final class l3 extends SinglePostCompleteSubscriber {
    public final Function a;

    public l3(Subscriber subscriber0, Function function0) {
        super(subscriber0);
        this.a = function0;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.downstream.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        Object object0;
        try {
            object0 = ObjectHelper.requireNonNull(this.a.apply(throwable0), "The valueSupplier returned a null value");
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            CompositeException compositeException0 = new CompositeException(new Throwable[]{throwable0, throwable1});
            this.downstream.onError(compositeException0);
            return;
        }
        this.complete(object0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        ++this.produced;
        this.downstream.onNext(object0);
    }
}

