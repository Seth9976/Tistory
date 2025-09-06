package com.google.firebase.crashlytics.internal.common;

import a7.c;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class CrashlyticsBackgroundWorker {
    public final Executor a;
    public Task b;
    public final Object c;
    public final ThreadLocal d;

    public CrashlyticsBackgroundWorker(Executor executor0) {
        this.b = Tasks.forResult(null);
        this.c = new Object();
        this.d = new ThreadLocal();
        this.a = executor0;
        executor0.execute(new e(this));
    }

    public void checkRunningOnThread() {
        Object object0 = this.d.get();
        if(!Boolean.TRUE.equals(object0)) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor getExecutor() {
        return this.a;
    }

    public Task submit(Callable callable0) {
        synchronized(this.c) {
            Task task0 = this.b;
            g g0 = new g(callable0, 1);
            Task task1 = task0.continueWith(this.a, g0);
            c c0 = new c(11);
            this.b = task1.continueWith(this.a, c0);
            return task1;
        }
    }

    public Task submitTask(Callable callable0) {
        synchronized(this.c) {
            Task task0 = this.b;
            g g0 = new g(callable0, 1);
            Task task1 = task0.continueWithTask(this.a, g0);
            c c0 = new c(11);
            this.b = task1.continueWith(this.a, c0);
            return task1;
        }
    }
}

