package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import java.util.concurrent.atomic.AtomicReference;

public final class f extends AtomicReference implements Disposable, SchedulerRunnableIntrospection, Runnable {
    public final SequentialDisposable a;
    public final SequentialDisposable b;

    public f(Runnable runnable0) {
        super(runnable0);
        this.a = new SequentialDisposable();
        this.b = new SequentialDisposable();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.getAndSet(null) != null) {
            this.a.dispose();
            this.b.dispose();
        }
    }

    @Override  // io.reactivex.schedulers.SchedulerRunnableIntrospection
    public final Runnable getWrappedRunnable() {
        Runnable runnable0 = (Runnable)this.get();
        return runnable0 == null ? Functions.EMPTY_RUNNABLE : runnable0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() == null;
    }

    @Override
    public final void run() {
        SequentialDisposable sequentialDisposable0 = this.b;
        SequentialDisposable sequentialDisposable1 = this.a;
        Runnable runnable0 = (Runnable)this.get();
        if(runnable0 != null) {
            try {
                runnable0.run();
            }
            finally {
                this.lazySet(null);
                sequentialDisposable1.lazySet(DisposableHelper.DISPOSED);
                sequentialDisposable0.lazySet(DisposableHelper.DISPOSED);
            }
        }
    }
}

