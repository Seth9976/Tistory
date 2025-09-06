package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.internal.zacp;

public abstract class ResultTransform {
    @NonNull
    public final PendingResult createFailedResult(@NonNull Status status0) {
        return new zacp(status0);
    }

    @NonNull
    public Status onFailure(@NonNull Status status0) [...] // Inlined contents

    @Nullable
    @WorkerThread
    public abstract PendingResult onSuccess(@NonNull Result arg1);
}

