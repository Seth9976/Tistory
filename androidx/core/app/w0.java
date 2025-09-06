package androidx.core.app;

import android.app.Notification.Action;
import android.app.Notification.BubbleMetadata;
import android.app.Notification;
import android.app.RemoteInput;
import android.content.LocusId;
import androidx.annotation.DoNotInline;

public abstract class w0 {
    @DoNotInline
    public static boolean a(Notification notification0) {
        return notification0.getAllowSystemGeneratedContextualActions();
    }

    @DoNotInline
    public static Notification.BubbleMetadata b(Notification notification0) {
        return notification0.getBubbleMetadata();
    }

    @DoNotInline
    public static int c(RemoteInput remoteInput0) {
        return remoteInput0.getEditChoicesBeforeSending();
    }

    @DoNotInline
    public static LocusId d(Notification notification0) {
        return notification0.getLocusId();
    }

    @DoNotInline
    public static boolean e(Notification.Action notification$Action0) {
        return notification$Action0.isContextual();
    }
}

