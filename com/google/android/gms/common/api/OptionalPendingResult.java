package com.google.android.gms.common.api;

import androidx.annotation.NonNull;

public abstract class OptionalPendingResult extends PendingResult {
    @NonNull
    public abstract Result get();

    public abstract boolean isDone();
}

