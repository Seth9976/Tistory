package androidx.core.app;

import android.app.Notification.Action.Builder;
import android.app.Notification.BubbleMetadata;
import android.app.Notification.Builder;
import android.content.LocusId;
import androidx.annotation.DoNotInline;

public abstract class c2 {
    @DoNotInline
    public static Notification.Builder a(Notification.Builder notification$Builder0, boolean z) {
        return notification$Builder0.setAllowSystemGeneratedContextualActions(z);
    }

    @DoNotInline
    public static Notification.Builder b(Notification.Builder notification$Builder0, Notification.BubbleMetadata notification$BubbleMetadata0) {
        return notification$Builder0.setBubbleMetadata(notification$BubbleMetadata0);
    }

    @DoNotInline
    public static Notification.Action.Builder c(Notification.Action.Builder notification$Action$Builder0, boolean z) {
        return notification$Action$Builder0.setContextual(z);
    }

    @DoNotInline
    public static Notification.Builder d(Notification.Builder notification$Builder0, Object object0) {
        return notification$Builder0.setLocusId(((LocusId)object0));
    }
}

