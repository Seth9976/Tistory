package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import androidx.annotation.DoNotInline;

public abstract class k2 {
    @DoNotInline
    public static NotificationChannel a(NotificationManager notificationManager0, String s, String s1) {
        return notificationManager0.getNotificationChannel(s, s1);
    }

    @DoNotInline
    public static String b(NotificationChannel notificationChannel0) {
        return notificationChannel0.getParentChannelId();
    }
}

