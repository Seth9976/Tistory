package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

@KeepForSdk
public class StatusPendingResult extends BasePendingResult {
    @Deprecated
    public StatusPendingResult(@NonNull Looper looper0) {
        super(looper0);
    }

    @KeepForSdk
    public StatusPendingResult(@NonNull GoogleApiClient googleApiClient0) {
        super(googleApiClient0);
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    @NonNull
    public final Result createFailedResult(@NonNull Status status0) {
        return status0;
    }
}

