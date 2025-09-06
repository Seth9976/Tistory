package androidx.core.app;

import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;
import androidx.annotation.DoNotInline;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class g2 {
    @DoNotInline
    public static List a(NotificationManager notificationManager0) {
        StatusBarNotification[] arr_statusBarNotification = notificationManager0.getActiveNotifications();
        return arr_statusBarNotification == null ? new ArrayList() : Arrays.asList(arr_statusBarNotification);
    }

    @DoNotInline
    public static int b(NotificationManager notificationManager0) {
        return notificationManager0.getCurrentInterruptionFilter();
    }
}

