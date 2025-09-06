package com.google.android.gms.common.api;

import androidx.annotation.NonNull;

public abstract class TransformedResult {
    public abstract void andFinally(@NonNull ResultCallbacks arg1);

    @NonNull
    public abstract TransformedResult then(@NonNull ResultTransform arg1);
}

