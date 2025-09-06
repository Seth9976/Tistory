package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public interface LifecycleFragment {
    @KeepForSdk
    void addCallback(@NonNull String arg1, @NonNull LifecycleCallback arg2);

    @Nullable
    @KeepForSdk
    LifecycleCallback getCallbackOrNull(@NonNull String arg1, @NonNull Class arg2);

    @Nullable
    @KeepForSdk
    Activity getLifecycleActivity();

    @KeepForSdk
    boolean isCreated();

    @KeepForSdk
    boolean isStarted();

    @KeepForSdk
    void startActivityForResult(@NonNull Intent arg1, int arg2);
}

