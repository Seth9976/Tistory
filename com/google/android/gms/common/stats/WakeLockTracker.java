package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;

@KeepForSdk
@Deprecated
public class WakeLockTracker {
    public static final WakeLockTracker a;

    static {
        WakeLockTracker.a = new WakeLockTracker();
    }

    @NonNull
    @KeepForSdk
    public static WakeLockTracker getInstance() {
        return WakeLockTracker.a;
    }

    @KeepForSdk
    public void registerAcquireEvent(@NonNull Context context0, @NonNull Intent intent0, @NonNull String s, @NonNull String s1, @NonNull String s2, int v, @NonNull String s3) {
    }

    @KeepForSdk
    public void registerDeadlineEvent(@NonNull Context context0, @NonNull String s, @NonNull String s1, @NonNull String s2, int v, @NonNull List list0, boolean z, long v1) {
    }

    @KeepForSdk
    public void registerEvent(@NonNull Context context0, @NonNull String s, int v, @NonNull String s1, @NonNull String s2, @NonNull String s3, int v1, @NonNull List list0) {
    }

    @KeepForSdk
    public void registerEvent(@NonNull Context context0, @NonNull String s, int v, @NonNull String s1, @NonNull String s2, @NonNull String s3, int v1, @NonNull List list0, long v2) {
    }

    @KeepForSdk
    public void registerReleaseEvent(@NonNull Context context0, @NonNull Intent intent0) {
    }
}

