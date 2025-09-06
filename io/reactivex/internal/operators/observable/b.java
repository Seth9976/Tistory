package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public final class b extends AtomicReference implements Observer, Disposable, Iterator {
    public final SpscLinkedArrayQueue a;
    public final ReentrantLock b;
    public final Condition c;
    public volatile boolean d;
    public volatile Throwable e;

    public b(int v) {
        this.a = new SpscLinkedArrayQueue(v);
        ReentrantLock reentrantLock0 = new ReentrantLock();
        this.b = reentrantLock0;
        this.c = reentrantLock0.newCondition();
    }

    public final void a() {
        this.b.lock();
        try {
            this.c.signalAll();
        }
        finally {
            this.b.unlock();
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
        this.a();
    }

    @Override
    public final boolean hasNext() {
        while(true) {
            if(this.isDisposed()) {
                Throwable throwable0 = this.e;
                if(throwable0 != null) {
                    throw ExceptionHelper.wrapOrThrow(throwable0);
                }
                return false;
            }
            boolean z = this.d;
            boolean z1 = this.a.isEmpty();
            if(z) {
                Throwable throwable1 = this.e;
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
            try {
                BlockingHelper.verifyNonBlocking();
                this.b.lock();
                try {
                    while(!this.d && this.a.isEmpty() && !this.isDisposed()) {
                        this.c.await();
                    }
                }
                finally {
                    this.b.unlock();
                }
                continue;
            }
            catch(InterruptedException interruptedException0) {
            }
            DisposableHelper.dispose(this);
            this.a();
            throw ExceptionHelper.wrapOrThrow(interruptedException0);
        }
        return true;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return this.a.poll();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.d = true;
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.e = throwable0;
        this.d = true;
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        this.a.offer(object0);
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}

