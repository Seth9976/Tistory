package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler.Worker;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public abstract class c3 extends BasicIntQueueSubscription implements FlowableSubscriber, Runnable {
    public final Worker a;
    public final boolean b;
    public final int c;
    public final int d;
    public final AtomicLong e;
    public Subscription f;
    public SimpleQueue g;
    public volatile boolean h;
    public volatile boolean i;
    public Throwable j;
    public int k;
    public long l;
    public boolean m;

    public c3(Worker scheduler$Worker0, boolean z, int v) {
        this.a = scheduler$Worker0;
        this.b = z;
        this.c = v;
        this.e = new AtomicLong();
        this.d = v - (v >> 2);
    }

    public final boolean a(Subscriber subscriber0, boolean z, boolean z1) {
        if(this.h) {
            this.clear();
            return true;
        }
        if(z) {
            if(!this.b) {
                Throwable throwable1 = this.j;
                if(throwable1 != null) {
                    this.h = true;
                    this.clear();
                    subscriber0.onError(throwable1);
                    this.a.dispose();
                    return true;
                }
                if(z1) {
                    this.h = true;
                    subscriber0.onComplete();
                    this.a.dispose();
                    return true;
                }
            }
            else if(z1) {
                this.h = true;
                Throwable throwable0 = this.j;
                if(throwable0 == null) {
                    subscriber0.onComplete();
                }
                else {
                    subscriber0.onError(throwable0);
                }
                this.a.dispose();
                return true;
            }
        }
        return false;
    }

    public abstract void b();

    public abstract void c();

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.h) {
            return;
        }
        this.h = true;
        this.f.cancel();
        this.a.dispose();
        if(!this.m && this.getAndIncrement() == 0) {
            this.g.clear();
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.g.clear();
    }

    public abstract void d();

    public final void e() {
        if(this.getAndIncrement() != 0) {
            return;
        }
        this.a.schedule(this);
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.g.isEmpty();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(!this.i) {
            this.i = true;
            this.e();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.i) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.j = throwable0;
        this.i = true;
        this.e();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.i) {
            return;
        }
        if(this.k == 2) {
            this.e();
            return;
        }
        if(!this.g.offer(object0)) {
            this.f.cancel();
            this.j = new MissingBackpressureException("Queue is full?!");
            this.i = true;
        }
        this.e();
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.e, v);
            this.e();
        }
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int v) {
        if((v & 2) != 0) {
            this.m = true;
            return 2;
        }
        return 0;
    }

    @Override
    public final void run() {
        if(this.m) {
            this.c();
            return;
        }
        if(this.k == 1) {
            this.d();
            return;
        }
        this.b();
    }
}

