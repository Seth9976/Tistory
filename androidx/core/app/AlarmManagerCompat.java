package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;

public final class AlarmManagerCompat {
    public static boolean canScheduleExactAlarms(@NonNull AlarmManager alarmManager0) {
        return Build.VERSION.SDK_INT < 0x1F ? true : t.a(alarmManager0);
    }

    @SuppressLint({"MissingPermission"})
    public static void setAlarmClock(@NonNull AlarmManager alarmManager0, long v, @NonNull PendingIntent pendingIntent0, @NonNull PendingIntent pendingIntent1) {
        r.b(alarmManager0, r.a(v, pendingIntent0), pendingIntent1);
    }

    public static void setAndAllowWhileIdle(@NonNull AlarmManager alarmManager0, int v, long v1, @NonNull PendingIntent pendingIntent0) {
        s.a(alarmManager0, v, v1, pendingIntent0);
    }

    public static void setExact(@NonNull AlarmManager alarmManager0, int v, long v1, @NonNull PendingIntent pendingIntent0) {
        alarmManager0.setExact(v, v1, pendingIntent0);
    }

    public static void setExactAndAllowWhileIdle(@NonNull AlarmManager alarmManager0, int v, long v1, @NonNull PendingIntent pendingIntent0) {
        s.b(alarmManager0, v, v1, pendingIntent0);
    }
}

