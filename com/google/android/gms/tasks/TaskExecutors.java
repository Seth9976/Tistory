package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.n0;
import java.util.concurrent.Executor;

public final class TaskExecutors {
    @NonNull
    public static final Executor MAIN_THREAD;
    public static final n0 a;

    static {
        TaskExecutors.MAIN_THREAD = new i();
        TaskExecutors.a = new n0(1);
    }
}

