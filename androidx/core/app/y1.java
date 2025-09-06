package androidx.core.app;

import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import androidx.annotation.DoNotInline;

public abstract class y1 {
    @DoNotInline
    public static Notification.Action.Builder a(Icon icon0, CharSequence charSequence0, PendingIntent pendingIntent0) {
        return new Notification.Action.Builder(icon0, charSequence0, pendingIntent0);
    }

    @DoNotInline
    public static Notification.Builder b(Notification.Builder notification$Builder0, Icon icon0) {
        return notification$Builder0.setLargeIcon(icon0);
    }

    @DoNotInline
    public static Notification.Builder c(Notification.Builder notification$Builder0, Object object0) {
        return notification$Builder0.setSmallIcon(((Icon)object0));
    }
}

