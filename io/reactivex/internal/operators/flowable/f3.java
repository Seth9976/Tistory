package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class f3 extends BasicIntQueueSubscription implements FlowableSubscriber {
    public final Subscriber a;
    public final SimplePlainQueue b;
    public final boolean c;
    public final Action d;
    public Subscription e;
    public volatile boolean f;
    public volatile boolean g;
    public Throwable h;
    public final AtomicLong i;
    public boolean j;

    public f3(Subscriber subscriber0, int v, boolean z, boolean z1, Action action0) {
        this.i = new AtomicLong();
        this.a = subscriber0;
        this.d = action0;
        this.c = z1;
        SpscLinkedArrayQueue spscLinkedArrayQueue0 = z ? new SpscLinkedArrayQueue(v) : new SpscArrayQueue(v);
        this.b = spscLinkedArrayQueue0;
    }

    public final boolean a(Subscriber subscriber0, boolean z, boolean z1) {
        if(this.f) {
            this.b.clear();
            return true;
        }
        if(z) {
            if(!this.c) {
                Throwable throwable1 = this.h;
                if(throwable1 != null) {
                    this.b.clear();
                    subscriber0.onError(throwable1);
                    return true;
                }
                if(z1) {
                    subscriber0.onComplete();
                    return true;
                }
            }
            else if(z1) {
                Throwable throwable0 = this.h;
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

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(!this.f) {
            this.f = true;
            this.e.cancel();
            if(!this.j && this.getAndIncrement() == 0) {
                this.b.clear();
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.b.clear();
    }

    public final void drain() {
        if(this.getAndIncrement() == 0) {
            SimplePlainQueue simplePlainQueue0 = this.b;
            Subscriber subscriber0 = this.a;
            int v = 1;
            while(true) {
                if(this.a(subscriber0, this.g, simplePlainQueue0.isEmpty())) {
                    return;
                }
                long v1 = this.i.get();
                long v2 = 0L;
                int v3;
                while((v3 = Long.compare(v2, v1)) != 0) {
                    boolean z = this.g;
                    Object object0 = simplePlainQueue0.poll();
                    if(this.a(subscriber0, z, object0 == null)) {
                        return;
                    }
                    if(object0 == null) {
                        break;
                    }
                    subscriber0.onNext(object0);
                    ++v2;
                }
                if(v3 == 0 && this.a(subscriber0, this.g, simplePlainQueue0.isEmpty())) {
                    return;
                }
                if(v2 != 0L && v1 != 0x7FFFFFFFFFFFFFFFL) {
                    this.i.addAndGet(-v2);
                }
                v = this.addAndGet(-v);
                if(v == 0) {
                    break;
                }
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.g = true;
        if(this.j) {
            this.a.onComplete();
            return;
        }
        this.drain();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.h = throwable0;
        this.g = true;
        if(this.j) {
            this.a.onError(throwable0);
            return;
        }
        this.drain();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(!this.b.offer(object0)) {
            this.e.cancel();
            MissingBackpressureException missingBackpressureException0 = new MissingBackpressureException("Buffer is full");
            try {
                this.d.run();
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                missingBackpressureException0.initCause(throwable0);
            }
            this.onError(missingBackpressureException0);
            return;
        }
        if(this.j) {
            this.a.onNext(null);
            return;
        }
        this.drain();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.e, subscription0)) {
            this.e = subscription0;
            this.a.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        return this.b.poll();
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(!this.j && SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.i, v);
            this.drain();
        }
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int v) {
        if((v & 2) != 0) {
            this.j = true;
            return 2;
        }
        return 0;
    }
}

