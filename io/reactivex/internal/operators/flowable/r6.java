package io.reactivex.internal.operators.flowable;

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

public final class r6 extends QueueDrainSubscriber implements Runnable, Subscription {
    public final long n;
    public final TimeUnit o;
    public final Scheduler p;
    public final int q;
    public Subscription r;
    public UnicastProcessor s;
    public final SequentialDisposable t;
    public volatile boolean u;
    public static final Object v;

    static {
        r6.v = new Object();
    }

    public r6(SerializedSubscriber serializedSubscriber0, long v, TimeUnit timeUnit0, Scheduler scheduler0, int v1) {
        super(serializedSubscriber0, new MpscLinkedQueue());
        this.t = new SequentialDisposable();
        this.n = v;
        this.o = timeUnit0;
        this.p = scheduler0;
        this.q = v1;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.cancelled = true;
    }

    public final void d0() {
        SimplePlainQueue simplePlainQueue0 = this.queue;
        Subscriber subscriber0 = this.downstream;
        UnicastProcessor unicastProcessor0 = this.s;
        int v = 1;
        while(true) {
            boolean z = this.u;
            boolean z1 = this.done;
            Object object0 = simplePlainQueue0.poll();
            Object object1 = r6.v;
            if(z1 && (object0 == null || object0 == object1)) {
                this.s = null;
                simplePlainQueue0.clear();
                Throwable throwable0 = this.error;
                if(throwable0 == null) {
                    unicastProcessor0.onComplete();
                }
                else {
                    unicastProcessor0.onError(throwable0);
                }
                this.t.dispose();
                return;
            }
            if(object0 == null) {
                v = this.leave(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            if(object0 == object1) {
                unicastProcessor0.onComplete();
                if(z) {
                    this.r.cancel();
                    continue;
                }
                else {
                    unicastProcessor0 = UnicastProcessor.create(this.q);
                    this.s = unicastProcessor0;
                    long v1 = this.requested();
                    if(v1 != 0L) {
                        subscriber0.onNext(unicastProcessor0);
                        if(v1 == 0x7FFFFFFFFFFFFFFFL) {
                            continue;
                        }
                        this.produced(1L);
                        continue;
                    }
                    this.s = null;
                    this.queue.clear();
                    this.r.cancel();
                    subscriber0.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                    this.t.dispose();
                    return;
                }
            }
            unicastProcessor0.onNext(object0);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.done = true;
        if(this.enter()) {
            this.d0();
        }
        this.downstream.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.error = throwable0;
        this.done = true;
        if(this.enter()) {
            this.d0();
        }
        this.downstream.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.u) {
            return;
        }
        if(this.fastEnter()) {
            this.s.onNext(object0);
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
        this.d0();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.r, subscription0)) {
            this.r = subscription0;
            this.s = UnicastProcessor.create(this.q);
            Subscriber subscriber0 = this.downstream;
            subscriber0.onSubscribe(this);
            long v = this.requested();
            if(v == 0L) {
                this.cancelled = true;
                subscription0.cancel();
                subscriber0.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
            }
            else {
                subscriber0.onNext(this.s);
                if(v != 0x7FFFFFFFFFFFFFFFL) {
                    this.produced(1L);
                }
                if(!this.cancelled) {
                    Disposable disposable0 = this.p.schedulePeriodicallyDirect(this, this.n, this.n, this.o);
                    if(this.t.replace(disposable0)) {
                        subscription0.request(0x7FFFFFFFFFFFFFFFL);
                    }
                }
            }
        }
    }

    @Override
    public final void run() {
        if(this.cancelled) {
            this.u = true;
        }
        this.queue.offer(r6.v);
        if(this.enter()) {
            this.d0();
        }
    }
}

