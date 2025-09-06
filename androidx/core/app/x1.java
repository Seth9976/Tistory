package androidx.core.app;

import android.app.Notification.Builder;
import android.app.Notification;
import android.media.AudioAttributes;
import android.net.Uri;
import androidx.annotation.DoNotInline;

public abstract class x1 {
    @DoNotInline
    public static Notification.Builder a(Notification.Builder notification$Builder0, String s) {
        return notification$Builder0.addPerson(s);
    }

    @DoNotInline
    public static Notification.Builder b(Notification.Builder notification$Builder0, String s) {
        return notification$Builder0.setCategory(s);
    }

    @DoNotInline
    public static Notification.Builder c(Notification.Builder notification$Builder0, int v) {
        return notification$Builder0.setColor(v);
    }

    @DoNotInline
    public static Notification.Builder d(Notification.Builder notification$Builder0, Notification notification0) {
        return notification$Builder0.setPublicVersion(notification0);
    }

    @DoNotInline
    public static Notification.Builder e(Notification.Builder notification$Builder0, Uri uri0, Object object0) {
        return notification$Builder0.setSound(uri0, ((AudioAttributes)object0));
    }

    @DoNotInline
    public static Notification.Builder f(Notification.Builder notification$Builder0, int v) {
        return notification$Builder0.setVisibility(v);
    }
}

