package io.reactivex;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;

public final class b implements Disposable, SchedulerRunnableIntrospection, Runnable {
    public final Runnable a;
    public final Worker b;
    public volatile boolean c;

    public b(Runnable runnable0, Worker scheduler$Worker0) {
        this.a = runnable0;
        this.b = scheduler$Worker0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.c = true;
        this.b.dispose();
    }

    @Override  // io.reactivex.schedulers.SchedulerRunnableIntrospection
    public final Runnable getWrappedRunnable() {
        return this.a;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c;
    }

    @Override
    public final void run() {
        if(!this.c) {
            try {
                this.a.run();
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                this.b.dispose();
                throw ExceptionHelper.wrapOrThrow(throwable0);
            }
        }
    }
}

