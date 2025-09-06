package io.reactivex.internal.operators.flowable;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
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
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class u extends QueueDrainSubscriber implements Disposable, Runnable, Subscription {
    public final Callable n;
    public final long o;
    public final TimeUnit p;
    public final Scheduler q;
    public Subscription r;
    public Collection s;
    public final AtomicReference t;

    public u(SerializedSubscriber serializedSubscriber0, Callable callable0, long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        super(serializedSubscriber0, new MpscLinkedQueue());
        this.t = new AtomicReference();
        this.n = callable0;
        this.o = v;
        this.p = timeUnit0;
        this.q = scheduler0;
    }

    @Override  // io.reactivex.internal.subscribers.QueueDrainSubscriber
    public final boolean accept(Subscriber subscriber0, Object object0) {
        this.downstream.onNext(((Collection)object0));
        return true;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.cancelled = true;
        this.r.cancel();
        DisposableHelper.dispose(this.t);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.cancel();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.t.get() == DisposableHelper.DISPOSED;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        Collection collection0;
        DisposableHelper.dispose(this.t);
        synchronized(this) {
            collection0 = this.s;
            if(collection0 == null) {
                return;
            }
            this.s = null;
        }
        this.queue.offer(collection0);
        this.done = true;
        if(this.enter()) {
            QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, null, this);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        DisposableHelper.dispose(this.t);
        synchronized(this) {
            this.s = null;
        }
        this.downstream.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        synchronized(this) {
            Collection collection0 = this.s;
            if(collection0 != null) {
                collection0.add(object0);
            }
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        Collection collection0;
        if(SubscriptionHelper.validate(this.r, subscription0)) {
            try {
                this.r = subscription0;
                collection0 = (Collection)ObjectHelper.requireNonNull(this.n.call(), "The supplied buffer is null");
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                this.cancel();
                EmptySubscription.error(throwable0, this.downstream);
                return;
            }
            this.s = collection0;
            this.downstream.onSubscribe(this);
            if(!this.cancelled) {
                subscription0.request(0x7FFFFFFFFFFFFFFFL);
                Disposable disposable0 = this.q.schedulePeriodicallyDirect(this, this.o, this.o, this.p);
                AtomicReference atomicReference0 = this.t;
                while(!atomicReference0.compareAndSet(null, disposable0)) {
                    if(atomicReference0.get() != null) {
                        disposable0.dispose();
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
    }

    @Override
    public final void run() {
        Collection collection1;
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
            collection1 = this.s;
            if(collection1 == null) {
                return;
            }
            this.s = collection0;
        }
        this.fastPathEmitMax(collection1, false, this);
    }
}

