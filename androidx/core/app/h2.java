package androidx.core.app;

import android.app.NotificationManager;
import androidx.annotation.DoNotInline;

public abstract class h2 {
    @DoNotInline
    public static boolean a(NotificationManager notificationManager0) {
        return notificationManager0.areNotificationsEnabled();
    }

    @DoNotInline
    public static int b(NotificationManager notificationManager0) {
        return notificationManager0.getImportance();
    }
}

