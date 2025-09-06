package androidx.core.app;

import android.app.Notification.Builder;
import android.app.Notification;
import android.content.Context;
import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;

public abstract class e1 {
    @DoNotInline
    public static RemoteViews a(Notification.Builder notification$Builder0) {
        return notification$Builder0.createHeadsUpContentView();
    }

    @DoNotInline
    public static RemoteViews b(Notification.Builder notification$Builder0) {
        return notification$Builder0.createContentView();
    }

    @DoNotInline
    public static RemoteViews c(Notification.Builder notification$Builder0) {
        return notification$Builder0.createHeadsUpContentView();
    }

    @DoNotInline
    public static Notification.Builder d(Context context0, Notification notification0) {
        return Notification.Builder.recoverBuilder(context0, notification0);
    }
}

