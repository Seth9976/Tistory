package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableAmb extends Flowable {
    public final Publisher[] b;
    public final Iterable c;

    public FlowableAmb(Publisher[] arr_publisher, Iterable iterable0) {
        this.b = arr_publisher;
        this.c = iterable0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Subscriber subscriber1;
        int v1;
        Publisher[] arr_publisher = this.b;
        if(arr_publisher == null) {
            try {
                arr_publisher = new Publisher[8];
                v1 = 0;
                Iterator iterator0 = this.c.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_23;
                    }
                    Object object0 = iterator0.next();
                    if(((Publisher)object0) == null) {
                        EmptySubscription.error(new NullPointerException("One of the sources is null"), subscriber0);
                        return;
                    }
                    if(v1 == arr_publisher.length) {
                        Publisher[] arr_publisher1 = new Publisher[(v1 >> 2) + v1];
                        System.arraycopy(arr_publisher, 0, arr_publisher1, 0, v1);
                        arr_publisher = arr_publisher1;
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
    label_23:
        if(v1 == 0) {
            EmptySubscription.complete(subscriber0);
            return;
        }
        if(v1 == 1) {
            arr_publisher[0].subscribe(subscriber0);
            return;
        }
        i i0 = new i(subscriber0, v1);
        j[] arr_j = i0.b;
        for(int v2 = 0; true; ++v2) {
            subscriber1 = i0.a;
            if(v2 >= arr_j.length) {
                break;
            }
            arr_j[v2] = new j(i0, v2 + 1, subscriber1);
        }
        AtomicInteger atomicInteger0 = i0.c;
        atomicInteger0.lazySet(0);
        subscriber1.onSubscribe(i0);
        for(int v = 0; v < arr_j.length && atomicInteger0.get() == 0; ++v) {
            arr_publisher[v].subscribe(arr_j[v]);
        }
    }
}

