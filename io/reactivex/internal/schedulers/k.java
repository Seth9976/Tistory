package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

public final class k implements Disposable, Callable {
    public final Runnable a;
    public final AtomicReference b;
    public final AtomicReference c;
    public final ExecutorService d;
    public Thread e;
    public static final FutureTask f;

    static {
        k.f = new FutureTask(Functions.EMPTY_RUNNABLE, null);
    }

    public k(Runnable runnable0, ExecutorService executorService0) {
        this.a = runnable0;
        this.c = new AtomicReference();
        this.b = new AtomicReference();
        this.d = executorService0;
    }

    public final void a(Future future0) {
        while(true) {
            AtomicReference atomicReference0 = this.c;
            Future future1 = (Future)atomicReference0.get();
            if(future1 == k.f) {
                future0.cancel(this.e != Thread.currentThread());
                return;
            }
            do {
                if(atomicReference0.compareAndSet(future1, future0)) {
                    return;
                }
            }
            while(atomicReference0.get() == future1);
        }
    }

    @Override
    public final Object call() {
        try {
            this.e = Thread.currentThread();
            this.a.run();
            Future future0 = this.d.submit(this);
            while(true) {
                AtomicReference atomicReference0 = this.b;
                Future future1 = (Future)atomicReference0.get();
                if(future1 == k.f) {
                    future0.cancel(this.e != Thread.currentThread());
                    this.e = null;
                    return null;
                }
                do {
                    if(atomicReference0.compareAndSet(future1, future0)) {
                        this.e = null;
                        return null;
                    }
                }
                while(atomicReference0.get() == future1);
            }
        }
        catch(Throwable throwable0) {
        }
        this.e = null;
        RxJavaPlugins.onError(throwable0);
        return null;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        FutureTask futureTask0 = k.f;
        Future future0 = (Future)this.c.getAndSet(futureTask0);
        boolean z = false;
        if(future0 != null && future0 != futureTask0) {
            future0.cancel(this.e != Thread.currentThread());
        }
        Future future1 = (Future)this.b.getAndSet(futureTask0);
        if(future1 != null && future1 != futureTask0) {
            if(this.e != Thread.currentThread()) {
                z = true;
            }
            future1.cancel(z);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c.get() == k.f;
    }
}

