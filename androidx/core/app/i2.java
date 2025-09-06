package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import androidx.annotation.DoNotInline;
import java.util.List;

public abstract class i2 {
    @DoNotInline
    public static void a(NotificationManager notificationManager0, NotificationChannel notificationChannel0) {
        notificationManager0.createNotificationChannel(notificationChannel0);
    }

    @DoNotInline
    public static void b(NotificationManager notificationManager0, NotificationChannelGroup notificationChannelGroup0) {
        notificationManager0.createNotificationChannelGroup(notificationChannelGroup0);
    }

    @DoNotInline
    public static void c(NotificationManager notificationManager0, List list0) {
        notificationManager0.createNotificationChannelGroups(list0);
    }

    @DoNotInline
    public static void d(NotificationManager notificationManager0, List list0) {
        notificationManager0.createNotificationChannels(list0);
    }

    @DoNotInline
    public static void e(NotificationManager notificationManager0, String s) {
        notificationManager0.deleteNotificationChannel(s);
    }

    @DoNotInline
    public static void f(NotificationManager notificationManager0, String s) {
        notificationManager0.deleteNotificationChannelGroup(s);
    }

    @DoNotInline
    public static String g(NotificationChannel notificationChannel0) {
        return notificationChannel0.getId();
    }

    @DoNotInline
    public static String h(NotificationChannelGroup notificationChannelGroup0) {
        return notificationChannelGroup0.getId();
    }

    @DoNotInline
    public static NotificationChannel i(NotificationManager notificationManager0, String s) {
        return notificationManager0.getNotificationChannel(s);
    }

    @DoNotInline
    public static List j(NotificationManager notificationManager0) {
        return notificationManager0.getNotificationChannelGroups();
    }

    @DoNotInline
    public static List k(NotificationManager notificationManager0) {
        return notificationManager0.getNotificationChannels();
    }
}

