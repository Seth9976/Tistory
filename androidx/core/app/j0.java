package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import androidx.annotation.DoNotInline;
import java.util.List;

public abstract class j0 {
    @DoNotInline
    public static NotificationChannelGroup a(String s, CharSequence charSequence0) {
        return new NotificationChannelGroup(s, charSequence0);
    }

    @DoNotInline
    public static List b(NotificationChannelGroup notificationChannelGroup0) {
        return notificationChannelGroup0.getChannels();
    }

    @DoNotInline
    public static String c(NotificationChannel notificationChannel0) {
        return notificationChannel0.getGroup();
    }

    @DoNotInline
    public static String d(NotificationChannelGroup notificationChannelGroup0) {
        return notificationChannelGroup0.getId();
    }

    @DoNotInline
    public static CharSequence e(NotificationChannelGroup notificationChannelGroup0) {
        return notificationChannelGroup0.getName();
    }
}

