package com.google.android.datatransport.runtime;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class s implements Executor {
    public final ExecutorService a;

    public s(ExecutorService executorService0) {
        this.a = executorService0;
    }

    @Override
    public final void execute(Runnable runnable0) {
        q q0 = new q(runnable0);
        this.a.execute(q0);
    }
}

