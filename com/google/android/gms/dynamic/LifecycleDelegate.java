package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public interface LifecycleDelegate {
    @KeepForSdk
    void onCreate(@Nullable Bundle arg1);

    @NonNull
    @KeepForSdk
    View onCreateView(@NonNull LayoutInflater arg1, @Nullable ViewGroup arg2, @Nullable Bundle arg3);

    @KeepForSdk
    void onDestroy();

    @KeepForSdk
    void onDestroyView();

    @KeepForSdk
    void onInflate(@NonNull Activity arg1, @NonNull Bundle arg2, @Nullable Bundle arg3);

    @KeepForSdk
    void onLowMemory();

    @KeepForSdk
    void onPause();

    @KeepForSdk
    void onResume();

    @KeepForSdk
    void onSaveInstanceState(@NonNull Bundle arg1);

    @KeepForSdk
    void onStart();

    @KeepForSdk
    void onStop();
}

