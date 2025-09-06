package io.reactivex.internal.operators.flowable;

import androidx.core.app.o;
import io.reactivex.Scheduler.Worker;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class t6 extends QueueDrainSubscriber implements Runnable, Subscription {
    public final long n;
    public final long o;
    public final TimeUnit p;
    public final Worker q;
    public final int r;
    public final LinkedList s;
    public Subscription t;
    public volatile boolean u;

    public t6(SerializedSubscriber serializedSubscriber0, long v, long v1, TimeUnit timeUnit0, Worker scheduler$Worker0, int v2) {
        super(serializedSubscriber0, new MpscLinkedQueue());
        this.n = v;
        this.o = v1;
        this.p = timeUnit0;
        this.q = scheduler$Worker0;
        this.r = v2;
        this.s = new LinkedList();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.cancelled = true;
    }

    public final void d0(UnicastProcessor unicastProcessor0) {
        s6 s60 = new s6(unicastProcessor0, false);
        this.queue.offer(s60);
        if(this.enter()) {
            this.e0();
        }
    }

    public final void e0() {
        SimplePlainQueue simplePlainQueue0 = this.queue;
        Subscriber subscriber0 = this.downstream;
        LinkedList linkedList0 = this.s;
        int v = 1;
        while(true) {
            if(this.u) {
                this.t.cancel();
                simplePlainQueue0.clear();
                linkedList0.clear();
                this.q.dispose();
                return;
            }
            boolean z = this.done;
            Object object0 = simplePlainQueue0.poll();
            if(z && (object0 == null || object0 instanceof s6)) {
                simplePlainQueue0.clear();
                Throwable throwable0 = this.error;
                if(throwable0 == null) {
                    for(Object object2: linkedList0) {
                        ((UnicastProcessor)object2).onComplete();
                    }
                }
                else {
                    for(Object object1: linkedList0) {
                        ((UnicastProcessor)object1).onError(throwable0);
                    }
                }
                linkedList0.clear();
                this.q.dispose();
                return;
            }
            if(object0 == null) {
                v = this.leave(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            if(!(object0 instanceof s6)) {
                for(Object object3: linkedList0) {
                    ((UnicastProcessor)object3).onNext(object0);
                }
            }
            else if(!((s6)object0).b) {
                linkedList0.remove(((s6)object0).a);
                ((s6)object0).a.onComplete();
                if(!linkedList0.isEmpty() || !this.cancelled) {
                    continue;
                }
                this.u = true;
            }
            else if(!this.cancelled) {
                long v1 = this.requested();
                if(v1 == 0L) {
                    subscriber0.onError(new MissingBackpressureException("Can\'t emit window due to lack of requests"));
                }
                else {
                    UnicastProcessor unicastProcessor0 = UnicastProcessor.create(this.r);
                    linkedList0.add(unicastProcessor0);
                    subscriber0.onNext(unicastProcessor0);
                    if(v1 != 0x7FFFFFFFFFFFFFFFL) {
                        this.produced(1L);
                    }
                    o o0 = new o(this, unicastProcessor0, false, 23);
                    this.q.schedule(o0, this.n, this.p);
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.done = true;
        if(this.enter()) {
            this.e0();
        }
        this.downstream.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.error = throwable0;
        this.done = true;
        if(this.enter()) {
            this.e0();
        }
        this.downstream.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.fastEnter()) {
            for(Object object1: this.s) {
                ((UnicastProcessor)object1).onNext(object0);
            }
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
        this.e0();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.t, subscription0)) {
            this.t = subscription0;
            this.downstream.onSubscribe(this);
            if(this.cancelled) {
                return;
            }
            long v = this.requested();
            if(v != 0L) {
                UnicastProcessor unicastProcessor0 = UnicastProcessor.create(this.r);
                this.s.add(unicastProcessor0);
                this.downstream.onNext(unicastProcessor0);
                if(v != 0x7FFFFFFFFFFFFFFFL) {
                    this.produced(1L);
                }
                o o0 = new o(this, unicastProcessor0, false, 23);
                this.q.schedule(o0, this.n, this.p);
                this.q.schedulePeriodically(this, this.o, this.o, this.p);
                subscription0.request(0x7FFFFFFFFFFFFFFFL);
                return;
            }
            subscription0.cancel();
            MissingBackpressureException missingBackpressureException0 = new MissingBackpressureException("Could not emit the first window due to lack of requests");
            this.downstream.onError(missingBackpressureException0);
        }
    }

    @Override
    public final void run() {
        s6 s60 = new s6(UnicastProcessor.create(this.r), true);
        if(!this.cancelled) {
            this.queue.offer(s60);
        }
        if(this.enter()) {
            this.e0();
        }
    }
}

