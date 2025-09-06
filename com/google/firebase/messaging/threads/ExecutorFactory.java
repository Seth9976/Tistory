package com.google.firebase.messaging.threads;

import com.google.errorprone.annotations.CompileTimeConstant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public interface ExecutorFactory {
    void executeOneOff(@CompileTimeConstant String arg1, @CompileTimeConstant String arg2, ThreadPriority arg3, Runnable arg4);

    ScheduledExecutorService newScheduledThreadPool(int arg1, ThreadPriority arg2);

    ScheduledExecutorService newScheduledThreadPool(int arg1, ThreadFactory arg2, ThreadPriority arg3);

    ExecutorService newSingleThreadExecutor(ThreadPriority arg1);

    ExecutorService newSingleThreadExecutor(ThreadFactory arg1, ThreadPriority arg2);

    ExecutorService newThreadPool(int arg1, ThreadPriority arg2);

    ExecutorService newThreadPool(int arg1, ThreadFactory arg2, ThreadPriority arg3);

    ExecutorService newThreadPool(ThreadPriority arg1);

    ExecutorService newThreadPool(ThreadFactory arg1, ThreadPriority arg2);

    Future submitOneOff(@CompileTimeConstant String arg1, @CompileTimeConstant String arg2, ThreadPriority arg3, Runnable arg4);
}

