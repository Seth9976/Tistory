package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;

@KeepForSdk
public class StatusCallback extends Stub {
    public final ResultHolder a;

    @KeepForSdk
    public StatusCallback(@NonNull ResultHolder baseImplementation$ResultHolder0) {
        this.a = baseImplementation$ResultHolder0;
    }

    @Override  // com.google.android.gms.common.api.internal.IStatusCallback
    @KeepForSdk
    public void onResult(@NonNull Status status0) {
        this.a.setResult(status0);
    }
}

