package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;

public abstract class BlockingBaseObserver extends CountDownLatch implements Observer, Disposable {
    public Object a;
    public Throwable b;
    public Disposable c;
    public volatile boolean d;

    public BlockingBaseObserver() {
        super(1);
    }

    public final Object blockingGet() {
        if(this.getCount() != 0L) {
            try {
                BlockingHelper.verifyNonBlocking();
                this.await();
            }
            catch(InterruptedException interruptedException0) {
                this.dispose();
                throw ExceptionHelper.wrapOrThrow(interruptedException0);
            }
        }
        Throwable throwable0 = this.b;
        if(throwable0 != null) {
            throw ExceptionHelper.wrapOrThrow(throwable0);
        }
        return this.a;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.d = true;
        Disposable disposable0 = this.c;
        if(disposable0 != null) {
            disposable0.dispose();
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.d;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.countDown();
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        this.c = disposable0;
        if(this.d) {
            disposable0.dispose();
        }
    }
}

