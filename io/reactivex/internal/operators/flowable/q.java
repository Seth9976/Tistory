package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.concurrent.atomic.AtomicReference;

public final class q extends DisposableSubscriber {
    public final int b;
    public boolean c;
    public final Object d;

    public q(Object object0, int v) {
        this.b = v;
        super();
        this.d = object0;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        switch(this.b) {
            case 0: {
                if(!this.c) {
                    this.c = true;
                    ((r)this.d).d0();
                }
                return;
            }
            case 1: {
                if(!this.c) {
                    this.c = true;
                    SubscriptionHelper.cancel(((k6)this.d).d);
                    ((k6)this.d).j = true;
                    ((k6)this.d).a();
                }
                return;
            }
            default: {
                if(!this.c) {
                    this.c = true;
                    ((o6)this.d).j.cancel();
                    ((o6)this.d).k = true;
                    ((o6)this.d).b();
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        switch(this.b) {
            case 0: {
                if(this.c) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.c = true;
                ((r)this.d).onError(throwable0);
                return;
            }
            case 1: {
                if(this.c) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.c = true;
                k6 k60 = (k6)this.d;
                SubscriptionHelper.cancel(k60.d);
                if(k60.g.addThrowable(throwable0)) {
                    k60.j = true;
                    k60.a();
                    return;
                }
                RxJavaPlugins.onError(throwable0);
                return;
            }
            default: {
                if(this.c) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.c = true;
                o6 o60 = (o6)this.d;
                o60.j.cancel();
                if(o60.f.addThrowable(throwable0)) {
                    o60.k = true;
                    o60.b();
                    return;
                }
                RxJavaPlugins.onError(throwable0);
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        switch(this.b) {
            case 0: {
                if(!this.c) {
                    this.c = true;
                    this.cancel();
                    ((r)this.d).d0();
                }
                return;
            }
            case 1: {
                if(!this.c) {
                    ((k6)this.d).f.offer(k6.m);
                    ((k6)this.d).a();
                }
                return;
            }
            default: {
                if(!this.c) {
                    this.c = true;
                    this.dispose();
                    o6 o60 = (o6)this.d;
                    AtomicReference atomicReference0 = o60.c;
                    while(!atomicReference0.compareAndSet(this, null) && atomicReference0.get() == this) {
                    }
                    o60.e.offer(o6.o);
                    o60.b();
                }
            }
        }
    }
}

