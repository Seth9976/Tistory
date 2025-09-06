package io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;

public final class ScheduledDirectTask extends a implements Callable {
    public ScheduledDirectTask(Runnable runnable0) {
        super(runnable0);
    }

    @Override
    public Object call() throws Exception {
        return this.call();
    }

    public Void call() throws Exception {
        try {
            this.runner = Thread.currentThread();
            this.runnable.run();
            return null;
        }
        finally {
            this.lazySet(a.FINISHED);
            this.runner = null;
        }
    }

    @Override  // io.reactivex.schedulers.SchedulerRunnableIntrospection
    public Runnable getWrappedRunnable() {
        return this.runnable;
    }
}

