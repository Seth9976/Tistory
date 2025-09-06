package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class FutureSingleObserver extends CountDownLatch implements SingleObserver, Disposable, Future {
    public Object a;
    public Throwable b;
    public final AtomicReference c;

    public FutureSingleObserver() {
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

    @Override  // io.reactivex.SingleObserver
    public void onError(Throwable throwable0) {
        while(true) {
            AtomicReference atomicReference0 = this.c;
            Disposable disposable0 = (Disposable)atomicReference0.get();
            if(disposable0 == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(throwable0);
                return;
            }
            this.b = throwable0;
            do {
                if(atomicReference0.compareAndSet(disposable0, this)) {
                    this.countDown();
                    return;
                }
            }
            while(atomicReference0.get() == disposable0);
        }
    }

    @Override  // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this.c, disposable0);
    }

    @Override  // io.reactivex.SingleObserver
    public void onSuccess(Object object0) {
        AtomicReference atomicReference0 = this.c;
        Disposable disposable0 = (Disposable)atomicReference0.get();
        if(disposable0 == DisposableHelper.DISPOSED) {
            return;
        }
        this.a = object0;
        while(!atomicReference0.compareAndSet(disposable0, this) && atomicReference0.get() == disposable0) {
        }
        this.countDown();
    }
}

