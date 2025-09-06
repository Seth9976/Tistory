package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class ExecutorUtils {
    public static void a(String s, ExecutorService executorService0) {
        Runtime.getRuntime().addShutdownHook(new Thread(new r(s, executorService0, TimeUnit.SECONDS), "Crashlytics Shutdown Hook for " + s));
    }

    public static ExecutorService buildSingleThreadExecutorService(String s) {
        ThreadFactory threadFactory0 = ExecutorUtils.getNamedThreadFactory(s);
        ThreadPoolExecutor.DiscardPolicy threadPoolExecutor$DiscardPolicy0 = new ThreadPoolExecutor.DiscardPolicy();
        ExecutorService executorService0 = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory0, threadPoolExecutor$DiscardPolicy0));
        ExecutorUtils.a(s, executorService0);
        return executorService0;
    }

    public static ScheduledExecutorService buildSingleThreadScheduledExecutorService(String s) {
        ScheduledExecutorService scheduledExecutorService0 = Executors.newSingleThreadScheduledExecutor(ExecutorUtils.getNamedThreadFactory(s));
        ExecutorUtils.a(s, scheduledExecutorService0);
        return scheduledExecutorService0;
    }

    public static ThreadFactory getNamedThreadFactory(String s) {
        return new q(s, new AtomicLong(1L));
    }
}

