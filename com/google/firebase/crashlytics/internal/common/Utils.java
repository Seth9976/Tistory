package com.google.firebase.crashlytics.internal.common;

import androidx.core.app.h;
import androidx.core.app.o;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Utils {
    public static final ExecutorService a;

    static {
        Utils.a = ExecutorUtils.buildSingleThreadExecutorService("awaitEvenIfOnMainThread task continuation executor");
    }

    public static Object awaitEvenIfOnMainThread(Task task0) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        h h0 = new h(countDownLatch0, 7);
        task0.continueWith(Utils.a, h0);
        countDownLatch0.await(4L, TimeUnit.SECONDS);
        if(task0.isSuccessful()) {
            return task0.getResult();
        }
        if(task0.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if(!task0.isComplete()) {
            throw new TimeoutException();
        }
        throw new IllegalStateException(task0.getException());
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch0, long v, TimeUnit timeUnit0) {
        boolean z1;
        try {
            boolean z = false;
            long v1 = timeUnit0.toNanos(v);
            long v2 = System.nanoTime() + v1;
            while(true) {
                try {
                    z1 = countDownLatch0.await(v1, TimeUnit.NANOSECONDS);
                    break;
                }
                catch(InterruptedException unused_ex) {
                    z = true;
                    v1 = v2 - System.nanoTime();
                }
            }
        }
        catch(Throwable throwable0) {
            if(z) {
                Thread.currentThread().interrupt();
            }
            throw throwable0;
        }
        if(z) {
            Thread.currentThread().interrupt();
        }
        return z1;
    }

    public static Task callTask(Executor executor0, Callable callable0) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        executor0.execute(new o(19, callable0, taskCompletionSource0));
        return taskCompletionSource0.getTask();
    }

    public static Task race(Task task0, Task task1) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        t t0 = new t(0, taskCompletionSource0);
        task0.continueWith(t0);
        task1.continueWith(t0);
        return taskCompletionSource0.getTask();
    }

    public static Task race(Executor executor0, Task task0, Task task1) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        t t0 = new t(1, taskCompletionSource0);
        task0.continueWith(executor0, t0);
        task1.continueWith(executor0, t0);
        return taskCompletionSource0.getTask();
    }
}

