package io.reactivex.internal.operators.flowable;

import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class q6 extends QueueDrainSubscriber implements Subscription {
    public final long n;
    public final TimeUnit o;
    public final Scheduler p;
    public final int q;
    public final boolean r;
    public final long s;
    public final Worker t;
    public long u;
    public long v;
    public Subscription w;
    public UnicastProcessor x;
    public volatile boolean y;
    public final SequentialDisposable z;

    public q6(SerializedSubscriber serializedSubscriber0, long v, TimeUnit timeUnit0, Scheduler scheduler0, int v1, long v2, boolean z) {
        super(serializedSubscriber0, new MpscLinkedQueue());
        this.z = new SequentialDisposable();
        this.n = v;
        this.o = timeUnit0;
        this.p = scheduler0;
        this.q = v1;
        this.s = v2;
        this.r = z;
        if(z) {
            this.t = scheduler0.createWorker();
            return;
        }
        this.t = null;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.cancelled = true;
    }

    public static boolean d0(q6 q60) {
        return q60.cancelled;
    }

    public static SimplePlainQueue e0(q6 q60) {
        return q60.queue;
    }

    public final void f0() {
        this.z.dispose();
        Worker scheduler$Worker0 = this.t;
        if(scheduler$Worker0 != null) {
            scheduler$Worker0.dispose();
        }
    }

    public final void g0() {
        SimplePlainQueue simplePlainQueue0 = this.queue;
        Subscriber subscriber0 = this.downstream;
        UnicastProcessor unicastProcessor0 = this.x;
        int v = 1;
        while(true) {
            if(this.y) {
                this.w.cancel();
                simplePlainQueue0.clear();
                this.f0();
                return;
            }
            boolean z = this.done;
            Object object0 = simplePlainQueue0.poll();
            if(z && (object0 == null || object0 instanceof p6)) {
                this.x = null;
                simplePlainQueue0.clear();
                Throwable throwable0 = this.error;
                if(throwable0 == null) {
                    unicastProcessor0.onComplete();
                }
                else {
                    unicastProcessor0.onError(throwable0);
                }
                this.f0();
                return;
            }
            if(object0 == null) {
                v = this.leave(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            if(object0 instanceof p6) {
                if(this.r && this.v != ((p6)object0).a) {
                    continue;
                }
                unicastProcessor0.onComplete();
                this.u = 0L;
                unicastProcessor0 = UnicastProcessor.create(this.q);
                this.x = unicastProcessor0;
                long v1 = this.requested();
                if(v1 != 0L) {
                    subscriber0.onNext(unicastProcessor0);
                    if(v1 == 0x7FFFFFFFFFFFFFFFL) {
                        continue;
                    }
                    this.produced(1L);
                    continue;
                }
                this.x = null;
                this.queue.clear();
                this.w.cancel();
                subscriber0.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                this.f0();
                return;
            }
            unicastProcessor0.onNext(object0);
            long v2 = this.u + 1L;
            if(v2 >= this.s) {
                ++this.v;
                this.u = 0L;
                unicastProcessor0.onComplete();
                long v3 = this.requested();
                if(v3 != 0L) {
                    unicastProcessor0 = UnicastProcessor.create(this.q);
                    this.x = unicastProcessor0;
                    this.downstream.onNext(unicastProcessor0);
                    if(v3 != 0x7FFFFFFFFFFFFFFFL) {
                        this.produced(1L);
                    }
                    if(!this.r) {
                        continue;
                    }
                    ((Disposable)this.z.get()).dispose();
                    p6 p60 = new p6(this.v, this);
                    Disposable disposable0 = this.t.schedulePeriodically(p60, this.n, this.n, this.o);
                    this.z.replace(disposable0);
                    continue;
                }
                this.x = null;
                this.w.cancel();
                MissingBackpressureException missingBackpressureException0 = new MissingBackpressureException("Could not deliver window due to lack of requests");
                this.downstream.onError(missingBackpressureException0);
                this.f0();
                return;
            }
            this.u = v2;
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.done = true;
        if(this.enter()) {
            this.g0();
        }
        this.downstream.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.error = throwable0;
        this.done = true;
        if(this.enter()) {
            this.g0();
        }
        this.downstream.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.y) {
            return;
        }
        if(this.fastEnter()) {
            UnicastProcessor unicastProcessor0 = this.x;
            unicastProcessor0.onNext(object0);
            long v = this.u + 1L;
            if(v >= this.s) {
                ++this.v;
                this.u = 0L;
                unicastProcessor0.onComplete();
                long v1 = this.requested();
                if(v1 == 0L) {
                    goto label_23;
                }
                UnicastProcessor unicastProcessor1 = UnicastProcessor.create(this.q);
                this.x = unicastProcessor1;
                this.downstream.onNext(unicastProcessor1);
                if(v1 != 0x7FFFFFFFFFFFFFFFL) {
                    this.produced(1L);
                }
                if(this.r) {
                    ((Disposable)this.z.get()).dispose();
                    p6 p60 = new p6(this.v, this);
                    Disposable disposable0 = this.t.schedulePeriodically(p60, this.n, this.n, this.o);
                    this.z.replace(disposable0);
                    goto label_30;
                label_23:
                    this.x = null;
                    this.w.cancel();
                    MissingBackpressureException missingBackpressureException0 = new MissingBackpressureException("Could not deliver window due to lack of requests");
                    this.downstream.onError(missingBackpressureException0);
                    this.f0();
                    return;
                }
            }
            else {
                this.u = v;
            }
        label_30:
            if(this.leave(-1) == 0) {
                return;
            }
        }
        else {
            this.queue.offer(object0);
            if(!this.enter()) {
                return;
            }
        }
        this.g0();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.w, subscription0)) {
            this.w = subscription0;
            Subscriber subscriber0 = this.downstream;
            subscriber0.onSubscribe(this);
            if(this.cancelled) {
                return;
            }
            UnicastProcessor unicastProcessor0 = UnicastProcessor.create(this.q);
            this.x = unicastProcessor0;
            long v = this.requested();
            if(v == 0L) {
                this.cancelled = true;
                subscription0.cancel();
                subscriber0.onError(new MissingBackpressureException("Could not deliver initial window due to lack of requests."));
            }
            else {
                subscriber0.onNext(unicastProcessor0);
                if(v != 0x7FFFFFFFFFFFFFFFL) {
                    this.produced(1L);
                }
                p6 p60 = new p6(this.v, this);
                Disposable disposable0 = this.r ? this.t.schedulePeriodically(p60, this.n, this.n, this.o) : this.p.schedulePeriodicallyDirect(p60, this.n, this.n, this.o);
                if(this.z.replace(disposable0)) {
                    subscription0.request(0x7FFFFFFFFFFFFFFFL);
                }
            }
        }
    }
}

