package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

public final class c extends DisposableObserver implements Iterator {
    public Notification b;
    public final Semaphore c;
    public final AtomicReference d;

    public c() {
        this.c = new Semaphore(0);
        this.d = new AtomicReference();
    }

    @Override
    public final boolean hasNext() {
        if(this.b != null && this.b.isOnError()) {
            throw ExceptionHelper.wrapOrThrow(this.b.getError());
        }
        if(this.b == null) {
            try {
                BlockingHelper.verifyNonBlocking();
                this.c.acquire();
            }
            catch(InterruptedException interruptedException0) {
                this.dispose();
                this.b = Notification.createOnError(interruptedException0);
                throw ExceptionHelper.wrapOrThrow(interruptedException0);
            }
            Notification notification0 = (Notification)this.d.getAndSet(null);
            this.b = notification0;
            if(notification0.isOnError()) {
                throw ExceptionHelper.wrapOrThrow(notification0.getError());
            }
        }
        return this.b.isOnNext();
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = this.b.getValue();
        this.b = null;
        return object0;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.d.getAndSet(((Notification)object0)) == null) {
            this.c.release();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Read-only iterator.");
    }
}

