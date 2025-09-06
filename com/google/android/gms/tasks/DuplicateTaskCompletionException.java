package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

public final class DuplicateTaskCompletionException extends IllegalStateException {
    @NonNull
    public static IllegalStateException of(@NonNull Task task0) {
        if(!task0.isComplete()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception exception0 = task0.getException();
        if(exception0 != null) {
            return new DuplicateTaskCompletionException("Complete with: failure", exception0);  // 初始化器: Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        if(task0.isSuccessful()) {
            return new DuplicateTaskCompletionException("Complete with: " + ("result " + task0.getResult()), null);  // 初始化器: Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        return task0.isCanceled() ? new DuplicateTaskCompletionException("Complete with: cancellation", null) : new DuplicateTaskCompletionException("Complete with: unknown issue", null);  // 初始化器: Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V / 初始化器: Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    }
}

