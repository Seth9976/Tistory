package io.reactivex.internal.operators.flowable;

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
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class r extends QueueDrainSubscriber implements Disposable, Subscription {
    public final int n;
    public final Callable o;
    public Subscription p;
    public Collection q;
    public final Object r;
    public Object s;

    public r(SerializedSubscriber serializedSubscriber0, Callable callable0, Callable callable1) {
        this.n = 0;
        super(serializedSubscriber0, new MpscLinkedQueue());
        this.s = new AtomicReference();
        this.o = callable0;
        this.r = callable1;
    }

    public r(SerializedSubscriber serializedSubscriber0, Callable callable0, Publisher publisher0) {
        this.n = 1;
        super(serializedSubscriber0, new MpscLinkedQueue());
        this.o = callable0;
        this.r = publisher0;
    }

    @Override  // io.reactivex.internal.subscribers.QueueDrainSubscriber
    public final boolean accept(Subscriber subscriber0, Object object0) {
        if(this.n != 0) {
            this.downstream.onNext(((Collection)object0));
            return true;
        }
        this.downstream.onNext(((Collection)object0));
        return true;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.n != 0) {
            if(!this.cancelled) {
                this.cancelled = true;
                ((s)this.s).dispose();
                this.p.cancel();
                if(this.enter()) {
                    this.queue.clear();
                }
            }
            return;
        }
        if(!this.cancelled) {
            this.cancelled = true;
            this.p.cancel();
            DisposableHelper.dispose(((AtomicReference)this.s));
            if(this.enter()) {
                this.queue.clear();
            }
        }
    }

    public final void d0() {
        Collection collection3;
        Collection collection1;
        Publisher publisher0;
        Collection collection2;
        Collection collection0;
        if(this.n != 0) {
            try {
                collection0 = (Collection)ObjectHelper.requireNonNull(this.o.call(), "The buffer supplied is null");
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                this.cancel();
                this.downstream.onError(throwable0);
                return;
            }
            synchronized(this) {
                collection1 = this.q;
                if(collection1 == null) {
                    return;
                }
                this.q = collection0;
            }
            this.fastPathEmitMax(collection1, false, this);
            return;
        }
        try {
            collection2 = (Collection)ObjectHelper.requireNonNull(this.o.call(), "The buffer supplied is null");
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            this.cancel();
            this.downstream.onError(throwable1);
            return;
        }
        try {
            publisher0 = (Publisher)ObjectHelper.requireNonNull(((Callable)this.r).call(), "The boundary publisher supplied is null");
        }
        catch(Throwable throwable2) {
            Exceptions.throwIfFatal(throwable2);
            this.cancelled = true;
            this.p.cancel();
            this.downstream.onError(throwable2);
            return;
        }
        q q0 = new q(this, 0);
        if(DisposableHelper.replace(((AtomicReference)this.s), q0)) {
            synchronized(this) {
                collection3 = this.q;
                if(collection3 == null) {
                    return;
                }
                this.q = collection2;
            }
            publisher0.subscribe(q0);
            this.fastPathEmitMax(collection3, false, this);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.n != 0) {
            this.cancel();
            return;
        }
        this.p.cancel();
        DisposableHelper.dispose(((AtomicReference)this.s));
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.n == 0 ? ((AtomicReference)this.s).get() == DisposableHelper.DISPOSED : this.cancelled;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        Collection collection1;
        Collection collection0;
        if(this.n != 0) {
            synchronized(this) {
                collection0 = this.q;
                if(collection0 == null) {
                    return;
                }
                this.q = null;
            }
            this.queue.offer(collection0);
            this.done = true;
            if(this.enter()) {
                QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this, this);
            }
            return;
        }
        synchronized(this) {
            collection1 = this.q;
            if(collection1 == null) {
                return;
            }
            this.q = null;
        }
        this.queue.offer(collection1);
        this.done = true;
        if(this.enter()) {
            QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this, this);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.n != 0) {
            this.cancel();
            this.downstream.onError(throwable0);
            return;
        }
        this.cancel();
        this.downstream.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.n != 0) {
            synchronized(this) {
                Collection collection0 = this.q;
                if(collection0 != null) {
                    collection0.add(object0);
                    return;
                }
                return;
            }
            return;
        }
        synchronized(this) {
            Collection collection1 = this.q;
            if(collection1 != null) {
                collection1.add(object0);
            }
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        Publisher publisher0;
        Subscriber subscriber0;
        Collection collection0;
        if(this.n != 0) {
            if(SubscriptionHelper.validate(this.p, subscription0)) {
                try {
                    this.p = subscription0;
                    collection0 = (Collection)ObjectHelper.requireNonNull(this.o.call(), "The buffer supplied is null");
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    this.cancelled = true;
                    subscription0.cancel();
                    EmptySubscription.error(throwable0, this.downstream);
                    return;
                }
                this.q = collection0;
                s s0 = new s(this, 0);
                this.s = s0;
                this.downstream.onSubscribe(this);
                if(!this.cancelled) {
                    subscription0.request(0x7FFFFFFFFFFFFFFFL);
                    ((Publisher)this.r).subscribe(s0);
                    return;
                }
            }
            return;
        }
        if(SubscriptionHelper.validate(this.p, subscription0)) {
            try {
                this.p = subscription0;
                subscriber0 = this.downstream;
                this.q = (Collection)ObjectHelper.requireNonNull(this.o.call(), "The buffer supplied is null");
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                this.cancelled = true;
                subscription0.cancel();
                EmptySubscription.error(throwable1, subscriber0);
                return;
            }
            try {
                publisher0 = (Publisher)ObjectHelper.requireNonNull(((Callable)this.r).call(), "The boundary publisher supplied is null");
            }
            catch(Throwable throwable2) {
                Exceptions.throwIfFatal(throwable2);
                this.cancelled = true;
                subscription0.cancel();
                EmptySubscription.error(throwable2, subscriber0);
                return;
            }
            q q0 = new q(this, 0);
            ((AtomicReference)this.s).set(q0);
            subscriber0.onSubscribe(this);
            if(!this.cancelled) {
                subscription0.request(0x7FFFFFFFFFFFFFFFL);
                publisher0.subscribe(q0);
            }
        }
    }
}

