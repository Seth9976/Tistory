package androidx.core.app;

import android.app.Notification.Action.Builder;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;
import androidx.annotation.DoNotInline;

public abstract class w1 {
    @DoNotInline
    public static Notification.Builder a(Notification.Builder notification$Builder0, Notification.Action notification$Action0) {
        return notification$Builder0.addAction(notification$Action0);
    }

    @DoNotInline
    public static Notification.Action.Builder b(Notification.Action.Builder notification$Action$Builder0, Bundle bundle0) {
        return notification$Action$Builder0.addExtras(bundle0);
    }

    @DoNotInline
    public static Notification.Action.Builder c(Notification.Action.Builder notification$Action$Builder0, RemoteInput remoteInput0) {
        return notification$Action$Builder0.addRemoteInput(remoteInput0);
    }

    @DoNotInline
    public static Notification.Action d(Notification.Action.Builder notification$Action$Builder0) {
        return notification$Action$Builder0.build();
    }

    @DoNotInline
    public static Notification.Action.Builder e(int v, CharSequence charSequence0, PendingIntent pendingIntent0) {
        return new Notification.Action.Builder(v, charSequence0, pendingIntent0);
    }

    @DoNotInline
    public static String f(Notification notification0) {
        return notification0.getGroup();
    }

    @DoNotInline
    public static Notification.Builder g(Notification.Builder notification$Builder0, String s) {
        return notification$Builder0.setGroup(s);
    }

    @DoNotInline
    public static Notification.Builder h(Notification.Builder notification$Builder0, boolean z) {
        return notification$Builder0.setGroupSummary(z);
    }

    @DoNotInline
    public static Notification.Builder i(Notification.Builder notification$Builder0, boolean z) {
        return notification$Builder0.setLocalOnly(z);
    }

    @DoNotInline
    public static Notification.Builder j(Notification.Builder notification$Builder0, String s) {
        return notification$Builder0.setSortKey(s);
    }
}

