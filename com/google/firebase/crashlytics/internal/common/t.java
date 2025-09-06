package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

public final class t implements Continuation {
    public final int a;
    public final TaskCompletionSource b;

    public t(int v, TaskCompletionSource taskCompletionSource0) {
        this.a = v;
        this.b = taskCompletionSource0;
        super();
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        TaskCompletionSource taskCompletionSource0 = this.b;
        if(this.a != 0) {
            if(task0.isSuccessful()) {
                taskCompletionSource0.trySetResult(task0.getResult());
                return null;
            }
            Exception exception0 = task0.getException();
            Objects.requireNonNull(exception0);
            taskCompletionSource0.trySetException(exception0);
            return null;
        }
        if(task0.isSuccessful()) {
            taskCompletionSource0.trySetResult(task0.getResult());
            return null;
        }
        Exception exception1 = task0.getException();
        Objects.requireNonNull(exception1);
        taskCompletionSource0.trySetException(exception1);
        return null;
    }
}

