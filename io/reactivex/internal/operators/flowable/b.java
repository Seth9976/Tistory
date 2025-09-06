package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.reactivestreams.Subscription;

public final class b extends AtomicReference implements FlowableSubscriber, Disposable, Runnable, Iterator {
    public final SpscArrayQueue a;
    public final long b;
    public final long c;
    public final ReentrantLock d;
    public final Condition e;
    public long f;
    public volatile boolean g;
    public volatile Throwable h;

    public b(int v) {
        this.a = new SpscArrayQueue(v);
        this.b = (long)v;
        this.c = (long)(v - (v >> 2));
        ReentrantLock reentrantLock0 = new ReentrantLock();
        this.d = reentrantLock0;
        this.e = reentrantLock0.newCondition();
    }

    public final void a() {
        this.d.lock();
        try {
            this.e.signalAll();
        }
        finally {
            this.d.unlock();
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.cancel(this);
        this.a();
    }

    @Override
    public final boolean hasNext() {
        while(true) {
            if(this.isDisposed()) {
                Throwable throwable0 = this.h;
                if(throwable0 != null) {
                    throw ExceptionHelper.wrapOrThrow(throwable0);
                }
                return false;
            }
            boolean z = this.g;
            boolean z1 = this.a.isEmpty();
            if(z) {
                Throwable throwable1 = this.h;
                if(throwable1 != null) {
                    throw ExceptionHelper.wrapOrThrow(throwable1);
                }
                if(z1) {
                    return false;
                }
            }
            if(!z1) {
                break;
            }
            BlockingHelper.verifyNonBlocking();
            this.d.lock();
            try {
                while(!this.g && this.a.isEmpty() && !this.isDisposed()) {
                    this.e.await();
                }
            }
            catch(InterruptedException interruptedException0) {
                this.run();
                throw ExceptionHelper.wrapOrThrow(interruptedException0);
            }
            finally {
                this.d.unlock();
            }
        }
        return true;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() == SubscriptionHelper.CANCELLED;
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = this.a.poll();
        long v = this.f + 1L;
        if(v == this.c) {
            this.f = 0L;
            ((Subscription)this.get()).request(v);
            return object0;
        }
        this.f = v;
        return object0;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.g = true;
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.h = throwable0;
        this.g = true;
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(!this.a.offer(object0)) {
            SubscriptionHelper.cancel(this);
            this.onError(new MissingBackpressureException("Queue full?!"));
            return;
        }
        this.a();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.setOnce(this, subscription0, this.b);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }

    @Override
    public final void run() {
        SubscriptionHelper.cancel(this);
        this.a();
    }
}

