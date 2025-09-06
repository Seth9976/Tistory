package androidx.core.app;

import android.app.Notification.Action;
import android.graphics.drawable.Icon;
import androidx.annotation.DoNotInline;

public abstract class s0 {
    @DoNotInline
    public static Icon a(Notification.Action notification$Action0) {
        return notification$Action0.getIcon();
    }
}

