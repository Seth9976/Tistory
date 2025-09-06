package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

public final class y2 extends SinglePostCompleteSubscriber {
    public final Function a;
    public final Function b;
    public final Callable c;

    public y2(Subscriber subscriber0, Function function0, Function function1, Callable callable0) {
        super(subscriber0);
        this.a = function0;
        this.b = function1;
        this.c = callable0;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        Object object0;
        try {
            object0 = ObjectHelper.requireNonNull(this.c.call(), "The onComplete publisher returned is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.downstream.onError(throwable0);
            return;
        }
        this.complete(object0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        Object object0;
        try {
            object0 = ObjectHelper.requireNonNull(this.b.apply(throwable0), "The onError publisher returned is null");
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
        Object object1;
        try {
            object1 = ObjectHelper.requireNonNull(this.a.apply(object0), "The onNext publisher returned is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.downstream.onError(throwable0);
            return;
        }
        ++this.produced;
        this.downstream.onNext(object1);
    }
}

