package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

public class TaskCompletionSource {
    public final k a;

    public TaskCompletionSource() {
        this.a = new k();
    }

    public TaskCompletionSource(@NonNull CancellationToken cancellationToken0) {
        this.a = new k();
        cancellationToken0.onCanceledRequested(new b(this, 2));
    }

    @NonNull
    public Task getTask() {
        return this.a;
    }

    public void setException(@NonNull Exception exception0) {
        this.a.a(exception0);
    }

    public void setResult(@Nullable Object object0) {
        this.a.b(object0);
    }

    public boolean trySetException(@NonNull Exception exception0) {
        k k0 = this.a;
        k0.getClass();
        Preconditions.checkNotNull(exception0, "Exception must not be null");
        synchronized(k0.a) {
            if(k0.c) {
                return false;
            }
            k0.c = true;
            k0.f = exception0;
        }
        k0.b.b(k0);
        return true;
    }

    public boolean trySetResult(@Nullable Object object0) {
        return this.a.d(object0);
    }
}

