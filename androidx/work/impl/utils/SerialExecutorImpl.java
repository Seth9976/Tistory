package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.o;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class SerialExecutorImpl implements SerialExecutor {
    public final ArrayDeque a;
    public final Executor b;
    public Runnable c;
    public final Object d;

    public SerialExecutorImpl(@NonNull Executor executor0) {
        this.b = executor0;
        this.a = new ArrayDeque();
        this.d = new Object();
    }

    public final void a() {
        Runnable runnable0 = (Runnable)this.a.poll();
        this.c = runnable0;
        if(runnable0 != null) {
            this.b.execute(runnable0);
        }
    }

    @Override
    public void execute(@NonNull Runnable runnable0) {
        synchronized(this.d) {
            o o0 = new o(9, this, runnable0);
            this.a.add(o0);
            if(this.c == null) {
                this.a();
            }
        }
    }

    @NonNull
    @VisibleForTesting
    public Executor getDelegatedExecutor() {
        return this.b;
    }

    @Override  // androidx.work.impl.utils.taskexecutor.SerialExecutor
    public boolean hasPendingTasks() {
        synchronized(this.d) {
        }
        return !this.a.isEmpty();
    }
}

