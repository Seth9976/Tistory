package io.reactivex.internal.operators.flowable;

import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class t extends QueueDrainSubscriber implements Disposable, Runnable, Subscription {
    public final Callable n;
    public final long o;
    public final TimeUnit p;
    public final int q;
    public final boolean r;
    public final Worker s;
    public Collection t;
    public Disposable u;
    public Subscription v;
    public long w;
    public long x;

    public t(SerializedSubscriber serializedSubscriber0, Callable callable0, long v, TimeUnit timeUnit0, int v1, boolean z, Worker scheduler$Worker0) {
        super(serializedSubscriber0, new MpscLinkedQueue());
        this.n = callable0;
        this.o = v;
        this.p = timeUnit0;
        this.q = v1;
        this.r = z;
        this.s = scheduler$Worker0;
    }

    @Override  // io.reactivex.internal.subscribers.QueueDrainSubscriber
    public final boolean accept(Subscriber subscriber0, Object object0) {
        subscriber0.onNext(((Collection)object0));
        return true;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(!this.cancelled) {
            this.cancelled = true;
            this.dispose();
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        synchronized(this) {
            this.t = null;
        }
        this.v.cancel();
        this.s.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.s.isDisposed();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        Collection collection0;
        synchronized(this) {
            collection0 = this.t;
            this.t = null;
        }
        if(collection0 != null) {
            this.queue.offer(collection0);
            this.done = true;
            if(this.enter()) {
                QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this, this);
            }
            this.s.dispose();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        synchronized(this) {
            this.t = null;
        }
        this.downstream.onError(throwable0);
        this.s.dispose();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Collection collection0;
        Collection collection1;
        synchronized(this) {
            collection0 = this.t;
            if(collection0 == null) {
                return;
            }
            collection0.add(object0);
            if(collection0.size() < this.q) {
                return;
            }
            this.t = null;
            ++this.w;
        }
        if(this.r) {
            this.u.dispose();
        }
        this.fastPathOrderedEmitMax(collection0, false, this);
        try {
            collection1 = (Collection)ObjectHelper.requireNonNull(this.n.call(), "The supplied buffer is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.cancel();
            this.downstream.onError(throwable0);
            return;
        }
        synchronized(this) {
            this.t = collection1;
            ++this.x;
        }
        if(this.r) {
            this.u = this.s.schedulePeriodically(this, this.o, this.o, this.p);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        Collection collection0;
        if(!SubscriptionHelper.validate(this.v, subscription0)) {
            return;
        }
        try {
            this.v = subscription0;
            collection0 = (Collection)ObjectHelper.requireNonNull(this.n.call(), "The supplied buffer is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.s.dispose();
            subscription0.cancel();
            EmptySubscription.error(throwable0, this.downstream);
            return;
        }
        this.t = collection0;
        this.downstream.onSubscribe(this);
        this.u = this.s.schedulePeriodically(this, this.o, this.o, this.p);
        subscription0.request(0x7FFFFFFFFFFFFFFFL);
    }

    @Override
    public final void run() {
        Collection collection0;
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
            Collection collection1 = this.t;
            if(collection1 != null && this.w == this.x) {
                this.t = collection0;
                this.fastPathOrderedEmitMax(collection1, false, this);
            }
        }
    }
}

