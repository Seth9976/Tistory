package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ServiceCompat {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface StopForegroundFlags {
    }

    public static final int START_STICKY = 1;
    public static final int STOP_FOREGROUND_DETACH = 2;
    public static final int STOP_FOREGROUND_REMOVE = 1;

    public static void startForeground(@NonNull Service service0, int v, @NonNull Notification notification0, int v1) {
        int v2 = Build.VERSION.SDK_INT;
        if(v2 >= 34) {
            e3.a(service0, v, notification0, v1);
            return;
        }
        if(v2 >= 29) {
            d3.a(service0, v, notification0, v1);
            return;
        }
        service0.startForeground(v, notification0);
    }

    public static void stopForeground(@NonNull Service service0, int v) {
        c3.a(service0, v);
    }
}

