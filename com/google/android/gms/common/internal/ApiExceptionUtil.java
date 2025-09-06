package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

@KeepForSdk
public class ApiExceptionUtil {
    @NonNull
    @KeepForSdk
    public static ApiException fromStatus(@NonNull Status status0) {
        return status0.hasResolution() ? new ResolvableApiException(status0) : new ApiException(status0);
    }
}

