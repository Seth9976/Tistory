package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;

public final class c0 extends BasicIntQueueSubscription implements MaybeObserver {
    public final Subscriber a;
    public final CompositeDisposable b;
    public final AtomicLong c;
    public final Object d;
    public final AtomicThrowable e;
    public final int f;
    public volatile boolean g;
    public boolean h;
    public long i;

    public c0(Subscriber subscriber0, int v, SimpleQueueWithConsumerIndex maybeMergeArray$SimpleQueueWithConsumerIndex0) {
        this.a = subscriber0;
        this.f = v;
        this.b = new CompositeDisposable();
        this.c = new AtomicLong();
        this.e = new AtomicThrowable();
        this.d = maybeMergeArray$SimpleQueueWithConsumerIndex0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(!this.g) {
            this.g = true;
            this.b.dispose();
            if(this.getAndIncrement() == 0) {
                ((SimpleQueue)this.d).clear();
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        ((SimpleQueue)this.d).clear();
    }

    public final void drain() {
        int v = 1;
        if(this.getAndIncrement() != 0) {
            return;
        }
        if(this.h) {
            Subscriber subscriber0 = this.a;
            Object object0 = this.d;
            int v1 = 1;
            do {
                if(this.g) {
                    ((SimpleQueue)object0).clear();
                    return;
                }
                Throwable throwable0 = (Throwable)this.e.get();
                if(throwable0 != null) {
                    ((SimpleQueue)object0).clear();
                    subscriber0.onError(throwable0);
                    return;
                }
                boolean z = ((SimpleQueueWithConsumerIndex)object0).producerIndex() == this.f;
                if(!((SimpleQueue)object0).isEmpty()) {
                    subscriber0.onNext(null);
                }
                if(z) {
                    subscriber0.onComplete();
                    return;
                }
                v1 = this.addAndGet(-v1);
            }
            while(v1 != 0);
            return;
        }
        Subscriber subscriber1 = this.a;
        Object object1 = this.d;
        long v2 = this.i;
        do {
            long v3 = this.c.get();
            int v4;
            while((v4 = Long.compare(v2, v3)) != 0) {
                if(this.g) {
                    ((SimpleQueue)object1).clear();
                    return;
                }
                if(((Throwable)this.e.get()) != null) {
                    ((SimpleQueue)object1).clear();
                    subscriber1.onError(this.e.terminate());
                    return;
                }
                if(((SimpleQueueWithConsumerIndex)object1).consumerIndex() == this.f) {
                    subscriber1.onComplete();
                    return;
                }
                Object object2 = ((SimpleQueueWithConsumerIndex)object1).poll();
                if(object2 == null) {
                    break;
                }
                if(object2 != NotificationLite.COMPLETE) {
                    subscriber1.onNext(object2);
                    ++v2;
                }
            }
            if(v4 == 0) {
                if(((Throwable)this.e.get()) != null) {
                    ((SimpleQueue)object1).clear();
                    subscriber1.onError(this.e.terminate());
                    return;
                }
                while(((SimpleQueueWithConsumerIndex)object1).peek() == NotificationLite.COMPLETE) {
                    ((SimpleQueueWithConsumerIndex)object1).drop();
                }
                if(((SimpleQueueWithConsumerIndex)object1).consumerIndex() == this.f) {
                    subscriber1.onComplete();
                    return;
                }
            }
            this.i = v2;
            v = this.addAndGet(-v);
        }
        while(v != 0);
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return ((SimpleQueue)this.d).isEmpty();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        ((SimpleQueue)this.d).offer(NotificationLite.COMPLETE);
        this.drain();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        if(this.e.addThrowable(throwable0)) {
            this.b.dispose();
            ((SimpleQueue)this.d).offer(NotificationLite.COMPLETE);
            this.drain();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        this.b.add(disposable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        ((SimpleQueue)this.d).offer(object0);
        this.drain();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        Object object0;
        do {
            object0 = ((SimpleQueueWithConsumerIndex)this.d).poll();
        }
        while(object0 == NotificationLite.COMPLETE);
        return object0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.c, v);
            this.drain();
        }
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int v) {
        if((v & 2) != 0) {
            this.h = true;
            return 2;
        }
        return 0;
    }
}

