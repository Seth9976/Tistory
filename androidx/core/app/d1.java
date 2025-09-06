package androidx.core.app;

import android.app.Notification;
import android.graphics.drawable.Icon;
import androidx.annotation.DoNotInline;

public abstract class d1 {
    @DoNotInline
    public static Icon a(Notification notification0) {
        return notification0.getLargeIcon();
    }

    @DoNotInline
    public static Icon b(Notification notification0) {
        return notification0.getSmallIcon();
    }
}

