package androidx.core.app;

import android.app.Notification.Action.Builder;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import androidx.annotation.DoNotInline;

public abstract class t1 {
    @DoNotInline
    public static Notification.Action.Builder a(Icon icon0, CharSequence charSequence0, PendingIntent pendingIntent0) {
        return new Notification.Action.Builder(icon0, charSequence0, pendingIntent0);
    }
}

