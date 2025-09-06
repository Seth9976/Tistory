package io.reactivex.internal.operators.flowable;

import io.reactivex.Scheduler.Worker;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class w extends QueueDrainSubscriber implements Runnable, Subscription {
    public final Callable n;
    public final long o;
    public final long p;
    public final TimeUnit q;
    public final Worker r;
    public final LinkedList s;
    public Subscription t;

    public w(SerializedSubscriber serializedSubscriber0, Callable callable0, long v, long v1, TimeUnit timeUnit0, Worker scheduler$Worker0) {
        super(serializedSubscriber0, new MpscLinkedQueue());
        this.n = callable0;
        this.o = v;
        this.p = v1;
        this.q = timeUnit0;
        this.r = scheduler$Worker0;
        this.s = new LinkedList();
    }

    @Override  // io.reactivex.internal.subscribers.QueueDrainSubscriber
    public final boolean accept(Subscriber subscriber0, Object object0) {
        subscriber0.onNext(((Collection)object0));
        return true;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.cancelled = true;
        this.t.cancel();
        this.r.dispose();
        synchronized(this) {
            this.s.clear();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList(this.s);
            this.s.clear();
        }
        for(Object object0: arrayList0) {
            this.queue.offer(((Collection)object0));
        }
        this.done = true;
        if(this.enter()) {
            QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this.r, this);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.done = true;
        this.r.dispose();
        synchronized(this) {
            this.s.clear();
        }
        this.downstream.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        synchronized(this) {
            for(Object object1: this.s) {
                ((Collection)object1).add(object0);
            }
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        Collection collection0;
        Worker scheduler$Worker0 = this.r;
        if(!SubscriptionHelper.validate(this.t, subscription0)) {
            return;
        }
        try {
            this.t = subscription0;
            collection0 = (Collection)ObjectHelper.requireNonNull(this.n.call(), "The supplied buffer is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            scheduler$Worker0.dispose();
            subscription0.cancel();
            EmptySubscription.error(throwable0, this.downstream);
            return;
        }
        this.s.add(collection0);
        this.downstream.onSubscribe(this);
        subscription0.request(0x7FFFFFFFFFFFFFFFL);
        this.r.schedulePeriodically(this, this.p, this.p, this.q);
        scheduler$Worker0.schedule(new v(this, collection0), this.o, this.q);
    }

    @Override
    public final void run() {
        Collection collection0;
        if(this.cancelled) {
            return;
        }
        try {
            collection0 = (Collection)ObjectHelper.requireNonNull(this.n.call(), "The supplied buffer is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.cancel();
            this.downstream.onError(throwable0);
            return;
        }
        synchronized(this) {
            if(this.cancelled) {
                return;
            }
            this.s.add(collection0);
        }
        v v1 = new v(this, collection0);
        this.r.schedule(v1, this.o, this.q);
    }
}

