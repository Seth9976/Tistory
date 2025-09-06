package io.reactivex.internal.operators.flowable;

import cd.b;
import io.reactivex.Flowable;
import io.reactivex.annotations.NonNull;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.Iterator;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableCombineLatest extends Flowable {
    public final Publisher[] b;
    public final Iterable c;
    public final Function d;
    public final int e;
    public final boolean f;

    public FlowableCombineLatest(@NonNull Iterable iterable0, @NonNull Function function0, int v, boolean z) {
        this.b = null;
        this.c = iterable0;
        this.d = function0;
        this.e = v;
        this.f = z;
    }

    public FlowableCombineLatest(@NonNull Publisher[] arr_publisher, @NonNull Function function0, int v, boolean z) {
        this.b = arr_publisher;
        this.c = null;
        this.d = function0;
        this.e = v;
        this.f = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Publisher publisher0;
        int v1;
        Iterator iterator0;
        Publisher[] arr_publisher = this.b;
        if(arr_publisher == null) {
            try {
                arr_publisher = new Publisher[8];
                iterator0 = (Iterator)ObjectHelper.requireNonNull(this.c.iterator(), "The iterator returned is null");
                v1 = 0;
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                EmptySubscription.error(throwable0, subscriber0);
                return;
            }
            while(true) {
                try {
                    if(!iterator0.hasNext()) {
                        break;
                    }
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    EmptySubscription.error(throwable1, subscriber0);
                    return;
                }
                try {
                    Object object0 = iterator0.next();
                    publisher0 = (Publisher)ObjectHelper.requireNonNull(object0, "The publisher returned by the iterator is null");
                }
                catch(Throwable throwable2) {
                    Exceptions.throwIfFatal(throwable2);
                    EmptySubscription.error(throwable2, subscriber0);
                    return;
                }
                if(v1 == arr_publisher.length) {
                    Publisher[] arr_publisher1 = new Publisher[(v1 >> 2) + v1];
                    System.arraycopy(arr_publisher, 0, arr_publisher1, 0, v1);
                    arr_publisher = arr_publisher1;
                }
                arr_publisher[v1] = publisher0;
                ++v1;
            }
        }
        else {
            v1 = arr_publisher.length;
        }
        if(v1 == 0) {
            EmptySubscription.complete(subscriber0);
            return;
        }
        if(v1 == 1) {
            arr_publisher[0].subscribe(new j1(subscriber0, new b(this, 12), 1));
            return;
        }
        b0 b00 = new b0(subscriber0, this.d, this.f, v1, this.e);
        subscriber0.onSubscribe(b00);
        c0[] arr_c0 = b00.c;
        for(int v = 0; v < v1 && !b00.l && !b00.j; ++v) {
            arr_publisher[v].subscribe(arr_c0[v]);
        }
    }
}

