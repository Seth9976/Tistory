package io.reactivex.internal.schedulers;

import io.reactivex.plugins.RxJavaPlugins;

public final class ScheduledDirectPeriodicTask extends a implements Runnable {
    public ScheduledDirectPeriodicTask(Runnable runnable0) {
        super(runnable0);
    }

    @Override  // io.reactivex.schedulers.SchedulerRunnableIntrospection
    public Runnable getWrappedRunnable() {
        return this.runnable;
    }

    @Override
    public void run() {
        try {
            this.runner = Thread.currentThread();
            this.runnable.run();
            this.runner = null;
        }
        catch(Throwable throwable0) {
            this.runner = null;
            this.lazySet(a.FINISHED);
            RxJavaPlugins.onError(throwable0);
        }
    }
}

