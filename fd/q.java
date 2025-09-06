package fd;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler.Worker;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscription;

public abstract class q extends AtomicInteger implements FlowableSubscriber, Runnable, Subscription {
    public final int a;
    public final int b;
    public final SpscArrayQueue c;
    public final Worker d;
    public Subscription e;
    public volatile boolean f;
    public Throwable g;
    public final AtomicLong h;
    public volatile boolean i;
    public int j;

    public q(int v, SpscArrayQueue spscArrayQueue0, Worker scheduler$Worker0) {
        this.h = new AtomicLong();
        this.a = v;
        this.c = spscArrayQueue0;
        this.b = v - (v >> 2);
        this.d = scheduler$Worker0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(!this.i) {
            this.i = true;
            this.e.cancel();
            this.d.dispose();
            if(this.getAndIncrement() == 0) {
                this.c.clear();
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.f) {
            return;
        }
        this.f = true;
        if(this.getAndIncrement() == 0) {
            this.d.schedule(this);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.f) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.g = throwable0;
        this.f = true;
        if(this.getAndIncrement() == 0) {
            this.d.schedule(this);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.f) {
            return;
        }
        if(!this.c.offer(object0)) {
            this.e.cancel();
            this.onError(new MissingBackpressureException("Queue is full?!"));
            return;
        }
        if(this.getAndIncrement() == 0) {
            this.d.schedule(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.h, v);
            if(this.getAndIncrement() == 0) {
                this.d.schedule(this);
            }
        }
    }
}

