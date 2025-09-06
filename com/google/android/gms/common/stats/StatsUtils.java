package com.google.android.gms.common.stats;

import android.os.PowerManager.WakeLock;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
@Deprecated
public class StatsUtils {
    @NonNull
    @KeepForSdk
    public static String getEventKey(@NonNull PowerManager.WakeLock powerManager$WakeLock0, @NonNull String s) {
        String s1 = String.valueOf(((long)Process.myPid()) << 0x20 | ((long)System.identityHashCode(powerManager$WakeLock0)));
        if(TextUtils.isEmpty(s)) {
            s = "";
        }
        return s1 + s;
    }
}

