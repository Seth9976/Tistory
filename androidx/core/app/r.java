package androidx.core.app;

import android.app.AlarmManager.AlarmClockInfo;
import android.app.AlarmManager;
import android.app.PendingIntent;
import androidx.annotation.DoNotInline;

public abstract class r {
    @DoNotInline
    public static AlarmManager.AlarmClockInfo a(long v, PendingIntent pendingIntent0) {
        return new AlarmManager.AlarmClockInfo(v, pendingIntent0);
    }

    @DoNotInline
    public static void b(AlarmManager alarmManager0, Object object0, PendingIntent pendingIntent0) {
        alarmManager0.setAlarmClock(((AlarmManager.AlarmClockInfo)object0), pendingIntent0);
    }
}

