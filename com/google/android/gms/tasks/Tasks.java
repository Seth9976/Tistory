package com.google.android.gms.tasks;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.o;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.tasks.zza;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Tasks {
    public static Object a(Task task0) {
        if(task0.isSuccessful()) {
            return task0.getResult();
        }
        if(!task0.isCanceled()) {
            throw new ExecutionException(task0.getException());
        }
        throw new CancellationException("Task is already canceled");
    }

    public static Object await(@NonNull Task task0) throws ExecutionException, InterruptedException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(task0, "Task must not be null");
        if(task0.isComplete()) {
            return Tasks.a(task0);
        }
        b b0 = new b();
        task0.addOnSuccessListener(TaskExecutors.a, b0);
        task0.addOnFailureListener(TaskExecutors.a, b0);
        task0.addOnCanceledListener(TaskExecutors.a, b0);
        ((CountDownLatch)b0.b).await();
        return Tasks.a(task0);
    }

    public static Object await(@NonNull Task task0, long v, @NonNull TimeUnit timeUnit0) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(task0, "Task must not be null");
        Preconditions.checkNotNull(timeUnit0, "TimeUnit must not be null");
        if(task0.isComplete()) {
            return Tasks.a(task0);
        }
        b b0 = new b();
        task0.addOnSuccessListener(TaskExecutors.a, b0);
        task0.addOnFailureListener(TaskExecutors.a, b0);
        task0.addOnCanceledListener(TaskExecutors.a, b0);
        if(!((CountDownLatch)b0.b).await(v, timeUnit0)) {
            throw new TimeoutException("Timed out waiting for Task");
        }
        return Tasks.a(task0);
    }

    @NonNull
    @Deprecated
    public static Task call(@NonNull Callable callable0) {
        return Tasks.call(TaskExecutors.MAIN_THREAD, callable0);
    }

    @NonNull
    @Deprecated
    public static Task call(@NonNull Executor executor0, @NonNull Callable callable0) {
        Preconditions.checkNotNull(executor0, "Executor must not be null");
        Preconditions.checkNotNull(callable0, "Callback must not be null");
        Task task0 = new k();
        executor0.execute(new o(17, task0, callable0));
        return task0;
    }

    @NonNull
    public static Task forCanceled() {
        Task task0 = new k();
        ((k)task0).c();
        return task0;
    }

    @NonNull
    public static Task forException(@NonNull Exception exception0) {
        Task task0 = new k();
        ((k)task0).a(exception0);
        return task0;
    }

    @NonNull
    public static Task forResult(Object object0) {
        Task task0 = new k();
        ((k)task0).b(object0);
        return task0;
    }

    @NonNull
    public static Task whenAll(@Nullable Collection collection0) {
        if(collection0 != null && !collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(((Task)object0) == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
                if(false) {
                    break;
                }
            }
            Task task0 = new k();
            c c0 = new c(collection0.size(), ((k)task0));
            for(Object object1: collection0) {
                ((Task)object1).addOnSuccessListener(TaskExecutors.a, c0);
                ((Task)object1).addOnFailureListener(TaskExecutors.a, c0);
                ((Task)object1).addOnCanceledListener(TaskExecutors.a, c0);
            }
            return task0;
        }
        return Tasks.forResult(null);
    }

    @NonNull
    public static Task whenAll(@Nullable Task[] arr_task) {
        return arr_task == null || arr_task.length == 0 ? Tasks.forResult(null) : Tasks.whenAll(Arrays.asList(arr_task));
    }

    @NonNull
    public static Task whenAllComplete(@Nullable Collection collection0) {
        if(collection0 != null && !collection0.isEmpty()) {
            Task task0 = Tasks.whenAll(collection0);
            a a0 = new a(collection0, 1);
            return task0.continueWithTask(TaskExecutors.MAIN_THREAD, a0);
        }
        return Tasks.forResult(Collections.emptyList());
    }

    @NonNull
    public static Task whenAllComplete(@Nullable Task[] arr_task) {
        return arr_task == null || arr_task.length == 0 ? Tasks.forResult(Collections.emptyList()) : Tasks.whenAllComplete(Arrays.asList(arr_task));
    }

    @NonNull
    public static Task whenAllSuccess(@Nullable Collection collection0) {
        if(collection0 != null && !collection0.isEmpty()) {
            Task task0 = Tasks.whenAll(collection0);
            a a0 = new a(collection0, 0);
            return task0.continueWith(TaskExecutors.MAIN_THREAD, a0);
        }
        return Tasks.forResult(Collections.emptyList());
    }

    @NonNull
    public static Task whenAllSuccess(@Nullable Task[] arr_task) {
        return arr_task == null || arr_task.length == 0 ? Tasks.forResult(Collections.emptyList()) : Tasks.whenAllSuccess(Arrays.asList(arr_task));
    }

    @NonNull
    public static Task withTimeout(@NonNull Task task0, long v, @NonNull TimeUnit timeUnit0) {
        Preconditions.checkNotNull(task0, "Task must not be null");
        Preconditions.checkArgument(v > 0L, "Timeout must be positive");
        Preconditions.checkNotNull(timeUnit0, "TimeUnit must not be null");
        d d0 = new d();
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource(d0);
        zza zza0 = new zza(Looper.getMainLooper());
        zza0.postDelayed(new zzx(taskCompletionSource0), timeUnit0.toMillis(v));
        task0.addOnCompleteListener(new zzy(zza0, taskCompletionSource0, d0));
        return taskCompletionSource0.getTask();
    }
}

