package androidx.core.app;

import android.app.Notification.Action;
import android.app.Notification;
import android.app.RemoteInput;
import android.os.Bundle;
import androidx.annotation.DoNotInline;

public abstract class r0 {
    @DoNotInline
    public static boolean a(RemoteInput remoteInput0) {
        return remoteInput0.getAllowFreeFormInput();
    }

    @DoNotInline
    public static CharSequence[] b(RemoteInput remoteInput0) {
        return remoteInput0.getChoices();
    }

    @DoNotInline
    public static Bundle c(Notification.Action notification$Action0) {
        return notification$Action0.getExtras();
    }

    @DoNotInline
    public static Bundle d(RemoteInput remoteInput0) {
        return remoteInput0.getExtras();
    }

    @DoNotInline
    public static String e(Notification notification0) {
        return notification0.getGroup();
    }

    @DoNotInline
    public static CharSequence f(RemoteInput remoteInput0) {
        return remoteInput0.getLabel();
    }

    @DoNotInline
    public static RemoteInput[] g(Notification.Action notification$Action0) {
        return notification$Action0.getRemoteInputs();
    }

    @DoNotInline
    public static String h(RemoteInput remoteInput0) {
        return remoteInput0.getResultKey();
    }

    @DoNotInline
    public static String i(Notification notification0) {
        return notification0.getSortKey();
    }
}

