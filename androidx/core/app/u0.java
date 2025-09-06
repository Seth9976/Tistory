package androidx.core.app;

import android.app.Notification;
import androidx.annotation.DoNotInline;

public abstract class u0 {
    @DoNotInline
    public static int a(Notification notification0) {
        return notification0.getBadgeIconType();
    }

    @DoNotInline
    public static String b(Notification notification0) {
        return notification0.getChannelId();
    }

    @DoNotInline
    public static int c(Notification notification0) {
        return notification0.getGroupAlertBehavior();
    }

    @DoNotInline
    public static CharSequence d(Notification notification0) {
        return notification0.getSettingsText();
    }

    @DoNotInline
    public static String e(Notification notification0) {
        return notification0.getShortcutId();
    }

    @DoNotInline
    public static long f(Notification notification0) {
        return notification0.getTimeoutAfter();
    }
}

