package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ApiException extends Exception {
    @NonNull
    @Deprecated
    protected final Status mStatus;

    public ApiException(@NonNull Status status0) {
        super(status0.getStatusCode() + ": " + (status0.getStatusMessage() == null ? "" : status0.getStatusMessage()));
        this.mStatus = status0;
    }

    @NonNull
    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.getStatusCode();
    }

    @Nullable
    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.getStatusMessage();
    }
}

