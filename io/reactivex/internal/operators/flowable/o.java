package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Function;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class o extends AtomicInteger implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final Callable b;
    public final Publisher c;
    public final Function d;
    public final CompositeDisposable e;
    public final AtomicLong f;
    public final AtomicReference g;
    public final AtomicThrowable h;
    public volatile boolean i;
    public final SpscLinkedArrayQueue j;
    public volatile boolean k;
    public long l;
    public LinkedHashMap m;
    public long n;

    public o(Subscriber subscriber0, Publisher publisher0, Function function0, Callable callable0) {
        this.a = subscriber0;
        this.b = callable0;
        this.c = publisher0;
        this.d = function0;
        this.j = new SpscLinkedArrayQueue(0x80);
        this.e = new CompositeDisposable();
        this.f = new AtomicLong();
        this.g = new AtomicReference();
        this.m = new LinkedHashMap();
        this.h = new AtomicThrowable();
    }

    public final void a(p p0, long v) {
        boolean z;
        this.e.delete(p0);
        if(this.e.size() == 0) {
            SubscriptionHelper.cancel(this.g);
            z = true;
        }
        else {
            z = false;
        }
        synchronized(this) {
            LinkedHashMap linkedHashMap0 = this.m;
            if(linkedHashMap0 == null) {
                return;
            }
            Object object0 = linkedHashMap0.remove(v);
            this.j.offer(object0);
        }
        if(z) {
            this.i = true;
        }
        this.b();
    }

    public final void b() {
        if(this.getAndIncrement() != 0) {
            return;
        }
        long v = this.n;
        Subscriber subscriber0 = this.a;
        SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.j;
        int v1 = 1;
        do {
            long v2 = this.f.get();
            int v3;
            while((v3 = Long.compare(v, v2)) != 0) {
                if(this.k) {
                    spscLinkedArrayQueue0.clear();
                    return;
                }
                boolean z = this.i;
                if(z && this.h.get() != null) {
                    spscLinkedArrayQueue0.clear();
                    subscriber0.onError(this.h.terminate());
                    return;
                }
                Collection collection0 = (Collection)spscLinkedArrayQueue0.poll();
                if(z && collection0 == null) {
                    subscriber0.onComplete();
                    return;
                }
                if(collection0 == null) {
                    break;
                }
                subscriber0.onNext(collection0);
                ++v;
            }
            if(v3 == 0) {
                if(this.k) {
                    spscLinkedArrayQueue0.clear();
                    return;
                }
                if(this.i) {
                    if(this.h.get() != null) {
                        spscLinkedArrayQueue0.clear();
                        subscriber0.onError(this.h.terminate());
                        return;
                    }
                    if(spscLinkedArrayQueue0.isEmpty()) {
                        subscriber0.onComplete();
                        return;
                    }
                }
            }
            this.n = v;
            v1 = this.addAndGet(-v1);
        }
        while(v1 != 0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(SubscriptionHelper.cancel(this.g)) {
            this.k = true;
            this.e.dispose();
            synchronized(this) {
                this.m = null;
            }
            if(this.getAndIncrement() != 0) {
                this.j.clear();
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.e.dispose();
        synchronized(this) {
            LinkedHashMap linkedHashMap0 = this.m;
            if(linkedHashMap0 == null) {
                return;
            }
            for(Object object0: linkedHashMap0.values()) {
                this.j.offer(((Collection)object0));
            }
            this.m = null;
        }
        this.i = true;
        this.b();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.h.addThrowable(throwable0)) {
            this.e.dispose();
            synchronized(this) {
                this.m = null;
            }
            this.i = true;
            this.b();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        synchronized(this) {
            LinkedHashMap linkedHashMap0 = this.m;
            if(linkedHashMap0 == null) {
                return;
            }
            for(Object object1: linkedHashMap0.values()) {
                ((Collection)object1).add(object0);
            }
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.setOnce(this.g, subscription0)) {
            n n0 = new n(this);
            this.e.add(n0);
            this.c.subscribe(n0);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        BackpressureHelper.add(this.f, v);
        this.b();
    }
}

