package androidx.core.app;

import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import androidx.annotation.DoNotInline;

public abstract class d2 {
    @DoNotInline
    public static Notification.Action.Builder a(Notification.Action.Builder notification$Action$Builder0, boolean z) {
        return notification$Action$Builder0.setAuthenticationRequired(z);
    }

    @DoNotInline
    public static Notification.Builder b(Notification.Builder notification$Builder0, int v) {
        return notification$Builder0.setForegroundServiceBehavior(v);
    }
}

