package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class BlockingMultiObserver extends CountDownLatch implements CompletableObserver, MaybeObserver, SingleObserver {
    public Object a;
    public Throwable b;
    public Disposable c;
    public volatile boolean d;

    public BlockingMultiObserver() {
        super(1);
    }

    public final void a() {
        this.d = true;
        Disposable disposable0 = this.c;
        if(disposable0 != null) {
            disposable0.dispose();
        }
    }

    public boolean blockingAwait(long v, TimeUnit timeUnit0) {
        if(this.getCount() != 0L) {
            try {
                BlockingHelper.verifyNonBlocking();
                if(!this.await(v, timeUnit0)) {
                    this.a();
                    return false;
                }
            }
            catch(InterruptedException interruptedException0) {
                this.a();
                throw ExceptionHelper.wrapOrThrow(interruptedException0);
            }
        }
        Throwable throwable0 = this.b;
        if(throwable0 != null) {
            throw ExceptionHelper.wrapOrThrow(throwable0);
        }
        return true;
    }

    public Object blockingGet() {
        if(this.getCount() != 0L) {
            try {
                BlockingHelper.verifyNonBlocking();
                this.await();
            }
            catch(InterruptedException interruptedException0) {
                this.a();
                throw ExceptionHelper.wrapOrThrow(interruptedException0);
            }
        }
        Throwable throwable0 = this.b;
        if(throwable0 != null) {
            throw ExceptionHelper.wrapOrThrow(throwable0);
        }
        return this.a;
    }

    public Object blockingGet(Object object0) {
        if(this.getCount() != 0L) {
            try {
                BlockingHelper.verifyNonBlocking();
                this.await();
            }
            catch(InterruptedException interruptedException0) {
                this.a();
                throw ExceptionHelper.wrapOrThrow(interruptedException0);
            }
        }
        Throwable throwable0 = this.b;
        if(throwable0 != null) {
            throw ExceptionHelper.wrapOrThrow(throwable0);
        }
        return this.a == null ? object0 : this.a;
    }

    public Throwable blockingGetError() {
        if(this.getCount() != 0L) {
            try {
                BlockingHelper.verifyNonBlocking();
                this.await();
                return this.b;
            }
            catch(InterruptedException throwable0) {
                this.a();
                return throwable0;
            }
        }
        return this.b;
    }

    public Throwable blockingGetError(long v, TimeUnit timeUnit0) {
        if(this.getCount() == 0L) {
            return this.b;
        }
        else {
            try {
                BlockingHelper.verifyNonBlocking();
                if(!this.await(v, timeUnit0)) {
                    this.a();
                    throw ExceptionHelper.wrapOrThrow(new TimeoutException(ExceptionHelper.timeoutMessage(v, timeUnit0)));
                }
                return this.b;
            }
            catch(InterruptedException interruptedException0) {
            }
        }
        this.a();
        throw ExceptionHelper.wrapOrThrow(interruptedException0);
    }

    @Override  // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        this.countDown();
    }

    @Override  // io.reactivex.SingleObserver, io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onError(Throwable throwable0) {
        this.b = throwable0;
        this.countDown();
    }

    @Override  // io.reactivex.SingleObserver, io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onSubscribe(Disposable disposable0) {
        this.c = disposable0;
        if(this.d) {
            disposable0.dispose();
        }
    }

    @Override  // io.reactivex.SingleObserver, io.reactivex.MaybeObserver
    public void onSuccess(Object object0) {
        this.a = object0;
        this.countDown();
    }
}

