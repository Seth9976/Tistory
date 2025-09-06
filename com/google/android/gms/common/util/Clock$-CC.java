package com.google.android.gms.common.util;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

public final class Clock.-CC {
    @KeepForSdk
    public static long $default$currentThreadTimeMillis(@NonNull Clock clock0) {
        return SystemClock.currentThreadTimeMillis();
    }
}

