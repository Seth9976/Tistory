package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;

public final class i implements Runnable {
    public final SequentialDisposable a;
    public final Runnable b;
    public final ExecutorWorker c;

    public i(ExecutorWorker executorScheduler$ExecutorWorker0, SequentialDisposable sequentialDisposable0, Runnable runnable0) {
        this.c = executorScheduler$ExecutorWorker0;
        this.a = sequentialDisposable0;
        this.b = runnable0;
    }

    @Override
    public final void run() {
        Disposable disposable0 = this.c.schedule(this.b);
        this.a.replace(disposable0);
    }
}

