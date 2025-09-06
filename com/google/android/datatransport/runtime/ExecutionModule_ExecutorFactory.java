package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class ExecutionModule_ExecutorFactory implements Factory {
    public static ExecutionModule_ExecutorFactory create() {
        return p.a;
    }

    public static Executor executor() {
        return (Executor)Preconditions.checkNotNull(new s(Executors.newSingleThreadExecutor()), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public Executor get() {
        return ExecutionModule_ExecutorFactory.executor();
    }
}

