package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import androidx.annotation.DoNotInline;

public abstract class w2 {
    @DoNotInline
    public static RemoteAction a(Icon icon0, CharSequence charSequence0, CharSequence charSequence1, PendingIntent pendingIntent0) {
        return new RemoteAction(icon0, charSequence0, charSequence1, pendingIntent0);
    }

    @DoNotInline
    public static PendingIntent b(RemoteAction remoteAction0) {
        return remoteAction0.getActionIntent();
    }

    @DoNotInline
    public static CharSequence c(RemoteAction remoteAction0) {
        return remoteAction0.getContentDescription();
    }

    @DoNotInline
    public static Icon d(RemoteAction remoteAction0) {
        return remoteAction0.getIcon();
    }

    @DoNotInline
    public static CharSequence e(RemoteAction remoteAction0) {
        return remoteAction0.getTitle();
    }

    @DoNotInline
    public static boolean f(RemoteAction remoteAction0) {
        return remoteAction0.isEnabled();
    }

    @DoNotInline
    public static void g(RemoteAction remoteAction0, boolean z) {
        remoteAction0.setEnabled(z);
    }
}

