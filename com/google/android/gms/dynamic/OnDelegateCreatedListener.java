package com.google.android.gms.dynamic;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public interface OnDelegateCreatedListener {
    @KeepForSdk
    void onDelegateCreated(@NonNull LifecycleDelegate arg1);
}

