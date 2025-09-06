package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class d0 extends SubscriptionArbiter implements FlowableSubscriber {
    public final Subscriber h;
    public final Publisher[] i;
    public final boolean j;
    public final AtomicInteger k;
    public int l;
    public ArrayList m;
    public long n;

    public d0(Publisher[] arr_publisher, boolean z, Subscriber subscriber0) {
        super(false);
        this.h = subscriber0;
        this.i = arr_publisher;
        this.j = z;
        this.k = new AtomicInteger();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        AtomicInteger atomicInteger0 = this.k;
        if(atomicInteger0.getAndIncrement() == 0) {
            Publisher[] arr_publisher = this.i;
            int v = this.l;
            while(true) {
                Subscriber subscriber0 = this.h;
                if(v == arr_publisher.length) {
                    ArrayList arrayList0 = this.m;
                    if(arrayList0 != null) {
                        if(arrayList0.size() == 1) {
                            subscriber0.onError(((Throwable)arrayList0.get(0)));
                            return;
                        }
                        subscriber0.onError(new CompositeException(arrayList0));
                        return;
                    }
                    subscriber0.onComplete();
                    return;
                }
                Publisher publisher0 = arr_publisher[v];
                if(publisher0 == null) {
                    NullPointerException nullPointerException0 = new NullPointerException("A Publisher entry is null");
                    if(this.j) {
                        ArrayList arrayList1 = this.m;
                        if(arrayList1 == null) {
                            arrayList1 = new ArrayList(arr_publisher.length - v + 1);
                            this.m = arrayList1;
                        }
                        arrayList1.add(nullPointerException0);
                        ++v;
                        continue;
                    }
                    subscriber0.onError(nullPointerException0);
                    return;
                }
                long v1 = this.n;
                if(v1 != 0L) {
                    this.n = 0L;
                    this.produced(v1);
                }
                publisher0.subscribe(this);
                ++v;
                this.l = v;
                if(atomicInteger0.decrementAndGet() == 0) {
                    break;
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.j) {
            ArrayList arrayList0 = this.m;
            if(arrayList0 == null) {
                arrayList0 = new ArrayList(this.i.length - this.l + 1);
                this.m = arrayList0;
            }
            arrayList0.add(throwable0);
            this.onComplete();
            return;
        }
        this.h.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        ++this.n;
        this.h.onNext(object0);
    }
}

