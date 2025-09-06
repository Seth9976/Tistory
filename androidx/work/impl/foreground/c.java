package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.Service;
import androidx.annotation.DoNotInline;

public abstract class c {
    @DoNotInline
    public static void a(Service service0, int v, Notification notification0, int v1) {
        service0.startForeground(v, notification0, v1);
    }
}

