package io.reactivex;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.schedulers.NewThreadWorker;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;

public final class a implements Disposable, SchedulerRunnableIntrospection, Runnable {
    public final Runnable a;
    public final Worker b;
    public Thread c;

    public a(Runnable runnable0, Worker scheduler$Worker0) {
        this.a = runnable0;
        this.b = scheduler$Worker0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        Worker scheduler$Worker0 = this.b;
        if(this.c == Thread.currentThread() && scheduler$Worker0 instanceof NewThreadWorker) {
            ((NewThreadWorker)scheduler$Worker0).shutdown();
            return;
        }
        scheduler$Worker0.dispose();
    }

    @Override  // io.reactivex.schedulers.SchedulerRunnableIntrospection
    public final Runnable getWrappedRunnable() {
        return this.a;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.b.isDisposed();
    }

    @Override
    public final void run() {
        try {
            this.c = Thread.currentThread();
            this.a.run();
        }
        finally {
            this.dispose();
            this.c = null;
        }
    }
}

