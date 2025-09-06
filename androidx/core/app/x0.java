package androidx.core.app;

import android.app.Notification.Action;
import androidx.annotation.DoNotInline;

public abstract class x0 {
    @DoNotInline
    public static boolean a(Notification.Action notification$Action0) {
        return notification$Action0.isAuthenticationRequired();
    }
}

