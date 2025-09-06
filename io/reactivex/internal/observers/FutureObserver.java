package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
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

public final class FutureObserver extends CountDownLatch implements Observer, Disposable, Future {
    public Object a;
    public Throwable b;
    public final AtomicReference c;

    public FutureObserver() {
        super(1);
        this.c = new AtomicReference();
    }

    @Override
    public boolean cancel(boolean z) {
        while(true) {
            AtomicReference atomicReference0 = this.c;
            Disposable disposable0 = (Disposable)atomicReference0.get();
            if(disposable0 == this) {
                break;
            }
            DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
            if(disposable0 == disposableHelper0) {
                break;
            }
            do {
                if(atomicReference0.compareAndSet(disposable0, disposableHelper0)) {
                    if(disposable0 != null) {
                        disposable0.dispose();
                    }
                    this.countDown();
                    return true;
                }
            }
            while(atomicReference0.get() == disposable0);
        }
        return false;
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
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
        return DisposableHelper.isDisposed(((Disposable)this.c.get()));
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.isDone();
    }

    @Override
    public boolean isDone() {
        return this.getCount() == 0L;
    }

    @Override  // io.reactivex.Observer
    public void onComplete() {
        if(this.a == null) {
            this.onError(new NoSuchElementException("The source is empty"));
            return;
        }
        while(true) {
            AtomicReference atomicReference0 = this.c;
            Disposable disposable0 = (Disposable)atomicReference0.get();
            if(disposable0 == this || disposable0 == DisposableHelper.DISPOSED) {
                break;
            }
            do {
                if(atomicReference0.compareAndSet(disposable0, this)) {
                    this.countDown();
                    return;
                }
            }
            while(atomicReference0.get() == disposable0);
        }
    }

    @Override  // io.reactivex.Observer
    public void onError(Throwable throwable0) {
        if(this.b == null) {
            this.b = throwable0;
            while(true) {
                AtomicReference atomicReference0 = this.c;
                Disposable disposable0 = (Disposable)atomicReference0.get();
                if(disposable0 == this || disposable0 == DisposableHelper.DISPOSED) {
                    break;
                }
                do {
                    if(atomicReference0.compareAndSet(disposable0, this)) {
                        this.countDown();
                        return;
                    }
                }
                while(atomicReference0.get() == disposable0);
            }
            RxJavaPlugins.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public void onNext(Object object0) {
        if(this.a != null) {
            ((Disposable)this.c.get()).dispose();
            this.onError(new IndexOutOfBoundsException("More than one element received"));
            return;
        }
        this.a = object0;
    }

    @Override  // io.reactivex.Observer
    public void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this.c, disposable0);
    }
}

