package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class x extends AtomicInteger implements Subscription {
    public final Subscriber a;
    public final FlowableCache b;
    public final AtomicLong c;
    public y d;
    public int e;
    public long f;

    public x(Subscriber subscriber0, FlowableCache flowableCache0) {
        this.a = subscriber0;
        this.b = flowableCache0;
        this.d = flowableCache0.f;
        this.c = new AtomicLong();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        x[] arr_x1;
        if(this.c.getAndSet(0x8000000000000000L) != 0x8000000000000000L) {
            while(true) {
                AtomicReference atomicReference0 = this.b.d;
                x[] arr_x = (x[])atomicReference0.get();
                int v = arr_x.length;
                if(v == 0) {
                    break;
                }
                int v1 = 0;
                while(true) {
                    if(v1 < v) {
                        if(arr_x[v1] == this) {
                            break;
                        }
                        else {
                            ++v1;
                            continue;
                        }
                    }
                    v1 = -1;
                    break;
                }
                if(v1 >= 0) {
                    if(v == 1) {
                        arr_x1 = FlowableCache.k;
                    }
                    else {
                        x[] arr_x2 = new x[v - 1];
                        System.arraycopy(arr_x, 0, arr_x2, 0, v1);
                        System.arraycopy(arr_x, v1 + 1, arr_x2, v1, v - v1 - 1);
                        arr_x1 = arr_x2;
                    }
                label_20:
                    if(!atomicReference0.compareAndSet(arr_x, arr_x1)) {
                        if(atomicReference0.get() != arr_x) {
                            continue;
                        }
                        if(false) {
                            break;
                        }
                        goto label_20;
                    }
                }
                break;
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.addCancel(this.c, v);
            this.b.e(this);
        }
    }
}

