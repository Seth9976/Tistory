package androidx.core.app;

import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Parcelable;
import androidx.annotation.DoNotInline;

public abstract class g1 {
    @DoNotInline
    public static Parcelable a(Icon icon0) {
        return icon0;
    }

    @DoNotInline
    public static Notification.Action.Builder b(Icon icon0, CharSequence charSequence0, PendingIntent pendingIntent0) {
        return new Notification.Action.Builder(icon0, charSequence0, pendingIntent0);
    }

    @DoNotInline
    public static void c(Notification.Builder notification$Builder0, Icon icon0) {
        notification$Builder0.setLargeIcon(icon0);
    }
}

