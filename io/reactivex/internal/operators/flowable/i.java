package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class i implements Subscription {
    public final Subscriber a;
    public final j[] b;
    public final AtomicInteger c;

    public i(Subscriber subscriber0, int v) {
        this.c = new AtomicInteger();
        this.a = subscriber0;
        this.b = new j[v];
    }

    public final boolean a(int v) {
        if(this.c.get() == 0 && this.c.compareAndSet(0, v)) {
            j[] arr_j = this.b;
            for(int v1 = 0; v1 < arr_j.length; ++v1) {
                if(v1 + 1 != v) {
                    j j0 = arr_j[v1];
                    j0.getClass();
                    SubscriptionHelper.cancel(j0);
                }
            }
            return true;
        }
        return false;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        AtomicInteger atomicInteger0 = this.c;
        if(atomicInteger0.get() != -1) {
            atomicInteger0.lazySet(-1);
            j[] arr_j = this.b;
            for(int v = 0; v < arr_j.length; ++v) {
                j j0 = arr_j[v];
                j0.getClass();
                SubscriptionHelper.cancel(j0);
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            int v1 = this.c.get();
            j[] arr_j = this.b;
            if(v1 > 0) {
                arr_j[v1 - 1].request(v);
                return;
            }
            if(v1 == 0) {
                for(int v2 = 0; v2 < arr_j.length; ++v2) {
                    arr_j[v2].request(v);
                }
            }
        }
    }
}

