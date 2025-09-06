package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class FutureSubscriber extends CountDownLatch implements FlowableSubscriber, Future, Subscription {
    public Object a;
    public Throwable b;
    public final AtomicReference c;

    public FutureSubscriber() {
        super(1);
        this.c = new AtomicReference();
    }

    @Override  // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override
    public boolean cancel(boolean z) {
        while(true) {
            AtomicReference atomicReference0 = this.c;
            Subscription subscription0 = (Subscription)atomicReference0.get();
            if(subscription0 == this) {
                break;
            }
            SubscriptionHelper subscriptionHelper0 = SubscriptionHelper.CANCELLED;
            if(subscription0 == subscriptionHelper0) {
                break;
            }
            do {
                if(atomicReference0.compareAndSet(subscription0, subscriptionHelper0)) {
                    if(subscription0 != null) {
                        subscription0.cancel();
                    }
                    this.countDown();
                    return true;
                }
            }
            while(atomicReference0.get() == subscription0);
        }
        return false;
    }

    @Override
    public Object get() throws InterruptedException, ExecutionException {
        if(this.getCount() != 0L) {
            BlockingHelper.verifyNonBlocking();
            this.await();
        }
        if(this.isCancelled()) {
            throw new CancellationException();
        }
        Throwable throwable0 = this.b;
        if(throwable0 != null) {
            throw new ExecutionException(throwable0);
        }
        return this.a;
    }

    @Override
    public Object get(long v, TimeUnit timeUnit0) throws InterruptedException, ExecutionException, TimeoutException {
        if(this.getCount() != 0L) {
            BlockingHelper.verifyNonBlocking();
            if(!this.await(v, timeUnit0)) {
                throw new TimeoutException(ExceptionHelper.timeoutMessage(v, timeUnit0));
            }
        }
        if(this.isCancelled()) {
            throw new CancellationException();
        }
        Throwable throwable0 = this.b;
        if(throwable0 != null) {
            throw new ExecutionException(throwable0);
        }
        return this.a;
    }

    @Override
    public boolean isCancelled() {
        return this.c.get() == SubscriptionHelper.CANCELLED;
    }

    @Override
    public boolean isDone() {
        return this.getCount() == 0L;
    }

    @Override  // org.reactivestreams.Subscriber
    public void onComplete() {
        if(this.a == null) {
            this.onError(new NoSuchElementException("The source is empty"));
            return;
        }
        while(true) {
            AtomicReference atomicReference0 = this.c;
            Subscription subscription0 = (Subscription)atomicReference0.get();
            if(subscription0 == this || subscription0 == SubscriptionHelper.CANCELLED) {
                break;
            }
            do {
                if(atomicReference0.compareAndSet(subscription0, this)) {
                    this.countDown();
                    return;
                }
            }
            while(atomicReference0.get() == subscription0);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        while(true) {
            AtomicReference atomicReference0 = this.c;
            Subscription subscription0 = (Subscription)atomicReference0.get();
            if(subscription0 == this || subscription0 == SubscriptionHelper.CANCELLED) {
                break;
            }
            this.b = throwable0;
            do {
                if(atomicReference0.compareAndSet(subscription0, this)) {
                    this.countDown();
                    return;
                }
            }
            while(atomicReference0.get() == subscription0);
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public void onNext(Object object0) {
        if(this.a != null) {
            ((Subscription)this.c.get()).cancel();
            this.onError(new IndexOutOfBoundsException("More than one element received"));
            return;
        }
        this.a = object0;
    }

    @Override  // io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.setOnce(this.c, subscription0, 0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // org.reactivestreams.Subscription
    public void request(long v) {
    }
}

