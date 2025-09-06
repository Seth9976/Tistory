package androidx.core.app;

import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;

public abstract class z1 {
    @DoNotInline
    public static Notification.Action.Builder a(Notification.Action.Builder notification$Action$Builder0, boolean z) {
        return notification$Action$Builder0.setAllowGeneratedReplies(z);
    }

    @DoNotInline
    public static Notification.Builder b(Notification.Builder notification$Builder0, RemoteViews remoteViews0) {
        return notification$Builder0.setCustomBigContentView(remoteViews0);
    }

    @DoNotInline
    public static Notification.Builder c(Notification.Builder notification$Builder0, RemoteViews remoteViews0) {
        return notification$Builder0.setCustomContentView(remoteViews0);
    }

    @DoNotInline
    public static Notification.Builder d(Notification.Builder notification$Builder0, RemoteViews remoteViews0) {
        return notification$Builder0.setCustomHeadsUpContentView(remoteViews0);
    }

    @DoNotInline
    public static Notification.Builder e(Notification.Builder notification$Builder0, CharSequence[] arr_charSequence) {
        return notification$Builder0.setRemoteInputHistory(arr_charSequence);
    }
}

