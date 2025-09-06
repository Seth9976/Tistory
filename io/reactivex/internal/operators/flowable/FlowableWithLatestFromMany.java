package io.reactivex.internal.operators.flowable;

import cd.b;
import io.reactivex.Flowable;
import io.reactivex.annotations.NonNull;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableWithLatestFromMany extends a {
    public final Publisher[] b;
    public final Iterable c;
    public final Function d;

    public FlowableWithLatestFromMany(@NonNull Flowable flowable0, @NonNull Iterable iterable0, @NonNull Function function0) {
        super(flowable0);
        this.b = null;
        this.c = iterable0;
        this.d = function0;
    }

    public FlowableWithLatestFromMany(@NonNull Flowable flowable0, @NonNull Publisher[] arr_publisher, Function function0) {
        super(flowable0);
        this.b = arr_publisher;
        this.c = null;
        this.d = function0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        int v1;
        Publisher[] arr_publisher = this.b;
        if(arr_publisher == null) {
            try {
                arr_publisher = new Publisher[8];
                v1 = 0;
                Iterator iterator0 = this.c.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_18;
                    }
                    Object object0 = iterator0.next();
                    if(v1 == arr_publisher.length) {
                        arr_publisher = (Publisher[])Arrays.copyOf(arr_publisher, (v1 >> 1) + v1);
                    }
                    arr_publisher[v1] = (Publisher)object0;
                    ++v1;
                }
            }
            catch(Throwable throwable0) {
            }
            Exceptions.throwIfFatal(throwable0);
            EmptySubscription.error(throwable0, subscriber0);
            return;
        }
        else {
            v1 = arr_publisher.length;
        }
    label_18:
        if(v1 == 0) {
            b b0 = new b(this, 13);
            new FlowableMap(this.source, b0).subscribeActual(subscriber0);
            return;
        }
        v6 v60 = new v6(subscriber0, this.d, v1);
        subscriber0.onSubscribe(v60);
        AtomicReference atomicReference0 = v60.e;
        for(int v = 0; v < v1 && atomicReference0.get() != SubscriptionHelper.CANCELLED; ++v) {
            arr_publisher[v].subscribe(v60.c[v]);
        }
        this.source.subscribe(v60);
    }
}

