package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ApiKey;

public interface HasApiKey {
    @NonNull
    @KeepForSdk
    ApiKey getApiKey();
}

