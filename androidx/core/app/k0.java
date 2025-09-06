package androidx.core.app;

import android.app.NotificationChannelGroup;
import androidx.annotation.DoNotInline;

public abstract class k0 {
    @DoNotInline
    public static String a(NotificationChannelGroup notificationChannelGroup0) {
        return notificationChannelGroup0.getDescription();
    }

    @DoNotInline
    public static boolean b(NotificationChannelGroup notificationChannelGroup0) {
        return notificationChannelGroup0.isBlocked();
    }

    @DoNotInline
    public static void c(NotificationChannelGroup notificationChannelGroup0, String s) {
        notificationChannelGroup0.setDescription(s);
    }
}

