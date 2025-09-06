package com.google.android.gms.common.api;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

public final class PendingResults {
    @NonNull
    public static PendingResult canceledPendingResult() {
        PendingResult pendingResult0 = new StatusPendingResult(Looper.getMainLooper());
        ((BasePendingResult)pendingResult0).cancel();
        return pendingResult0;
    }

    @NonNull
    public static PendingResult canceledPendingResult(@NonNull Result result0) {
        Preconditions.checkNotNull(result0, "Result must not be null");
        Preconditions.checkArgument(result0.getStatus().getStatusCode() == 16, "Status code must be CommonStatusCodes.CANCELED");
        PendingResult pendingResult0 = new b(result0);
        ((BasePendingResult)pendingResult0).cancel();
        return pendingResult0;
    }

    @NonNull
    @KeepForSdk
    public static PendingResult immediateFailedResult(@NonNull Result result0, @NonNull GoogleApiClient googleApiClient0) {
        Preconditions.checkNotNull(result0, "Result must not be null");
        Preconditions.checkArgument(!result0.getStatus().isSuccess(), "Status code must not be SUCCESS");
        PendingResult pendingResult0 = new b(result0, googleApiClient0);
        ((BasePendingResult)pendingResult0).setResult(result0);
        return pendingResult0;
    }

    @NonNull
    @KeepForSdk
    public static OptionalPendingResult immediatePendingResult(@NonNull Result result0) {
        Preconditions.checkNotNull(result0, "Result must not be null");
        c c0 = new c(null);  // 初始化器: Lcom/google/android/gms/common/api/internal/BasePendingResult;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V
        c0.setResult(result0);
        return new OptionalPendingResultImpl(c0);
    }

    @NonNull
    @KeepForSdk
    public static OptionalPendingResult immediatePendingResult(@NonNull Result result0, @NonNull GoogleApiClient googleApiClient0) {
        Preconditions.checkNotNull(result0, "Result must not be null");
        c c0 = new c(googleApiClient0);  // 初始化器: Lcom/google/android/gms/common/api/internal/BasePendingResult;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V
        c0.setResult(result0);
        return new OptionalPendingResultImpl(c0);
    }

    @NonNull
    @KeepForSdk
    public static PendingResult immediatePendingResult(@NonNull Status status0) {
        Preconditions.checkNotNull(status0, "Result must not be null");
        PendingResult pendingResult0 = new StatusPendingResult(Looper.getMainLooper());
        ((BasePendingResult)pendingResult0).setResult(status0);
        return pendingResult0;
    }

    @NonNull
    @KeepForSdk
    public static PendingResult immediatePendingResult(@NonNull Status status0, @NonNull GoogleApiClient googleApiClient0) {
        Preconditions.checkNotNull(status0, "Result must not be null");
        PendingResult pendingResult0 = new StatusPendingResult(googleApiClient0);
        ((BasePendingResult)pendingResult0).setResult(status0);
        return pendingResult0;
    }
}

