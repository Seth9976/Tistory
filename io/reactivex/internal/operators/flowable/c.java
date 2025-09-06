package io.reactivex.internal.operators.flowable;

import io.reactivex.Notification;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

public final class c extends DisposableSubscriber implements Iterator {
    public final Semaphore b;
    public final AtomicReference c;
    public Notification d;

    public c() {
        this.b = new Semaphore(0);
        this.c = new AtomicReference();
    }

    @Override
    public final boolean hasNext() {
        if(this.d != null && this.d.isOnError()) {
            throw ExceptionHelper.wrapOrThrow(this.d.getError());
        }
        if((this.d == null || this.d.isOnNext()) && this.d == null) {
            try {
                BlockingHelper.verifyNonBlocking();
                this.b.acquire();
            }
            catch(InterruptedException interruptedException0) {
                this.dispose();
                this.d = Notification.createOnError(interruptedException0);
                throw ExceptionHelper.wrapOrThrow(interruptedException0);
            }
            Notification notification0 = (Notification)this.c.getAndSet(null);
            this.d = notification0;
            if(notification0.isOnError()) {
                throw ExceptionHelper.wrapOrThrow(notification0.getError());
            }
        }
        return this.d.isOnNext();
    }

    @Override
    public final Object next() {
        if(!this.hasNext() || !this.d.isOnNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = this.d.getValue();
        this.d = null;
        return object0;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.c.getAndSet(((Notification)object0)) == null) {
            this.b.release();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Read-only iterator.");
    }
}

