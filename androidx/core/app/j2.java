package androidx.core.app;

import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import androidx.annotation.DoNotInline;

public abstract class j2 {
    @DoNotInline
    public static NotificationChannelGroup a(NotificationManager notificationManager0, String s) {
        return notificationManager0.getNotificationChannelGroup(s);
    }
}

