package androidx.core.app;

import android.app.NotificationChannel;
import androidx.annotation.DoNotInline;

public abstract class h0 {
    @DoNotInline
    public static boolean a(NotificationChannel notificationChannel0) {
        return notificationChannel0.canBubble();
    }
}

