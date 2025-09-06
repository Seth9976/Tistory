package androidx.core.app;

import android.app.NotificationChannel;
import androidx.annotation.DoNotInline;

public abstract class i0 {
    @DoNotInline
    public static String a(NotificationChannel notificationChannel0) {
        return notificationChannel0.getConversationId();
    }

    @DoNotInline
    public static String b(NotificationChannel notificationChannel0) {
        return notificationChannel0.getParentChannelId();
    }

    @DoNotInline
    public static boolean c(NotificationChannel notificationChannel0) {
        return notificationChannel0.isImportantConversation();
    }

    @DoNotInline
    public static void d(NotificationChannel notificationChannel0, String s, String s1) {
        notificationChannel0.setConversationId(s, s1);
    }
}

