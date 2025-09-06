package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import androidx.annotation.DoNotInline;

public abstract class a {
    @DoNotInline
    public static void a(AlarmManager alarmManager0, int v, long v1, PendingIntent pendingIntent0) {
        alarmManager0.setExact(v, v1, pendingIntent0);
    }
}

