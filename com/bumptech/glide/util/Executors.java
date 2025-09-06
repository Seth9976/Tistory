package com.bumptech.glide.util;

import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.n0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class Executors {
    public static final n0 a;
    public static final n0 b;

    static {
        Executors.a = new n0(2);
        Executors.b = new n0(3);
    }

    public static Executor directExecutor() {
        return Executors.b;
    }

    public static Executor mainThreadExecutor() {
        return Executors.a;
    }

    @VisibleForTesting
    public static void shutdownAndAwaitTermination(ExecutorService executorService0) {
        executorService0.shutdownNow();
        try {
            TimeUnit timeUnit0 = TimeUnit.SECONDS;
            if(!executorService0.awaitTermination(5L, timeUnit0)) {
                executorService0.shutdownNow();
                if(!executorService0.awaitTermination(5L, timeUnit0)) {
                    throw new RuntimeException("Failed to shutdown");
                }
            }
        }
        catch(InterruptedException interruptedException0) {
            executorService0.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(interruptedException0);
        }
    }
}

