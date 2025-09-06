package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class g2 extends BasicIntQueueSubscription implements Publisher {
    public final Object a;
    public final SpscLinkedArrayQueue b;
    public final GroupBySubscriber c;
    public final boolean d;
    public final AtomicLong e;
    public volatile boolean f;
    public Throwable g;
    public final AtomicBoolean h;
    public final AtomicReference i;
    public final AtomicBoolean j;
    public boolean k;
    public int l;

    public g2(int v, GroupBySubscriber flowableGroupBy$GroupBySubscriber0, Object object0, boolean z) {
        this.e = new AtomicLong();
        this.h = new AtomicBoolean();
        this.i = new AtomicReference();
        this.j = new AtomicBoolean();
        this.b = new SpscLinkedArrayQueue(v);
        this.c = flowableGroupBy$GroupBySubscriber0;
        this.a = object0;
        this.d = z;
    }

    public final boolean a(boolean z, boolean z1, Subscriber subscriber0, boolean z2, long v) {
        boolean z3 = this.h.get();
        SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.b;
        if(z3) {
            while(spscLinkedArrayQueue0.poll() != null) {
                ++v;
            }
            if(v != 0L) {
                this.c.i.request(v);
            }
            return true;
        }
        if(z) {
            if(!z2) {
                Throwable throwable1 = this.g;
                if(throwable1 != null) {
                    spscLinkedArrayQueue0.clear();
                    subscriber0.onError(throwable1);
                    return true;
                }
                if(z1) {
                    subscriber0.onComplete();
                    return true;
                }
            }
            else if(z1) {
                Throwable throwable0 = this.g;
                if(throwable0 != null) {
                    subscriber0.onError(throwable0);
                    return true;
                }
                subscriber0.onComplete();
                return true;
            }
        }
        return false;
    }

    public final void b() {
        int v = this.l;
        if(v != 0) {
            this.l = 0;
            this.c.i.request(((long)v));
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.h.compareAndSet(false, true)) {
            this.c.cancel(this.a);
            this.drain();
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        while(this.b.poll() != null) {
            ++this.l;
        }
        this.b();
    }

    public final void drain() {
        if(this.getAndIncrement() != 0) {
            return;
        }
        if(this.k) {
            SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.b;
            Subscriber subscriber0 = (Subscriber)this.i.get();
            int v = 1;
            while(true) {
                if(subscriber0 != null) {
                    if(this.h.get()) {
                        break;
                    }
                    boolean z = this.f;
                    if(z && !this.d) {
                        Throwable throwable0 = this.g;
                        if(throwable0 != null) {
                            spscLinkedArrayQueue0.clear();
                            subscriber0.onError(throwable0);
                            return;
                        }
                    }
                    subscriber0.onNext(null);
                    if(z) {
                        Throwable throwable1 = this.g;
                        if(throwable1 != null) {
                            subscriber0.onError(throwable1);
                            return;
                        }
                        subscriber0.onComplete();
                        return;
                    }
                }
                v = this.addAndGet(-v);
                if(v == 0) {
                    break;
                }
                if(subscriber0 == null) {
                    subscriber0 = (Subscriber)this.i.get();
                }
            }
        }
        else {
            SpscLinkedArrayQueue spscLinkedArrayQueue1 = this.b;
            boolean z1 = this.d;
            Subscriber subscriber1 = (Subscriber)this.i.get();
            int v1 = 1;
        alab1:
            while(true) {
                if(subscriber1 != null) {
                    long v2 = this.e.get();
                    long v3 = 0L;
                    int v4;
                    while((v4 = Long.compare(v3, v2)) != 0) {
                        boolean z2 = this.f;
                        Object object0 = spscLinkedArrayQueue1.poll();
                        if(this.a(z2, object0 == null, subscriber1, z1, v3)) {
                            break alab1;
                        }
                        if(object0 == null) {
                            break;
                        }
                        subscriber1.onNext(object0);
                        ++v3;
                    }
                    if(v4 == 0 && this.a(this.f, spscLinkedArrayQueue1.isEmpty(), subscriber1, z1, v3)) {
                        break;
                    }
                    if(v3 != 0L) {
                        if(v2 != 0x7FFFFFFFFFFFFFFFL) {
                            this.e.addAndGet(-v3);
                        }
                        this.c.i.request(v3);
                    }
                }
                v1 = this.addAndGet(-v1);
                if(v1 == 0) {
                    break;
                }
                if(subscriber1 == null) {
                    subscriber1 = (Subscriber)this.i.get();
                }
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        if(this.b.isEmpty()) {
            this.b();
            return true;
        }
        return false;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        Object object0 = this.b.poll();
        if(object0 != null) {
            ++this.l;
            return object0;
        }
        this.b();
        return null;
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.e, v);
            this.drain();
        }
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int v) {
        if((v & 2) != 0) {
            this.k = true;
            return 2;
        }
        return 0;
    }

    @Override  // org.reactivestreams.Publisher
    public final void subscribe(Subscriber subscriber0) {
        if(this.j.compareAndSet(false, true)) {
            subscriber0.onSubscribe(this);
            this.i.lazySet(subscriber0);
            this.drain();
            return;
        }
        EmptySubscription.error(new IllegalStateException("Only one Subscriber allowed!"), subscriber0);
    }
}

