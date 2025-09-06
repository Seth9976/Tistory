package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.subscriptions.EmptySubscription;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableZip extends Flowable {
    public final Publisher[] b;
    public final Iterable c;
    public final Function d;
    public final int e;
    public final boolean f;

    public FlowableZip(Publisher[] arr_publisher, Iterable iterable0, Function function0, int v, boolean z) {
        this.b = arr_publisher;
        this.c = iterable0;
        this.d = function0;
        this.e = v;
        this.f = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        int v1;
        Publisher[] arr_publisher = this.b;
        if(arr_publisher == null) {
            arr_publisher = new Publisher[8];
            v1 = 0;
            for(Object object0: this.c) {
                if(v1 == arr_publisher.length) {
                    Publisher[] arr_publisher1 = new Publisher[(v1 >> 2) + v1];
                    System.arraycopy(arr_publisher, 0, arr_publisher1, 0, v1);
                    arr_publisher = arr_publisher1;
                }
                arr_publisher[v1] = (Publisher)object0;
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
        x6 x60 = new x6(subscriber0, this.d, this.f, v1, this.e);
        subscriber0.onSubscribe(x60);
        y6[] arr_y6 = x60.b;
        for(int v = 0; v < v1 && !x60.g && (x60.f || x60.e.get() == null); ++v) {
            arr_publisher[v].subscribe(arr_y6[v]);
        }
    }
}

