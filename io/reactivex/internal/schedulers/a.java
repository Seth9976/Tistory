package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

public abstract class a extends AtomicReference implements Disposable, SchedulerRunnableIntrospection {
    protected static final FutureTask DISPOSED;
    protected static final FutureTask FINISHED;
    protected final Runnable runnable;
    protected Thread runner;

    static {
        a.FINISHED = new FutureTask(Functions.EMPTY_RUNNABLE, null);
        a.DISPOSED = new FutureTask(Functions.EMPTY_RUNNABLE, null);
    }

    public a(Runnable runnable0) {
        this.runnable = runnable0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        Future future0 = (Future)this.get();
        if(future0 != a.FINISHED && (future0 != a.DISPOSED && this.compareAndSet(future0, a.DISPOSED) && future0 != null)) {
            future0.cancel(this.runner != Thread.currentThread());
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        Future future0 = (Future)this.get();
        return future0 == a.FINISHED || future0 == a.DISPOSED;
    }

    public final void setFuture(Future future0) {
        do {
            Future future1 = (Future)this.get();
            if(future1 == a.FINISHED) {
                break;
            }
            if(future1 == a.DISPOSED) {
                future0.cancel(this.runner != Thread.currentThread());
                return;
            }
        }
        while(!this.compareAndSet(future1, future0));
    }
}

