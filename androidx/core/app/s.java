package androidx.core.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import androidx.annotation.DoNotInline;

public abstract class s {
    @DoNotInline
    public static void a(AlarmManager alarmManager0, int v, long v1, PendingIntent pendingIntent0) {
        alarmManager0.setAndAllowWhileIdle(v, v1, pendingIntent0);
    }

    @DoNotInline
    public static void b(AlarmManager alarmManager0, int v, long v1, PendingIntent pendingIntent0) {
        alarmManager0.setExactAndAllowWhileIdle(v, v1, pendingIntent0);
    }
}

