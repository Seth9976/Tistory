package io.reactivex.internal.operators.flowable;

import dd.e;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.HalfSerializer;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class a3 extends AtomicInteger implements FlowableSubscriber, Subscription {
    public final int a;
    public final Subscriber b;
    public volatile boolean c;
    public volatile boolean d;
    public final AtomicLong e;
    public final AtomicReference f;
    public Object g;
    public Serializable h;

    public a3(Subscriber subscriber0, int v) {
        this.a = v;
        if(v != 1) {
            super();
            this.b = subscriber0;
            this.f = new AtomicReference();
            this.g = new e(this, 4);
            this.h = new AtomicThrowable();
            this.e = new AtomicLong();
            return;
        }
        super();
        this.e = new AtomicLong();
        this.f = new AtomicReference();
        this.b = subscriber0;
    }

    public boolean a(boolean z, boolean z1, Subscriber subscriber0, AtomicReference atomicReference0) {
        if(this.d) {
            atomicReference0.lazySet(null);
            return true;
        }
        if(z) {
            Throwable throwable0 = (Throwable)this.h;
            if(throwable0 != null) {
                atomicReference0.lazySet(null);
                subscriber0.onError(throwable0);
                return true;
            }
            if(z1) {
                subscriber0.onComplete();
                return true;
            }
        }
        return false;
    }

    public void b() {
        boolean z;
        if(this.getAndIncrement() != 0) {
            return;
        }
        Subscriber subscriber0 = this.b;
        AtomicLong atomicLong0 = this.e;
        AtomicReference atomicReference0 = this.f;
        int v = 1;
        do {
            long v1;
            for(v1 = 0L; true; ++v1) {
                z = false;
                if(Long.compare(v1, atomicLong0.get()) == 0) {
                    break;
                }
                boolean z1 = this.c;
                Object object0 = atomicReference0.getAndSet(null);
                if(this.a(z1, object0 == null, subscriber0, atomicReference0)) {
                    return;
                }
                if(object0 == null) {
                    break;
                }
                subscriber0.onNext(object0);
            }
            if(v1 == atomicLong0.get()) {
                boolean z2 = this.c;
                if(atomicReference0.get() == null) {
                    z = true;
                }
                if(this.a(z2, z, subscriber0, atomicReference0)) {
                    return;
                }
            }
            if(v1 != 0L) {
                BackpressureHelper.produced(atomicLong0, v1);
            }
            v = this.addAndGet(-v);
        }
        while(v != 0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.a != 0) {
            if(!this.d) {
                this.d = true;
                ((Subscription)this.g).cancel();
                if(this.getAndIncrement() == 0) {
                    this.f.lazySet(null);
                }
            }
            return;
        }
        SubscriptionHelper.cancel(this.f);
        DisposableHelper.dispose(((e)this.g));
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.a != 0) {
            this.c = true;
            this.b();
            return;
        }
        this.c = true;
        if(this.d) {
            HalfSerializer.onComplete(this.b, this, ((AtomicThrowable)this.h));
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            this.h = throwable0;
            this.c = true;
            this.b();
            return;
        }
        DisposableHelper.dispose(((e)this.g));
        HalfSerializer.onError(this.b, throwable0, this, ((AtomicThrowable)this.h));
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.a != 0) {
            this.f.lazySet(object0);
            this.b();
            return;
        }
        HalfSerializer.onNext(this.b, object0, this, ((AtomicThrowable)this.h));
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(this.a != 0) {
            if(SubscriptionHelper.validate(((Subscription)this.g), subscription0)) {
                this.g = subscription0;
                this.b.onSubscribe(this);
                subscription0.request(0x7FFFFFFFFFFFFFFFL);
            }
            return;
        }
        SubscriptionHelper.deferredSetOnce(this.f, this.e, subscription0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(this.a != 0) {
            if(SubscriptionHelper.validate(v)) {
                BackpressureHelper.add(this.e, v);
                this.b();
            }
            return;
        }
        SubscriptionHelper.deferredRequest(this.f, this.e, v);
    }
}

