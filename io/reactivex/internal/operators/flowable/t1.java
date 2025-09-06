package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class t1 extends AtomicReference implements FlowableSubscriber, Disposable {
    public final long a;
    public final u1 b;
    public final int c;
    public final int d;
    public volatile boolean e;
    public volatile SimpleQueue f;
    public long g;
    public int h;

    public t1(u1 u10, long v) {
        this.a = v;
        this.b = u10;
        this.d = u10.e;
        this.c = u10.e >> 2;
    }

    public final void a(long v) {
        if(this.h != 1) {
            long v1 = this.g + v;
            if(v1 >= ((long)this.c)) {
                this.g = 0L;
                ((Subscription)this.get()).request(v1);
                return;
            }
            this.g = v1;
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() == SubscriptionHelper.CANCELLED;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.e = true;
        this.b.b();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.lazySet(SubscriptionHelper.CANCELLED);
        u1 u10 = this.b;
        if(u10.h.addThrowable(throwable0)) {
            this.e = true;
            if(!u10.c) {
                u10.l.cancel();
                t1[] arr_t1 = (t1[])u10.j.getAndSet(u1.s);
                for(int v = 0; v < arr_t1.length; ++v) {
                    t1 t10 = arr_t1[v];
                    t10.getClass();
                    SubscriptionHelper.cancel(t10);
                }
            }
            u10.b();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.h == 2) {
            this.b.b();
        }
        else {
            u1 u10 = this.b;
            if(u10.get() == 0 && u10.compareAndSet(0, 1)) {
                long v = u10.k.get();
                SimpleQueue simpleQueue0 = this.f;
                if(v == 0L || simpleQueue0 != null && !simpleQueue0.isEmpty()) {
                    if(simpleQueue0 == null) {
                        simpleQueue0 = this.f;
                        if(simpleQueue0 == null) {
                            simpleQueue0 = new SpscArrayQueue(u10.e);
                            this.f = simpleQueue0;
                        }
                    }
                    if(!simpleQueue0.offer(object0)) {
                        u10.onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                }
                else {
                    u10.a.onNext(object0);
                    if(v != 0x7FFFFFFFFFFFFFFFL) {
                        u10.k.decrementAndGet();
                    }
                    this.a(1L);
                }
                if(u10.decrementAndGet() != 0) {
                    u10.c();
                    return;
                }
                return;
            }
            SimpleQueue simpleQueue1 = this.f;
            if(simpleQueue1 == null) {
                simpleQueue1 = new SpscArrayQueue(u10.e);
                this.f = simpleQueue1;
            }
            if(!simpleQueue1.offer(object0)) {
                u10.onError(new MissingBackpressureException("Inner queue full?!"));
                return;
            }
            if(u10.getAndIncrement() == 0) {
                u10.c();
            }
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.setOnce(this, subscription0)) {
            if(subscription0 instanceof QueueSubscription) {
                int v = ((QueueSubscription)subscription0).requestFusion(7);
                if(v == 1) {
                    this.h = 1;
                    this.f = (QueueSubscription)subscription0;
                    this.e = true;
                    this.b.b();
                    return;
                }
                if(v == 2) {
                    this.h = 2;
                    this.f = (QueueSubscription)subscription0;
                }
            }
            subscription0.request(((long)this.d));
        }
    }
}

