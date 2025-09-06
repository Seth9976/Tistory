package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableCache extends a implements FlowableSubscriber {
    public final AtomicBoolean b;
    public final int c;
    public final AtomicReference d;
    public volatile long e;
    public final y f;
    public y g;
    public int h;
    public Throwable i;
    public volatile boolean j;
    public static final x[] k;
    public static final x[] l;

    static {
        FlowableCache.k = new x[0];
        FlowableCache.l = new x[0];
    }

    public FlowableCache(Flowable flowable0, int v) {
        super(flowable0);
        this.c = v;
        this.b = new AtomicBoolean();
        y y0 = new y(v, 0);
        this.f = y0;
        this.g = y0;
        this.d = new AtomicReference(FlowableCache.k);
    }

    public final void e(x x0) {
        if(x0.getAndIncrement() != 0) {
            return;
        }
        long v = x0.f;
        int v1 = x0.e;
        y y0 = x0.d;
        AtomicLong atomicLong0 = x0.c;
        Subscriber subscriber0 = x0.a;
        int v2 = this.c;
        int v3 = 1;
        while(true) {
            boolean z = Long.compare(this.e, v) == 0;
            if(this.j && z) {
                x0.d = null;
                Throwable throwable0 = this.i;
                if(throwable0 != null) {
                    subscriber0.onError(throwable0);
                    return;
                }
                subscriber0.onComplete();
                return;
            }
            if(!z) {
                long v4 = atomicLong0.get();
                if(v4 == 0x8000000000000000L) {
                    x0.d = null;
                    return;
                }
                if(v4 != v) {
                    if(v1 == v2) {
                        y0 = (y)y0.b;
                        v1 = 0;
                    }
                    subscriber0.onNext(y0.a[v1]);
                    ++v1;
                    ++v;
                    continue;
                }
            }
            x0.f = v;
            x0.e = v1;
            x0.d = y0;
            v3 = x0.addAndGet(-v3);
            if(v3 == 0) {
                break;
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public void onComplete() {
        this.j = true;
        x[] arr_x = (x[])this.d.getAndSet(FlowableCache.l);
        for(int v = 0; v < arr_x.length; ++v) {
            this.e(arr_x[v]);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        if(this.j) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.i = throwable0;
        this.j = true;
        x[] arr_x = (x[])this.d.getAndSet(FlowableCache.l);
        for(int v = 0; v < arr_x.length; ++v) {
            this.e(arr_x[v]);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public void onNext(Object object0) {
        int v = this.h;
        if(v == this.c) {
            y y0 = new y(v, 0);
            y0.a[0] = object0;
            this.h = 1;
            this.g.b = y0;
            this.g = y0;
        }
        else {
            this.g.a[v] = object0;
            this.h = v + 1;
        }
        ++this.e;
        x[] arr_x = (x[])this.d.get();
        for(int v1 = 0; v1 < arr_x.length; ++v1) {
            this.e(arr_x[v1]);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription0) {
        subscription0.request(0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        x x0 = new x(subscriber0, this);
        subscriber0.onSubscribe(x0);
        while(true) {
            AtomicReference atomicReference0 = this.d;
            x[] arr_x = (x[])atomicReference0.get();
            if(arr_x == FlowableCache.l) {
                break;
            }
            x[] arr_x1 = new x[arr_x.length + 1];
            System.arraycopy(arr_x, 0, arr_x1, 0, arr_x.length);
            arr_x1[arr_x.length] = x0;
        label_8:
            if(atomicReference0.compareAndSet(arr_x, arr_x1)) {
                break;
            }
            if(atomicReference0.get() != arr_x) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_8;
        }
        if(!this.b.get() && this.b.compareAndSet(false, true)) {
            this.source.subscribe(this);
            return;
        }
        this.e(x0);
    }
}

