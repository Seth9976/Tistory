package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;

public interface ConnectivityMonitorFactory {
    @NonNull
    ConnectivityMonitor build(@NonNull Context arg1, @NonNull ConnectivityListener arg2);
}

