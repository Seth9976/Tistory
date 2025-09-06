package androidx.core.app;

import android.app.Notification.Builder;
import android.content.Context;
import androidx.annotation.DoNotInline;

public abstract class a2 {
    @DoNotInline
    public static Notification.Builder a(Context context0, String s) {
        return new Notification.Builder(context0, s);
    }

    @DoNotInline
    public static Notification.Builder b(Notification.Builder notification$Builder0, int v) {
        return notification$Builder0.setBadgeIconType(v);
    }

    @DoNotInline
    public static Notification.Builder c(Notification.Builder notification$Builder0, boolean z) {
        return notification$Builder0.setColorized(z);
    }

    @DoNotInline
    public static Notification.Builder d(Notification.Builder notification$Builder0, int v) {
        return notification$Builder0.setGroupAlertBehavior(v);
    }

    @DoNotInline
    public static Notification.Builder e(Notification.Builder notification$Builder0, CharSequence charSequence0) {
        return notification$Builder0.setSettingsText(charSequence0);
    }

    @DoNotInline
    public static Notification.Builder f(Notification.Builder notification$Builder0, String s) {
        return notification$Builder0.setShortcutId(s);
    }

    @DoNotInline
    public static Notification.Builder g(Notification.Builder notification$Builder0, long v) {
        return notification$Builder0.setTimeoutAfter(v);
    }
}

