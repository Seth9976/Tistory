package androidx.core.app;

import android.app.Notification.Action.Builder;
import androidx.annotation.DoNotInline;

public abstract class v1 {
    @DoNotInline
    public static Notification.Action.Builder a(Notification.Action.Builder notification$Action$Builder0, boolean z) {
        return notification$Action$Builder0.setAuthenticationRequired(z);
    }
}

