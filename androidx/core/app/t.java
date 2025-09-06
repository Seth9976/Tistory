package androidx.core.app;

import android.app.AlarmManager;
import androidx.annotation.DoNotInline;

public abstract class t {
    @DoNotInline
    public static boolean a(AlarmManager alarmManager0) {
        return alarmManager0.canScheduleExactAlarms();
    }
}

