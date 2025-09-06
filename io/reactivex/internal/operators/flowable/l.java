package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class l extends AtomicLong implements FlowableSubscriber, BooleanSupplier, Subscription {
    public final Subscriber a;
    public final Callable b;
    public final int c;
    public final int d;
    public final ArrayDeque e;
    public final AtomicBoolean f;
    public Subscription g;
    public boolean h;
    public int i;
    public volatile boolean j;
    public long k;

    public l(Subscriber subscriber0, int v, int v1, Callable callable0) {
        this.a = subscriber0;
        this.c = v;
        this.d = v1;
        this.b = callable0;
        this.f = new AtomicBoolean();
        this.e = new ArrayDeque();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.j = true;
        this.g.cancel();
    }

    @Override  // io.reactivex.functions.BooleanSupplier
    public final boolean getAsBoolean() {
        return this.j;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.h) {
            return;
        }
        this.h = true;
        long v = this.k;
        if(v != 0L) {
            BackpressureHelper.produced(this, v);
        }
        QueueDrainHelper.postComplete(this.a, this.e, this, this);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.h) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.h = true;
        this.e.clear();
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Collection collection0;
        if(this.h) {
            return;
        }
        ArrayDeque arrayDeque0 = this.e;
        int v = this.i + 1;
        if(this.i == 0) {
            try {
                collection0 = (Collection)ObjectHelper.requireNonNull(this.b.call(), "The bufferSupplier returned a null buffer");
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                this.cancel();
                this.onError(throwable0);
                return;
            }
            arrayDeque0.offer(collection0);
        }
        Collection collection1 = (Collection)arrayDeque0.peek();
        if(collection1 != null && collection1.size() + 1 == this.c) {
            arrayDeque0.poll();
            collection1.add(object0);
            ++this.k;
            this.a.onNext(collection1);
        }
        for(Object object1: arrayDeque0) {
            ((Collection)object1).add(object0);
        }
        if(v == this.d) {
            v = 0;
        }
        this.i = v;
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.g, subscription0)) {
            this.g = subscription0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(!SubscriptionHelper.validate(v) || QueueDrainHelper.postCompleteRequest(v, this.a, this.e, this, this)) {
            return;
        }
        boolean z = this.f.get();
        int v1 = this.d;
        if(!z && this.f.compareAndSet(false, true)) {
            long v2 = BackpressureHelper.multiplyCap(v1, v - 1L);
            this.g.request(BackpressureHelper.addCap(this.c, v2));
            return;
        }
        long v3 = BackpressureHelper.multiplyCap(v1, v);
        this.g.request(v3);
    }
}

