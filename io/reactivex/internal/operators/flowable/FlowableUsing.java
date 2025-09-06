package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableUsing extends Flowable {
    public final Callable b;
    public final Function c;
    public final Consumer d;
    public final boolean e;

    public FlowableUsing(Callable callable0, Function function0, Consumer consumer0, boolean z) {
        this.b = callable0;
        this.c = function0;
        this.d = consumer0;
        this.e = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Publisher publisher0;
        Object object0;
        Consumer consumer0;
        try {
            consumer0 = this.d;
            object0 = this.b.call();
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptySubscription.error(throwable0, subscriber0);
            return;
        }
        try {
            publisher0 = (Publisher)ObjectHelper.requireNonNull(this.c.apply(object0), "The sourceSupplier returned a null Publisher");
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            try {
                consumer0.accept(object0);
            }
            catch(Throwable throwable2) {
                Exceptions.throwIfFatal(throwable2);
                EmptySubscription.error(new CompositeException(new Throwable[]{throwable1, throwable2}), subscriber0);
                return;
            }
            EmptySubscription.error(throwable1, subscriber0);
            return;
        }
        publisher0.subscribe(new g6(subscriber0, object0, consumer0, this.e));
    }
}

