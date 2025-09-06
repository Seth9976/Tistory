package androidx.core.app;

import android.app.ActivityManager;
import androidx.annotation.NonNull;

public final class ActivityManagerCompat {
    public static boolean isLowRamDevice(@NonNull ActivityManager activityManager0) {
        return activityManager0.isLowRamDevice();
    }
}

